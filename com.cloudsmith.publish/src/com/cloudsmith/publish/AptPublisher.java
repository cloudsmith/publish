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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apt Publisher</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.publish.AptPublisher#getAptActions <em>Apt Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.publish.PublishPackage#getAptPublisher()
 * @model
 * @generated
 */
public interface AptPublisher extends Publisher, IAptActions {
	/**
	 * Returns the value of the '<em><b>Apt Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apt Actions</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Apt Actions</em>' containment reference.
	 * @see #setAptActions(AptActions)
	 * @see com.cloudsmith.publish.PublishPackage#getAptPublisher_AptActions()
	 * @model containment="true"
	 * @generated
	 */
	AptActions getAptActions();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.AptPublisher#getAptActions <em>Apt Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Apt Actions</em>' containment reference.
	 * @see #getAptActions()
	 * @generated
	 */
	void setAptActions(AptActions value);

} // AptPublisher
