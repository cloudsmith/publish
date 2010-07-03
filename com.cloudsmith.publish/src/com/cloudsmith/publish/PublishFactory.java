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
package com.cloudsmith.publish;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.publish.PublishPackage
 * @generated
 */
public interface PublishFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PublishFactory eINSTANCE = com.cloudsmith.publish.impl.PublishFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Action Parameter</em>'.
	 * @generated
	 */
	ActionParameter createActionParameter();

	/**
	 * Returns a new object of class '<em>GEM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>GEM Actions</em>'.
	 * @generated
	 */
	GEMActions createGEMActions();

	/**
	 * Returns a new object of class '<em>GEM Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>GEM Publisher</em>'.
	 * @generated
	 */
	GEMPublisher createGEMPublisher();

	/**
	 * Returns a new object of class '<em>Native Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Native Actions</em>'.
	 * @generated
	 */
	NativeActions createNativeActions();

	/**
	 * Returns a new object of class '<em>Publisher Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Publisher Action</em>'.
	 * @generated
	 */
	PublisherAction createPublisherAction();

	/**
	 * Returns a new object of class '<em>Repository Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Repository Publisher</em>'.
	 * @generated
	 */
	RepositoryPublisher createRepositoryPublisher();

	/**
	 * Returns a new object of class '<em>RPM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>RPM Actions</em>'.
	 * @generated
	 */
	RPMActions createRPMActions();

	/**
	 * Returns a new object of class '<em>RPM Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>RPM Publisher</em>'.
	 * @generated
	 */
	RPMPublisher createRPMPublisher();

	/**
	 * Returns a new object of class '<em>Ruby Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ruby Actions</em>'.
	 * @generated
	 */
	RubyActions createRubyActions();

	/**
	 * Returns a new object of class '<em>Ruby Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Ruby Publisher</em>'.
	 * @generated
	 */
	RubyPublisher createRubyPublisher();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	PublishPackage getPublishPackage();

} // PublishFactory
