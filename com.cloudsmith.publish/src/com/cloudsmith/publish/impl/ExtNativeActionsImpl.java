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
import com.cloudsmith.publish.ExtNativeActions;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Native Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ExtNativeActionsImpl extends ActionPackageImpl implements ExtNativeActions {

	// http://bugzilla.cloudsmith.com/show_bug.cgi?id=904
	public static final String NAME = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExtNativeActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction cleanupFetch(String uri) {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("cleanupFetch");
		a.getParameters();
		ActionParameter p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("uri");
		p.setValue(uri);
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
		return PublishPackage.Literals.EXT_NATIVE_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generates an Action 'exec(argc:count, arg0:txt, argn:txt)'
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction exec(String... cmd) {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("exec");
		a.getParameters();
		ActionParameter p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("argc");
		p.setValue(String.valueOf(cmd.length));
		a.getParameters().add(p);
		int count = 0;
		for(String s : cmd) {
			p = PublishFactory.eINSTANCE.createActionParameter();
			p.setName("arg" + String.valueOf(count++));
			p.setValue(s);
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
	public PublisherAction fetch(String uri) {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("fetch");
		a.getParameters();
		ActionParameter p = PublishFactory.eINSTANCE.createActionParameter();
		p.setName("uri");
		p.setValue(uri);
		a.getParameters().add(p);
		a.setActionPackage(this);
		return a;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloudsmith.publish.impl.ActionPackageImpl#getName()
	 */
	@Override
	public String getName() {
		return NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installFromCSource");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallFromCSource");

		a.setActionPackage(this);
		return a;
	}

} // ExtNativeActionsImpl
