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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RPMActions;
import com.cloudsmith.publish.RPMPublisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.RPMPublisherImpl#getRPMInstallDir <em>RPM Install Dir</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.RPMPublisherImpl#getRpmActions <em>Rpm Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RPMPublisherImpl extends PublisherImpl implements RPMPublisher {
	/**
	 * The default value of the '{@link #getRPMInstallDir() <em>RPM Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRPMInstallDir()
	 * @generated
	 * @ordered
	 */
	protected static final String RPM_INSTALL_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPMInstallDir() <em>RPM Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRPMInstallDir()
	 * @generated
	 * @ordered
	 */
	protected String rpmInstallDir = RPM_INSTALL_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRpmActions() <em>Rpm Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRpmActions()
	 * @generated
	 * @ordered
	 */
	protected RPMActions rpmActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RPMPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRpmActions(RPMActions newRpmActions, NotificationChain msgs) {
		RPMActions oldRpmActions = rpmActions;
		rpmActions = newRpmActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.RPM_PUBLISHER__RPM_ACTIONS, oldRpmActions, newRpmActions);
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
			case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
				return getRPMInstallDir();
			case PublishPackage.RPM_PUBLISHER__RPM_ACTIONS:
				return getRpmActions();
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
			case PublishPackage.RPM_PUBLISHER__RPM_ACTIONS:
				return basicSetRpmActions(null, msgs);
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
			case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
				return RPM_INSTALL_DIR_EDEFAULT == null
						? rpmInstallDir != null
						: !RPM_INSTALL_DIR_EDEFAULT.equals(rpmInstallDir);
			case PublishPackage.RPM_PUBLISHER__RPM_ACTIONS:
				return rpmActions != null;
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
			case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
				setRPMInstallDir((String) newValue);
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
	protected EClass eStaticClass() {
		return PublishPackage.Literals.RPM_PUBLISHER;
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
			case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
				setRPMInstallDir(RPM_INSTALL_DIR_EDEFAULT);
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
	public RPMActions getRpmActions() {
		// create on demand and remember it being used
		if(rpmActions == null) {
			rpmActions = PublishFactory.eINSTANCE.createRPMActions();
			getUsedPackages().add(rpmActions);
		}
		return rpmActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRPMInstallDir() {
		return rpmInstallDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installFromCSource() {
		return getRpmActions().installFromCSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRPMInstallDir(String newRPMInstallDir) {
		String oldRPMInstallDir = rpmInstallDir;
		rpmInstallDir = newRPMInstallDir;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR, oldRPMInstallDir, rpmInstallDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (RPMInstallDir: ");
		result.append(rpmInstallDir);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallFromCSource() {
		return getRpmActions().installFromCSource();
	}

	@Override
	public BuildSet write(BuildUnit unit) {
		BuildSet bs = super.write(unit); // sets all of the defaults, returns empty? BuildSet

		getWhenInstalling().add(installFromCSource());
		getWhenUninstalling().add(uninstallFromCSource());
		return bs;
	}
} // RPMPublisherImpl
