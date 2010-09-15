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

import com.cloudsmith.publish.PHPActions;
import com.cloudsmith.publish.PHPPublisher;
import com.cloudsmith.publish.PublishPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHP Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.PHPPublisherImpl#getPhpActions <em>Php Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PHPPublisherImpl extends PublisherImpl implements PHPPublisher {
	/**
	 * The cached value of the '{@link #getPhpActions() <em>Php Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPhpActions()
	 * @generated
	 * @ordered
	 */
	protected PHPActions phpActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PHPPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPhpActions(PHPActions newPhpActions, NotificationChain msgs) {
		PHPActions oldPhpActions = phpActions;
		phpActions = newPhpActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.PHP_PUBLISHER__PHP_ACTIONS, oldPhpActions, newPhpActions);
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
			case PublishPackage.PHP_PUBLISHER__PHP_ACTIONS:
				return getPhpActions();
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
			case PublishPackage.PHP_PUBLISHER__PHP_ACTIONS:
				return basicSetPhpActions(null, msgs);
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
			case PublishPackage.PHP_PUBLISHER__PHP_ACTIONS:
				return phpActions != null;
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
			case PublishPackage.PHP_PUBLISHER__PHP_ACTIONS:
				setPhpActions((PHPActions) newValue);
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
			case PublishPackage.PHP_PUBLISHER__PHP_ACTIONS:
				setPhpActions((PHPActions) null);
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
	public PHPActions getPhpActions() {
		return phpActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPhpActions(PHPActions newPhpActions) {
		if(newPhpActions != phpActions) {
			NotificationChain msgs = null;
			if(phpActions != null)
				msgs = ((InternalEObject) phpActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.PHP_PUBLISHER__PHP_ACTIONS, null, msgs);
			if(newPhpActions != null)
				msgs = ((InternalEObject) newPhpActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PublishPackage.PHP_PUBLISHER__PHP_ACTIONS, null, msgs);
			msgs = basicSetPhpActions(newPhpActions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PHP_PUBLISHER__PHP_ACTIONS, newPhpActions, newPhpActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.PHP_PUBLISHER;
	}

} // PHPPublisherImpl
