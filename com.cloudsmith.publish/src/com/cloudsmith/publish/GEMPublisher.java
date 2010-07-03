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
 * A representation of the model object '<em><b>GEM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.publish.GEMPublisher#getGemActions <em>Gem Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.publish.PublishPackage#getGEMPublisher()
 * @model
 * @generated
 */
public interface GEMPublisher extends Publisher, IGEMActions {

	/**
	 * Returns the value of the '<em><b>Gem Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gem Actions</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gem Actions</em>' containment reference.
	 * @see com.cloudsmith.publish.PublishPackage#getGEMPublisher_GemActions()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	GEMActions getGemActions();
} // GEMPublisher
