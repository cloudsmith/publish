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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}</li>
 *   <li>{@link com.cloudsmith.publish.PublisherAction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.cloudsmith.publish.PublisherAction#getActionPackage <em>Action Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cloudsmith.publish.PublishPackage#getPublisherAction()
 * @model
 * @generated
 */
public interface PublisherAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisherAction_Name()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.ActionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisherAction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Action Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Package</em>' reference.
	 * @see #setActionPackage(ActionPackage)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisherAction_ActionPackage()
	 * @model required="true"
	 * @generated
	 */
	ActionPackage getActionPackage();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.PublisherAction#getActionPackage <em>Action Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Package</em>' reference.
	 * @see #getActionPackage()
	 * @generated
	 */
	void setActionPackage(ActionPackage value);

} // PublisherAction
