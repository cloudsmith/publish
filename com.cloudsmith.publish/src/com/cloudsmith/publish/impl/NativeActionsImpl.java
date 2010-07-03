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

import org.eclipse.emf.ecore.EClass;

import com.cloudsmith.publish.ActionParameter;
import com.cloudsmith.publish.NativeActions;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.google.inject.internal.Nullable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Native Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class NativeActionsImpl extends ActionPackageImpl implements NativeActions {

	/**
	 * Since these actions are always used in a native touchpoint, there is no need to output
	 * them with their touchpoint namespace as prefix.
	 */
	public static final String NAME = "";

	public static final String NATIVE_TOUCHPOINT = "org.eclipse.equinox.p2.touchpoint.natives";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NativeActionsImpl() {
		super();
	}

	private void assertNotNull(String parameterName, Object value) {
		if(value == null)
			throw new IllegalArgumentException("The parameter " + parameterName + " can not be null.");
	}

	private void assertNotNullOrEmpty(String parameterName, String value) {
		assertNotNull(parameterName, value);
		if(value.length() < 1)
			throw new IllegalArgumentException("The parameter " + parameterName + " can not be an empty string.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction chmod(String targetDir, String targetFile, String permissions, @Nullable String options) {
		assertNotNullOrEmpty("targetDir", targetDir);
		assertNotNullOrEmpty("targetFile", targetFile);
		assertNotNullOrEmpty("permissions", permissions);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("chmod");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("targetDir");
		p.setValue(targetDir);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("targetFile");
		p.setValue(targetFile);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("permissions");
		p.setValue(permissions);
		a.getParameters().add(p);

		if(options != null && options.length() > 0) {
			p = PublishFactory.eINSTANCE.createActionParameter();
			p.setName("options");
			p.setValue(options);
			a.getParameters().add(p);
		}
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction cleanupCopy(String source, String target) {
		assertNotNullOrEmpty("source", source);
		assertNotNullOrEmpty("target", target);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("cleanupCopy");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("source");
		p.setValue(source);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("target");
		p.setValue(target);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction cleanupZip(String source, String target) {
		assertNotNullOrEmpty("source", source);
		assertNotNullOrEmpty("target", target);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("cleanupZip");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("source");
		p.setValue(source);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("target");
		p.setValue(target);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction copy(String source, String target, boolean overwrite) {
		assertNotNullOrEmpty("source", source);
		assertNotNullOrEmpty("target", target);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("copy");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("source");
		p.setValue(source);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("target");
		p.setValue(target);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("overwrite");
		p.setValue(Boolean.toString(overwrite));
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.NATIVE_ACTIONS;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getTouchPoint() {
		return NATIVE_TOUCHPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction link(String targetDir, String linkTarget, String linkName, boolean force) {
		assertNotNullOrEmpty("targetDir", targetDir);
		assertNotNullOrEmpty("linkTarget", linkTarget);
		assertNotNullOrEmpty("linkName", linkName);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("link");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("targetDir");
		p.setValue(targetDir);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("linkTarget");
		p.setValue(linkTarget);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("linkName");
		p.setValue(linkName);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("force");
		p.setValue(Boolean.toString(force));
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction mkdir(String path) {
		assertNotNullOrEmpty("path", path);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("mkdir");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("path");
		p.setValue(path);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction remove(String path) {
		assertNotNullOrEmpty("path", path);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("remove");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("path");
		p.setValue(path);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction rmdir(String path) {
		assertNotNullOrEmpty("path", path);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("rmdir");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("path");
		p.setValue(path);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction unZip(String source, String target) {
		assertNotNullOrEmpty("source", source);
		assertNotNullOrEmpty("target", target);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("unZip");

		ActionParameter p = null;

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("source");
		p.setValue(source);
		a.getParameters().add(p);

		p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("target");
		p.setValue(target);
		a.getParameters().add(p);

		a.setActionPackage(this);
		return a;

	}
} // NativeActionsImpl
