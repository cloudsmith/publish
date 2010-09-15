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

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;

import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.IVarName;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.VersionedCapability;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.publish.PublishPackage
 * @generated
 */
public class PublishSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static PublishPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublishSwitch() {
		if(modelPackage == null) {
			modelPackage = PublishPackage.eINSTANCE;
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionPackage(ActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionParameter(ActionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionContainer(BFunctionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildUnit(BuildUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSource(CSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Native Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Native Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtNativeActions(ExtNativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEM(GEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEMActions(GEMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEMPublisher(GEMPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IExt Native Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IExt Native Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIExtNativeActions(IExtNativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGEM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGEM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGEMActions(IGEMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedValue(INamedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INative Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INative Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINativeActions(INativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPHP Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPHP Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPHPActions(IPHPActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvidedCapabilityContainer(IProvidedCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRequiredCapabilityContainer(IRequiredCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRPM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRPM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRPMActions(IRPMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRuby Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRuby Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRubyActions(IRubyActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVar Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVar Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVarName(IVarName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNative(Native object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeActions(NativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativePublisher(NativePublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePear(Pear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePecl(Pecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHP Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHPActions(PHPActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHP Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHPPackage(PHPPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHP Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHPPublisher(PHPPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHP Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHPRuntime(PHPRuntime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishable(Publishable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherAction(PublisherAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryDefinition(RepositoryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryPublisher(RepositoryPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPM(RPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPMActions(RPMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPMPublisher(RPMPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyActions(RubyActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyPublisher(RubyPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyRuntime(RubyRuntime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedCapability(VersionedCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if(theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch(classifierID) {
			case PublishPackage.PUBLISHABLE: {
				Publishable publishable = (Publishable) theEObject;
				T result = casePublishable(publishable);
				if(result == null)
					result = caseBuildUnit(publishable);
				if(result == null)
					result = caseVersionedCapability(publishable);
				if(result == null)
					result = caseBFunctionContainer(publishable);
				if(result == null)
					result = caseIRequiredCapabilityContainer(publishable);
				if(result == null)
					result = caseIProvidedCapabilityContainer(publishable);
				if(result == null)
					result = caseIVarName(publishable);
				if(result == null)
					result = caseCapability(publishable);
				if(result == null)
					result = caseINamedValue(publishable);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RPM: {
				RPM rpm = (RPM) theEObject;
				T result = caseRPM(rpm);
				if(result == null)
					result = casePublishable(rpm);
				if(result == null)
					result = caseBuildUnit(rpm);
				if(result == null)
					result = caseVersionedCapability(rpm);
				if(result == null)
					result = caseBFunctionContainer(rpm);
				if(result == null)
					result = caseIRequiredCapabilityContainer(rpm);
				if(result == null)
					result = caseIProvidedCapabilityContainer(rpm);
				if(result == null)
					result = caseIVarName(rpm);
				if(result == null)
					result = caseCapability(rpm);
				if(result == null)
					result = caseINamedValue(rpm);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.GEM: {
				GEM gem = (GEM) theEObject;
				T result = caseGEM(gem);
				if(result == null)
					result = casePublishable(gem);
				if(result == null)
					result = caseBuildUnit(gem);
				if(result == null)
					result = caseVersionedCapability(gem);
				if(result == null)
					result = caseBFunctionContainer(gem);
				if(result == null)
					result = caseIRequiredCapabilityContainer(gem);
				if(result == null)
					result = caseIProvidedCapabilityContainer(gem);
				if(result == null)
					result = caseIVarName(gem);
				if(result == null)
					result = caseCapability(gem);
				if(result == null)
					result = caseINamedValue(gem);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.NATIVE_ACTIONS: {
				NativeActions nativeActions = (NativeActions) theEObject;
				T result = caseNativeActions(nativeActions);
				if(result == null)
					result = caseActionPackage(nativeActions);
				if(result == null)
					result = caseINativeActions(nativeActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.IRPM_ACTIONS: {
				IRPMActions irpmActions = (IRPMActions) theEObject;
				T result = caseIRPMActions(irpmActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.GEM_ACTIONS: {
				GEMActions gemActions = (GEMActions) theEObject;
				T result = caseGEMActions(gemActions);
				if(result == null)
					result = caseActionPackage(gemActions);
				if(result == null)
					result = caseIGEMActions(gemActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PUBLISHER: {
				Publisher publisher = (Publisher) theEObject;
				T result = casePublisher(publisher);
				if(result == null)
					result = caseINativeActions(publisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PUBLISHER_ACTION: {
				PublisherAction publisherAction = (PublisherAction) theEObject;
				T result = casePublisherAction(publisherAction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.ACTION_PARAMETER: {
				ActionParameter actionParameter = (ActionParameter) theEObject;
				T result = caseActionParameter(actionParameter);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.ACTION_PACKAGE: {
				ActionPackage actionPackage = (ActionPackage) theEObject;
				T result = caseActionPackage(actionPackage);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.INATIVE_ACTIONS: {
				INativeActions iNativeActions = (INativeActions) theEObject;
				T result = caseINativeActions(iNativeActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RPM_ACTIONS: {
				RPMActions rpmActions = (RPMActions) theEObject;
				T result = caseRPMActions(rpmActions);
				if(result == null)
					result = caseActionPackage(rpmActions);
				if(result == null)
					result = caseIRPMActions(rpmActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RPM_PUBLISHER: {
				RPMPublisher rpmPublisher = (RPMPublisher) theEObject;
				T result = caseRPMPublisher(rpmPublisher);
				if(result == null)
					result = casePublisher(rpmPublisher);
				if(result == null)
					result = caseIRPMActions(rpmPublisher);
				if(result == null)
					result = caseINativeActions(rpmPublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.IGEM_ACTIONS: {
				IGEMActions igemActions = (IGEMActions) theEObject;
				T result = caseIGEMActions(igemActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.GEM_PUBLISHER: {
				GEMPublisher gemPublisher = (GEMPublisher) theEObject;
				T result = caseGEMPublisher(gemPublisher);
				if(result == null)
					result = casePublisher(gemPublisher);
				if(result == null)
					result = caseIGEMActions(gemPublisher);
				if(result == null)
					result = caseINativeActions(gemPublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.REPOSITORY_DEFINITION: {
				RepositoryDefinition repositoryDefinition = (RepositoryDefinition) theEObject;
				T result = caseRepositoryDefinition(repositoryDefinition);
				if(result == null)
					result = casePublishable(repositoryDefinition);
				if(result == null)
					result = caseBuildUnit(repositoryDefinition);
				if(result == null)
					result = caseVersionedCapability(repositoryDefinition);
				if(result == null)
					result = caseBFunctionContainer(repositoryDefinition);
				if(result == null)
					result = caseIRequiredCapabilityContainer(repositoryDefinition);
				if(result == null)
					result = caseIProvidedCapabilityContainer(repositoryDefinition);
				if(result == null)
					result = caseIVarName(repositoryDefinition);
				if(result == null)
					result = caseCapability(repositoryDefinition);
				if(result == null)
					result = caseINamedValue(repositoryDefinition);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.REPOSITORY_PUBLISHER: {
				RepositoryPublisher repositoryPublisher = (RepositoryPublisher) theEObject;
				T result = caseRepositoryPublisher(repositoryPublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RUBY_PUBLISHER: {
				RubyPublisher rubyPublisher = (RubyPublisher) theEObject;
				T result = caseRubyPublisher(rubyPublisher);
				if(result == null)
					result = casePublisher(rubyPublisher);
				if(result == null)
					result = caseIRubyActions(rubyPublisher);
				if(result == null)
					result = caseINativeActions(rubyPublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.IRUBY_ACTIONS: {
				IRubyActions iRubyActions = (IRubyActions) theEObject;
				T result = caseIRubyActions(iRubyActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RUBY_ACTIONS: {
				RubyActions rubyActions = (RubyActions) theEObject;
				T result = caseRubyActions(rubyActions);
				if(result == null)
					result = caseActionPackage(rubyActions);
				if(result == null)
					result = caseIRubyActions(rubyActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.RUBY_RUNTIME: {
				RubyRuntime rubyRuntime = (RubyRuntime) theEObject;
				T result = caseRubyRuntime(rubyRuntime);
				if(result == null)
					result = casePublishable(rubyRuntime);
				if(result == null)
					result = caseBuildUnit(rubyRuntime);
				if(result == null)
					result = caseVersionedCapability(rubyRuntime);
				if(result == null)
					result = caseBFunctionContainer(rubyRuntime);
				if(result == null)
					result = caseIRequiredCapabilityContainer(rubyRuntime);
				if(result == null)
					result = caseIProvidedCapabilityContainer(rubyRuntime);
				if(result == null)
					result = caseIVarName(rubyRuntime);
				if(result == null)
					result = caseCapability(rubyRuntime);
				if(result == null)
					result = caseINamedValue(rubyRuntime);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.CSOURCE: {
				CSource cSource = (CSource) theEObject;
				T result = caseCSource(cSource);
				if(result == null)
					result = caseBuildUnit(cSource);
				if(result == null)
					result = caseVersionedCapability(cSource);
				if(result == null)
					result = caseBFunctionContainer(cSource);
				if(result == null)
					result = caseIRequiredCapabilityContainer(cSource);
				if(result == null)
					result = caseIProvidedCapabilityContainer(cSource);
				if(result == null)
					result = caseIVarName(cSource);
				if(result == null)
					result = caseCapability(cSource);
				if(result == null)
					result = caseINamedValue(cSource);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.IEXT_NATIVE_ACTIONS: {
				IExtNativeActions iExtNativeActions = (IExtNativeActions) theEObject;
				T result = caseIExtNativeActions(iExtNativeActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.EXT_NATIVE_ACTIONS: {
				ExtNativeActions extNativeActions = (ExtNativeActions) theEObject;
				T result = caseExtNativeActions(extNativeActions);
				if(result == null)
					result = caseActionPackage(extNativeActions);
				if(result == null)
					result = caseIExtNativeActions(extNativeActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.NATIVE_PUBLISHER: {
				NativePublisher nativePublisher = (NativePublisher) theEObject;
				T result = caseNativePublisher(nativePublisher);
				if(result == null)
					result = casePublisher(nativePublisher);
				if(result == null)
					result = caseIExtNativeActions(nativePublisher);
				if(result == null)
					result = caseINativeActions(nativePublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.NATIVE: {
				Native native_ = (Native) theEObject;
				T result = caseNative(native_);
				if(result == null)
					result = casePublishable(native_);
				if(result == null)
					result = caseBuildUnit(native_);
				if(result == null)
					result = caseVersionedCapability(native_);
				if(result == null)
					result = caseBFunctionContainer(native_);
				if(result == null)
					result = caseIRequiredCapabilityContainer(native_);
				if(result == null)
					result = caseIProvidedCapabilityContainer(native_);
				if(result == null)
					result = caseIVarName(native_);
				if(result == null)
					result = caseCapability(native_);
				if(result == null)
					result = caseINamedValue(native_);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.IPHP_ACTIONS: {
				IPHPActions iphpActions = (IPHPActions) theEObject;
				T result = caseIPHPActions(iphpActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PHP_ACTIONS: {
				PHPActions phpActions = (PHPActions) theEObject;
				T result = casePHPActions(phpActions);
				if(result == null)
					result = caseActionPackage(phpActions);
				if(result == null)
					result = caseIPHPActions(phpActions);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PHP_PUBLISHER: {
				PHPPublisher phpPublisher = (PHPPublisher) theEObject;
				T result = casePHPPublisher(phpPublisher);
				if(result == null)
					result = casePublisher(phpPublisher);
				if(result == null)
					result = caseIPHPActions(phpPublisher);
				if(result == null)
					result = caseINativeActions(phpPublisher);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PHP_RUNTIME: {
				PHPRuntime phpRuntime = (PHPRuntime) theEObject;
				T result = casePHPRuntime(phpRuntime);
				if(result == null)
					result = casePublishable(phpRuntime);
				if(result == null)
					result = caseBuildUnit(phpRuntime);
				if(result == null)
					result = caseVersionedCapability(phpRuntime);
				if(result == null)
					result = caseBFunctionContainer(phpRuntime);
				if(result == null)
					result = caseIRequiredCapabilityContainer(phpRuntime);
				if(result == null)
					result = caseIProvidedCapabilityContainer(phpRuntime);
				if(result == null)
					result = caseIVarName(phpRuntime);
				if(result == null)
					result = caseCapability(phpRuntime);
				if(result == null)
					result = caseINamedValue(phpRuntime);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PHP_PACKAGE: {
				PHPPackage phpPackage = (PHPPackage) theEObject;
				T result = casePHPPackage(phpPackage);
				if(result == null)
					result = casePublishable(phpPackage);
				if(result == null)
					result = caseBuildUnit(phpPackage);
				if(result == null)
					result = caseVersionedCapability(phpPackage);
				if(result == null)
					result = caseBFunctionContainer(phpPackage);
				if(result == null)
					result = caseIRequiredCapabilityContainer(phpPackage);
				if(result == null)
					result = caseIProvidedCapabilityContainer(phpPackage);
				if(result == null)
					result = caseIVarName(phpPackage);
				if(result == null)
					result = caseCapability(phpPackage);
				if(result == null)
					result = caseINamedValue(phpPackage);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PEAR: {
				Pear pear = (Pear) theEObject;
				T result = casePear(pear);
				if(result == null)
					result = casePHPPackage(pear);
				if(result == null)
					result = casePublishable(pear);
				if(result == null)
					result = caseBuildUnit(pear);
				if(result == null)
					result = caseVersionedCapability(pear);
				if(result == null)
					result = caseBFunctionContainer(pear);
				if(result == null)
					result = caseIRequiredCapabilityContainer(pear);
				if(result == null)
					result = caseIProvidedCapabilityContainer(pear);
				if(result == null)
					result = caseIVarName(pear);
				if(result == null)
					result = caseCapability(pear);
				if(result == null)
					result = caseINamedValue(pear);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PublishPackage.PECL: {
				Pecl pecl = (Pecl) theEObject;
				T result = casePecl(pecl);
				if(result == null)
					result = casePHPPackage(pecl);
				if(result == null)
					result = casePublishable(pecl);
				if(result == null)
					result = caseBuildUnit(pecl);
				if(result == null)
					result = caseVersionedCapability(pecl);
				if(result == null)
					result = caseBFunctionContainer(pecl);
				if(result == null)
					result = caseIRequiredCapabilityContainer(pecl);
				if(result == null)
					result = caseIProvidedCapabilityContainer(pecl);
				if(result == null)
					result = caseIVarName(pecl);
				if(result == null)
					result = caseCapability(pecl);
				if(result == null)
					result = caseINamedValue(pecl);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

} // PublishSwitch
