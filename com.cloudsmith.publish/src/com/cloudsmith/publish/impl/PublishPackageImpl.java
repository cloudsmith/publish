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
package com.cloudsmith.publish.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.p2.P2Package;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.cloudsmith.publish.ActionPackage;
import com.cloudsmith.publish.ActionParameter;
import com.cloudsmith.publish.AptActions;
import com.cloudsmith.publish.AptPublisher;
import com.cloudsmith.publish.CSource;
import com.cloudsmith.publish.ExtNativeActions;
import com.cloudsmith.publish.GEMActions;
import com.cloudsmith.publish.GEMPublisher;
import com.cloudsmith.publish.IAptActions;
import com.cloudsmith.publish.IExtNativeActions;
import com.cloudsmith.publish.IGEMActions;
import com.cloudsmith.publish.INativeActions;
import com.cloudsmith.publish.IPHPActions;
import com.cloudsmith.publish.IRPMActions;
import com.cloudsmith.publish.IRubyActions;
import com.cloudsmith.publish.IYumActions;
import com.cloudsmith.publish.Native;
import com.cloudsmith.publish.NativeActions;
import com.cloudsmith.publish.NativePublisher;
import com.cloudsmith.publish.PHPActions;
import com.cloudsmith.publish.PHPExt;
import com.cloudsmith.publish.PHPPackage;
import com.cloudsmith.publish.PHPPublisher;
import com.cloudsmith.publish.PHPRuntime;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.Publishable;
import com.cloudsmith.publish.Publisher;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RPMActions;
import com.cloudsmith.publish.RPMPublisher;
import com.cloudsmith.publish.RepositoryDefinition;
import com.cloudsmith.publish.RepositoryPublisher;
import com.cloudsmith.publish.RubyActions;
import com.cloudsmith.publish.RubyPublisher;
import com.cloudsmith.publish.RubyRuntime;
import com.cloudsmith.publish.YumActions;
import com.cloudsmith.publish.YumPublisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PublishPackageImpl extends EPackageImpl implements PublishPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass publishableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rpmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nativeActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass irpmActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gemActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass publisherActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iNativeActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rpmActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rpmPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass igemActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gemPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repositoryDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repositoryPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rubyPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRubyActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rubyActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rubyRuntimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iExtNativeActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass extNativeActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nativePublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iphpActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpRuntimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass phpExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iYumActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass yumActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass yumPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iAptActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass aptActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass aptPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass yumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass aptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link PublishPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PublishPackage init() {
		if(isInited)
			return (PublishPackage) EPackage.Registry.INSTANCE.getEPackage(PublishPackage.eNS_URI);

		// Obtain or create and register package
		PublishPackageImpl thePublishPackage = (PublishPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PublishPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new PublishPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		B3BuildPackage.eINSTANCE.eClass();
		P2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		thePublishPackage.createPackageContents();

		// Initialize created meta-data
		thePublishPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePublishPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PublishPackage.eNS_URI, thePublishPackage);
		return thePublishPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.cloudsmith.publish.PublishPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PublishPackageImpl() {
		super(eNS_URI, PublishFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if(isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		publishableEClass = createEClass(PUBLISHABLE);

		rpmEClass = createEClass(RPM);

		gemEClass = createEClass(GEM);

		nativeActionsEClass = createEClass(NATIVE_ACTIONS);

		irpmActionsEClass = createEClass(IRPM_ACTIONS);

		gemActionsEClass = createEClass(GEM_ACTIONS);

		publisherEClass = createEClass(PUBLISHER);
		createEAttribute(publisherEClass, PUBLISHER__ID);
		createEAttribute(publisherEClass, PUBLISHER__SINGLETON);
		createEAttribute(publisherEClass, PUBLISHER__VERSION);
		createEAttribute(publisherEClass, PUBLISHER__COPYRIGHT_TEXT);
		createEAttribute(publisherEClass, PUBLISHER__COPYRIGHT_URL);
		createEAttribute(publisherEClass, PUBLISHER__LICENSE_TEXT);
		createEAttribute(publisherEClass, PUBLISHER__LICENSE_URL);
		createEAttribute(publisherEClass, PUBLISHER__RUNTIME_FILTER);
		createEAttribute(publisherEClass, PUBLISHER__PROPERTIES);
		createEReference(publisherEClass, PUBLISHER__WHEN_INSTALLING);
		createEReference(publisherEClass, PUBLISHER__WHEN_UNINSTALLING);
		createEReference(publisherEClass, PUBLISHER__WHEN_CONFIGURING);
		createEReference(publisherEClass, PUBLISHER__WHEN_UNCONFIGURING);
		createEAttribute(publisherEClass, PUBLISHER__NAME);
		createEReference(publisherEClass, PUBLISHER__UNIT);
		createEReference(publisherEClass, PUBLISHER__PROVIDES);
		createEReference(publisherEClass, PUBLISHER__REQUIRES);
		createEReference(publisherEClass, PUBLISHER__META_REQUIRES);
		createEReference(publisherEClass, PUBLISHER__USED_PACKAGES);
		createEReference(publisherEClass, PUBLISHER__NATIVE_ACTIONS);

		publisherActionEClass = createEClass(PUBLISHER_ACTION);
		createEAttribute(publisherActionEClass, PUBLISHER_ACTION__NAME);
		createEReference(publisherActionEClass, PUBLISHER_ACTION__PARAMETERS);
		createEReference(publisherActionEClass, PUBLISHER_ACTION__ACTION_PACKAGE);
		createEAttribute(publisherActionEClass, PUBLISHER_ACTION__QUALIFIED_NAME);

		actionParameterEClass = createEClass(ACTION_PARAMETER);
		createEAttribute(actionParameterEClass, ACTION_PARAMETER__NAME);
		createEAttribute(actionParameterEClass, ACTION_PARAMETER__VALUE);

		actionPackageEClass = createEClass(ACTION_PACKAGE);
		createEAttribute(actionPackageEClass, ACTION_PACKAGE__NAME);
		createEAttribute(actionPackageEClass, ACTION_PACKAGE__TOUCH_POINT);

		iNativeActionsEClass = createEClass(INATIVE_ACTIONS);

		rpmActionsEClass = createEClass(RPM_ACTIONS);

		rpmPublisherEClass = createEClass(RPM_PUBLISHER);
		createEAttribute(rpmPublisherEClass, RPM_PUBLISHER__RPM_INSTALL_DIR);
		createEReference(rpmPublisherEClass, RPM_PUBLISHER__RPM_ACTIONS);

		igemActionsEClass = createEClass(IGEM_ACTIONS);

		gemPublisherEClass = createEClass(GEM_PUBLISHER);
		createEReference(gemPublisherEClass, GEM_PUBLISHER__GEM_ACTIONS);

		repositoryDefinitionEClass = createEClass(REPOSITORY_DEFINITION);

		repositoryPublisherEClass = createEClass(REPOSITORY_PUBLISHER);

		rubyPublisherEClass = createEClass(RUBY_PUBLISHER);
		createEReference(rubyPublisherEClass, RUBY_PUBLISHER__RUBY_ACTIONS);

		iRubyActionsEClass = createEClass(IRUBY_ACTIONS);

		rubyActionsEClass = createEClass(RUBY_ACTIONS);

		rubyRuntimeEClass = createEClass(RUBY_RUNTIME);

		cSourceEClass = createEClass(CSOURCE);

		iExtNativeActionsEClass = createEClass(IEXT_NATIVE_ACTIONS);

		extNativeActionsEClass = createEClass(EXT_NATIVE_ACTIONS);

		nativePublisherEClass = createEClass(NATIVE_PUBLISHER);
		createEReference(nativePublisherEClass, NATIVE_PUBLISHER__EXT_NATIVE_ACTIONS);

		nativeEClass = createEClass(NATIVE);

		iphpActionsEClass = createEClass(IPHP_ACTIONS);

		phpActionsEClass = createEClass(PHP_ACTIONS);

		phpPublisherEClass = createEClass(PHP_PUBLISHER);
		createEReference(phpPublisherEClass, PHP_PUBLISHER__PHP_ACTIONS);

		phpRuntimeEClass = createEClass(PHP_RUNTIME);

		phpPackageEClass = createEClass(PHP_PACKAGE);

		phpEClass = createEClass(PHP);

		phpExtEClass = createEClass(PHP_EXT);

		iYumActionsEClass = createEClass(IYUM_ACTIONS);

		yumActionsEClass = createEClass(YUM_ACTIONS);

		yumPublisherEClass = createEClass(YUM_PUBLISHER);
		createEReference(yumPublisherEClass, YUM_PUBLISHER__YUM_ACTIONS);

		iAptActionsEClass = createEClass(IAPT_ACTIONS);

		aptActionsEClass = createEClass(APT_ACTIONS);

		aptPublisherEClass = createEClass(APT_PUBLISHER);
		createEReference(aptPublisherEClass, APT_PUBLISHER__APT_ACTIONS);

		yumEClass = createEClass(YUM);

		aptEClass = createEClass(APT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActionPackage() {
		return actionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getActionPackage_Name() {
		return (EAttribute) actionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getActionPackage_TouchPoint() {
		return (EAttribute) actionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActionParameter() {
		return actionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getActionParameter_Name() {
		return (EAttribute) actionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getActionParameter_Value() {
		return (EAttribute) actionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAPT() {
		return aptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAptActions() {
		return aptActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAptPublisher() {
		return aptPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAptPublisher_AptActions() {
		return (EReference) aptPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCSource() {
		return cSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExtNativeActions() {
		return extNativeActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGEM() {
		return gemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGEMActions() {
		return gemActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGEMPublisher() {
		return gemPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGEMPublisher_GemActions() {
		return (EReference) gemPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIAptActions() {
		return iAptActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIExtNativeActions() {
		return iExtNativeActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIGEMActions() {
		return igemActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getINativeActions() {
		return iNativeActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIPHPActions() {
		return iphpActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRPMActions() {
		return irpmActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRubyActions() {
		return iRubyActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIYumActions() {
		return iYumActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNative() {
		return nativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNativeActions() {
		return nativeActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNativePublisher() {
		return nativePublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNativePublisher_ExtNativeActions() {
		return (EReference) nativePublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHP() {
		return phpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHPActions() {
		return phpActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHPExt() {
		return phpExtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHPPackage() {
		return phpPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHPPublisher() {
		return phpPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPHPPublisher_PhpActions() {
		return (EReference) phpPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPHPRuntime() {
		return phpRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPublishable() {
		return publishableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_CopyrightText() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_CopyrightURL() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_Id() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_LicenseText() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_LicenseURL() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_MetaRequires() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_Name() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_NativeActions() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_Properties() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_Provides() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_Requires() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_RuntimeFilter() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_Singleton() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_Unit() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_UsedPackages() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisher_Version() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_WhenConfiguring() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_WhenInstalling() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_WhenUnconfiguring() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisher_WhenUninstalling() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPublisherAction() {
		return publisherActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisherAction_ActionPackage() {
		return (EReference) publisherActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisherAction_Name() {
		return (EAttribute) publisherActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPublisherAction_Parameters() {
		return (EReference) publisherActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPublisherAction_QualifiedName() {
		return (EAttribute) publisherActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublishFactory getPublishFactory() {
		return (PublishFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepositoryDefinition() {
		return repositoryDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepositoryPublisher() {
		return repositoryPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRPM() {
		return rpmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRPMActions() {
		return rpmActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRPMPublisher() {
		return rpmPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRPMPublisher_RpmActions() {
		return (EReference) rpmPublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRPMPublisher_RPMInstallDir() {
		return (EAttribute) rpmPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRubyActions() {
		return rubyActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRubyPublisher() {
		return rubyPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRubyPublisher_RubyActions() {
		return (EReference) rubyPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRubyRuntime() {
		return rubyRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getYUM() {
		return yumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getYumActions() {
		return yumActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getYumPublisher() {
		return yumPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getYumPublisher_YumActions() {
		return (EReference) yumPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if(isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		B3BuildPackage theB3BuildPackage = (B3BuildPackage) EPackage.Registry.INSTANCE.getEPackage(B3BuildPackage.eNS_URI);
		P2Package theP2Package = (P2Package) EPackage.Registry.INSTANCE.getEPackage(P2Package.eNS_URI);
		B3backendPackage theB3backendPackage = (B3backendPackage) EPackage.Registry.INSTANCE.getEPackage(B3backendPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		publishableEClass.getESuperTypes().add(theB3BuildPackage.getBuildUnit());
		rpmEClass.getESuperTypes().add(this.getPublishable());
		gemEClass.getESuperTypes().add(this.getPublishable());
		nativeActionsEClass.getESuperTypes().add(this.getActionPackage());
		nativeActionsEClass.getESuperTypes().add(this.getINativeActions());
		gemActionsEClass.getESuperTypes().add(this.getActionPackage());
		gemActionsEClass.getESuperTypes().add(this.getIGEMActions());
		publisherEClass.getESuperTypes().add(this.getINativeActions());
		rpmActionsEClass.getESuperTypes().add(this.getActionPackage());
		rpmActionsEClass.getESuperTypes().add(this.getIRPMActions());
		rpmPublisherEClass.getESuperTypes().add(this.getPublisher());
		rpmPublisherEClass.getESuperTypes().add(this.getIRPMActions());
		gemPublisherEClass.getESuperTypes().add(this.getPublisher());
		gemPublisherEClass.getESuperTypes().add(this.getIGEMActions());
		repositoryDefinitionEClass.getESuperTypes().add(this.getPublishable());
		rubyPublisherEClass.getESuperTypes().add(this.getPublisher());
		rubyPublisherEClass.getESuperTypes().add(this.getIRubyActions());
		rubyActionsEClass.getESuperTypes().add(this.getActionPackage());
		rubyActionsEClass.getESuperTypes().add(this.getIRubyActions());
		rubyRuntimeEClass.getESuperTypes().add(this.getPublishable());
		cSourceEClass.getESuperTypes().add(theB3BuildPackage.getBuildUnit());
		extNativeActionsEClass.getESuperTypes().add(this.getActionPackage());
		extNativeActionsEClass.getESuperTypes().add(this.getIExtNativeActions());
		nativePublisherEClass.getESuperTypes().add(this.getPublisher());
		nativePublisherEClass.getESuperTypes().add(this.getIExtNativeActions());
		nativeEClass.getESuperTypes().add(this.getPublishable());
		phpActionsEClass.getESuperTypes().add(this.getActionPackage());
		phpActionsEClass.getESuperTypes().add(this.getIPHPActions());
		phpPublisherEClass.getESuperTypes().add(this.getPublisher());
		phpPublisherEClass.getESuperTypes().add(this.getIPHPActions());
		phpRuntimeEClass.getESuperTypes().add(this.getPublishable());
		phpPackageEClass.getESuperTypes().add(this.getPublishable());
		phpEClass.getESuperTypes().add(this.getPHPPackage());
		phpExtEClass.getESuperTypes().add(this.getPHPPackage());
		yumActionsEClass.getESuperTypes().add(this.getActionPackage());
		yumActionsEClass.getESuperTypes().add(this.getIYumActions());
		yumPublisherEClass.getESuperTypes().add(this.getPublisher());
		yumPublisherEClass.getESuperTypes().add(this.getIYumActions());
		aptActionsEClass.getESuperTypes().add(this.getActionPackage());
		aptActionsEClass.getESuperTypes().add(this.getIAptActions());
		aptPublisherEClass.getESuperTypes().add(this.getPublisher());
		aptPublisherEClass.getESuperTypes().add(this.getIAptActions());
		yumEClass.getESuperTypes().add(this.getPublishable());
		aptEClass.getESuperTypes().add(this.getPublishable());

		// Initialize classes and features; add operations and parameters
		initEClass(
			publishableEClass, Publishable.class, "Publishable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(publishableEClass, theB3BuildPackage.getB3BuilderJob(), "publish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			rpmEClass, com.cloudsmith.publish.RPM.class, "RPM", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			gemEClass, com.cloudsmith.publish.GEM.class, "GEM", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			nativeActionsEClass, NativeActions.class, "NativeActions", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			irpmActionsEClass, IRPMActions.class, "IRPMActions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(irpmActionsEClass, this.getPublisherAction(), "installSRCRPM", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(irpmActionsEClass, this.getPublisherAction(), "uninstallSRCRPM", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(irpmActionsEClass, this.getPublisherAction(), "installRPM", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(irpmActionsEClass, this.getPublisherAction(), "uninstallRPM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			gemActionsEClass, GEMActions.class, "GEMActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getPublisher_Id(), ecorePackage.getEString(), "id", null, 0, 1, Publisher.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_Singleton(), ecorePackage.getEBoolean(), "singleton", "true", 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_Version(), theB3BuildPackage.getVersion(), "version", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_CopyrightURL(), ecorePackage.getEString(), "copyrightURL", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_LicenseText(), ecorePackage.getEString(), "licenseText", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_LicenseURL(), ecorePackage.getEString(), "licenseURL", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_RuntimeFilter(), ecorePackage.getEString(), "runtimeFilter", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theP2Package.getMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(
			getPublisher_Properties(), g1, "properties", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_WhenInstalling(), this.getPublisherAction(), null, "whenInstalling", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_WhenUninstalling(), this.getPublisherAction(), null, "whenUninstalling", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_WhenConfiguring(), this.getPublisherAction(), null, "whenConfiguring", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_WhenUnconfiguring(), this.getPublisherAction(), null, "whenUnconfiguring", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisher_Name(), ecorePackage.getEString(), "name", null, 0, 1, Publisher.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_Unit(), theB3BuildPackage.getBuildUnit(), null, "unit", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_Provides(), theB3BuildPackage.getCapability(), null, "provides", null, 0, -1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_Requires(), theB3BuildPackage.getRequiredCapability(), null, "requires", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_MetaRequires(), theB3BuildPackage.getRequiredCapability(), null, "metaRequires", null, 0, -1,
			Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_UsedPackages(), this.getActionPackage(), null, "usedPackages", null, 0, -1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisher_NativeActions(), this.getNativeActions(), null, "nativeActions", null, 0, 1, Publisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(
			publisherEClass, theB3BuildPackage.getBuildSet(), "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3BuildPackage.getBuildUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(publisherEClass, theB3BuildPackage.getBuildSet(), "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3BuildPackage.getBuildUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3BuildPackage.getBuildSet(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(publisherEClass, ecorePackage.getEString(), "getTouchpointType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			publisherEClass, theB3BuildPackage.getVersion(), "getTouchpointVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			publisherActionEClass, PublisherAction.class, "PublisherAction", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getPublisherAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, PublisherAction.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisherAction_Parameters(), this.getActionParameter(), null, "parameters", null, 0, -1,
			PublisherAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPublisherAction_ActionPackage(), this.getActionPackage(), null, "actionPackage", null, 1, 1,
			PublisherAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPublisherAction_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1,
			PublisherAction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);

		initEClass(
			actionParameterEClass, ActionParameter.class, "ActionParameter", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getActionParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionParameter.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getActionParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, ActionParameter.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			actionPackageEClass, ActionPackage.class, "ActionPackage", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getActionPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActionPackage.class, IS_TRANSIENT,
			IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getActionPackage_TouchPoint(), ecorePackage.getEString(), "touchPoint", null, 1, 1, ActionPackage.class,
			IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			iNativeActionsEClass, INativeActions.class, "INativeActions", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "link", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetDir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "linkTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "linkName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "force", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "unZip", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "cleanupZip", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "overwrite", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "cleanupCopy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "mkdir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "rmdir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "chmod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetDir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "permissions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "fetch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "cleanupFetch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iNativeActionsEClass, this.getPublisherAction(), "exec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getStringArray(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			rpmActionsEClass, RPMActions.class, "RPMActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			rpmPublisherEClass, RPMPublisher.class, "RPMPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getRPMPublisher_RPMInstallDir(), ecorePackage.getEString(), "RPMInstallDir", null, 0, 1,
			RPMPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getRPMPublisher_RpmActions(), this.getRPMActions(), null, "rpmActions", null, 0, 1, RPMPublisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			igemActionsEClass, IGEMActions.class, "IGEMActions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(igemActionsEClass, this.getPublisherAction(), "installGEM", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(igemActionsEClass, this.getPublisherAction(), "uninstallGEM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			gemPublisherEClass, GEMPublisher.class, "GEMPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getGEMPublisher_GemActions(), this.getGEMActions(), null, "gemActions", null, 0, 1, GEMPublisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			repositoryDefinitionEClass, RepositoryDefinition.class, "RepositoryDefinition", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			repositoryPublisherEClass, RepositoryPublisher.class, "RepositoryPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			repositoryPublisherEClass, theB3BuildPackage.getBuildSet(), "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3BuildPackage.getBuildUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3BuildPackage.getBuildSet(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			rubyPublisherEClass, RubyPublisher.class, "RubyPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getRubyPublisher_RubyActions(), this.getRubyActions(), null, "rubyActions", null, 0, 1,
			RubyPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			iRubyActionsEClass, IRubyActions.class, "IRubyActions", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		addEOperation(
			iRubyActionsEClass, this.getPublisherAction(), "installRubyEnterpriseFromCSource", 0, 1, IS_UNIQUE,
			IS_ORDERED);

		addEOperation(
			iRubyActionsEClass, this.getPublisherAction(), "uninstallRubyEnterpriseFromCSource", 0, 1, IS_UNIQUE,
			IS_ORDERED);

		op = addEOperation(
			iRubyActionsEClass, this.getPublisherAction(), "installPassenger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "server", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			iRubyActionsEClass, this.getPublisherAction(), "uninstallPassenger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "server", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			rubyActionsEClass, RubyActions.class, "RubyActions", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			rubyRuntimeEClass, RubyRuntime.class, "RubyRuntime", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cSourceEClass, CSource.class, "CSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iExtNativeActionsEClass, IExtNativeActions.class, "IExtNativeActions", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		addEOperation(
			iExtNativeActionsEClass, this.getPublisherAction(), "installFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			iExtNativeActionsEClass, this.getPublisherAction(), "uninstallFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			extNativeActionsEClass, ExtNativeActions.class, "ExtNativeActions", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			nativePublisherEClass, NativePublisher.class, "NativePublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getNativePublisher_ExtNativeActions(), this.getExtNativeActions(), null, "extNativeActions", null, 0, 1,
			NativePublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeEClass, Native.class, "Native", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iphpActionsEClass, IPHPActions.class, "IPHPActions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "installPHP", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "uninstallPHP", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "installPHPRuntime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "uninstallPHPRuntime", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "installPHPExt", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iphpActionsEClass, this.getPublisherAction(), "uninstallPHPExt", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			iphpActionsEClass, this.getPublisherAction(), "installPHPRuntimeFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			iphpActionsEClass, this.getPublisherAction(), "uninstallPHPRuntimeFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			iphpActionsEClass, this.getPublisherAction(), "installPHPExtFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			iphpActionsEClass, this.getPublisherAction(), "uninstallPHPExtFromCSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			phpActionsEClass, PHPActions.class, "PHPActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			phpPublisherEClass, PHPPublisher.class, "PHPPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPHPPublisher_PhpActions(), this.getPHPActions(), null, "phpActions", null, 0, 1, PHPPublisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			phpRuntimeEClass, PHPRuntime.class, "PHPRuntime", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			phpPackageEClass, PHPPackage.class, "PHPPackage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			phpEClass, com.cloudsmith.publish.PHP.class, "PHP", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phpExtEClass, PHPExt.class, "PHPExt", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iYumActionsEClass, IYumActions.class, "IYumActions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			yumActionsEClass, YumActions.class, "YumActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			yumPublisherEClass, YumPublisher.class, "YumPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getYumPublisher_YumActions(), this.getYumActions(), null, "yumActions", null, 0, 1, YumPublisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			iAptActionsEClass, IAptActions.class, "IAptActions", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			aptActionsEClass, AptActions.class, "AptActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			aptPublisherEClass, AptPublisher.class, "AptPublisher", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAptPublisher_AptActions(), this.getAptActions(), null, "aptActions", null, 0, 1, AptPublisher.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			yumEClass, com.cloudsmith.publish.YUM.class, "YUM", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			aptEClass, com.cloudsmith.publish.APT.class, "APT", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // PublishPackageImpl
