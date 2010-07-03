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

import java.io.IOException;
import java.util.List;

import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.RepositoryPublisher;
import com.google.inject.internal.Lists;

import org.eclipse.b3.backend.evaluator.B3ContextAccess;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.core.PathIterator;
import org.eclipse.b3.p2.InstallableUnit;
import org.eclipse.b3.p2.P2Factory;
import org.eclipse.b3.p2.P2Package;
import org.eclipse.b3.p2.impl.InstallableUnitImpl;
import org.eclipse.b3.p2.impl.MetadataRepositoryImpl;
import org.eclipse.b3.p2.util.P2Bridge;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.REPOSITORY_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * @generated NOT
	 */
	public BuildSet write(BuildUnit unit, BuildSet output) {
		// Each of the files in output should be a p2 repository model written to file.
		// The result is a new file

		P2Factory p2Factory = P2Factory.eINSTANCE;

		// pick up calling context from thread local storage
		BExecutionContext ctx = B3ContextAccess.get();

		ResourceSet resourceSet = new ResourceSetImpl();

		// Set up the new file.
		// TODO: TEST OUTPUT to TMP
		URI resultURI = URI.createURI("file:/tmp/PublishTest/output.p2");
		Resource resultResource = resourceSet.createResource(resultURI);
		resultResource.getContents().clear();

		// Create a MDR in the new file, and give it a location
		MetadataRepositoryImpl mdr = (MetadataRepositoryImpl) p2Factory.createMetadataRepository();
		java.net.URI resultMDRURI = java.net.URI.create("file:/tmp/PublishTest/");
		mdr.setLocation(resultMDRURI);
		resultResource.getContents().add(mdr);
		// get the list to add all aggregated IUs to
		EList<IInstallableUnit> resultIUList = mdr.getInstallableUnits();

		// Aggregate all IUs in all of the input
		//
		PathIterator pItor = output.getPathIterator();
		while(pItor.hasNext()) {
			// Convert java.net.URI to EMF URI
			URI uri = URI.createURI(pItor.next().toString());
			// Load the input p2 model resource
			Resource r = resourceSet.getResource(uri, true);
			List<InstallableUnitImpl> toBeCopied = Lists.newArrayList();
			TreeIterator<EObject> treeItor = r.getAllContents();
			while(treeItor.hasNext()) {
				EObject e = treeItor.next();
				if(e instanceof InstallableUnit)
					toBeCopied.add((InstallableUnitImpl) e);
			}
			// TODO: is it required to copy first?
			resultIUList.addAll(EcoreUtil.copyAll(toBeCopied));
		}
		try {
			resultResource.save(null);
		}
		catch(IOException e) {
			System.err.print("Could not save resulting p2 model\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Write the MDR in p2 repo format
		IMetadataRepositoryManager mdrMgr = P2Utils.getRepositoryManager(IMetadataRepositoryManager.class);
		try {
			IProgressMonitor monitor = ctx != null
					? ctx.getProgressMonitor()
					: new NullProgressMonitor();
			P2Bridge.exportFromModel(mdrMgr, mdr, monitor);
		}
		catch(CoreException e) {
			System.err.print("Could not save resulting mdr repository\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Return a BuildSet - to allow additional aggregation
		BuildSet bs = B3BuildFactory.eINSTANCE.createBuildSet();
		PathVector pv = B3BuildFactory.eINSTANCE.createPathVector();
		pv.setBasePath(java.net.URI.create(resultURI.toString()));
		bs.getPathVectors().add(pv);
		return bs;
	}

} // RepositoryPublisherImpl
