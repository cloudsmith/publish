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
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.cloudsmith.publish.PublishPackage
 * @generated
 */
public class PublishSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PublishPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishSwitch() {
		if (modelPackage == null) {
			modelPackage = PublishPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PublishPackage.IP2_PUBLISHABLE: {
			IP2Publishable ip2Publishable = (IP2Publishable) theEObject;
			T result = caseIP2Publishable(ip2Publishable);
			if (result == null)
				result = caseBuildUnit(ip2Publishable);
			if (result == null)
				result = caseVersionedCapability(ip2Publishable);
			if (result == null)
				result = caseBFunctionContainer(ip2Publishable);
			if (result == null)
				result = caseIRequiredCapabilityContainer(ip2Publishable);
			if (result == null)
				result = caseIProvidedCapabilityContainer(ip2Publishable);
			if (result == null)
				result = caseCapability(ip2Publishable);
			if (result == null)
				result = caseINamedValue(ip2Publishable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.RPM: {
			RPM rpm = (RPM) theEObject;
			T result = caseRPM(rpm);
			if (result == null)
				result = caseIP2Publishable(rpm);
			if (result == null)
				result = caseBuildUnit(rpm);
			if (result == null)
				result = caseVersionedCapability(rpm);
			if (result == null)
				result = caseBFunctionContainer(rpm);
			if (result == null)
				result = caseIRequiredCapabilityContainer(rpm);
			if (result == null)
				result = caseIProvidedCapabilityContainer(rpm);
			if (result == null)
				result = caseCapability(rpm);
			if (result == null)
				result = caseINamedValue(rpm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.GEM: {
			GEM gem = (GEM) theEObject;
			T result = caseGEM(gem);
			if (result == null)
				result = caseIP2Publishable(gem);
			if (result == null)
				result = caseBuildUnit(gem);
			if (result == null)
				result = caseVersionedCapability(gem);
			if (result == null)
				result = caseBFunctionContainer(gem);
			if (result == null)
				result = caseIRequiredCapabilityContainer(gem);
			if (result == null)
				result = caseIProvidedCapabilityContainer(gem);
			if (result == null)
				result = caseCapability(gem);
			if (result == null)
				result = caseINamedValue(gem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.NATIVE_ACTIONS: {
			NativeActions nativeActions = (NativeActions) theEObject;
			T result = caseNativeActions(nativeActions);
			if (result == null)
				result = caseActionPackage(nativeActions);
			if (result == null)
				result = caseINativeActions(nativeActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.IRPM_ACTIONS: {
			IRPMActions irpmActions = (IRPMActions) theEObject;
			T result = caseIRPMActions(irpmActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.GEM_ACTIONS: {
			GEMActions gemActions = (GEMActions) theEObject;
			T result = caseGEMActions(gemActions);
			if (result == null)
				result = caseActionPackage(gemActions);
			if (result == null)
				result = caseIGEMActions(gemActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.PUBLISHER: {
			Publisher publisher = (Publisher) theEObject;
			T result = casePublisher(publisher);
			if (result == null)
				result = caseINativeActions(publisher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.PUBLISHER_ACTION: {
			PublisherAction publisherAction = (PublisherAction) theEObject;
			T result = casePublisherAction(publisherAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.ACTION_PARAMETER: {
			ActionParameter actionParameter = (ActionParameter) theEObject;
			T result = caseActionParameter(actionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.ACTION_PACKAGE: {
			ActionPackage actionPackage = (ActionPackage) theEObject;
			T result = caseActionPackage(actionPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.INATIVE_ACTIONS: {
			INativeActions iNativeActions = (INativeActions) theEObject;
			T result = caseINativeActions(iNativeActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.RPM_ACTIONS: {
			RPMActions rpmActions = (RPMActions) theEObject;
			T result = caseRPMActions(rpmActions);
			if (result == null)
				result = caseActionPackage(rpmActions);
			if (result == null)
				result = caseIRPMActions(rpmActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.RPM_PUBLISHER: {
			RPMPublisher rpmPublisher = (RPMPublisher) theEObject;
			T result = caseRPMPublisher(rpmPublisher);
			if (result == null)
				result = casePublisher(rpmPublisher);
			if (result == null)
				result = caseIRPMActions(rpmPublisher);
			if (result == null)
				result = caseINativeActions(rpmPublisher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.IGEM_ACTIONS: {
			IGEMActions igemActions = (IGEMActions) theEObject;
			T result = caseIGEMActions(igemActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PublishPackage.GEM_PUBLISHER: {
			GEMPublisher gemPublisher = (GEMPublisher) theEObject;
			T result = caseGEMPublisher(gemPublisher);
			if (result == null)
				result = casePublisher(gemPublisher);
			if (result == null)
				result = caseIGEMActions(gemPublisher);
			if (result == null)
				result = caseINativeActions(gemPublisher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP2 Publishable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP2 Publishable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIP2Publishable(IP2Publishable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPM(RPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEM(GEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeActions(NativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRPM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRPM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRPMActions(IRPMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEMActions(GEMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
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
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherAction(PublisherAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionParameter(ActionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionPackage(ActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INative Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INative Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINativeActions(INativeActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
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
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPMPublisher(RPMPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGEM Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGEM Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGEMActions(IGEMActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEM Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEM Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEMPublisher(GEMPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedValue(INamedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedCapability(VersionedCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionContainer(BFunctionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRequiredCapabilityContainer(
			IRequiredCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvidedCapabilityContainer(
			IProvidedCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildUnit(BuildUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //PublishSwitch
