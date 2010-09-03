/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package com.cloudsmith.publish.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.b3.backend.core.B3ContextAccess;
import org.eclipse.b3.backend.core.runtime.B3OutputLocationProvider;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.core.iterators.PathIterator;
import org.eclipse.b3.p2.ArtifactRepository;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.p2.P2Factory;
import org.eclipse.b3.p2.impl.ArtifactKeyImpl;
import org.eclipse.b3.p2.impl.ArtifactRepositoryImpl;
import org.eclipse.b3.p2.impl.InstallableUnitImpl;
import org.eclipse.b3.p2.impl.MetadataRepositoryImpl;
import org.eclipse.b3.p2.util.P2Bridge;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.b3.util.IOUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.RepositoryPublisher;
import com.google.inject.internal.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RepositoryPublisherImpl extends EObjectImpl implements RepositoryPublisher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RepositoryPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * @generated NOT
	 */
	public BuildSet write(BuildUnit unit, BuildSet input) {
		// Each of the files in output should be a p2 repository model written to file.
		// The result is a new file

		P2Factory p2Factory = P2Factory.eINSTANCE;

		// pick up calling context from thread local storage
		BExecutionContext ctx = B3ContextAccess.get();

		ResourceSet resourceSet = new ResourceSetImpl();

		// Set up the new file.
		// TODO: TEST OUTPUT to TMP
		File tempOutput;
		try {
			tempOutput = File.createTempFile("b3output", ".p2");
			tempOutput.deleteOnExit();
		}
		catch(IOException e) {
			throw new Error(e.getMessage(), e);
		}

		URI tempURI = URI.createFileURI(tempOutput.getAbsolutePath());
		Resource resultResource = resourceSet.createResource(tempURI);
		resultResource.getContents().clear();

		// Get the output location for the unit
		B3OutputLocationProvider locProvider = ctx.getInjector().getInstance(B3OutputLocationProvider.class);
		java.net.URI outputURI = locProvider.getFileURI(unit.getOutputLocation());

		File resultRepoDir = new File(outputURI);
		resultRepoDir.mkdirs();
		if(!resultRepoDir.isDirectory())
			throw new Error("Unable to access directory " + resultRepoDir.getAbsolutePath());

		// java.net.URI resultRepoURI = java.net.URI.create("file:/tmp/PublishTest/");

		// Create a MDR in the new file, and give it a location
		MetadataRepositoryImpl mdr = (MetadataRepositoryImpl) p2Factory.createMetadataRepository();
		mdr.setName(unit.getName());
		mdr.setLocation(outputURI);
		mdr.setType(IMetadataRepositoryManager.TYPE_SIMPLE_REPOSITORY);
		mdr.setVersion("1.0.0");
		mdr.setProperty(IRepository.PROP_COMPRESSED, "true");
		resultResource.getContents().add(mdr);
		// get the list to add all aggregated IUs to
		EList<IInstallableUnit> resultIUList = mdr.getInstallableUnits();

		// Create an AR in the new file, and give it a location
		ArtifactRepositoryImpl ar = (ArtifactRepositoryImpl) p2Factory.createArtifactRepository();
		ar.setName(unit.getName());
		ar.setLocation(outputURI);
		ar.setType(IArtifactRepositoryManager.TYPE_SIMPLE_REPOSITORY);
		ar.setVersion("1.0.0");
		ar.setProperty(IRepository.PROP_COMPRESSED, "true");
		resultResource.getContents().add(mdr);
		// get the list to add all aggregated artifacts to
		EMap<IArtifactKey, EList<IArtifactDescriptor>> resultArtifactMap = ar.getArtifactMap();

		PathIterator pItor = input.getPathIterator();
		while(pItor.hasNext()) {
			// Convert java.net.URI to EMF URI
			URI uri = URI.createURI(pItor.next().toString());
			// Load the input p2 model resource
			Resource r = resourceSet.getResource(uri, true);
			for(EObject obj : r.getContents()) {
				if(obj instanceof MetadataRepository) {
					MetadataRepository mdrModel = (MetadataRepository) obj;
					List<InstallableUnitImpl> toBeCopied = Lists.newArrayList();
					for(IInstallableUnit iu : mdrModel.getInstallableUnits())
						toBeCopied.add((InstallableUnitImpl) iu);
					resultIUList.addAll(EcoreUtil.copyAll(toBeCopied));
				}
				else if(obj instanceof ArtifactRepository) {
					ArtifactRepository arModel = (ArtifactRepository) obj;
					// TODO: is it required to copy first?
					for(Map.Entry<IArtifactKey, EList<IArtifactDescriptor>> arEntry : arModel.getArtifactMap().entrySet()) {
						resultArtifactMap.put(
							EcoreUtil.copy((ArtifactKeyImpl) arEntry.getKey()), new BasicEList<IArtifactDescriptor>(
								EcoreUtil.copyAll(arEntry.getValue())));
					}
				}
			}
		}

		IProgressMonitor monitor = ctx != null
				? ctx.getProgressMonitor()
				: new NullProgressMonitor();

		// // Write the MDR in p2 repo format
		IMetadataRepositoryManager mdrMgr = P2Utils.getRepositoryManager(IMetadataRepositoryManager.class);
		try {
			P2Bridge.exportFromModel(mdrMgr, mdr, true, monitor);
		}
		catch(CoreException e) {
			System.err.print("Could not save resulting mdr repository\n");
			throw new Error(e.getMessage(), e);
		}

		// // Write the AR in p2 repo format
		IArtifactRepositoryManager arMgr = P2Utils.getRepositoryManager(IArtifactRepositoryManager.class);
		try {
			P2Bridge.exportFromModel(arMgr, ar, true, monitor);
		}
		catch(CoreException e) {
			System.err.print("Could not save resulting ar repository\n");
			throw new Error(e.getMessage(), e);
		}

		try {
			packRepository(resultRepoDir);
		}
		catch(IOException e) {
			System.err.print("Could not zip resulting repository\n");
			throw new Error(e.getMessage(), e);
		}

		// Return a BuildSet (containing the outputURI where the repo in p2 form is found).
		BuildSet bs = B3BuildFactory.eINSTANCE.createBuildSet();
		PathVector pv = B3BuildFactory.eINSTANCE.createPathVector();
		pv.setBasePath(outputURI);
		bs.getPathVectors().add(pv);
		return bs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.REPOSITORY_PUBLISHER;
	}

	private void addArchiveEntry(File dir, ZipOutputStream archive, String entryName) throws IOException {
		ZipEntry entry = new ZipEntry(entryName);
		archive.putNextEntry(entry);

		File entryFile = new File(dir, entryName);

		FileInputStream entrySource = new FileInputStream(entryFile);
		IOUtils.copyStream(entrySource, archive, true, false);

		archive.closeEntry();

		if(!entryFile.delete())
			throw new IOException("Could not delete " + entryFile.getAbsolutePath());
	}

	private void packRepository(File resultRepoDir) throws IOException {
		File archiveFile = new File(resultRepoDir, resultRepoDir.getName() + ".zip");
		if(archiveFile.exists() && !archiveFile.delete())
			throw new IOException("Could not delete " + archiveFile.getAbsolutePath());

		ZipOutputStream archive = new ZipOutputStream(new FileOutputStream(archiveFile));
		addArchiveEntry(resultRepoDir, archive, "artifacts.jar");
		addArchiveEntry(resultRepoDir, archive, "content.jar");
		archive.close();
	}

} // RepositoryPublisherImpl
