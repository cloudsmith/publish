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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.equinox.p2.metadata.Version;

import com.cloudsmith.publish.AptActions;
import com.cloudsmith.publish.AptPublisher;
import com.cloudsmith.publish.PublishPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apt Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.AptPublisherImpl#getAptActions <em>Apt Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AptPublisherImpl extends PublisherImpl implements AptPublisher {
	private static final String TOUCHPOINT_TYPE = "com.cloudsmith.apt";

	private static final Version TOUCHPOINT_VERSION = Version.create("1.0.0");

	/**
	 * The cached value of the '{@link #getAptActions() <em>Apt Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAptActions()
	 * @generated
	 * @ordered
	 */
	protected AptActions aptActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AptPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAptActions(AptActions newAptActions, NotificationChain msgs) {
		AptActions oldAptActions = aptActions;
		aptActions = newAptActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.APT_PUBLISHER__APT_ACTIONS, oldAptActions, newAptActions);
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
			case PublishPackage.APT_PUBLISHER__APT_ACTIONS:
				return getAptActions();
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
			case PublishPackage.APT_PUBLISHER__APT_ACTIONS:
				return basicSetAptActions(null, msgs);
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
			case PublishPackage.APT_PUBLISHER__APT_ACTIONS:
				return aptActions != null;
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
			case PublishPackage.APT_PUBLISHER__APT_ACTIONS:
				setAptActions((AptActions) newValue);
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
			case PublishPackage.APT_PUBLISHER__APT_ACTIONS:
				setAptActions((AptActions) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AptActions getAptActions() {
		return aptActions;
	}

	@Override
	public String getTouchpointType() {
		return TOUCHPOINT_TYPE;
	}

	@Override
	public Version getTouchpointVersion() {
		return TOUCHPOINT_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAptActions(AptActions newAptActions) {
		if(newAptActions != aptActions) {
			NotificationChain msgs = null;
			if(aptActions != null)
				msgs = ((InternalEObject) aptActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.APT_PUBLISHER__APT_ACTIONS, null, msgs);
			if(newAptActions != null)
				msgs = ((InternalEObject) newAptActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.APT_PUBLISHER__APT_ACTIONS, null, msgs);
			msgs = basicSetAptActions(newAptActions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.APT_PUBLISHER__APT_ACTIONS, newAptActions, newAptActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.APT_PUBLISHER;
	}

} // AptPublisherImpl
