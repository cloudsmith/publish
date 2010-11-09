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
 * A representation of the model object '<em><b>YUM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.publish.YumPublisher#getYumActions <em>Yum Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.publish.PublishPackage#getYumPublisher()
 * @model
 * @generated
 */
public interface YumPublisher extends Publisher, IYumActions {
	/**
	 * Returns the value of the '<em><b>Yum Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YUM Actions</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Yum Actions</em>' containment reference.
	 * @see #setYumActions(YumActions)
	 * @see com.cloudsmith.publish.PublishPackage#getYumPublisher_YumActions()
	 * @model containment="true"
	 * @generated
	 */
	YumActions getYumActions();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.YumPublisher#getYumActions <em>Yum Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Yum Actions</em>' containment reference.
	 * @see #getYumActions()
	 * @generated
	 */
	void setYumActions(YumActions value);

} // YumPublisher
