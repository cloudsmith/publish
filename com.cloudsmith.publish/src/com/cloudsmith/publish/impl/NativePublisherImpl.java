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

import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.internal.BuildUnitUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.cloudsmith.publish.CSource;
import com.cloudsmith.publish.ExtNativeActions;
import com.cloudsmith.publish.NativePublisher;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Native Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.NativePublisherImpl#getExtNativeActions <em>Ext Native Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NativePublisherImpl extends PublisherImpl implements NativePublisher {
	/**
	 * The cached value of the '{@link #getExtNativeActions() <em>Ext Native Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtNativeActions()
	 * @generated
	 * @ordered
	 */
	protected ExtNativeActions extNativeActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NativePublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExtNativeActions(ExtNativeActions newExtNativeActions, NotificationChain msgs) {
		ExtNativeActions oldExtNativeActions = extNativeActions;
		extNativeActions = newExtNativeActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS, oldExtNativeActions,
				newExtNativeActions);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
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
			case PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS:
				return getExtNativeActions();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS:
				return basicSetExtNativeActions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS:
				return extNativeActions != null;
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
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS:
				setExtNativeActions((ExtNativeActions) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS:
				setExtNativeActions((ExtNativeActions) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ExtNativeActions getExtNativeActions() {
		// create on demand and remember it being used
		if(extNativeActions == null) {
			extNativeActions = PublishFactory.eINSTANCE.createExtNativeActions();
			getUsedPackages().add(extNativeActions);
		}

		return extNativeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installFromCSource() {
		return getExtNativeActions().installFromCSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExtNativeActions(ExtNativeActions newExtNativeActions) {
		if(newExtNativeActions != extNativeActions) {
			NotificationChain msgs = null;
			if(extNativeActions != null)
				msgs = ((InternalEObject) extNativeActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS, null, msgs);
			if(newExtNativeActions != null)
				msgs = ((InternalEObject) newExtNativeActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS, null, msgs);
			msgs = basicSetExtNativeActions(newExtNativeActions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS, newExtNativeActions,
				newExtNativeActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallFromCSource() {
		return getExtNativeActions().uninstallFromCSource();
	}

	/*
	 * (non-Javadoc)
	 * Adds default install/uninstall operations if none stated by user.
	 * 
	 * @see com.cloudsmith.publish.impl.PublisherImpl#write(org.eclipse.b3.build.BuildUnit)
	 */
	@Override
	public BuildSet write(BuildUnit unit) {

		boolean isSource = ((unit instanceof CSource) || CSource.class.isAssignableFrom(BuildUnitUtils.getBuildUnitInterface(unit)));
		// If Native is marked as CSource, add default actions
		if(isSource) {
			if(getWhenInstalling().size() == 0)
				getWhenInstalling().add(installFromCSource());
			if(getWhenUninstalling().size() == 0)
				getWhenUninstalling().add(uninstallFromCSource());
		}
		return super.write(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.NATIVE_PUBLISHER;
	}
} // NativePublisherImpl
