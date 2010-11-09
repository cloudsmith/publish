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

import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.YumActions;
import com.cloudsmith.publish.YumPublisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.YumPublisherImpl#getYumActions <em>Yum Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class YumPublisherImpl extends PublisherImpl implements YumPublisher {

	/**
	 * The cached value of the '{@link #getYumActions() <em>Yum Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getYumActions()
	 * @generated
	 * @ordered
	 */
	protected YumActions yumActions;

	private static final String TOUCHPOINT_TYPE = "com.cloudsmith.yum";

	private static final Version TOUCHPOINT_VERSION = Version.create("1.0.0");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YumPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetYumActions(YumActions newYumActions, NotificationChain msgs) {
		YumActions oldYumActions = yumActions;
		yumActions = newYumActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.YUM_PUBLISHER__YUM_ACTIONS, oldYumActions, newYumActions);
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
			case PublishPackage.YUM_PUBLISHER__YUM_ACTIONS:
				return getYumActions();
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
			case PublishPackage.YUM_PUBLISHER__YUM_ACTIONS:
				return basicSetYumActions(null, msgs);
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
			case PublishPackage.YUM_PUBLISHER__YUM_ACTIONS:
				return yumActions != null;
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
			case PublishPackage.YUM_PUBLISHER__YUM_ACTIONS:
				setYumActions((YumActions) newValue);
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
			case PublishPackage.YUM_PUBLISHER__YUM_ACTIONS:
				setYumActions((YumActions) null);
				return;
		}
		super.eUnset(featureID);
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
	public YumActions getYumActions() {
		return yumActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setYumActions(YumActions newYumActions) {
		if(newYumActions != yumActions) {
			NotificationChain msgs = null;
			if(yumActions != null)
				msgs = ((InternalEObject) yumActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.YUM_PUBLISHER__YUM_ACTIONS, null, msgs);
			if(newYumActions != null)
				msgs = ((InternalEObject) newYumActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.YUM_PUBLISHER__YUM_ACTIONS, null, msgs);
			msgs = basicSetYumActions(newYumActions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.YUM_PUBLISHER__YUM_ACTIONS, newYumActions, newYumActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.YUM_PUBLISHER;
	}

} // YumPublisherImpl
