/**
 */
package model.impl;

import java.io.File;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.Adapter;
import model.ArchimateModel;
import model.ArchimateModelElement;
import model.DiagramModel;
import model.Folder;
import model.FolderType;
import model.Identifier;
import model.Metadata;
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
 * An implementation of the model object '<em><b>Archimate Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ArchimateModelImpl#getFolders <em>Folders</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getArchimateModel <em>Archimate Model</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getFile <em>File</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link model.impl.ArchimateModelImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchimateModelImpl extends MinimalEObjectImpl.Container implements ArchimateModel {
	/**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> folders;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final File FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchimateModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARCHIMATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<Folder>(Folder.class, this, ModelPackage.ARCHIMATE_MODEL__FOLDERS);
		}
		return folders;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__ID, oldId, id));
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
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ModelPackage.ARCHIMATE_MODEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ARCHIMATE_MODEL__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ARCHIMATE_MODEL__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARCHIMATE_MODEL__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder addDerivedRelationsFolder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeDerivedRelationsFolder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getDefaultFolderForElement(EObject element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModel getDefaultDiagramModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModel> getDiagramModels() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getFolder(FolderType type) {
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
			case ModelPackage.ARCHIMATE_MODEL__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case ModelPackage.ARCHIMATE_MODEL__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ModelPackage.ARCHIMATE_MODEL__METADATA:
				return basicSetMetadata(null, msgs);
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
			case ModelPackage.ARCHIMATE_MODEL__FOLDERS:
				return getFolders();
			case ModelPackage.ARCHIMATE_MODEL__NAME:
				return getName();
			case ModelPackage.ARCHIMATE_MODEL__ID:
				return getId();
			case ModelPackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL:
				return getArchimateModel();
			case ModelPackage.ARCHIMATE_MODEL__PROPERTIES:
				return getProperties();
			case ModelPackage.ARCHIMATE_MODEL__PURPOSE:
				return getPurpose();
			case ModelPackage.ARCHIMATE_MODEL__FILE:
				return getFile();
			case ModelPackage.ARCHIMATE_MODEL__VERSION:
				return getVersion();
			case ModelPackage.ARCHIMATE_MODEL__METADATA:
				return getMetadata();
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
			case ModelPackage.ARCHIMATE_MODEL__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__ID:
				setId((String)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__FILE:
				setFile((File)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case ModelPackage.ARCHIMATE_MODEL__METADATA:
				setMetadata((Metadata)newValue);
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
			case ModelPackage.ARCHIMATE_MODEL__FOLDERS:
				getFolders().clear();
				return;
			case ModelPackage.ARCHIMATE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ARCHIMATE_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.ARCHIMATE_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.ARCHIMATE_MODEL__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ModelPackage.ARCHIMATE_MODEL__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ModelPackage.ARCHIMATE_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModelPackage.ARCHIMATE_MODEL__METADATA:
				setMetadata((Metadata)null);
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
			case ModelPackage.ARCHIMATE_MODEL__FOLDERS:
				return folders != null && !folders.isEmpty();
			case ModelPackage.ARCHIMATE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ARCHIMATE_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL:
				return getArchimateModel() != null;
			case ModelPackage.ARCHIMATE_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.ARCHIMATE_MODEL__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ModelPackage.ARCHIMATE_MODEL__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ModelPackage.ARCHIMATE_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModelPackage.ARCHIMATE_MODEL__METADATA:
				return metadata != null;
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
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARCHIMATE_MODEL__NAME: return ModelPackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARCHIMATE_MODEL__ID: return ModelPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == Adapter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchimateModelElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL: return ModelPackage.ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (derivedFeatureID) {
				case ModelPackage.ARCHIMATE_MODEL__PROPERTIES: return ModelPackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMEABLE__NAME: return ModelPackage.ARCHIMATE_MODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
				case ModelPackage.IDENTIFIER__ID: return ModelPackage.ARCHIMATE_MODEL__ID;
				default: return -1;
			}
		}
		if (baseClass == Adapter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchimateModelElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL: return ModelPackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (baseFeatureID) {
				case ModelPackage.PROPERTIES__PROPERTIES: return ModelPackage.ARCHIMATE_MODEL__PROPERTIES;
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
		if (baseClass == Nameable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Identifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Adapter.class) {
			switch (baseOperationID) {
				case ModelPackage.ADAPTER___GET_ADAPTER__OBJECT: return ModelPackage.ARCHIMATE_MODEL___GET_ADAPTER__OBJECT;
				case ModelPackage.ADAPTER___SET_ADAPTER__OBJECT_OBJECT: return ModelPackage.ARCHIMATE_MODEL___SET_ADAPTER__OBJECT_OBJECT;
				default: return -1;
			}
		}
		if (baseClass == ArchimateModelElement.class) {
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
			case ModelPackage.ARCHIMATE_MODEL___SET_DEFAULTS:
				setDefaults();
				return null;
			case ModelPackage.ARCHIMATE_MODEL___ADD_DERIVED_RELATIONS_FOLDER:
				return addDerivedRelationsFolder();
			case ModelPackage.ARCHIMATE_MODEL___REMOVE_DERIVED_RELATIONS_FOLDER:
				removeDerivedRelationsFolder();
				return null;
			case ModelPackage.ARCHIMATE_MODEL___GET_DEFAULT_FOLDER_FOR_ELEMENT__EOBJECT:
				return getDefaultFolderForElement((EObject)arguments.get(0));
			case ModelPackage.ARCHIMATE_MODEL___GET_DEFAULT_DIAGRAM_MODEL:
				return getDefaultDiagramModel();
			case ModelPackage.ARCHIMATE_MODEL___GET_DIAGRAM_MODELS:
				return getDiagramModels();
			case ModelPackage.ARCHIMATE_MODEL___GET_FOLDER__FOLDERTYPE:
				return getFolder((FolderType)arguments.get(0));
			case ModelPackage.ARCHIMATE_MODEL___GET_ADAPTER__OBJECT:
				return getAdapter(arguments.get(0));
			case ModelPackage.ARCHIMATE_MODEL___SET_ADAPTER__OBJECT_OBJECT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", file: ");
		result.append(file);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ArchimateModelImpl
