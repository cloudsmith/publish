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

import com.cloudsmith.publish.ActionParameter;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RubyActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RubyActionsImpl extends ActionPackageImpl implements RubyActions {
	public static final String INTERNAL_NAME = "com.cloudsmith.touchpoint.ruby";

	// http://bugzilla.cloudsmith.com/show_bug.cgi?id=904
	public static final String NAME = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RubyActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.RUBY_ACTIONS;
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
	public PublisherAction installPassenger(String server) {
		assertNotNullOrEmpty("server", server);
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installPassenger");
		ActionParameter ap = PublishFactory.eINSTANCE.createActionParameter();
		ap.setName("server");
		ap.setValue(server);
		a.getParameters().add(ap);

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installRubyEnterpriseFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("installRubyEnterpriseFromCSource");

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPassenger(String server) {
		assertNotNullOrEmpty("server", server);

		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallPassenger");
		ActionParameter ap = PublishFactory.eINSTANCE.createActionParameter();
		ap.setName("server");
		ap.setValue(server);
		a.getParameters().add(ap);

		a.setActionPackage(this);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallRubyEnterpriseFromCSource() {
		PublisherAction a = PublishFactory.eINSTANCE.createPublisherAction();
		a.setName("uninstallRubyEnterpriseFromCSource");

		a.setActionPackage(this);
		return a;
	}
} // RubyActionsImpl
