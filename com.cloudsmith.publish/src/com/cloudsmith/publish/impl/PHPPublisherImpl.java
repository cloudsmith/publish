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
import com.cloudsmith.publish.PHP;
import com.cloudsmith.publish.PHPActions;
import com.cloudsmith.publish.PHPExt;
import com.cloudsmith.publish.PHPPackage;
import com.cloudsmith.publish.PHPPublisher;
import com.cloudsmith.publish.PHPRuntime;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

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
	 * @generated NOT
	 */
	public PHPActions getPhpActions() {
		// create on demand and remember it being used
		if(phpActions == null) {
			phpActions = PublishFactory.eINSTANCE.createPHPActions();
			getUsedPackages().add(phpActions);
		}
		return phpActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHP() {
		return getPhpActions().installPHP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPExt() {
		return getPhpActions().installPHPExt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPExtFromCSource() {
		return getPhpActions().installPHPExtFromCSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPRuntime() {
		return getPhpActions().installPHPRuntime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPRuntimeFromCSource() {
		return getPhpActions().installPHPRuntimeFromCSource();
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
	 * @generated NOT
	 */
	public PublisherAction uninstallPHP() {
		return getPhpActions().uninstallPHP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPExt() {
		return getPhpActions().uninstallPHPExt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPExtFromCSource() {
		return getPhpActions().uninstallPHPExtFromCSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPRuntime() {
		return getPhpActions().uninstallPHPRuntime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPRuntimeFromCSource() {
		return getPhpActions().uninstallPHPRuntimeFromCSource();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloudsmith.publish.impl.PublisherImpl#write(org.eclipse.b3.build.BuildUnit)
	 */
	@Override
	public BuildSet write(BuildUnit unit) {
		// TODO Needs to differentiate between a PHP, PHPExt, and if combined with CSource
		Class<? extends BuildUnit> unitInterface = BuildUnitUtils.getBuildUnitInterface(unit);
		boolean isSource = (unit instanceof CSource) || CSource.class.isAssignableFrom(unitInterface);
		boolean isPHPRuntime = (unit instanceof PHPRuntime) || PHPRuntime.class.isAssignableFrom(unitInterface);
		boolean isPHPExt = (unit instanceof PHPExt) || PHPExt.class.isAssignableFrom(unitInterface);
		boolean isPHP = (unit instanceof PHP) || PHP.class.isAssignableFrom(unitInterface);
		boolean isPHPPackage = (unit instanceof PHPPackage) || PHPPackage.class.isAssignableFrom(unitInterface);

		// Check degenerate states and report errors
		if(!(isPHPRuntime || isPHPPackage))
			throw new IllegalArgumentException("Unit " + unit.getName() +
					", must be one of PHPRuntime, PHP, PHPExt, or PHPPackage");
		if(isPHPRuntime && isPHPPackage)
			throw new IllegalArgumentException(
				"A unit can not be both PHPRuntime and some type of PHPPackage at the same time.");
		if(isPHPExt && isPHP)
			throw new IllegalArgumentException("The types PHP and PHPExt are mutually exclusive.");
		if(isPHP && isSource)
			throw new IllegalArgumentException("The type PHP can not be combined with the type CSource.");

		// RUNTIME (when installing)
		if(isPHPRuntime) {
			if(getWhenInstalling().size() == 0)
				getWhenInstalling().add(isSource
						? installPHPRuntimeFromCSource()
						: installPHPRuntime());
			if(getWhenUninstalling().size() == 0)
				getWhenUninstalling().add(isSource
						? uninstallPHPRuntimeFromCSource()
						: uninstallPHPRuntime());

		}
		// PHPExt (when configuring)
		else if(isPHPExt) {
			if(getWhenConfiguring().size() == 0)
				getWhenConfiguring().add(isSource
						? installPHPExtFromCSource()
						: installPHPExt());
			if(getWhenUnconfiguring().size() == 0)
				getWhenUnconfiguring().add(isSource
						? uninstallPHPExtFromCSource()
						: uninstallPHPExt());

		}
		// PHP (when configuring)
		else if(isPHP) {
			if(getWhenConfiguring().size() == 0)
				getWhenConfiguring().add(installPHP());
			if(getWhenUnconfiguring().size() == 0)
				getWhenUnconfiguring().add(uninstallPHP());
		}
		// (else)
		// Something that is a PHPPackage has no default processing, instructions are passed as specified
		// by user.

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
		return PublishPackage.Literals.PHP_PUBLISHER;
	}
} // PHPPublisherImpl
