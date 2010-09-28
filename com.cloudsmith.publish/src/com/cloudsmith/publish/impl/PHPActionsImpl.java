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

import com.cloudsmith.publish.PHPActions;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHP Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PHPActionsImpl extends ActionPackageImpl implements PHPActions {
	public static final String INTERNAL_NAME = "com.cloudsmith.touchpoint.php";

	// http://bugzilla.cloudsmith.com/show_bug.cgi?id=904
	public static final String NAME = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PHPActionsImpl() {
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
	 * @generated NOT
	 */
	public PublisherAction installPHP() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPHP");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPExt() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPHPExt");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPExtFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPHPExtFromCSource");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPRuntime() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPHPRuntime");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPHPRuntimeFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPHPRuntimeFromCSource");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHP() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPHP");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPExt() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPHPExt");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPExtFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPHPExtFromCSource");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPRuntime() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPHPRuntime");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPHPRuntimeFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPHPRuntimeFromCSource");
		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.PHP_ACTIONS;
	}

} // PHPActionsImpl
