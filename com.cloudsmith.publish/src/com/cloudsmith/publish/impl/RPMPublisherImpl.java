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

import com.cloudsmith.publish.ConfigurePhase;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.RPMInstallPhase;
import com.cloudsmith.publish.RPMPublisher;
import org.eclipse.emf.common.notify.Notification;
import com.cloudsmith.publish.RPMUninstallPhase;
import com.cloudsmith.publish.UnconfigurePhase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cloudsmith.publish.impl.RPMPublisherImpl#getRPMInstallDir <em>RPM Install Dir</em>}</li>
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
	 * @see #getRPMInstallDir()
	 * @generated
	 * @ordered
	 */
	protected static final String RPM_INSTALL_DIR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRPMInstallDir() <em>RPM Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPMInstallDir()
	 * @generated
	 * @ordered
	 */
	protected String rpmInstallDir = RPM_INSTALL_DIR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPMPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.RPM_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRPMInstallDir() {
		return rpmInstallDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPMInstallDir(String newRPMInstallDir) {
		String oldRPMInstallDir = rpmInstallDir;
		rpmInstallDir = newRPMInstallDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR,
					oldRPMInstallDir, rpmInstallDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void installRPM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uninstallRPM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
			return getRPMInstallDir();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
			setRPMInstallDir((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
			setRPMInstallDir(RPM_INSTALL_DIR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PublishPackage.RPM_PUBLISHER__RPM_INSTALL_DIR:
			return RPM_INSTALL_DIR_EDEFAULT == null ? rpmInstallDir != null
					: !RPM_INSTALL_DIR_EDEFAULT.equals(rpmInstallDir);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (RPMInstallDir: ");
		result.append(rpmInstallDir);
		result.append(')');
		return result.toString();
	}

} //RPMPublisherImpl
