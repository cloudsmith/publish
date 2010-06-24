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
 * A representation of the model object '<em><b>RPM Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cloudsmith.publish.RPMPublisher#getRPMInstallDir <em>RPM Install Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cloudsmith.publish.PublishPackage#getRPMPublisher()
 * @model
 * @generated
 */
public interface RPMPublisher extends Publisher, IRPMActions {
	/**
	 * Returns the value of the '<em><b>RPM Install Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RPM Install Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RPM Install Dir</em>' attribute.
	 * @see #setRPMInstallDir(String)
	 * @see com.cloudsmith.publish.PublishPackage#getRPMPublisher_RPMInstallDir()
	 * @model
	 * @generated
	 */
	String getRPMInstallDir();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.RPMPublisher#getRPMInstallDir <em>RPM Install Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPM Install Dir</em>' attribute.
	 * @see #getRPMInstallDir()
	 * @generated
	 */
	void setRPMInstallDir(String value);

} // RPMPublisher
