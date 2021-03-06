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

import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RPMActions;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>RPM Actions</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RPMActionsImpl extends ActionPackageImpl implements RPMActions {
	public static final String INTERNAL_NAME = "com.cloudsmith.touchpoint.rpm";

	// http://bugzilla.cloudsmith.com/show_bug.cgi?id=904
	public static final String NAME = "";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RPMActionsImpl() {
		super();
	}

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
	public PublisherAction installRPM() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installRPM");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installSRCRPM() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installSRCRPM");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallRPM() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallRPM");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallSRCRPM() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallSRCRPM");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.RPM_ACTIONS;
	}
} // RPMActionsImpl
