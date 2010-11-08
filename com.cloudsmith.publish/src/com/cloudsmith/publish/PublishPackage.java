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

import org.eclipse.b3.build.B3BuildPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.publish.PublishFactory
 * @model kind="package"
 * @generated
 */
public interface PublishPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.Publishable <em>Publishable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.Publishable
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublishable()
		 * @generated
		 */
		EClass PUBLISHABLE = eINSTANCE.getPublishable();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.RPM <em>RPM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.RPM
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPM()
		 * @generated
		 */
		EClass RPM = eINSTANCE.getRPM();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.GEM <em>GEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.GEM
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEM()
		 * @generated
		 */
		EClass GEM = eINSTANCE.getGEM();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.NativeActionsImpl <em>Native Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.NativeActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativeActions()
		 * @generated
		 */
		EClass NATIVE_ACTIONS = eINSTANCE.getNativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IRPMActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRPMActions()
		 * @generated
		 */
		EClass IRPM_ACTIONS = eINSTANCE.getIRPMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.GEMActionsImpl <em>GEM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.GEMActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMActions()
		 * @generated
		 */
		EClass GEM_ACTIONS = eINSTANCE.getGEMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.PublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__ID = eINSTANCE.getPublisher_Id();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__SINGLETON = eINSTANCE.getPublisher_Singleton();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__VERSION = eINSTANCE.getPublisher_Version();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__COPYRIGHT_TEXT = eINSTANCE.getPublisher_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Copyright URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__COPYRIGHT_URL = eINSTANCE.getPublisher_CopyrightURL();

		/**
		 * The meta object literal for the '<em><b>License Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__LICENSE_TEXT = eINSTANCE.getPublisher_LicenseText();

		/**
		 * The meta object literal for the '<em><b>License URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__LICENSE_URL = eINSTANCE.getPublisher_LicenseURL();

		/**
		 * The meta object literal for the '<em><b>Runtime Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__RUNTIME_FILTER = eINSTANCE.getPublisher_RuntimeFilter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__PROPERTIES = eINSTANCE.getPublisher_Properties();

		/**
		 * The meta object literal for the '<em><b>When Installing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__WHEN_INSTALLING = eINSTANCE.getPublisher_WhenInstalling();

		/**
		 * The meta object literal for the '<em><b>When Uninstalling</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__WHEN_UNINSTALLING = eINSTANCE.getPublisher_WhenUninstalling();

		/**
		 * The meta object literal for the '<em><b>When Configuring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__WHEN_CONFIGURING = eINSTANCE.getPublisher_WhenConfiguring();

		/**
		 * The meta object literal for the '<em><b>When Unconfiguring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__WHEN_UNCONFIGURING = eINSTANCE.getPublisher_WhenUnconfiguring();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER__NAME = eINSTANCE.getPublisher_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__UNIT = eINSTANCE.getPublisher_Unit();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__PROVIDES = eINSTANCE.getPublisher_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__REQUIRES = eINSTANCE.getPublisher_Requires();

		/**
		 * The meta object literal for the '<em><b>Meta Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__META_REQUIRES = eINSTANCE.getPublisher_MetaRequires();

		/**
		 * The meta object literal for the '<em><b>Used Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__USED_PACKAGES = eINSTANCE.getPublisher_UsedPackages();

		/**
		 * The meta object literal for the '<em><b>Native Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER__NATIVE_ACTIONS = eINSTANCE.getPublisher_NativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PublisherActionImpl <em>Publisher Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.PublisherActionImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisherAction()
		 * @generated
		 */
		EClass PUBLISHER_ACTION = eINSTANCE.getPublisherAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER_ACTION__NAME = eINSTANCE.getPublisherAction_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER_ACTION__PARAMETERS = eINSTANCE.getPublisherAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Action Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER_ACTION__ACTION_PACKAGE = eINSTANCE.getPublisherAction_ActionPackage();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER_ACTION__QUALIFIED_NAME = eINSTANCE.getPublisherAction_QualifiedName();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.ActionParameterImpl <em>Action Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.ActionParameterImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionParameter()
		 * @generated
		 */
		EClass ACTION_PARAMETER = eINSTANCE.getActionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_PARAMETER__NAME = eINSTANCE.getActionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_PARAMETER__VALUE = eINSTANCE.getActionParameter_Value();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.ActionPackageImpl <em>Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.ActionPackageImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionPackage()
		 * @generated
		 */
		EClass ACTION_PACKAGE = eINSTANCE.getActionPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_PACKAGE__NAME = eINSTANCE.getActionPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Touch Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION_PACKAGE__TOUCH_POINT = eINSTANCE.getActionPackage_TouchPoint();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.INativeActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getINativeActions()
		 * @generated
		 */
		EClass INATIVE_ACTIONS = eINSTANCE.getINativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RPMActionsImpl <em>RPM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.RPMActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMActions()
		 * @generated
		 */
		EClass RPM_ACTIONS = eINSTANCE.getRPMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RPMPublisherImpl <em>RPM Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.RPMPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMPublisher()
		 * @generated
		 */
		EClass RPM_PUBLISHER = eINSTANCE.getRPMPublisher();

		/**
		 * The meta object literal for the '<em><b>RPM Install Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RPM_PUBLISHER__RPM_INSTALL_DIR = eINSTANCE.getRPMPublisher_RPMInstallDir();

		/**
		 * The meta object literal for the '<em><b>Rpm Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RPM_PUBLISHER__RPM_ACTIONS = eINSTANCE.getRPMPublisher_RpmActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IGEMActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIGEMActions()
		 * @generated
		 */
		EClass IGEM_ACTIONS = eINSTANCE.getIGEMActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.GEMPublisherImpl <em>GEM Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.GEMPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMPublisher()
		 * @generated
		 */
		EClass GEM_PUBLISHER = eINSTANCE.getGEMPublisher();

		/**
		 * The meta object literal for the '<em><b>Gem Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GEM_PUBLISHER__GEM_ACTIONS = eINSTANCE.getGEMPublisher_GemActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.RepositoryDefinition <em>Repository Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.RepositoryDefinition
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRepositoryDefinition()
		 * @generated
		 */
		EClass REPOSITORY_DEFINITION = eINSTANCE.getRepositoryDefinition();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RepositoryPublisherImpl <em>Repository Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.RepositoryPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRepositoryPublisher()
		 * @generated
		 */
		EClass REPOSITORY_PUBLISHER = eINSTANCE.getRepositoryPublisher();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RubyPublisherImpl <em>Ruby Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.RubyPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyPublisher()
		 * @generated
		 */
		EClass RUBY_PUBLISHER = eINSTANCE.getRubyPublisher();

		/**
		 * The meta object literal for the '<em><b>Ruby Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RUBY_PUBLISHER__RUBY_ACTIONS = eINSTANCE.getRubyPublisher_RubyActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IRubyActions <em>IRuby Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IRubyActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRubyActions()
		 * @generated
		 */
		EClass IRUBY_ACTIONS = eINSTANCE.getIRubyActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.RubyActionsImpl <em>Ruby Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.RubyActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyActions()
		 * @generated
		 */
		EClass RUBY_ACTIONS = eINSTANCE.getRubyActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.RubyRuntime <em>Ruby Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.RubyRuntime
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyRuntime()
		 * @generated
		 */
		EClass RUBY_RUNTIME = eINSTANCE.getRubyRuntime();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.CSource <em>CSource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.CSource
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getCSource()
		 * @generated
		 */
		EClass CSOURCE = eINSTANCE.getCSource();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IExtNativeActions <em>IExt Native Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IExtNativeActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIExtNativeActions()
		 * @generated
		 */
		EClass IEXT_NATIVE_ACTIONS = eINSTANCE.getIExtNativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.ExtNativeActionsImpl <em>Ext Native Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.ExtNativeActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getExtNativeActions()
		 * @generated
		 */
		EClass EXT_NATIVE_ACTIONS = eINSTANCE.getExtNativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.NativePublisherImpl <em>Native Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.NativePublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativePublisher()
		 * @generated
		 */
		EClass NATIVE_PUBLISHER = eINSTANCE.getNativePublisher();

		/**
		 * The meta object literal for the '<em><b>Ext Native Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS = eINSTANCE.getNativePublisher_ExtNativeActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.Native <em>Native</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.Native
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNative()
		 * @generated
		 */
		EClass NATIVE = eINSTANCE.getNative();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IPHPActions <em>IPHP Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IPHPActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIPHPActions()
		 * @generated
		 */
		EClass IPHP_ACTIONS = eINSTANCE.getIPHPActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PHPActionsImpl <em>PHP Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.PHPActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPActions()
		 * @generated
		 */
		EClass PHP_ACTIONS = eINSTANCE.getPHPActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.PHPPublisherImpl <em>PHP Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.PHPPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPPublisher()
		 * @generated
		 */
		EClass PHP_PUBLISHER = eINSTANCE.getPHPPublisher();

		/**
		 * The meta object literal for the '<em><b>Php Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PHP_PUBLISHER__PHP_ACTIONS = eINSTANCE.getPHPPublisher_PhpActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.PHPRuntime <em>PHP Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.PHPRuntime
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPRuntime()
		 * @generated
		 */
		EClass PHP_RUNTIME = eINSTANCE.getPHPRuntime();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.PHPPackage <em>PHP Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.PHPPackage
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPPackage()
		 * @generated
		 */
		EClass PHP_PACKAGE = eINSTANCE.getPHPPackage();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.PHP <em>PHP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.PHP
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHP()
		 * @generated
		 */
		EClass PHP = eINSTANCE.getPHP();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.PHPExt <em>PHP Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.PHPExt
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPExt()
		 * @generated
		 */
		EClass PHP_EXT = eINSTANCE.getPHPExt();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IYumActions <em>IYum Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IYumActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIYumActions()
		 * @generated
		 */
		EClass IYUM_ACTIONS = eINSTANCE.getIYumActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.YumActionsImpl <em>Yum Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.YumActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYumActions()
		 * @generated
		 */
		EClass YUM_ACTIONS = eINSTANCE.getYumActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.YumPublisherImpl <em>Yum Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.YumPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYumPublisher()
		 * @generated
		 */
		EClass YUM_PUBLISHER = eINSTANCE.getYumPublisher();

		/**
		 * The meta object literal for the '<em><b>Yum Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference YUM_PUBLISHER__YUM_ACTIONS = eINSTANCE.getYumPublisher_YumActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.IAptActions <em>IApt Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.IAptActions
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIAptActions()
		 * @generated
		 */
		EClass IAPT_ACTIONS = eINSTANCE.getIAptActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.AptActionsImpl <em>Apt Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.AptActionsImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getAptActions()
		 * @generated
		 */
		EClass APT_ACTIONS = eINSTANCE.getAptActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.impl.AptPublisherImpl <em>Apt Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.impl.AptPublisherImpl
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getAptPublisher()
		 * @generated
		 */
		EClass APT_PUBLISHER = eINSTANCE.getAptPublisher();

		/**
		 * The meta object literal for the '<em><b>Apt Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APT_PUBLISHER__APT_ACTIONS = eINSTANCE.getAptPublisher_AptActions();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.Yum <em>Yum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.Yum
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYum()
		 * @generated
		 */
		EClass YUM = eINSTANCE.getYum();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.publish.Apt <em>Apt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.publish.Apt
		 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getApt()
		 * @generated
		 */
		EClass APT = eINSTANCE.getApt();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "publish";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://com.cloudsmith.publish/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PublishPackage eINSTANCE = com.cloudsmith.publish.impl.PublishPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.Publishable <em>Publishable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.Publishable
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublishable()
	 * @generated
	 */
	int PUBLISHABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__NAME = B3BuildPackage.BUILD_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__NAME_SPACE = B3BuildPackage.BUILD_UNIT__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__COND_EXPR = B3BuildPackage.BUILD_UNIT__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__VERSION = B3BuildPackage.BUILD_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__FUNCTIONS = B3BuildPackage.BUILD_UNIT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__REQUIRED_PREDICATES = B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__PROVIDED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__VAR_NAME = B3BuildPackage.BUILD_UNIT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__BUILDERS = B3BuildPackage.BUILD_UNIT__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__DOCUMENTATION = B3BuildPackage.BUILD_UNIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__EXECUTION_MODE = B3BuildPackage.BUILD_UNIT__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__META_REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__IMPLEMENTS = B3BuildPackage.BUILD_UNIT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__CONCERNS = B3BuildPackage.BUILD_UNIT__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__DEFAULT_PROPERTIES = B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__SYNCHRONIZATIONS = B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__REPOSITORIES = B3BuildPackage.BUILD_UNIT__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__CONTAINERS = B3BuildPackage.BUILD_UNIT__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__PROPERTY_SETS = B3BuildPackage.BUILD_UNIT__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__SOURCE_LOCATION = B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__OUTPUT_LOCATION = B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__PROVIDERS = B3BuildPackage.BUILD_UNIT__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__PARENT = B3BuildPackage.BUILD_UNIT__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__FRAGMENT_HOSTS = B3BuildPackage.BUILD_UNIT__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE__PLATFORM_FILTER = B3BuildPackage.BUILD_UNIT__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Publishable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_FEATURE_COUNT = B3BuildPackage.BUILD_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.RPM <em>RPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.RPM
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPM()
	 * @generated
	 */
	int RPM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>RPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.GEM <em>GEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.GEM
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEM()
	 * @generated
	 */
	int GEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>GEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.ActionPackageImpl <em>Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.ActionPackageImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionPackage()
	 * @generated
	 */
	int ACTION_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PACKAGE__TOUCH_POINT = 1;

	/**
	 * The number of structural features of the '<em>Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.NativeActionsImpl <em>Native Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.NativeActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativeActions()
	 * @generated
	 */
	int NATIVE_ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>Native Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IRPMActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRPMActions()
	 * @generated
	 */
	int IRPM_ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>IRPM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IRPM_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.GEMActionsImpl <em>GEM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.GEMActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMActions()
	 * @generated
	 */
	int GEM_ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>GEM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.PublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 6;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.INativeActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getINativeActions()
	 * @generated
	 */
	int INATIVE_ACTIONS = 10;

	/**
	 * The number of structural features of the '<em>INative Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INATIVE_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = INATIVE_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__SINGLETON = INATIVE_ACTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__VERSION = INATIVE_ACTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__COPYRIGHT_TEXT = INATIVE_ACTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__COPYRIGHT_URL = INATIVE_ACTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LICENSE_TEXT = INATIVE_ACTIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LICENSE_URL = INATIVE_ACTIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__RUNTIME_FILTER = INATIVE_ACTIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PROPERTIES = INATIVE_ACTIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_INSTALLING = INATIVE_ACTIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_UNINSTALLING = INATIVE_ACTIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_CONFIGURING = INATIVE_ACTIONS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WHEN_UNCONFIGURING = INATIVE_ACTIONS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = INATIVE_ACTIONS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__UNIT = INATIVE_ACTIONS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PROVIDES = INATIVE_ACTIONS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__REQUIRES = INATIVE_ACTIONS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__META_REQUIRES = INATIVE_ACTIONS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__USED_PACKAGES = INATIVE_ACTIONS_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NATIVE_ACTIONS = INATIVE_ACTIONS_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = INATIVE_ACTIONS_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PublisherActionImpl <em>Publisher Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.PublisherActionImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPublisherAction()
	 * @generated
	 */
	int PUBLISHER_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Action Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__ACTION_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION__QUALIFIED_NAME = 3;

	/**
	 * The number of structural features of the '<em>Publisher Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_ACTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.ActionParameterImpl <em>Action Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.ActionParameterImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getActionParameter()
	 * @generated
	 */
	int ACTION_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RPMActionsImpl <em>RPM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.RPMActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMActions()
	 * @generated
	 */
	int RPM_ACTIONS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>RPM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RPMPublisherImpl <em>RPM Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.RPMPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRPMPublisher()
	 * @generated
	 */
	int RPM_PUBLISHER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>RPM Install Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__RPM_INSTALL_DIR = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpm Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER__RPM_ACTIONS = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPM Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RPM_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IGEMActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIGEMActions()
	 * @generated
	 */
	int IGEM_ACTIONS = 13;

	/**
	 * The number of structural features of the '<em>IGEM Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IGEM_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.GEMPublisherImpl <em>GEM Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.GEMPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getGEMPublisher()
	 * @generated
	 */
	int GEM_PUBLISHER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gem Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER__GEM_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEM Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEM_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.RepositoryDefinition <em>Repository Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.RepositoryDefinition
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRepositoryDefinition()
	 * @generated
	 */
	int REPOSITORY_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Repository Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEFINITION_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RepositoryPublisherImpl <em>Repository Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.RepositoryPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRepositoryPublisher()
	 * @generated
	 */
	int REPOSITORY_PUBLISHER = 16;

	/**
	 * The number of structural features of the '<em>Repository Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PUBLISHER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RubyPublisherImpl <em>Ruby Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.RubyPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyPublisher()
	 * @generated
	 */
	int RUBY_PUBLISHER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Ruby Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER__RUBY_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ruby Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IRubyActions <em>IRuby Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IRubyActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIRubyActions()
	 * @generated
	 */
	int IRUBY_ACTIONS = 18;

	/**
	 * The number of structural features of the '<em>IRuby Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IRUBY_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.RubyActionsImpl <em>Ruby Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.RubyActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyActions()
	 * @generated
	 */
	int RUBY_ACTIONS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>Ruby Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.RubyRuntime <em>Ruby Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.RubyRuntime
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getRubyRuntime()
	 * @generated
	 */
	int RUBY_RUNTIME = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Ruby Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RUBY_RUNTIME_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.CSource <em>CSource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.CSource
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getCSource()
	 * @generated
	 */
	int CSOURCE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__NAME = B3BuildPackage.BUILD_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__NAME_SPACE = B3BuildPackage.BUILD_UNIT__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__COND_EXPR = B3BuildPackage.BUILD_UNIT__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__VERSION = B3BuildPackage.BUILD_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__FUNCTIONS = B3BuildPackage.BUILD_UNIT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__REQUIRED_PREDICATES = B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__PROVIDED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__VAR_NAME = B3BuildPackage.BUILD_UNIT__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__BUILDERS = B3BuildPackage.BUILD_UNIT__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__DOCUMENTATION = B3BuildPackage.BUILD_UNIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__EXECUTION_MODE = B3BuildPackage.BUILD_UNIT__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__META_REQUIRED_CAPABILITIES = B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__IMPLEMENTS = B3BuildPackage.BUILD_UNIT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__CONCERNS = B3BuildPackage.BUILD_UNIT__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__DEFAULT_PROPERTIES = B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__SYNCHRONIZATIONS = B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__REPOSITORIES = B3BuildPackage.BUILD_UNIT__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__CONTAINERS = B3BuildPackage.BUILD_UNIT__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__PROPERTY_SETS = B3BuildPackage.BUILD_UNIT__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__SOURCE_LOCATION = B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__OUTPUT_LOCATION = B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__PROVIDERS = B3BuildPackage.BUILD_UNIT__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__PARENT = B3BuildPackage.BUILD_UNIT__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__FRAGMENT_HOSTS = B3BuildPackage.BUILD_UNIT__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE__PLATFORM_FILTER = B3BuildPackage.BUILD_UNIT__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>CSource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FEATURE_COUNT = B3BuildPackage.BUILD_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IExtNativeActions <em>IExt Native Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IExtNativeActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIExtNativeActions()
	 * @generated
	 */
	int IEXT_NATIVE_ACTIONS = 22;

	/**
	 * The number of structural features of the '<em>IExt Native Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IEXT_NATIVE_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.ExtNativeActionsImpl <em>Ext Native Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.ExtNativeActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getExtNativeActions()
	 * @generated
	 */
	int EXT_NATIVE_ACTIONS = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXT_NATIVE_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXT_NATIVE_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>Ext Native Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXT_NATIVE_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.NativePublisherImpl <em>Native Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.NativePublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNativePublisher()
	 * @generated
	 */
	int NATIVE_PUBLISHER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Ext Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Native Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.Native <em>Native</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.Native
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getNative()
	 * @generated
	 */
	int NATIVE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IPHPActions <em>IPHP Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IPHPActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIPHPActions()
	 * @generated
	 */
	int IPHP_ACTIONS = 26;

	/**
	 * The number of structural features of the '<em>IPHP Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPHP_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PHPActionsImpl <em>PHP Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.PHPActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPActions()
	 * @generated
	 */
	int PHP_ACTIONS = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>PHP Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.PHPPublisherImpl <em>PHP Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.PHPPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPPublisher()
	 * @generated
	 */
	int PHP_PUBLISHER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Php Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER__PHP_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PHP Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.PHPRuntime <em>PHP Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.PHPRuntime
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPRuntime()
	 * @generated
	 */
	int PHP_RUNTIME = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>PHP Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_RUNTIME_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.PHPPackage <em>PHP Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.PHPPackage
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPPackage()
	 * @generated
	 */
	int PHP_PACKAGE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>PHP Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_PACKAGE_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.PHP <em>PHP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.PHP
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHP()
	 * @generated
	 */
	int PHP = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__NAME = PHP_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__NAME_SPACE = PHP_PACKAGE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__COND_EXPR = PHP_PACKAGE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__VERSION = PHP_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__FUNCTIONS = PHP_PACKAGE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__REQUIRED_CAPABILITIES = PHP_PACKAGE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__REQUIRED_PREDICATES = PHP_PACKAGE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__PROVIDED_CAPABILITIES = PHP_PACKAGE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__VAR_NAME = PHP_PACKAGE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__BUILDERS = PHP_PACKAGE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__DOCUMENTATION = PHP_PACKAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__EXECUTION_MODE = PHP_PACKAGE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__META_REQUIRED_CAPABILITIES = PHP_PACKAGE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__IMPLEMENTS = PHP_PACKAGE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__CONCERNS = PHP_PACKAGE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__DEFAULT_PROPERTIES = PHP_PACKAGE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__SYNCHRONIZATIONS = PHP_PACKAGE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__REPOSITORIES = PHP_PACKAGE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__CONTAINERS = PHP_PACKAGE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__PROPERTY_SETS = PHP_PACKAGE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__SOURCE_LOCATION = PHP_PACKAGE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__OUTPUT_LOCATION = PHP_PACKAGE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__PROVIDERS = PHP_PACKAGE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__PARENT = PHP_PACKAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__FRAGMENT_HOSTS = PHP_PACKAGE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP__PLATFORM_FILTER = PHP_PACKAGE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>PHP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_FEATURE_COUNT = PHP_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.PHPExt <em>PHP Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.PHPExt
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getPHPExt()
	 * @generated
	 */
	int PHP_EXT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__NAME = PHP_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__NAME_SPACE = PHP_PACKAGE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__COND_EXPR = PHP_PACKAGE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__VERSION = PHP_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__FUNCTIONS = PHP_PACKAGE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__REQUIRED_CAPABILITIES = PHP_PACKAGE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__REQUIRED_PREDICATES = PHP_PACKAGE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__PROVIDED_CAPABILITIES = PHP_PACKAGE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__VAR_NAME = PHP_PACKAGE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__BUILDERS = PHP_PACKAGE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__DOCUMENTATION = PHP_PACKAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__EXECUTION_MODE = PHP_PACKAGE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__META_REQUIRED_CAPABILITIES = PHP_PACKAGE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__IMPLEMENTS = PHP_PACKAGE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__CONCERNS = PHP_PACKAGE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__DEFAULT_PROPERTIES = PHP_PACKAGE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__SYNCHRONIZATIONS = PHP_PACKAGE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__REPOSITORIES = PHP_PACKAGE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__CONTAINERS = PHP_PACKAGE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__PROPERTY_SETS = PHP_PACKAGE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__SOURCE_LOCATION = PHP_PACKAGE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__OUTPUT_LOCATION = PHP_PACKAGE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__PROVIDERS = PHP_PACKAGE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__PARENT = PHP_PACKAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__FRAGMENT_HOSTS = PHP_PACKAGE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT__PLATFORM_FILTER = PHP_PACKAGE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>PHP Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PHP_EXT_FEATURE_COUNT = PHP_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IYumActions <em>IYum Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IYumActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIYumActions()
	 * @generated
	 */
	int IYUM_ACTIONS = 33;

	/**
	 * The number of structural features of the '<em>IYum Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IYUM_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.YumActionsImpl <em>Yum Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.YumActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYumActions()
	 * @generated
	 */
	int YUM_ACTIONS = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>Yum Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.YumPublisherImpl <em>Yum Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.YumPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYumPublisher()
	 * @generated
	 */
	int YUM_PUBLISHER = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Yum Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER__YUM_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Yum Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.IAptActions <em>IApt Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.IAptActions
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getIAptActions()
	 * @generated
	 */
	int IAPT_ACTIONS = 36;

	/**
	 * The number of structural features of the '<em>IApt Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IAPT_ACTIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.AptActionsImpl <em>Apt Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.AptActionsImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getAptActions()
	 * @generated
	 */
	int APT_ACTIONS = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_ACTIONS__NAME = ACTION_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Touch Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_ACTIONS__TOUCH_POINT = ACTION_PACKAGE__TOUCH_POINT;

	/**
	 * The number of structural features of the '<em>Apt Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_ACTIONS_FEATURE_COUNT = ACTION_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.impl.AptPublisherImpl <em>Apt Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.impl.AptPublisherImpl
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getAptPublisher()
	 * @generated
	 */
	int APT_PUBLISHER = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__ID = PUBLISHER__ID;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__SINGLETON = PUBLISHER__SINGLETON;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__VERSION = PUBLISHER__VERSION;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__COPYRIGHT_TEXT = PUBLISHER__COPYRIGHT_TEXT;

	/**
	 * The feature id for the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__COPYRIGHT_URL = PUBLISHER__COPYRIGHT_URL;

	/**
	 * The feature id for the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__LICENSE_TEXT = PUBLISHER__LICENSE_TEXT;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__LICENSE_URL = PUBLISHER__LICENSE_URL;

	/**
	 * The feature id for the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__RUNTIME_FILTER = PUBLISHER__RUNTIME_FILTER;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__PROPERTIES = PUBLISHER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>When Installing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__WHEN_INSTALLING = PUBLISHER__WHEN_INSTALLING;

	/**
	 * The feature id for the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__WHEN_UNINSTALLING = PUBLISHER__WHEN_UNINSTALLING;

	/**
	 * The feature id for the '<em><b>When Configuring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__WHEN_CONFIGURING = PUBLISHER__WHEN_CONFIGURING;

	/**
	 * The feature id for the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__WHEN_UNCONFIGURING = PUBLISHER__WHEN_UNCONFIGURING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__NAME = PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__UNIT = PUBLISHER__UNIT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__PROVIDES = PUBLISHER__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__REQUIRES = PUBLISHER__REQUIRES;

	/**
	 * The feature id for the '<em><b>Meta Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__META_REQUIRES = PUBLISHER__META_REQUIRES;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__USED_PACKAGES = PUBLISHER__USED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__NATIVE_ACTIONS = PUBLISHER__NATIVE_ACTIONS;

	/**
	 * The feature id for the '<em><b>Apt Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER__APT_ACTIONS = PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apt Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_PUBLISHER_FEATURE_COUNT = PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.Yum <em>Yum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.Yum
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getYum()
	 * @generated
	 */
	int YUM = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Yum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YUM_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.publish.Apt <em>Apt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.publish.Apt
	 * @see com.cloudsmith.publish.impl.PublishPackageImpl#getApt()
	 * @generated
	 */
	int APT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__NAME = PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__NAME_SPACE = PUBLISHABLE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__COND_EXPR = PUBLISHABLE__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__VERSION = PUBLISHABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__FUNCTIONS = PUBLISHABLE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__REQUIRED_CAPABILITIES = PUBLISHABLE__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__REQUIRED_PREDICATES = PUBLISHABLE__REQUIRED_PREDICATES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__PROVIDED_CAPABILITIES = PUBLISHABLE__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__VAR_NAME = PUBLISHABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__BUILDERS = PUBLISHABLE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__DOCUMENTATION = PUBLISHABLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__EXECUTION_MODE = PUBLISHABLE__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__META_REQUIRED_CAPABILITIES = PUBLISHABLE__META_REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__IMPLEMENTS = PUBLISHABLE__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__CONCERNS = PUBLISHABLE__CONCERNS;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__DEFAULT_PROPERTIES = PUBLISHABLE__DEFAULT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__SYNCHRONIZATIONS = PUBLISHABLE__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__REPOSITORIES = PUBLISHABLE__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__CONTAINERS = PUBLISHABLE__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__PROPERTY_SETS = PUBLISHABLE__PROPERTY_SETS;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__SOURCE_LOCATION = PUBLISHABLE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__OUTPUT_LOCATION = PUBLISHABLE__OUTPUT_LOCATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__PROVIDERS = PUBLISHABLE__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__PARENT = PUBLISHABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__FRAGMENT_HOSTS = PUBLISHABLE__FRAGMENT_HOSTS;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT__PLATFORM_FILTER = PUBLISHABLE__PLATFORM_FILTER;

	/**
	 * The number of structural features of the '<em>Apt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APT_FEATURE_COUNT = PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.ActionPackage <em>Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action Package</em>'.
	 * @see com.cloudsmith.publish.ActionPackage
	 * @generated
	 */
	EClass getActionPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.ActionPackage#getName()
	 * @see #getActionPackage()
	 * @generated
	 */
	EAttribute getActionPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionPackage#getTouchPoint <em>Touch Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Touch Point</em>'.
	 * @see com.cloudsmith.publish.ActionPackage#getTouchPoint()
	 * @see #getActionPackage()
	 * @generated
	 */
	EAttribute getActionPackage_TouchPoint();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.ActionParameter <em>Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action Parameter</em>'.
	 * @see com.cloudsmith.publish.ActionParameter
	 * @generated
	 */
	EClass getActionParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.ActionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.cloudsmith.publish.ActionParameter#getValue()
	 * @see #getActionParameter()
	 * @generated
	 */
	EAttribute getActionParameter_Value();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Apt <em>Apt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Apt</em>'.
	 * @see com.cloudsmith.publish.Apt
	 * @generated
	 */
	EClass getApt();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.AptActions <em>Apt Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Apt Actions</em>'.
	 * @see com.cloudsmith.publish.AptActions
	 * @generated
	 */
	EClass getAptActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.AptPublisher <em>Apt Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Apt Publisher</em>'.
	 * @see com.cloudsmith.publish.AptPublisher
	 * @generated
	 */
	EClass getAptPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.AptPublisher#getAptActions <em>Apt Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Apt Actions</em>'.
	 * @see com.cloudsmith.publish.AptPublisher#getAptActions()
	 * @see #getAptPublisher()
	 * @generated
	 */
	EReference getAptPublisher_AptActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.CSource <em>CSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>CSource</em>'.
	 * @see com.cloudsmith.publish.CSource
	 * @generated
	 */
	EClass getCSource();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.ExtNativeActions <em>Ext Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ext Native Actions</em>'.
	 * @see com.cloudsmith.publish.ExtNativeActions
	 * @generated
	 */
	EClass getExtNativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEM <em>GEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GEM</em>'.
	 * @see com.cloudsmith.publish.GEM
	 * @generated
	 */
	EClass getGEM();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEMActions <em>GEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GEM Actions</em>'.
	 * @see com.cloudsmith.publish.GEMActions
	 * @generated
	 */
	EClass getGEMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.GEMPublisher <em>GEM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GEM Publisher</em>'.
	 * @see com.cloudsmith.publish.GEMPublisher
	 * @generated
	 */
	EClass getGEMPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.GEMPublisher#getGemActions <em>Gem Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Gem Actions</em>'.
	 * @see com.cloudsmith.publish.GEMPublisher#getGemActions()
	 * @see #getGEMPublisher()
	 * @generated
	 */
	EReference getGEMPublisher_GemActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IAptActions <em>IApt Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IApt Actions</em>'.
	 * @see com.cloudsmith.publish.IAptActions
	 * @generated
	 */
	EClass getIAptActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IExtNativeActions <em>IExt Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IExt Native Actions</em>'.
	 * @see com.cloudsmith.publish.IExtNativeActions
	 * @generated
	 */
	EClass getIExtNativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IGEM Actions</em>'.
	 * @see com.cloudsmith.publish.IGEMActions
	 * @generated
	 */
	EClass getIGEMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>INative Actions</em>'.
	 * @see com.cloudsmith.publish.INativeActions
	 * @generated
	 */
	EClass getINativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IPHPActions <em>IPHP Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IPHP Actions</em>'.
	 * @see com.cloudsmith.publish.IPHPActions
	 * @generated
	 */
	EClass getIPHPActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRPM Actions</em>'.
	 * @see com.cloudsmith.publish.IRPMActions
	 * @generated
	 */
	EClass getIRPMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IRubyActions <em>IRuby Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRuby Actions</em>'.
	 * @see com.cloudsmith.publish.IRubyActions
	 * @generated
	 */
	EClass getIRubyActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.IYumActions <em>IYum Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IYum Actions</em>'.
	 * @see com.cloudsmith.publish.IYumActions
	 * @generated
	 */
	EClass getIYumActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Native <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Native</em>'.
	 * @see com.cloudsmith.publish.Native
	 * @generated
	 */
	EClass getNative();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.NativeActions <em>Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Native Actions</em>'.
	 * @see com.cloudsmith.publish.NativeActions
	 * @generated
	 */
	EClass getNativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.NativePublisher <em>Native Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Native Publisher</em>'.
	 * @see com.cloudsmith.publish.NativePublisher
	 * @generated
	 */
	EClass getNativePublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.NativePublisher#getExtNativeActions
	 * <em>Ext Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ext Native Actions</em>'.
	 * @see com.cloudsmith.publish.NativePublisher#getExtNativeActions()
	 * @see #getNativePublisher()
	 * @generated
	 */
	EReference getNativePublisher_ExtNativeActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHP <em>PHP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP</em>'.
	 * @see com.cloudsmith.publish.PHP
	 * @generated
	 */
	EClass getPHP();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHPActions <em>PHP Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP Actions</em>'.
	 * @see com.cloudsmith.publish.PHPActions
	 * @generated
	 */
	EClass getPHPActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHPExt <em>PHP Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP Ext</em>'.
	 * @see com.cloudsmith.publish.PHPExt
	 * @generated
	 */
	EClass getPHPExt();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHPPackage <em>PHP Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP Package</em>'.
	 * @see com.cloudsmith.publish.PHPPackage
	 * @generated
	 */
	EClass getPHPPackage();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHPPublisher <em>PHP Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP Publisher</em>'.
	 * @see com.cloudsmith.publish.PHPPublisher
	 * @generated
	 */
	EClass getPHPPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.PHPPublisher#getPhpActions <em>Php Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Php Actions</em>'.
	 * @see com.cloudsmith.publish.PHPPublisher#getPhpActions()
	 * @see #getPHPPublisher()
	 * @generated
	 */
	EReference getPHPPublisher_PhpActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PHPRuntime <em>PHP Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>PHP Runtime</em>'.
	 * @see com.cloudsmith.publish.PHPRuntime
	 * @generated
	 */
	EClass getPHPRuntime();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Publishable <em>Publishable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Publishable</em>'.
	 * @see com.cloudsmith.publish.Publishable
	 * @generated
	 */
	EClass getPublishable();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see com.cloudsmith.publish.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the meta object for the attribute '<em>Copyright URL</em>'.
	 * @see com.cloudsmith.publish.Publisher#getCopyrightURL()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_CopyrightURL();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.cloudsmith.publish.Publisher#getId()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getLicenseText <em>License Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the meta object for the attribute '<em>License URL</em>'.
	 * @see com.cloudsmith.publish.Publisher#getLicenseURL()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_LicenseURL();

	/**
	 * Returns the meta object for the reference list '{@link com.cloudsmith.publish.Publisher#getMetaRequires <em>Meta Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Meta Requires</em>'.
	 * @see com.cloudsmith.publish.Publisher#getMetaRequires()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_MetaRequires();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cloudsmith.publish.Publisher#getName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.Publisher#getNativeActions <em>Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Native Actions</em>'.
	 * @see com.cloudsmith.publish.Publisher#getNativeActions()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_NativeActions();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see com.cloudsmith.publish.Publisher#getProperties()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Properties();

	/**
	 * Returns the meta object for the reference list '{@link com.cloudsmith.publish.Publisher#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see com.cloudsmith.publish.Publisher#getRequires()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Requires();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getRuntimeFilter <em>Runtime Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Runtime Filter</em>'.
	 * @see com.cloudsmith.publish.Publisher#getRuntimeFilter()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_RuntimeFilter();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see com.cloudsmith.publish.Publisher#isSingleton()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Singleton();

	/**
	 * Returns the meta object for the reference '{@link com.cloudsmith.publish.Publisher#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see com.cloudsmith.publish.Publisher#getUnit()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.Publisher#getUsedPackages <em>Used Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Used Packages</em>'.
	 * @see com.cloudsmith.publish.Publisher#getUsedPackages()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_UsedPackages();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.Publisher#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.cloudsmith.publish.Publisher#getVersion()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.Publisher#getWhenConfiguring
	 * <em>When Configuring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>When Configuring</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenConfiguring()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenConfiguring();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.Publisher#getWhenInstalling <em>When Installing</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>When Installing</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenInstalling()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenInstalling();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.Publisher#getWhenUnconfiguring
	 * <em>When Unconfiguring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>When Unconfiguring</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenUnconfiguring()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenUnconfiguring();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cloudsmith.publish.Publisher#getWhenUninstalling
	 * <em>When Uninstalling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>When Uninstalling</em>'.
	 * @see com.cloudsmith.publish.Publisher#getWhenUninstalling()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_WhenUninstalling();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.PublisherAction <em>Publisher Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Publisher Action</em>'.
	 * @see com.cloudsmith.publish.PublisherAction
	 * @generated
	 */
	EClass getPublisherAction();

	/**
	 * Returns the meta object for the reference '{@link com.cloudsmith.publish.PublisherAction#getActionPackage <em>Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Action Package</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getActionPackage()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EReference getPublisherAction_ActionPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.PublisherAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getParameters()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EReference getPublisherAction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.PublisherAction#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see com.cloudsmith.publish.PublisherAction#getQualifiedName()
	 * @see #getPublisherAction()
	 * @generated
	 */
	EAttribute getPublisherAction_QualifiedName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PublishFactory getPublishFactory();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RepositoryDefinition <em>Repository Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repository Definition</em>'.
	 * @see com.cloudsmith.publish.RepositoryDefinition
	 * @generated
	 */
	EClass getRepositoryDefinition();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RepositoryPublisher <em>Repository Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repository Publisher</em>'.
	 * @see com.cloudsmith.publish.RepositoryPublisher
	 * @generated
	 */
	EClass getRepositoryPublisher();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>RPM</em>'.
	 * @see com.cloudsmith.publish.RPM
	 * @generated
	 */
	EClass getRPM();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPMActions <em>RPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>RPM Actions</em>'.
	 * @see com.cloudsmith.publish.RPMActions
	 * @generated
	 */
	EClass getRPMActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RPMPublisher <em>RPM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>RPM Publisher</em>'.
	 * @see com.cloudsmith.publish.RPMPublisher
	 * @generated
	 */
	EClass getRPMPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.RPMPublisher#getRpmActions <em>Rpm Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Rpm Actions</em>'.
	 * @see com.cloudsmith.publish.RPMPublisher#getRpmActions()
	 * @see #getRPMPublisher()
	 * @generated
	 */
	EReference getRPMPublisher_RpmActions();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.publish.RPMPublisher#getRPMInstallDir <em>RPM Install Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>RPM Install Dir</em>'.
	 * @see com.cloudsmith.publish.RPMPublisher#getRPMInstallDir()
	 * @see #getRPMPublisher()
	 * @generated
	 */
	EAttribute getRPMPublisher_RPMInstallDir();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RubyActions <em>Ruby Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ruby Actions</em>'.
	 * @see com.cloudsmith.publish.RubyActions
	 * @generated
	 */
	EClass getRubyActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RubyPublisher <em>Ruby Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ruby Publisher</em>'.
	 * @see com.cloudsmith.publish.RubyPublisher
	 * @generated
	 */
	EClass getRubyPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.RubyPublisher#getRubyActions <em>Ruby Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Ruby Actions</em>'.
	 * @see com.cloudsmith.publish.RubyPublisher#getRubyActions()
	 * @see #getRubyPublisher()
	 * @generated
	 */
	EReference getRubyPublisher_RubyActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.RubyRuntime <em>Ruby Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ruby Runtime</em>'.
	 * @see com.cloudsmith.publish.RubyRuntime
	 * @generated
	 */
	EClass getRubyRuntime();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.Yum <em>Yum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Yum</em>'.
	 * @see com.cloudsmith.publish.Yum
	 * @generated
	 */
	EClass getYum();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.YumActions <em>Yum Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Yum Actions</em>'.
	 * @see com.cloudsmith.publish.YumActions
	 * @generated
	 */
	EClass getYumActions();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.publish.YumPublisher <em>Yum Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Yum Publisher</em>'.
	 * @see com.cloudsmith.publish.YumPublisher
	 * @generated
	 */
	EClass getYumPublisher();

	/**
	 * Returns the meta object for the containment reference '{@link com.cloudsmith.publish.YumPublisher#getYumActions <em>Yum Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Yum Actions</em>'.
	 * @see com.cloudsmith.publish.YumPublisher#getYumActions()
	 * @see #getYumPublisher()
	 * @generated
	 */
	EReference getYumPublisher_YumActions();

} // PublishPackage
