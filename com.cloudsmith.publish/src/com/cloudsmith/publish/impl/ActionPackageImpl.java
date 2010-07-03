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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.cloudsmith.publish.ActionPackage;
import com.cloudsmith.publish.PublishPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.ActionPackageImpl#getName <em>Name</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.ActionPackageImpl#getTouchPoint <em>Touch Point</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ActionPackageImpl extends EObjectImpl implements ActionPackage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTouchPoint() <em>Touch Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTouchPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUCH_POINT_EDEFAULT = null;

	public static final String DEFAULT_TOUCHPOINT = "org.eclipse.equinox.p2.osgi";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case PublishPackage.ACTION_PACKAGE__NAME:
				return getName();
			case PublishPackage.ACTION_PACKAGE__TOUCH_POINT:
				return getTouchPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case PublishPackage.ACTION_PACKAGE__NAME:
				return NAME_EDEFAULT == null
						? getName() != null
						: !NAME_EDEFAULT.equals(getName());
			case PublishPackage.ACTION_PACKAGE__TOUCH_POINT:
				return TOUCH_POINT_EDEFAULT == null
						? getTouchPoint() != null
						: !TOUCH_POINT_EDEFAULT.equals(getTouchPoint());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.ACTION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getTouchPoint() {
		return DEFAULT_TOUCHPOINT;
	}

} // ActionPackageImpl
