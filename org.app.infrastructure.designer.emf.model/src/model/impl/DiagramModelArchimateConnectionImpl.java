/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.DiagramModelArchimateConnection;
import model.Folder;
import model.ModelPackage;
import model.Relationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Archimate Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DiagramModelArchimateConnectionImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramModelArchimateConnectionImpl extends DiagramModelConnectionImpl implements DiagramModelArchimateConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModelArchimateConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIAGRAM_MODEL_ARCHIMATE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationship() {
		// TODO: implement this method to return the 'Relationship' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Relationship newRelationship) {
		// TODO: implement this method to set the 'Relationship' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRelationshipToModel(Folder parent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRelationshipFromModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				return getRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				setRelationship((Relationship)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				setRelationship((Relationship)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				return getRelationship() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION___ADD_RELATIONSHIP_TO_MODEL__FOLDER:
				addRelationshipToModel((Folder)arguments.get(0));
				return null;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION___REMOVE_RELATIONSHIP_FROM_MODEL:
				removeRelationshipFromModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiagramModelArchimateConnectionImpl
