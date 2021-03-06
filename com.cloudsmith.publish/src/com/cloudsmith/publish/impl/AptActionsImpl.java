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

import com.cloudsmith.publish.AptActions;
import com.cloudsmith.publish.PublishPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apt Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AptActionsImpl extends ActionPackageImpl implements AptActions {
	public static final String INTERNAL_NAME = "com.cloudsmith.touchpoint.apt";

	// http://bugzilla.cloudsmith.com/show_bug.cgi?id=904
	public static final String NAME = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AptActionsImpl() {
		super();
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
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.APT_ACTIONS;
	}

} // AptActionsImpl
