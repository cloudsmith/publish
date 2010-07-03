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
 * A representation of the model object '<em><b>Ruby Publisher</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.publish.RubyPublisher#getRubyActions <em>Ruby Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.publish.PublishPackage#getRubyPublisher()
 * @model
 * @generated
 */
public interface RubyPublisher extends Publisher, IRubyActions {

	/**
	 * Returns the value of the '<em><b>Ruby Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Actions</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ruby Actions</em>' containment reference.
	 * @see com.cloudsmith.publish.PublishPackage#getRubyPublisher_RubyActions()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	RubyActions getRubyActions();
} // RubyPublisher
