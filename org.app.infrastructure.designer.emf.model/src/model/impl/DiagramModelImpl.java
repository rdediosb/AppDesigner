/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.ArchimateModel;
import model.DiagramModel;
import model.DiagramModelComponent;
import model.DiagramModelContainer;
import model.DiagramModelObject;
import model.Documentable;
import model.Identifier;
import model.ModelPackage;
import model.Nameable;
import model.Properties;
import model.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DiagramModelImpl#getArchimateModel <em>Archimate Model</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getDiagramModel <em>Diagram Model</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link model.impl.DiagramModelImpl#getConnectionRouterType <em>Connection Router Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramModelImpl extends MinimalEObjectImpl.Container implements DiagramModel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getConnectionRouterType() <em>Connection Router Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionRouterType()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTION_ROUTER_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectionRouterType() <em>Connection Router Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionRouterType()
	 * @generated
	 * @ordered
	 */
	protected int connectionRouterType = CONNECTION_ROUTER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIAGRAM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateModel getArchimateModel() {
		// TODO: implement this method to return the 'Archimate Model' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModel getDiagramModel() {
		// TODO: implement this method to return the 'Diagram Model' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<DiagramModelObject>(DiagramModelObject.class, this, ModelPackage.DIAGRAM_MODEL__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ModelPackage.DIAGRAM_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectionRouterType() {
		return connectionRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionRouterType(int newConnectionRouterType) {
		int oldConnectionRouterType = connectionRouterType;
		connectionRouterType = newConnectionRouterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE, oldConnectionRouterType, connectionRouterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCopy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAdapter(Object adapter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapter(Object adapter, Object object) {
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
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.DIAGRAM_MODEL__ARCHIMATE_MODEL:
				return getArchimateModel();
			case ModelPackage.DIAGRAM_MODEL__ID:
				return getId();
			case ModelPackage.DIAGRAM_MODEL__NAME:
				return getName();
			case ModelPackage.DIAGRAM_MODEL__DIAGRAM_MODEL:
				return getDiagramModel();
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
				return getChildren();
			case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION:
				return getDocumentation();
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				return getConnectionRouterType();
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
			case ModelPackage.DIAGRAM_MODEL__ID:
				setId((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DiagramModelObject>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				setConnectionRouterType((Integer)newValue);
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
			case ModelPackage.DIAGRAM_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
				getChildren().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				setConnectionRouterType(CONNECTION_ROUTER_TYPE_EDEFAULT);
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
			case ModelPackage.DIAGRAM_MODEL__ARCHIMATE_MODEL:
				return getArchimateModel() != null;
			case ModelPackage.DIAGRAM_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.DIAGRAM_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.DIAGRAM_MODEL__DIAGRAM_MODEL:
				return getDiagramModel() != null;
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
				return children != null && !children.isEmpty();
			case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				return connectionRouterType != CONNECTION_ROUTER_TYPE_EDEFAULT;
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
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__ID: return ModelPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == model.Cloneable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__NAME: return ModelPackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == DiagramModelComponent.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__DIAGRAM_MODEL: return ModelPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;
				default: return -1;
			}
		}
		if (baseClass == DiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__CHILDREN: return ModelPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == Documentable.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION: return ModelPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL__PROPERTIES: return ModelPackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
				case ModelPackage.IDENTIFIER__ID: return ModelPackage.DIAGRAM_MODEL__ID;
				default: return -1;
			}
		}
		if (baseClass == model.Cloneable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMEABLE__NAME: return ModelPackage.DIAGRAM_MODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == DiagramModelComponent.class) {
			switch (baseFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL: return ModelPackage.DIAGRAM_MODEL__DIAGRAM_MODEL;
				default: return -1;
			}
		}
		if (baseClass == DiagramModelContainer.class) {
			switch (baseFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return ModelPackage.DIAGRAM_MODEL__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == Documentable.class) {
			switch (baseFeatureID) {
				case ModelPackage.DOCUMENTABLE__DOCUMENTATION: return ModelPackage.DIAGRAM_MODEL__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (baseFeatureID) {
				case ModelPackage.PROPERTIES__PROPERTIES: return ModelPackage.DIAGRAM_MODEL__PROPERTIES;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == model.Cloneable.class) {
			switch (baseOperationID) {
				case ModelPackage.CLONEABLE___GET_COPY: return ModelPackage.DIAGRAM_MODEL___GET_COPY;
				default: return -1;
			}
		}
		if (baseClass == Nameable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DiagramModelComponent.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DiagramModelContainer.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Documentable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DIAGRAM_MODEL___GET_COPY:
				return getCopy();
			case ModelPackage.DIAGRAM_MODEL___GET_ADAPTER__OBJECT:
				return getAdapter(arguments.get(0));
			case ModelPackage.DIAGRAM_MODEL___SET_ADAPTER__OBJECT_OBJECT:
				setAdapter(arguments.get(0), arguments.get(1));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", connectionRouterType: ");
		result.append(connectionRouterType);
		result.append(')');
		return result.toString();
	}

} //DiagramModelImpl
