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

import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RPMActions;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>RPM Actions</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RPMActionsImpl extends ActionPackageImpl implements RPMActions {
	public static final String NAME = "com.cloudsmith.touchpoint.rpm";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RPMActionsImpl() {
		super();
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

	@Override
	public String getName() {
		return NAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installRPM() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setActionPackage(this);
		a.setName("installRPM");
		// EList<ActionParameter> params = a.getParameters();
		// add parameters as needed
		return a;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction uninstallRPM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
} // RPMActionsImpl
