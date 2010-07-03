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

import org.eclipse.b3.build.BuildSet;

import org.eclipse.b3.build.BuildUnit;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.cloudsmith.publish.PublishPackage#getRepositoryPublisher()
 * @model
 * @generated
 */
public interface RepositoryPublisher extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BuildSet write(BuildUnit unit, BuildSet output);

} // RepositoryPublisher
