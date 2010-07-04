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

import org.eclipse.b3.build.BuildUnit;

import org.eclipse.b3.build.core.B3BuilderJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publishable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see com.cloudsmith.publish.PublishPackage#getPublishable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Publishable extends BuildUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.build.B3BuilderJob"
	 * @generated
	 */
	B3BuilderJob publish();

} // Publishable
