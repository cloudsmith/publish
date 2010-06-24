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

import org.eclipse.b3.build.build.B3BuildPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.cloudsmith.publish.PublishFactory
 * @model kind="package"
 * @generated
 */
public interface PublishPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "publish";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.cloudsmith.publish/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PublishPackage eINSTANCE = com.cloudsmith.publish.impl.PublishPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IP2Publishable <em>IP2 Publishable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.IP2Publishable
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIP2Publishable()
	 * @generated
	 */
	int IP2_PUBLISHABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__NAME = B3BuildPackage.BUILD_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__NAME_SPACE = B3BuildPackage.BUILD_UNIT__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__COND_EXPR = B3BuildPackage.BUILD_UNIT__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__VERSION = B3BuildPackage.BUILD_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__FUNCTIONS = B3BuildPackage.BUILD_UNIT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__PROVIDED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__BUILDERS = B3BuildPackage.BUILD_UNIT__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__DOCUMENTATION = B3BuildPackage.BUILD_UNIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__EXECUTION_MODE = B3BuildPackage.BUILD_UNIT__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__META_REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__IMPLEMENTS = B3BuildPackage.BUILD_UNIT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__CONCERNS = B3BuildPackage.BUILD_UNIT__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__DEFAULT_PROPERTIES = B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__SYNCHRONIZATIONS = B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__REPOSITORIES = B3BuildPackage.BUILD_UNIT__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__CONTAINERS = B3BuildPackage.BUILD_UNIT__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__PROPERTY_SETS = B3BuildPackage.BUILD_UNIT__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__SOURCE_LOCATION = B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__OUTPUT_LOCATION = B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE__PROVIDERS = B3BuildPackage.BUILD_UNIT__PROVIDERS;

	/**
	 * The number of structural features of the '<em>IP2 Publishable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP2_PUBLISHABLE_FEATURE_COUNT = B3BuildPackage.BUILD_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.RPM <em>RPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.RPM
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPM()
	 * @generated
	 */
	int RPM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__NAME = IP2_PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__NAME_SPACE = IP2_PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__COND_EXPR = IP2_PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__VERSION = IP2_PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__FUNCTIONS = IP2_PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__REQUIRED_CAPABILITIES = IP2_PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__PROVIDED_CAPABILITIES = IP2_PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__BUILDERS = IP2_PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__DOCUMENTATION = IP2_PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__EXECUTION_MODE = IP2_PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__META_REQUIRED_CAPABILITIES = IP2_PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__IMPLEMENTS = IP2_PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__CONCERNS = IP2_PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__DEFAULT_PROPERTIES = IP2_PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__SYNCHRONIZATIONS = IP2_PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__REPOSITORIES = IP2_PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__CONTAINERS = IP2_PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__PROPERTY_SETS = IP2_PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__SOURCE_LOCATION = IP2_PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__OUTPUT_LOCATION = IP2_PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__PROVIDERS = IP2_PUBLISHABLE__PROVIDERS;

	/**
	 * The number of structural features of the '<em>RPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_FEATURE_COUNT = IP2_PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.GEM <em>GEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.GEM
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEM()
	 * @generated
	 */
	int GEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__NAME = IP2_PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__NAME_SPACE = IP2_PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__COND_EXPR = IP2_PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__VERSION = IP2_PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__FUNCTIONS = IP2_PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__REQUIRED_CAPABILITIES = IP2_PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__PROVIDED_CAPABILITIES = IP2_PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__BUILDERS = IP2_PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__DOCUMENTATION = IP2_PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__EXECUTION_MODE = IP2_PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__META_REQUIRED_CAPABILITIES = IP2_PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__IMPLEMENTS = IP2_PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__CONCERNS = IP2_PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__DEFAULT_PROPERTIES = IP2_PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__SYNCHRONIZATIONS = IP2_PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__REPOSITORIES = IP2_PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__CONTAINERS = IP2_PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__PROPERTY_SETS = IP2_PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__SOURCE_LOCATION = IP2_PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__OUTPUT_LOCATION = IP2_PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM__PROVIDERS = IP2_PUBLISHABLE__PROVIDERS;

	/**
	 * The number of structural features of the '<em>GEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_FEATURE_COUNT = IP2_PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.ActionPackageImpl <em>Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.ActionPackageImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionPackage()
	 * @generated
	 */
	int ACTION_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PACKAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.NativeActionsImpl <em>Native Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.NativeActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativeActions()
	 * @generated
	 */
	int NATIVE_ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The number of structural features of the '<em>Native Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.IRPMActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRPMActions()
	 * @generated
	 */
	int IRPM_ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>IRPM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRPM_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.GEMActionsImpl <em>GEM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.GEMActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMActions()
	 * @generated
	 */
	int GEM_ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The number of structural features of the '<em>GEM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.PublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 6;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.INativeActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getINativeActions()
	 * @generated
	 */
	int INATIVE_ACTIONS = 10;

	/**
	 * The number of structural features of the '<em>INative Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INATIVE_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = INATIVE_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__SINGLETON = INATIVE_ACTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__VERSION = INATIVE_ACTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__COPYRIGHT_TEXT = INATIVE_ACTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__COPYRIGHT_URL = INATIVE_ACTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LICENSE_TEXT = INATIVE_ACTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LICENSE_URL = INATIVE_ACTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__RUNTIME_FILTER = INATIVE_ACTIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PROPERTIES = INATIVE_ACTIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__EREFERENCE0 = INATIVE_ACTIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_INSTALLING = INATIVE_ACTIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_UNINSTALLING = INATIVE_ACTIONS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_CONFIGURING = INATIVE_ACTIONS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_UNCONFIGURING = INATIVE_ACTIONS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = INATIVE_ACTIONS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__UNIT = INATIVE_ACTIONS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PROVIDES = INATIVE_ACTIONS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__REQUIRES = INATIVE_ACTIONS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__META_REQUIRES = INATIVE_ACTIONS_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = INATIVE_ACTIONS_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PublisherActionImpl <em>Publisher Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.PublisherActionImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisherAction()
	 * @generated
	 */
	int PUBLISHER_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Action Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__ACTION_PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Publisher Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.ActionParameterImpl <em>Action Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.ActionParameterImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionParameter()
	 * @generated
	 */
	int ACTION_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RPMActionsImpl <em>RPM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.RPMActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMActions()
	 * @generated
	 */
	int RPM_ACTIONS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The number of structural features of the '<em>RPM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RPMPublisherImpl <em>RPM Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.RPMPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMPublisher()
	 * @generated
	 */
	int RPM_PUBLISHER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__EREFERENCE0 = PUBLISHER__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>RPM Install Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__RPM_INSTALL_DIR = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPM Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.IGEMActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIGEMActions()
	 * @generated
	 */
	int IGEM_ACTIONS = 13;

	/**
	 * The number of structural features of the '<em>IGEM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGEM_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.GEMPublisherImpl <em>GEM Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cloudsmith.publish.impl.GEMPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMPublisher()
	 * @generated
	 */
	int GEM_PUBLISHER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__EREFERENCE0 = PUBLISHER__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The number of structural features of the '<em>GEM Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IP2Publishable <em>IP2 Publishable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP2 Publishable</em>'.
	 * @see com.cloudsmith.publish.IP2Publishable
	 * @generated
	 */
	EClass getIP2Publishable();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPM</em>'.
	 * @see com.cloudsmith.publish.RPM
	 * @generated
	 */
	EClass getRPM();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEM <em>GEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEM</em>'.
	 * @see com.cloudsmith.publish.GEM
	 * @generated
	 */
	EClass getGEM();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.NativeActions <em>Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Actions</em>'.
	 * @see com.cloudsmith.publish.NativeActions
	 * @generated
	 */
	EClass getNativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRPM Actions</em>'.
	 * @see com.cloudsmith.publish.IRPMActions
	 * @generated
	 */
	EClass getIRPMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEMActions <em>GEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEM Actions</em>'.
	 * @see com.cloudsmith.publish.GEMActions
	 * @generated
	 */
	EClass getGEMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see com.cloudsmith.publish.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.cloudsmith.publish.Publisher#getId()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see com.cloudsmith.publish.Publisher#isSingleton()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Singleton();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.cloudsmith.publish.Publisher#getVersion()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see com.cloudsmith.publish.Publisher#getCopyrightText()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_CopyrightText();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getCopyrightURL <em>Copyright URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright URL</em>'.
	 * @see com.cloudsmith.publish.Publisher#getCopyrightURL()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_CopyrightURL();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getLicenseText <em>License Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Text</em>'.
	 * @see com.cloudsmith.publish.Publisher#getLicenseText()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_LicenseText();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getLicenseURL <em>License URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License URL</em>'.
	 * @see com.cloudsmith.publish.Publisher#getLicenseURL()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_LicenseURL();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getRuntimeFilter <em>Runtime Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Filter</em>'.
	 * @see com.cloudsmith.publish.Publisher#getRuntimeFilter()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_RuntimeFilter();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see com.cloudsmith.publish.Publisher#getProperties()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Properties();

	/**
	 * Returns the meta object for the reference '{@link com.cloudsmith.publish.Publisher#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see com.cloudsmith.publish.Publisher#getEReference0()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_EReference0();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.Publisher#getWhenInstalling <em>When Installing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Installing</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenInstalling()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenInstalling();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.Publisher#getWhenUninstalling <em>When Uninstalling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Uninstalling</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenUninstalling()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenUninstalling();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.Publisher#getWhenConfiguring <em>When Configuring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Configuring</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenConfiguring()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenConfiguring();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.Publisher#getWhenUnconfiguring <em>When Unconfiguring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Unconfiguring</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenUnconfiguring()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenUnconfiguring();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.Publisher#getName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Name();

	/**
	 * Returns the meta object for the reference '{@link com.cloudsmith.publish.Publisher#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see com.cloudsmith.publish.Publisher#getUnit()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Unit();

	/**
	 * Returns the meta object for the reference list '{@link com.cloudsmith.publish.Publisher#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see com.cloudsmith.publish.Publisher#getProvides()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Provides();

	/**
	 * Returns the meta object for the reference list '{@link com.cloudsmith.publish.Publisher#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see com.cloudsmith.publish.Publisher#getRequires()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Requires();

	/**
	 * Returns the meta object for the reference list '{@link com.cloudsmith.publish.Publisher#getMetaRequires <em>Meta Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Requires</em>'.
	 * @see com.cloudsmith.publish.Publisher#getMetaRequires()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_MetaRequires();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PublisherAction <em>Publisher Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Action</em>'.
	 * @see com.cloudsmith.publish.PublisherAction
	 * @generated
	 */
	EClass getPublisherAction();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getName()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EAttribute getPublisherAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.PublisherAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getParameters()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EReference getPublisherAction_Parameters();

	/**
	 * Returns the meta object for the reference '{@link com.cloudsmith.publish.PublisherAction#getActionPackage <em>Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Package</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getActionPackage()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EReference getPublisherAction_ActionPackage();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.ActionParameter <em>Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Parameter</em>'.
	 * @see com.cloudsmith.publish.ActionParameter
	 * @generated
	 */
	EClass getActionParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.ActionParameter#getName()
	 * @see #getActionParameter()
	 * @generated
	 */
	EAttribute getActionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.cloudsmith.publish.ActionParameter#getValue()
	 * @see #getActionParameter()
	 * @generated
	 */
	EAttribute getActionParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.ActionPackage <em>Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Package</em>'.
	 * @see com.cloudsmith.publish.ActionPackage
	 * @generated
	 */
	EClass getActionPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.ActionPackage#getName()
	 * @see #getActionPackage()
	 * @generated
	 */
	EAttribute getActionPackage_Name();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INative Actions</em>'.
	 * @see com.cloudsmith.publish.INativeActions
	 * @generated
	 */
	EClass getINativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPMActions <em>RPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPM Actions</em>'.
	 * @see com.cloudsmith.publish.RPMActions
	 * @generated
	 */
	EClass getRPMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPMPublisher <em>RPM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPM Publisher</em>'.
	 * @see com.cloudsmith.publish.RPMPublisher
	 * @generated
	 */
	EClass getRPMPublisher();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.RPMPublisher#getRPMInstallDir <em>RPM Install Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RPM Install Dir</em>'.
	 * @see com.cloudsmith.publish.RPMPublisher#getRPMInstallDir()
	 * @see #getRPMPublisher()
	 * @generated
	 */
	EAttribute getRPMPublisher_RPMInstallDir();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGEM Actions</em>'.
	 * @see com.cloudsmith.publish.IGEMActions
	 * @generated
	 */
	EClass getIGEMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEMPublisher <em>GEM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEM Publisher</em>'.
	 * @see com.cloudsmith.publish.GEMPublisher
	 * @generated
	 */
	EClass getGEMPublisher();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PublishFactory getPublishFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IP2Publishable <em>IP2 Publishable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.IP2Publishable
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIP2Publishable()
		 * @generated
		 */
		EClass IP2_PUBLISHABLE = eINSTANCE.getIP2Publishable();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.RPM <em>RPM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.RPM
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPM()
		 * @generated
		 */
		EClass RPM = eINSTANCE.getRPM();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.GEM <em>GEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.GEM
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEM()
		 * @generated
		 */
		EClass GEM = eINSTANCE.getGEM();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.NativeActionsImpl <em>Native Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.NativeActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativeActions()
		 * @generated
		 */
		EClass NATIVE_ACTIONS = eINSTANCE.getNativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.IRPMActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRPMActions()
		 * @generated
		 */
		EClass IRPM_ACTIONS = eINSTANCE.getIRPMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.GEMActionsImpl <em>GEM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.GEMActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMActions()
		 * @generated
		 */
		EClass GEM_ACTIONS = eINSTANCE.getGEMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.PublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ID = eINSTANCE.getPublisher_Id();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__SINGLETON = eINSTANCE.getPublisher_Singleton();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__VERSION = eINSTANCE.getPublisher_Version();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__COPYRIGHT_TEXT = eINSTANCE
				.getPublisher_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Copyright URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__COPYRIGHT_URL = eINSTANCE
				.getPublisher_CopyrightURL();

		/**
		 * The meta object literal for the '<em><b>License Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__LICENSE_TEXT = eINSTANCE
				.getPublisher_LicenseText();

		/**
		 * The meta object literal for the '<em><b>License URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__LICENSE_URL = eINSTANCE.getPublisher_LicenseURL();

		/**
		 * The meta object literal for the '<em><b>Runtime Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__RUNTIME_FILTER = eINSTANCE
				.getPublisher_RuntimeFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PROPERTIES = eINSTANCE.getPublisher_Properties();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__EREFERENCE0 = eINSTANCE
				.getPublisher_EReference0();

		/**
		 * The meta object literal for the '<em><b>When Installing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__WHEN_INSTALLING = eINSTANCE
				.getPublisher_WhenInstalling();

		/**
		 * The meta object literal for the '<em><b>When Uninstalling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__WHEN_UNINSTALLING = eINSTANCE
				.getPublisher_WhenUninstalling();

		/**
		 * The meta object literal for the '<em><b>When Configuring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__WHEN_CONFIGURING = eINSTANCE
				.getPublisher_WhenConfiguring();

		/**
		 * The meta object literal for the '<em><b>When Unconfiguring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__WHEN_UNCONFIGURING = eINSTANCE
				.getPublisher_WhenUnconfiguring();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__NAME = eINSTANCE.getPublisher_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__UNIT = eINSTANCE.getPublisher_Unit();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__PROVIDES = eINSTANCE.getPublisher_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__REQUIRES = eINSTANCE.getPublisher_Requires();

		/**
		 * The meta object literal for the '<em><b>Meta Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__META_REQUIRES = eINSTANCE
				.getPublisher_MetaRequires();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PublisherActionImpl <em>Publisher Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.PublisherActionImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisherAction()
		 * @generated
		 */
		EClass PUBLISHER_ACTION = eINSTANCE.getPublisherAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER_ACTION__NAME = eINSTANCE.getPublisherAction_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER_ACTION__PARAMETERS = eINSTANCE
				.getPublisherAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Action Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER_ACTION__ACTION_PACKAGE = eINSTANCE
				.getPublisherAction_ActionPackage();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.ActionParameterImpl <em>Action Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.ActionParameterImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionParameter()
		 * @generated
		 */
		EClass ACTION_PARAMETER = eINSTANCE.getActionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_PARAMETER__NAME = eINSTANCE.getActionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_PARAMETER__VALUE = eINSTANCE
				.getActionParameter_Value();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.ActionPackageImpl <em>Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.ActionPackageImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionPackage()
		 * @generated
		 */
		EClass ACTION_PACKAGE = eINSTANCE.getActionPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_PACKAGE__NAME = eINSTANCE.getActionPackage_Name();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.INativeActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getINativeActions()
		 * @generated
		 */
		EClass INATIVE_ACTIONS = eINSTANCE.getINativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RPMActionsImpl <em>RPM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.RPMActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMActions()
		 * @generated
		 */
		EClass RPM_ACTIONS = eINSTANCE.getRPMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RPMPublisherImpl <em>RPM Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.RPMPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMPublisher()
		 * @generated
		 */
		EClass RPM_PUBLISHER = eINSTANCE.getRPMPublisher();

		/**
		 * The meta object literal for the '<em><b>RPM Install Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPM_PUBLISHER__RPM_INSTALL_DIR = eINSTANCE
				.getRPMPublisher_RPMInstallDir();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.IGEMActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIGEMActions()
		 * @generated
		 */
		EClass IGEM_ACTIONS = eINSTANCE.getIGEMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.GEMPublisherImpl <em>GEM Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cloudsmith.publish.impl.GEMPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMPublisher()
		 * @generated
		 */
		EClass GEM_PUBLISHER = eINSTANCE.getGEMPublisher();

	}

} //PublishPackage
