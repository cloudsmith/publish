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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IExt Native Actions</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see com.cloudsmith.publish.PublishPackage#getIExtNativeActions()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IExtNativeActions extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction cleanupFetch(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model cmdDataType="org.eclipse.b3.backend.evaluator.b3backend.StringArray"
	 * @generated NOT
	 */
	PublisherAction exec(String... cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction fetch(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction installFromCSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction uninstallFromCSource();

} // IExtNativeActions
