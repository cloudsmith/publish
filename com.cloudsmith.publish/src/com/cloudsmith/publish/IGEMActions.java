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
 * A representation of the model object '<em><b>IGEM Actions</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see com.cloudsmith.publish.PublishPackage#getIGEMActions()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGEMActions extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction installGEM();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	PublisherAction uninstallGEM();

} // IGEMActions
