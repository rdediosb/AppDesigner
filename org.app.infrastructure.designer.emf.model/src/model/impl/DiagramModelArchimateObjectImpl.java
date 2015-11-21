/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.ArchimateElement;
import model.DiagramModelArchimateObject;
import model.DiagramModelContainer;
import model.DiagramModelObject;
import model.Folder;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Archimate Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DiagramModelArchimateObjectImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link model.impl.DiagramModelArchimateObjectImpl#getArchimateElement <em>Archimate Element</em>}</li>
 *   <li>{@link model.impl.DiagramModelArchimateObjectImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramModelArchimateObjectImpl extends DiagramModelObjectImpl implements DiagramModelArchimateObject {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramModelObject> children;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected int type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModelArchimateObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<DiagramModelObject>(DiagramModelObject.class, this, ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateElement getArchimateElement() {
		// TODO: implement this method to return the 'Archimate Element' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchimateElement(ArchimateElement newArchimateElement) {
		// TODO: implement this method to set the 'Archimate Element' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(int newType) {
		int oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addArchimateElementToModel(Folder parent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeArchimateElementFromModel() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return getChildren();
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				return getArchimateElement();
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DiagramModelObject>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				setArchimateElement((ArchimateElement)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
				setType((Integer)newValue);
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
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				getChildren().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				setArchimateElement((ArchimateElement)null);
				return;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				return getArchimateElement() != null;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN: return ModelPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DiagramModelContainer.class) {
			switch (baseFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT___ADD_ARCHIMATE_ELEMENT_TO_MODEL__FOLDER:
				addArchimateElementToModel((Folder)arguments.get(0));
				return null;
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT___REMOVE_ARCHIMATE_ELEMENT_FROM_MODEL:
				removeArchimateElementFromModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DiagramModelArchimateObjectImpl
