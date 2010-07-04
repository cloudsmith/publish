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
package com.cloudsmith.publish.util;

import com.cloudsmith.publish.*;

import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;

import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.VersionedCapability;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.publish.PublishPackage
 * @generated
 */
public class PublishAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static PublishPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PublishSwitch<Adapter> modelSwitch = new PublishSwitch<Adapter>() {
		@Override
		public Adapter caseActionPackage(ActionPackage object) {
			return createActionPackageAdapter();
		}

		@Override
		public Adapter caseActionParameter(ActionParameter object) {
			return createActionParameterAdapter();
		}

		@Override
		public Adapter caseBFunctionContainer(BFunctionContainer object) {
			return createBFunctionContainerAdapter();
		}

		@Override
		public Adapter caseBuildUnit(BuildUnit object) {
			return createBuildUnitAdapter();
		}

		@Override
		public Adapter caseCapability(Capability object) {
			return createCapabilityAdapter();
		}

		@Override
		public Adapter caseCSource(CSource object) {
			return createCSourceAdapter();
		}

		@Override
		public Adapter caseGEM(GEM object) {
			return createGEMAdapter();
		}

		@Override
		public Adapter caseGEMActions(GEMActions object) {
			return createGEMActionsAdapter();
		}

		@Override
		public Adapter caseGEMPublisher(GEMPublisher object) {
			return createGEMPublisherAdapter();
		}

		@Override
		public Adapter caseIGEMActions(IGEMActions object) {
			return createIGEMActionsAdapter();
		}

		@Override
		public Adapter caseINamedValue(INamedValue object) {
			return createINamedValueAdapter();
		}

		@Override
		public Adapter caseINativeActions(INativeActions object) {
			return createINativeActionsAdapter();
		}

		@Override
		public Adapter caseIProvidedCapabilityContainer(IProvidedCapabilityContainer object) {
			return createIProvidedCapabilityContainerAdapter();
		}

		@Override
		public Adapter caseIRequiredCapabilityContainer(IRequiredCapabilityContainer object) {
			return createIRequiredCapabilityContainerAdapter();
		}

		@Override
		public Adapter caseIRPMActions(IRPMActions object) {
			return createIRPMActionsAdapter();
		}

		@Override
		public Adapter caseIRubyActions(IRubyActions object) {
			return createIRubyActionsAdapter();
		}

		@Override
		public Adapter caseNativeActions(NativeActions object) {
			return createNativeActionsAdapter();
		}

		@Override
		public Adapter casePublishable(Publishable object) {
			return createPublishableAdapter();
		}

		@Override
		public Adapter casePublisher(Publisher object) {
			return createPublisherAdapter();
		}

		@Override
		public Adapter casePublisherAction(PublisherAction object) {
			return createPublisherActionAdapter();
		}

		@Override
		public Adapter caseRepositoryDefinition(RepositoryDefinition object) {
			return createRepositoryDefinitionAdapter();
		}

		@Override
		public Adapter caseRepositoryPublisher(RepositoryPublisher object) {
			return createRepositoryPublisherAdapter();
		}

		@Override
		public Adapter caseRPM(RPM object) {
			return createRPMAdapter();
		}

		@Override
		public Adapter caseRPMActions(RPMActions object) {
			return createRPMActionsAdapter();
		}

		@Override
		public Adapter caseRPMPublisher(RPMPublisher object) {
			return createRPMPublisherAdapter();
		}

		@Override
		public Adapter caseRubyActions(RubyActions object) {
			return createRubyActionsAdapter();
		}

		@Override
		public Adapter caseRubyPublisher(RubyPublisher object) {
			return createRubyPublisherAdapter();
		}

		@Override
		public Adapter caseRubyRuntime(RubyRuntime object) {
			return createRubyRuntimeAdapter();
		}

		@Override
		public Adapter caseVersionedCapability(VersionedCapability object) {
			return createVersionedCapabilityAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublishAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = PublishPackage.eINSTANCE;
		}
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.ActionPackage <em>Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.ActionPackage
	 * @generated
	 */
	public Adapter createActionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.ActionParameter <em>Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.ActionParameter
	 * @generated
	 */
	public Adapter createActionParameterAdapter() {
		return null;
	}

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * <em>BFunction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * @generated
	 */
	public Adapter createBFunctionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.BuildUnit
	 * @generated
	 */
	public Adapter createBuildUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.CSource <em>CSource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.CSource
	 * @generated
	 */
	public Adapter createCSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.GEMActions <em>GEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.GEMActions
	 * @generated
	 */
	public Adapter createGEMActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.GEM <em>GEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.GEM
	 * @generated
	 */
	public Adapter createGEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.GEMPublisher <em>GEM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.GEMPublisher
	 * @generated
	 */
	public Adapter createGEMPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.IGEMActions <em>IGEM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.IGEMActions
	 * @generated
	 */
	public Adapter createIGEMActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.INamedValue <em>INamed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.INamedValue
	 * @generated
	 */
	public Adapter createINamedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.INativeActions <em>INative Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.INativeActions
	 * @generated
	 */
	public Adapter createINativeActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.IProvidedCapabilityContainer
	 * @generated
	 */
	public Adapter createIProvidedCapabilityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.IRequiredCapabilityContainer
	 * @generated
	 */
	public Adapter createIRequiredCapabilityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.IRPMActions <em>IRPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.IRPMActions
	 * @generated
	 */
	public Adapter createIRPMActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.IRubyActions <em>IRuby Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.IRubyActions
	 * @generated
	 */
	public Adapter createIRubyActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.NativeActions <em>Native Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.NativeActions
	 * @generated
	 */
	public Adapter createNativeActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.Publishable <em>Publishable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.Publishable
	 * @generated
	 */
	public Adapter createPublishableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.PublisherAction <em>Publisher Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.PublisherAction
	 * @generated
	 */
	public Adapter createPublisherActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RepositoryDefinition <em>Repository Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RepositoryDefinition
	 * @generated
	 */
	public Adapter createRepositoryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RepositoryPublisher <em>Repository Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RepositoryPublisher
	 * @generated
	 */
	public Adapter createRepositoryPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RPMActions <em>RPM Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RPMActions
	 * @generated
	 */
	public Adapter createRPMActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RPM
	 * @generated
	 */
	public Adapter createRPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RPMPublisher <em>RPM Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RPMPublisher
	 * @generated
	 */
	public Adapter createRPMPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RubyActions <em>Ruby Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RubyActions
	 * @generated
	 */
	public Adapter createRubyActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RubyPublisher <em>Ruby Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RubyPublisher
	 * @generated
	 */
	public Adapter createRubyPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.publish.RubyRuntime <em>Ruby Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.publish.RubyRuntime
	 * @generated
	 */
	public Adapter createRubyRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.VersionedCapability <em>Versioned Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.VersionedCapability
	 * @generated
	 */
	public Adapter createVersionedCapabilityAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if(object == modelPackage) {
			return true;
		}
		if(object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // PublishAdapterFactory
