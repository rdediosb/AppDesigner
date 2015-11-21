/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.archimatetool.com/archimate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "archimate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.Adapter <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Adapter
	 * @see model.impl.ModelPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER___GET_ADAPTER__OBJECT = 0;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER___SET_ADAPTER__OBJECT_OBJECT = 1;

	/**
	 * The number of operations of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.Identifier <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Identifier
	 * @see model.impl.ModelPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PropertyImpl
	 * @see model.impl.ModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Properties <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Properties
	 * @see model.impl.ModelPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MetadataImpl
	 * @see model.impl.ModelPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 4;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Nameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Nameable
	 * @see model.impl.ModelPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.TextContent <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TextContent
	 * @see model.impl.ModelPackageImpl#getTextContent()
	 * @generated
	 */
	int TEXT_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Documentable <em>Documentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Documentable
	 * @see model.impl.ModelPackageImpl#getDocumentable()
	 * @generated
	 */
	int DOCUMENTABLE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Cloneable <em>Cloneable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Cloneable
	 * @see model.impl.ModelPackageImpl#getCloneable()
	 * @generated
	 */
	int CLONEABLE = 8;

	/**
	 * The number of structural features of the '<em>Cloneable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONEABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONEABLE___GET_COPY = 0;

	/**
	 * The number of operations of the '<em>Cloneable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONEABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.FolderContainer <em>Folder Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.FolderContainer
	 * @see model.impl.ModelPackageImpl#getFolderContainer()
	 * @generated
	 */
	int FOLDER_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONTAINER__FOLDERS = 0;

	/**
	 * The number of structural features of the '<em>Folder Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Folder Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.ArchimateModelElement <em>Archimate Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ArchimateModelElement
	 * @see model.impl.ModelPackageImpl#getArchimateModelElement()
	 * @generated
	 */
	int ARCHIMATE_MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL = ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archimate Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT = ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT___GET_ADAPTER__OBJECT = ADAPTER___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ADAPTER___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The number of operations of the '<em>Archimate Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT = ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ArchimateModelImpl <em>Archimate Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArchimateModelImpl
	 * @see model.impl.ModelPackageImpl#getArchimateModel()
	 * @generated
	 */
	int ARCHIMATE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__FOLDERS = FOLDER_CONTAINER__FOLDERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__NAME = FOLDER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__ID = FOLDER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__ARCHIMATE_MODEL = FOLDER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__PROPERTIES = FOLDER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__PURPOSE = FOLDER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__FILE = FOLDER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__VERSION = FOLDER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__METADATA = FOLDER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Archimate Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_FEATURE_COUNT = FOLDER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___GET_ADAPTER__OBJECT = FOLDER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___SET_ADAPTER__OBJECT_OBJECT = FOLDER_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___SET_DEFAULTS = FOLDER_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Derived Relations Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___ADD_DERIVED_RELATIONS_FOLDER = FOLDER_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Derived Relations Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___REMOVE_DERIVED_RELATIONS_FOLDER = FOLDER_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Default Folder For Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___GET_DEFAULT_FOLDER_FOR_ELEMENT__EOBJECT = FOLDER_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Default Diagram Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___GET_DEFAULT_DIAGRAM_MODEL = FOLDER_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Diagram Models</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___GET_DIAGRAM_MODELS = FOLDER_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL___GET_FOLDER__FOLDERTYPE = FOLDER_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Archimate Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_OPERATION_COUNT = FOLDER_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link model.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FolderImpl
	 * @see model.impl.ModelPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 12;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FOLDERS = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ELEMENTS = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TYPE = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___GET_ADAPTER__OBJECT = ARCHIMATE_MODEL_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_MODEL_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ArchimateComponentImpl <em>Archimate Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArchimateComponentImpl
	 * @see model.impl.ModelPackageImpl#getArchimateComponent()
	 * @generated
	 */
	int ARCHIMATE_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Archimate Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT___GET_ADAPTER__OBJECT = ARCHIMATE_MODEL_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_MODEL_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT___GET_COPY = ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Archimate Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_COMPONENT_OPERATION_COUNT = ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.ArchimateElementImpl <em>Archimate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArchimateElementImpl
	 * @see model.impl.ModelPackageImpl#getArchimateElement()
	 * @generated
	 */
	int ARCHIMATE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_COMPONENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__ID = ARCHIMATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__NAME = ARCHIMATE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__DOCUMENTATION = ARCHIMATE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__PROPERTIES = ARCHIMATE_COMPONENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Archimate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT_FEATURE_COUNT = ARCHIMATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_COMPONENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_COMPONENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT___GET_COPY = ARCHIMATE_COMPONENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Archimate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT_OPERATION_COUNT = ARCHIMATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.JunctionElement <em>Junction Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.JunctionElement
	 * @see model.impl.ModelPackageImpl#getJunctionElement()
	 * @generated
	 */
	int JUNCTION_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Junction Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Junction Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.InterfaceElement <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.InterfaceElement
	 * @see model.impl.ModelPackageImpl#getInterfaceElement()
	 * @generated
	 */
	int INTERFACE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__INTERFACE_TYPE = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.ServiceElement <em>Service Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ServiceElement
	 * @see model.impl.ModelPackageImpl#getServiceElement()
	 * @generated
	 */
	int SERVICE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.JunctionImpl
	 * @see model.impl.ModelPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 18;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION___GET_ADAPTER__OBJECT = JUNCTION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION___SET_ADAPTER__OBJECT_OBJECT = JUNCTION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION___GET_COPY = JUNCTION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = JUNCTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AndJunctionImpl <em>And Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AndJunctionImpl
	 * @see model.impl.ModelPackageImpl#getAndJunction()
	 * @generated
	 */
	int AND_JUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>And Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION___GET_ADAPTER__OBJECT = JUNCTION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION___SET_ADAPTER__OBJECT_OBJECT = JUNCTION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION___GET_COPY = JUNCTION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>And Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION_OPERATION_COUNT = JUNCTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.OrJunctionImpl <em>Or Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OrJunctionImpl
	 * @see model.impl.ModelPackageImpl#getOrJunction()
	 * @generated
	 */
	int OR_JUNCTION = 20;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Or Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION___GET_ADAPTER__OBJECT = JUNCTION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION___SET_ADAPTER__OBJECT_OBJECT = JUNCTION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION___GET_COPY = JUNCTION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Or Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION_OPERATION_COUNT = JUNCTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.BusinessLayerElement <em>Business Layer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BusinessLayerElement
	 * @see model.impl.ModelPackageImpl#getBusinessLayerElement()
	 * @generated
	 */
	int BUSINESS_LAYER_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessActivityImpl <em>Business Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessActivityImpl
	 * @see model.impl.ModelPackageImpl#getBusinessActivity()
	 * @generated
	 */
	int BUSINESS_ACTIVITY = 22;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTIVITY_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessActorImpl <em>Business Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessActorImpl
	 * @see model.impl.ModelPackageImpl#getBusinessActor()
	 * @generated
	 */
	int BUSINESS_ACTOR = 23;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessCollaborationImpl <em>Business Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessCollaborationImpl
	 * @see model.impl.ModelPackageImpl#getBusinessCollaboration()
	 * @generated
	 */
	int BUSINESS_COLLABORATION = 24;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ContractImpl
	 * @see model.impl.ModelPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 25;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessEventImpl <em>Business Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessEventImpl
	 * @see model.impl.ModelPackageImpl#getBusinessEvent()
	 * @generated
	 */
	int BUSINESS_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessFunctionImpl <em>Business Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessFunctionImpl
	 * @see model.impl.ModelPackageImpl#getBusinessFunction()
	 * @generated
	 */
	int BUSINESS_FUNCTION = 27;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FUNCTION_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessInteractionImpl <em>Business Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessInteractionImpl
	 * @see model.impl.ModelPackageImpl#getBusinessInteraction()
	 * @generated
	 */
	int BUSINESS_INTERACTION = 28;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERACTION_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessInterfaceImpl <em>Business Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getBusinessInterface()
	 * @generated
	 */
	int BUSINESS_INTERFACE = 29;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__INTERFACE_TYPE = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MeaningImpl <em>Meaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MeaningImpl
	 * @see model.impl.ModelPackageImpl#getMeaning()
	 * @generated
	 */
	int MEANING = 30;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Meaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Meaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessObjectImpl <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessObjectImpl
	 * @see model.impl.ModelPackageImpl#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessProcessImpl <em>Business Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessProcessImpl
	 * @see model.impl.ModelPackageImpl#getBusinessProcess()
	 * @generated
	 */
	int BUSINESS_PROCESS = 32;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductImpl
	 * @see model.impl.ModelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 33;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RepresentationImpl
	 * @see model.impl.ModelPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 34;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessRoleImpl <em>Business Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessRoleImpl
	 * @see model.impl.ModelPackageImpl#getBusinessRole()
	 * @generated
	 */
	int BUSINESS_ROLE = 35;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusinessServiceImpl <em>Business Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessServiceImpl
	 * @see model.impl.ModelPackageImpl#getBusinessService()
	 * @generated
	 */
	int BUSINESS_SERVICE = 36;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Business Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ValueImpl
	 * @see model.impl.ModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 37;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocationImpl
	 * @see model.impl.ModelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 38;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_ADAPTER__OBJECT = BUSINESS_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___SET_ADAPTER__OBJECT_OBJECT = BUSINESS_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_COPY = BUSINESS_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = BUSINESS_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.ApplicationLayerElement <em>Application Layer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ApplicationLayerElement
	 * @see model.impl.ModelPackageImpl#getApplicationLayerElement()
	 * @generated
	 */
	int APPLICATION_LAYER_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationCollaborationImpl <em>Application Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationCollaborationImpl
	 * @see model.impl.ModelPackageImpl#getApplicationCollaboration()
	 * @generated
	 */
	int APPLICATION_COLLABORATION = 40;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COLLABORATION_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationComponentImpl
	 * @see model.impl.ModelPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 41;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationFunctionImpl <em>Application Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationFunctionImpl
	 * @see model.impl.ModelPackageImpl#getApplicationFunction()
	 * @generated
	 */
	int APPLICATION_FUNCTION = 42;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FUNCTION_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationInteractionImpl <em>Application Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationInteractionImpl
	 * @see model.impl.ModelPackageImpl#getApplicationInteraction()
	 * @generated
	 */
	int APPLICATION_INTERACTION = 43;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERACTION_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationInterfaceImpl <em>Application Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getApplicationInterface()
	 * @generated
	 */
	int APPLICATION_INTERFACE = 44;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__INTERFACE_TYPE = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataObjectImpl
	 * @see model.impl.ModelPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 45;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ApplicationServiceImpl <em>Application Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ApplicationServiceImpl
	 * @see model.impl.ModelPackageImpl#getApplicationService()
	 * @generated
	 */
	int APPLICATION_SERVICE = 46;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE__ARCHIMATE_MODEL = APPLICATION_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE__ID = APPLICATION_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE__NAME = APPLICATION_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE__DOCUMENTATION = APPLICATION_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE__PROPERTIES = APPLICATION_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Application Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_FEATURE_COUNT = APPLICATION_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE___GET_ADAPTER__OBJECT = APPLICATION_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE___SET_ADAPTER__OBJECT_OBJECT = APPLICATION_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE___GET_COPY = APPLICATION_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Application Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_OPERATION_COUNT = APPLICATION_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.TechnologyLayerElement <em>Technology Layer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TechnologyLayerElement
	 * @see model.impl.ModelPackageImpl#getTechnologyLayerElement()
	 * @generated
	 */
	int TECHNOLOGY_LAYER_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Technology Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Technology Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArtifactImpl
	 * @see model.impl.ModelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 48;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CommunicationPathImpl
	 * @see model.impl.ModelPackageImpl#getCommunicationPath()
	 * @generated
	 */
	int COMMUNICATION_PATH = 49;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Communication Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Communication Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NetworkImpl
	 * @see model.impl.ModelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 50;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InfrastructureInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getInfrastructureInterface()
	 * @generated
	 */
	int INFRASTRUCTURE_INTERFACE = 51;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__INTERFACE_TYPE = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Infrastructure Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InfrastructureServiceImpl
	 * @see model.impl.ModelPackageImpl#getInfrastructureService()
	 * @generated
	 */
	int INFRASTRUCTURE_SERVICE = 52;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Infrastructure Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Infrastructure Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InfrastructureFunctionImpl <em>Infrastructure Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InfrastructureFunctionImpl
	 * @see model.impl.ModelPackageImpl#getInfrastructureFunction()
	 * @generated
	 */
	int INFRASTRUCTURE_FUNCTION = 53;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Infrastructure Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Infrastructure Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FUNCTION_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NodeImpl
	 * @see model.impl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 54;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SystemSoftwareImpl <em>System Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SystemSoftwareImpl
	 * @see model.impl.ModelPackageImpl#getSystemSoftware()
	 * @generated
	 */
	int SYSTEM_SOFTWARE = 55;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>System Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>System Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DeviceImpl
	 * @see model.impl.ModelPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 56;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ARCHIMATE_MODEL = TECHNOLOGY_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = TECHNOLOGY_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = TECHNOLOGY_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DOCUMENTATION = TECHNOLOGY_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROPERTIES = TECHNOLOGY_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = TECHNOLOGY_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_ADAPTER__OBJECT = TECHNOLOGY_LAYER_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___SET_ADAPTER__OBJECT_OBJECT = TECHNOLOGY_LAYER_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_COPY = TECHNOLOGY_LAYER_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = TECHNOLOGY_LAYER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MotivationElementImpl <em>Motivation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MotivationElementImpl
	 * @see model.impl.ModelPackageImpl#getMotivationElement()
	 * @generated
	 */
	int MOTIVATION_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Motivation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Motivation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StakeholderImpl
	 * @see model.impl.ModelPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 58;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DriverImpl
	 * @see model.impl.ModelPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 59;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AssessmentImpl
	 * @see model.impl.ModelPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 60;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GoalImpl
	 * @see model.impl.ModelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 61;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RequirementImpl
	 * @see model.impl.ModelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 62;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConstraintImpl
	 * @see model.impl.ModelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 63;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PrincipleImpl <em>Principle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PrincipleImpl
	 * @see model.impl.ModelPackageImpl#getPrinciple()
	 * @generated
	 */
	int PRINCIPLE = 64;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__ARCHIMATE_MODEL = MOTIVATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__ID = MOTIVATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__DOCUMENTATION = MOTIVATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__PROPERTIES = MOTIVATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE___GET_ADAPTER__OBJECT = MOTIVATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE___SET_ADAPTER__OBJECT_OBJECT = MOTIVATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE___GET_COPY = MOTIVATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ImplementationMigrationElementImpl <em>Implementation Migration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ImplementationMigrationElementImpl
	 * @see model.impl.ModelPackageImpl#getImplementationMigrationElement()
	 * @generated
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT = 65;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Implementation Migration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT___GET_ADAPTER__OBJECT = ARCHIMATE_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT___GET_COPY = ARCHIMATE_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Implementation Migration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MIGRATION_ELEMENT_OPERATION_COUNT = ARCHIMATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.WorkPackageImpl
	 * @see model.impl.ModelPackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 66;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ARCHIMATE_MODEL = IMPLEMENTATION_MIGRATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ID = IMPLEMENTATION_MIGRATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__NAME = IMPLEMENTATION_MIGRATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DOCUMENTATION = IMPLEMENTATION_MIGRATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__PROPERTIES = IMPLEMENTATION_MIGRATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE___GET_ADAPTER__OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE___SET_ADAPTER__OBJECT_OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE___GET_COPY = IMPLEMENTATION_MIGRATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_OPERATION_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DeliverableImpl
	 * @see model.impl.ModelPackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 67;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__ARCHIMATE_MODEL = IMPLEMENTATION_MIGRATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__ID = IMPLEMENTATION_MIGRATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__NAME = IMPLEMENTATION_MIGRATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DOCUMENTATION = IMPLEMENTATION_MIGRATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PROPERTIES = IMPLEMENTATION_MIGRATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE___GET_ADAPTER__OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE___SET_ADAPTER__OBJECT_OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE___GET_COPY = IMPLEMENTATION_MIGRATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_OPERATION_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PlateauImpl <em>Plateau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PlateauImpl
	 * @see model.impl.ModelPackageImpl#getPlateau()
	 * @generated
	 */
	int PLATEAU = 68;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU__ARCHIMATE_MODEL = IMPLEMENTATION_MIGRATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU__ID = IMPLEMENTATION_MIGRATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU__NAME = IMPLEMENTATION_MIGRATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU__DOCUMENTATION = IMPLEMENTATION_MIGRATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU__PROPERTIES = IMPLEMENTATION_MIGRATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Plateau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU_FEATURE_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU___GET_ADAPTER__OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU___SET_ADAPTER__OBJECT_OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU___GET_COPY = IMPLEMENTATION_MIGRATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Plateau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEAU_OPERATION_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GapImpl <em>Gap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GapImpl
	 * @see model.impl.ModelPackageImpl#getGap()
	 * @generated
	 */
	int GAP = 69;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__ARCHIMATE_MODEL = IMPLEMENTATION_MIGRATION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__ID = IMPLEMENTATION_MIGRATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__NAME = IMPLEMENTATION_MIGRATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__DOCUMENTATION = IMPLEMENTATION_MIGRATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__PROPERTIES = IMPLEMENTATION_MIGRATION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_FEATURE_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP___GET_ADAPTER__OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP___SET_ADAPTER__OBJECT_OBJECT = IMPLEMENTATION_MIGRATION_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP___GET_COPY = IMPLEMENTATION_MIGRATION_ELEMENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_OPERATION_COUNT = IMPLEMENTATION_MIGRATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RelationshipImpl
	 * @see model.impl.ModelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 70;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ARCHIMATE_MODEL = ARCHIMATE_COMPONENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = ARCHIMATE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ARCHIMATE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = ARCHIMATE_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROPERTIES = ARCHIMATE_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ARCHIMATE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ARCHIMATE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ARCHIMATE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_ADAPTER__OBJECT = ARCHIMATE_COMPONENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_COMPONENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_COPY = ARCHIMATE_COMPONENT___GET_COPY;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ARCHIMATE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AccessRelationshipImpl <em>Access Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getAccessRelationship()
	 * @generated
	 */
	int ACCESS_RELATIONSHIP = 71;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP__ACCESS_TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Access Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AggregationRelationshipImpl <em>Aggregation Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AggregationRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getAggregationRelationship()
	 * @generated
	 */
	int AGGREGATION_RELATIONSHIP = 72;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Aggregation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AssignmentRelationshipImpl <em>Assignment Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AssignmentRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getAssignmentRelationship()
	 * @generated
	 */
	int ASSIGNMENT_RELATIONSHIP = 73;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Assignment Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Assignment Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AssociationRelationshipImpl <em>Association Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AssociationRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getAssociationRelationship()
	 * @generated
	 */
	int ASSOCIATION_RELATIONSHIP = 74;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Association Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Association Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.CompositionRelationshipImpl <em>Composition Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CompositionRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getCompositionRelationship()
	 * @generated
	 */
	int COMPOSITION_RELATIONSHIP = 75;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Composition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Composition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.FlowRelationshipImpl <em>Flow Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FlowRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getFlowRelationship()
	 * @generated
	 */
	int FLOW_RELATIONSHIP = 76;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Flow Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Flow Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RealisationRelationshipImpl <em>Realisation Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RealisationRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getRealisationRelationship()
	 * @generated
	 */
	int REALISATION_RELATIONSHIP = 77;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Realisation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Realisation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALISATION_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SpecialisationRelationshipImpl <em>Specialisation Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SpecialisationRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getSpecialisationRelationship()
	 * @generated
	 */
	int SPECIALISATION_RELATIONSHIP = 78;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Specialisation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Specialisation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TriggeringRelationshipImpl <em>Triggering Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TriggeringRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getTriggeringRelationship()
	 * @generated
	 */
	int TRIGGERING_RELATIONSHIP = 79;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Triggering Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Triggering Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERING_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.UsedByRelationshipImpl <em>Used By Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UsedByRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getUsedByRelationship()
	 * @generated
	 */
	int USED_BY_RELATIONSHIP = 80;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Used By Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Used By Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BY_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InfluenceRelationshipImpl <em>Influence Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InfluenceRelationshipImpl
	 * @see model.impl.ModelPackageImpl#getInfluenceRelationship()
	 * @generated
	 */
	int INFLUENCE_RELATIONSHIP = 81;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Influence Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP___GET_ADAPTER__OBJECT = RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP___GET_COPY = RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Influence Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelComponentImpl <em>Diagram Model Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelComponentImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelComponent()
	 * @generated
	 */
	int DIAGRAM_MODEL_COMPONENT = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__NAME = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT___GET_COPY = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT___GET_ADAPTER__OBJECT = IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT___SET_ADAPTER__OBJECT_OBJECT = IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.DiagramModelContainer <em>Diagram Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.DiagramModelContainer
	 * @see model.impl.ModelPackageImpl#getDiagramModelContainer()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONTAINER = 83;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__CHILDREN = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER___GET_COPY = DIAGRAM_MODEL_COMPONENT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_COMPONENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_COMPONENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The number of operations of the '<em>Diagram Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER_OPERATION_COUNT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelImpl <em>Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModel()
	 * @generated
	 */
	int DIAGRAM_MODEL = 84;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DIAGRAM_MODEL = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CHILDREN = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL___GET_ADAPTER__OBJECT = ARCHIMATE_MODEL_ELEMENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL___SET_ADAPTER__OBJECT_OBJECT = ARCHIMATE_MODEL_ELEMENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL___GET_COPY = ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OPERATION_COUNT = ARCHIMATE_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelObjectImpl <em>Diagram Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelObjectImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_OBJECT = 86;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FONT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FONT_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__LINE_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__BOUNDS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FILL_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Diagram Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___GET_COPY = DIAGRAM_MODEL_COMPONENT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_COMPONENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_COMPONENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT_OPERATION_COUNT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelReferenceImpl <em>Diagram Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelReferenceImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelReference()
	 * @generated
	 */
	int DIAGRAM_MODEL_REFERENCE = 85;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Referenced Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Diagram Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelGroupImpl <em>Diagram Model Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelGroupImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelGroup()
	 * @generated
	 */
	int DIAGRAM_MODEL_GROUP = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__DOCUMENTATION = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Diagram Model Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelNoteImpl <em>Diagram Model Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelNoteImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelNote()
	 * @generated
	 */
	int DIAGRAM_MODEL_NOTE = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__CONTENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__BORDER_TYPE = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Model Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Diagram Model Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelImageImpl <em>Diagram Model Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelImageImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelImage()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE = 89;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__BORDER_COLOR = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__IMAGE_PATH = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Model Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Diagram Model Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelConnectionImpl <em>Diagram Model Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelConnectionImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONNECTION = 90;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__FONT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__FONT_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__PROPERTIES = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__DOCUMENTATION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TEXT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TEXT_POSITION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__SOURCE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TARGET = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__BENDPOINTS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TYPE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Diagram Model Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___GET_COPY = DIAGRAM_MODEL_COMPONENT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_COMPONENT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_COMPONENT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___DISCONNECT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Reconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION___RECONNECT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram Model Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION_OPERATION_COUNT = DIAGRAM_MODEL_COMPONENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelBendpointImpl <em>Diagram Model Bendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelBendpointImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelBendpoint()
	 * @generated
	 */
	int DIAGRAM_MODEL_BENDPOINT = 91;

	/**
	 * The feature id for the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__START_X = CLONEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__START_Y = CLONEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__END_X = CLONEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__END_Y = CLONEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diagram Model Bendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT_FEATURE_COUNT = CLONEABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT___GET_COPY = CLONEABLE___GET_COPY;

	/**
	 * The number of operations of the '<em>Diagram Model Bendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT_OPERATION_COUNT = CLONEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.LineObject <em>Line Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.LineObject
	 * @see model.impl.ModelPackageImpl#getLineObject()
	 * @generated
	 */
	int LINE_OBJECT = 92;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OBJECT__LINE_WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OBJECT__LINE_COLOR = 1;

	/**
	 * The number of structural features of the '<em>Line Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.FontAttribute <em>Font Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.FontAttribute
	 * @see model.impl.ModelPackageImpl#getFontAttribute()
	 * @generated
	 */
	int FONT_ATTRIBUTE = 93;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__FONT = 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__FONT_COLOR = 1;

	/**
	 * The number of structural features of the '<em>Font Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Font Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.TextPosition <em>Text Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TextPosition
	 * @see model.impl.ModelPackageImpl#getTextPosition()
	 * @generated
	 */
	int TEXT_POSITION = 94;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION__TEXT_POSITION = 0;

	/**
	 * The number of structural features of the '<em>Text Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.TextAlignment <em>Text Alignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TextAlignment
	 * @see model.impl.ModelPackageImpl#getTextAlignment()
	 * @generated
	 */
	int TEXT_ALIGNMENT = 95;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT__TEXT_ALIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Text Alignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT___GET_DEFAULT_TEXT_ALIGNMENT = 0;

	/**
	 * The number of operations of the '<em>Text Alignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ALIGNMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.BorderObject <em>Border Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BorderObject
	 * @see model.impl.ModelPackageImpl#getBorderObject()
	 * @generated
	 */
	int BORDER_OBJECT = 96;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OBJECT__BORDER_COLOR = 0;

	/**
	 * The number of structural features of the '<em>Border Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Border Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.DiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.DiagramModelImageProvider
	 * @see model.impl.ModelPackageImpl#getDiagramModelImageProvider()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER = 97;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Image Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram Model Image Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BoundsImpl
	 * @see model.impl.ModelPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 98;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS___GET_COPY = 0;

	/**
	 * The number of operations of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.Lockable <em>Lockable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Lockable
	 * @see model.impl.ModelPackageImpl#getLockable()
	 * @generated
	 */
	int LOCKABLE = 99;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE__LOCKED = 0;

	/**
	 * The number of structural features of the '<em>Lockable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lockable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.ArchimateDiagramModelImpl <em>Archimate Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArchimateDiagramModelImpl
	 * @see model.impl.ModelPackageImpl#getArchimateDiagramModel()
	 * @generated
	 */
	int ARCHIMATE_DIAGRAM_MODEL = 100;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__ARCHIMATE_MODEL = DIAGRAM_MODEL__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__CHILDREN = DIAGRAM_MODEL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__DOCUMENTATION = DIAGRAM_MODEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__PROPERTIES = DIAGRAM_MODEL__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT = DIAGRAM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archimate Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL_FEATURE_COUNT = DIAGRAM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL___GET_ADAPTER__OBJECT = DIAGRAM_MODEL___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL___GET_COPY = DIAGRAM_MODEL___GET_COPY;

	/**
	 * The number of operations of the '<em>Archimate Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL_OPERATION_COUNT = DIAGRAM_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelArchimateObjectImpl <em>Diagram Model Archimate Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelArchimateObjectImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelArchimateObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT = 101;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archimate Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Archimate Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Add Archimate Element To Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___ADD_ARCHIMATE_ELEMENT_TO_MODEL__FOLDER = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Archimate Element From Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT___REMOVE_ARCHIMATE_ELEMENT_FROM_MODEL = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diagram Model Archimate Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.DiagramModelArchimateConnectionImpl <em>Diagram Model Archimate Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DiagramModelArchimateConnectionImpl
	 * @see model.impl.ModelPackageImpl#getDiagramModelArchimateConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION = 102;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__ID = DIAGRAM_MODEL_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__NAME = DIAGRAM_MODEL_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__FONT = DIAGRAM_MODEL_CONNECTION__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__FONT_COLOR = DIAGRAM_MODEL_CONNECTION__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__PROPERTIES = DIAGRAM_MODEL_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__DOCUMENTATION = DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_CONNECTION__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_CONNECTION__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TEXT = DIAGRAM_MODEL_CONNECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TEXT_POSITION = DIAGRAM_MODEL_CONNECTION__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__SOURCE = DIAGRAM_MODEL_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TARGET = DIAGRAM_MODEL_CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__BENDPOINTS = DIAGRAM_MODEL_CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TYPE = DIAGRAM_MODEL_CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Archimate Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___GET_COPY = DIAGRAM_MODEL_CONNECTION___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_CONNECTION___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_CONNECTION___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT = DIAGRAM_MODEL_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___DISCONNECT = DIAGRAM_MODEL_CONNECTION___DISCONNECT;

	/**
	 * The operation id for the '<em>Reconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___RECONNECT = DIAGRAM_MODEL_CONNECTION___RECONNECT;

	/**
	 * The operation id for the '<em>Add Relationship To Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___ADD_RELATIONSHIP_TO_MODEL__FOLDER = DIAGRAM_MODEL_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Relationship From Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION___REMOVE_RELATIONSHIP_FROM_MODEL = DIAGRAM_MODEL_CONNECTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diagram Model Archimate Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION_OPERATION_COUNT = DIAGRAM_MODEL_CONNECTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.SketchModelImpl <em>Sketch Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SketchModelImpl
	 * @see model.impl.ModelPackageImpl#getSketchModel()
	 * @generated
	 */
	int SKETCH_MODEL = 103;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ARCHIMATE_MODEL = DIAGRAM_MODEL__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__CHILDREN = DIAGRAM_MODEL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__DOCUMENTATION = DIAGRAM_MODEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__PROPERTIES = DIAGRAM_MODEL__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__CONNECTION_ROUTER_TYPE = DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__BACKGROUND = DIAGRAM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sketch Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_FEATURE_COUNT = DIAGRAM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL___GET_ADAPTER__OBJECT = DIAGRAM_MODEL___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL___GET_COPY = DIAGRAM_MODEL___GET_COPY;

	/**
	 * The number of operations of the '<em>Sketch Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_OPERATION_COUNT = DIAGRAM_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SketchModelStickyImpl <em>Sketch Model Sticky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SketchModelStickyImpl
	 * @see model.impl.ModelPackageImpl#getSketchModelSticky()
	 * @generated
	 */
	int SKETCH_MODEL_STICKY = 104;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__CONTENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sketch Model Sticky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Sketch Model Sticky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SketchModelActorImpl <em>Sketch Model Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SketchModelActorImpl
	 * @see model.impl.ModelPackageImpl#getSketchModelActor()
	 * @generated
	 */
	int SKETCH_MODEL_ACTOR = 105;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__DOCUMENTATION = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sketch Model Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___GET_COPY = DIAGRAM_MODEL_OBJECT___GET_COPY;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___GET_ADAPTER__OBJECT = DIAGRAM_MODEL_OBJECT___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___SET_ADAPTER__OBJECT_OBJECT = DIAGRAM_MODEL_OBJECT___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Default Text Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___GET_DEFAULT_TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;

	/**
	 * The operation id for the '<em>Add Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___ADD_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Remove Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR___SET_BOUNDS__INT_INT_INT_INT = DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Sketch Model Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR_OPERATION_COUNT = DIAGRAM_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.FolderType <em>Folder Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.FolderType
	 * @see model.impl.ModelPackageImpl#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 106;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see model.impl.ModelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 107;


	/**
	 * Returns the meta object for class '{@link model.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see model.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for the '{@link model.Adapter#getAdapter(java.lang.Object) <em>Get Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Adapter</em>' operation.
	 * @see model.Adapter#getAdapter(java.lang.Object)
	 * @generated
	 */
	EOperation getAdapter__GetAdapter__Object();

	/**
	 * Returns the meta object for the '{@link model.Adapter#setAdapter(java.lang.Object, java.lang.Object) <em>Set Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Adapter</em>' operation.
	 * @see model.Adapter#setAdapter(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getAdapter__SetAdapter__Object_Object();

	/**
	 * Returns the meta object for class '{@link model.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see model.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link model.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link model.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see model.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link model.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link model.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see model.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Properties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see model.Properties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Properties();

	/**
	 * Returns the meta object for class '{@link model.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see model.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Metadata#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see model.Metadata#getEntries()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Entries();

	/**
	 * Returns the meta object for class '{@link model.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see model.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link model.Nameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Nameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link model.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see model.TextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute '{@link model.TextContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see model.TextContent#getContent()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Content();

	/**
	 * Returns the meta object for class '{@link model.Documentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable</em>'.
	 * @see model.Documentable
	 * @generated
	 */
	EClass getDocumentable();

	/**
	 * Returns the meta object for the attribute '{@link model.Documentable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see model.Documentable#getDocumentation()
	 * @see #getDocumentable()
	 * @generated
	 */
	EAttribute getDocumentable_Documentation();

	/**
	 * Returns the meta object for class '{@link model.Cloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloneable</em>'.
	 * @see model.Cloneable
	 * @generated
	 */
	EClass getCloneable();

	/**
	 * Returns the meta object for the '{@link model.Cloneable#getCopy() <em>Get Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Copy</em>' operation.
	 * @see model.Cloneable#getCopy()
	 * @generated
	 */
	EOperation getCloneable__GetCopy();

	/**
	 * Returns the meta object for class '{@link model.FolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Container</em>'.
	 * @see model.FolderContainer
	 * @generated
	 */
	EClass getFolderContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FolderContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see model.FolderContainer#getFolders()
	 * @see #getFolderContainer()
	 * @generated
	 */
	EReference getFolderContainer_Folders();

	/**
	 * Returns the meta object for class '{@link model.ArchimateModelElement <em>Archimate Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate Model Element</em>'.
	 * @see model.ArchimateModelElement
	 * @generated
	 */
	EClass getArchimateModelElement();

	/**
	 * Returns the meta object for the reference '{@link model.ArchimateModelElement#getArchimateModel <em>Archimate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archimate Model</em>'.
	 * @see model.ArchimateModelElement#getArchimateModel()
	 * @see #getArchimateModelElement()
	 * @generated
	 */
	EReference getArchimateModelElement_ArchimateModel();

	/**
	 * Returns the meta object for class '{@link model.ArchimateModel <em>Archimate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate Model</em>'.
	 * @see model.ArchimateModel
	 * @generated
	 */
	EClass getArchimateModel();

	/**
	 * Returns the meta object for the attribute '{@link model.ArchimateModel#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see model.ArchimateModel#getPurpose()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link model.ArchimateModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see model.ArchimateModel#getFile()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_File();

	/**
	 * Returns the meta object for the attribute '{@link model.ArchimateModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see model.ArchimateModel#getVersion()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link model.ArchimateModel#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see model.ArchimateModel#getMetadata()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EReference getArchimateModel_Metadata();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#setDefaults() <em>Set Defaults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Defaults</em>' operation.
	 * @see model.ArchimateModel#setDefaults()
	 * @generated
	 */
	EOperation getArchimateModel__SetDefaults();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#addDerivedRelationsFolder() <em>Add Derived Relations Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Derived Relations Folder</em>' operation.
	 * @see model.ArchimateModel#addDerivedRelationsFolder()
	 * @generated
	 */
	EOperation getArchimateModel__AddDerivedRelationsFolder();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#removeDerivedRelationsFolder() <em>Remove Derived Relations Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Derived Relations Folder</em>' operation.
	 * @see model.ArchimateModel#removeDerivedRelationsFolder()
	 * @generated
	 */
	EOperation getArchimateModel__RemoveDerivedRelationsFolder();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#getDefaultFolderForElement(org.eclipse.emf.ecore.EObject) <em>Get Default Folder For Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Folder For Element</em>' operation.
	 * @see model.ArchimateModel#getDefaultFolderForElement(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getArchimateModel__GetDefaultFolderForElement__EObject();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#getDefaultDiagramModel() <em>Get Default Diagram Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Diagram Model</em>' operation.
	 * @see model.ArchimateModel#getDefaultDiagramModel()
	 * @generated
	 */
	EOperation getArchimateModel__GetDefaultDiagramModel();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#getDiagramModels() <em>Get Diagram Models</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Diagram Models</em>' operation.
	 * @see model.ArchimateModel#getDiagramModels()
	 * @generated
	 */
	EOperation getArchimateModel__GetDiagramModels();

	/**
	 * Returns the meta object for the '{@link model.ArchimateModel#getFolder(model.FolderType) <em>Get Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Folder</em>' operation.
	 * @see model.ArchimateModel#getFolder(model.FolderType)
	 * @generated
	 */
	EOperation getArchimateModel__GetFolder__FolderType();

	/**
	 * Returns the meta object for class '{@link model.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see model.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Folder#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see model.Folder#getElements()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Elements();

	/**
	 * Returns the meta object for the attribute '{@link model.Folder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Folder#getType()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Type();

	/**
	 * Returns the meta object for class '{@link model.ArchimateComponent <em>Archimate Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate Component</em>'.
	 * @see model.ArchimateComponent
	 * @generated
	 */
	EClass getArchimateComponent();

	/**
	 * Returns the meta object for class '{@link model.ArchimateElement <em>Archimate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate Element</em>'.
	 * @see model.ArchimateElement
	 * @generated
	 */
	EClass getArchimateElement();

	/**
	 * Returns the meta object for class '{@link model.JunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Element</em>'.
	 * @see model.JunctionElement
	 * @generated
	 */
	EClass getJunctionElement();

	/**
	 * Returns the meta object for class '{@link model.InterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see model.InterfaceElement
	 * @generated
	 */
	EClass getInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceElement#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see model.InterfaceElement#getInterfaceType()
	 * @see #getInterfaceElement()
	 * @generated
	 */
	EAttribute getInterfaceElement_InterfaceType();

	/**
	 * Returns the meta object for class '{@link model.ServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Element</em>'.
	 * @see model.ServiceElement
	 * @generated
	 */
	EClass getServiceElement();

	/**
	 * Returns the meta object for class '{@link model.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see model.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link model.AndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Junction</em>'.
	 * @see model.AndJunction
	 * @generated
	 */
	EClass getAndJunction();

	/**
	 * Returns the meta object for class '{@link model.OrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Junction</em>'.
	 * @see model.OrJunction
	 * @generated
	 */
	EClass getOrJunction();

	/**
	 * Returns the meta object for class '{@link model.BusinessLayerElement <em>Business Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Layer Element</em>'.
	 * @see model.BusinessLayerElement
	 * @generated
	 */
	EClass getBusinessLayerElement();

	/**
	 * Returns the meta object for class '{@link model.BusinessActivity <em>Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Activity</em>'.
	 * @see model.BusinessActivity
	 * @generated
	 */
	EClass getBusinessActivity();

	/**
	 * Returns the meta object for class '{@link model.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Actor</em>'.
	 * @see model.BusinessActor
	 * @generated
	 */
	EClass getBusinessActor();

	/**
	 * Returns the meta object for class '{@link model.BusinessCollaboration <em>Business Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Collaboration</em>'.
	 * @see model.BusinessCollaboration
	 * @generated
	 */
	EClass getBusinessCollaboration();

	/**
	 * Returns the meta object for class '{@link model.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see model.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for class '{@link model.BusinessEvent <em>Business Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Event</em>'.
	 * @see model.BusinessEvent
	 * @generated
	 */
	EClass getBusinessEvent();

	/**
	 * Returns the meta object for class '{@link model.BusinessFunction <em>Business Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Function</em>'.
	 * @see model.BusinessFunction
	 * @generated
	 */
	EClass getBusinessFunction();

	/**
	 * Returns the meta object for class '{@link model.BusinessInteraction <em>Business Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Interaction</em>'.
	 * @see model.BusinessInteraction
	 * @generated
	 */
	EClass getBusinessInteraction();

	/**
	 * Returns the meta object for class '{@link model.BusinessInterface <em>Business Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Interface</em>'.
	 * @see model.BusinessInterface
	 * @generated
	 */
	EClass getBusinessInterface();

	/**
	 * Returns the meta object for class '{@link model.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meaning</em>'.
	 * @see model.Meaning
	 * @generated
	 */
	EClass getMeaning();

	/**
	 * Returns the meta object for class '{@link model.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see model.BusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for class '{@link model.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process</em>'.
	 * @see model.BusinessProcess
	 * @generated
	 */
	EClass getBusinessProcess();

	/**
	 * Returns the meta object for class '{@link model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see model.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link model.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see model.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for class '{@link model.BusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Role</em>'.
	 * @see model.BusinessRole
	 * @generated
	 */
	EClass getBusinessRole();

	/**
	 * Returns the meta object for class '{@link model.BusinessService <em>Business Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Service</em>'.
	 * @see model.BusinessService
	 * @generated
	 */
	EClass getBusinessService();

	/**
	 * Returns the meta object for class '{@link model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see model.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link model.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see model.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link model.ApplicationLayerElement <em>Application Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Layer Element</em>'.
	 * @see model.ApplicationLayerElement
	 * @generated
	 */
	EClass getApplicationLayerElement();

	/**
	 * Returns the meta object for class '{@link model.ApplicationCollaboration <em>Application Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Collaboration</em>'.
	 * @see model.ApplicationCollaboration
	 * @generated
	 */
	EClass getApplicationCollaboration();

	/**
	 * Returns the meta object for class '{@link model.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Component</em>'.
	 * @see model.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for class '{@link model.ApplicationFunction <em>Application Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Function</em>'.
	 * @see model.ApplicationFunction
	 * @generated
	 */
	EClass getApplicationFunction();

	/**
	 * Returns the meta object for class '{@link model.ApplicationInteraction <em>Application Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Interaction</em>'.
	 * @see model.ApplicationInteraction
	 * @generated
	 */
	EClass getApplicationInteraction();

	/**
	 * Returns the meta object for class '{@link model.ApplicationInterface <em>Application Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Interface</em>'.
	 * @see model.ApplicationInterface
	 * @generated
	 */
	EClass getApplicationInterface();

	/**
	 * Returns the meta object for class '{@link model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see model.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link model.ApplicationService <em>Application Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Service</em>'.
	 * @see model.ApplicationService
	 * @generated
	 */
	EClass getApplicationService();

	/**
	 * Returns the meta object for class '{@link model.TechnologyLayerElement <em>Technology Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Layer Element</em>'.
	 * @see model.TechnologyLayerElement
	 * @generated
	 */
	EClass getTechnologyLayerElement();

	/**
	 * Returns the meta object for class '{@link model.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see model.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link model.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Path</em>'.
	 * @see model.CommunicationPath
	 * @generated
	 */
	EClass getCommunicationPath();

	/**
	 * Returns the meta object for class '{@link model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see model.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for class '{@link model.InfrastructureInterface <em>Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Interface</em>'.
	 * @see model.InfrastructureInterface
	 * @generated
	 */
	EClass getInfrastructureInterface();

	/**
	 * Returns the meta object for class '{@link model.InfrastructureService <em>Infrastructure Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Service</em>'.
	 * @see model.InfrastructureService
	 * @generated
	 */
	EClass getInfrastructureService();

	/**
	 * Returns the meta object for class '{@link model.InfrastructureFunction <em>Infrastructure Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Function</em>'.
	 * @see model.InfrastructureFunction
	 * @generated
	 */
	EClass getInfrastructureFunction();

	/**
	 * Returns the meta object for class '{@link model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link model.SystemSoftware <em>System Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Software</em>'.
	 * @see model.SystemSoftware
	 * @generated
	 */
	EClass getSystemSoftware();

	/**
	 * Returns the meta object for class '{@link model.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see model.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link model.MotivationElement <em>Motivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation Element</em>'.
	 * @see model.MotivationElement
	 * @generated
	 */
	EClass getMotivationElement();

	/**
	 * Returns the meta object for class '{@link model.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see model.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for class '{@link model.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see model.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for class '{@link model.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see model.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for class '{@link model.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see model.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link model.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see model.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for class '{@link model.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see model.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link model.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principle</em>'.
	 * @see model.Principle
	 * @generated
	 */
	EClass getPrinciple();

	/**
	 * Returns the meta object for class '{@link model.ImplementationMigrationElement <em>Implementation Migration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Migration Element</em>'.
	 * @see model.ImplementationMigrationElement
	 * @generated
	 */
	EClass getImplementationMigrationElement();

	/**
	 * Returns the meta object for class '{@link model.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see model.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for class '{@link model.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see model.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for class '{@link model.Plateau <em>Plateau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plateau</em>'.
	 * @see model.Plateau
	 * @generated
	 */
	EClass getPlateau();

	/**
	 * Returns the meta object for class '{@link model.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap</em>'.
	 * @see model.Gap
	 * @generated
	 */
	EClass getGap();

	/**
	 * Returns the meta object for class '{@link model.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see model.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link model.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see model.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link model.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see model.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link model.AccessRelationship <em>Access Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Relationship</em>'.
	 * @see model.AccessRelationship
	 * @generated
	 */
	EClass getAccessRelationship();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessRelationship#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see model.AccessRelationship#getAccessType()
	 * @see #getAccessRelationship()
	 * @generated
	 */
	EAttribute getAccessRelationship_AccessType();

	/**
	 * Returns the meta object for class '{@link model.AggregationRelationship <em>Aggregation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Relationship</em>'.
	 * @see model.AggregationRelationship
	 * @generated
	 */
	EClass getAggregationRelationship();

	/**
	 * Returns the meta object for class '{@link model.AssignmentRelationship <em>Assignment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Relationship</em>'.
	 * @see model.AssignmentRelationship
	 * @generated
	 */
	EClass getAssignmentRelationship();

	/**
	 * Returns the meta object for class '{@link model.AssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Relationship</em>'.
	 * @see model.AssociationRelationship
	 * @generated
	 */
	EClass getAssociationRelationship();

	/**
	 * Returns the meta object for class '{@link model.CompositionRelationship <em>Composition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Relationship</em>'.
	 * @see model.CompositionRelationship
	 * @generated
	 */
	EClass getCompositionRelationship();

	/**
	 * Returns the meta object for class '{@link model.FlowRelationship <em>Flow Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Relationship</em>'.
	 * @see model.FlowRelationship
	 * @generated
	 */
	EClass getFlowRelationship();

	/**
	 * Returns the meta object for class '{@link model.RealisationRelationship <em>Realisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realisation Relationship</em>'.
	 * @see model.RealisationRelationship
	 * @generated
	 */
	EClass getRealisationRelationship();

	/**
	 * Returns the meta object for class '{@link model.SpecialisationRelationship <em>Specialisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation Relationship</em>'.
	 * @see model.SpecialisationRelationship
	 * @generated
	 */
	EClass getSpecialisationRelationship();

	/**
	 * Returns the meta object for class '{@link model.TriggeringRelationship <em>Triggering Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggering Relationship</em>'.
	 * @see model.TriggeringRelationship
	 * @generated
	 */
	EClass getTriggeringRelationship();

	/**
	 * Returns the meta object for class '{@link model.UsedByRelationship <em>Used By Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used By Relationship</em>'.
	 * @see model.UsedByRelationship
	 * @generated
	 */
	EClass getUsedByRelationship();

	/**
	 * Returns the meta object for class '{@link model.InfluenceRelationship <em>Influence Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence Relationship</em>'.
	 * @see model.InfluenceRelationship
	 * @generated
	 */
	EClass getInfluenceRelationship();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Component</em>'.
	 * @see model.DiagramModelComponent
	 * @generated
	 */
	EClass getDiagramModelComponent();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelComponent#getDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Model</em>'.
	 * @see model.DiagramModelComponent#getDiagramModel()
	 * @see #getDiagramModelComponent()
	 * @generated
	 */
	EReference getDiagramModelComponent_DiagramModel();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Container</em>'.
	 * @see model.DiagramModelContainer
	 * @generated
	 */
	EClass getDiagramModelContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link model.DiagramModelContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see model.DiagramModelContainer#getChildren()
	 * @see #getDiagramModelContainer()
	 * @generated
	 */
	EReference getDiagramModelContainer_Children();

	/**
	 * Returns the meta object for class '{@link model.DiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model</em>'.
	 * @see model.DiagramModel
	 * @generated
	 */
	EClass getDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModel#getConnectionRouterType <em>Connection Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Router Type</em>'.
	 * @see model.DiagramModel#getConnectionRouterType()
	 * @see #getDiagramModel()
	 * @generated
	 */
	EAttribute getDiagramModel_ConnectionRouterType();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Reference</em>'.
	 * @see model.DiagramModelReference
	 * @generated
	 */
	EClass getDiagramModelReference();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelReference#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Model</em>'.
	 * @see model.DiagramModelReference#getReferencedModel()
	 * @see #getDiagramModelReference()
	 * @generated
	 */
	EReference getDiagramModelReference_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Object</em>'.
	 * @see model.DiagramModelObject
	 * @generated
	 */
	EClass getDiagramModelObject();

	/**
	 * Returns the meta object for the containment reference '{@link model.DiagramModelObject#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see model.DiagramModelObject#getBounds()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_Bounds();

	/**
	 * Returns the meta object for the containment reference list '{@link model.DiagramModelObject#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see model.DiagramModelObject#getSourceConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_SourceConnections();

	/**
	 * Returns the meta object for the reference list '{@link model.DiagramModelObject#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see model.DiagramModelObject#getTargetConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_TargetConnections();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelObject#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see model.DiagramModelObject#getFillColor()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EAttribute getDiagramModelObject_FillColor();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelObject#addConnection(model.DiagramModelConnection) <em>Add Connection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Connection</em>' operation.
	 * @see model.DiagramModelObject#addConnection(model.DiagramModelConnection)
	 * @generated
	 */
	EOperation getDiagramModelObject__AddConnection__DiagramModelConnection();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelObject#removeConnection(model.DiagramModelConnection) <em>Remove Connection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Connection</em>' operation.
	 * @see model.DiagramModelObject#removeConnection(model.DiagramModelConnection)
	 * @generated
	 */
	EOperation getDiagramModelObject__RemoveConnection__DiagramModelConnection();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelObject#setBounds(int, int, int, int) <em>Set Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bounds</em>' operation.
	 * @see model.DiagramModelObject#setBounds(int, int, int, int)
	 * @generated
	 */
	EOperation getDiagramModelObject__SetBounds__int_int_int_int();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Group</em>'.
	 * @see model.DiagramModelGroup
	 * @generated
	 */
	EClass getDiagramModelGroup();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Note</em>'.
	 * @see model.DiagramModelNote
	 * @generated
	 */
	EClass getDiagramModelNote();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelNote#getBorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Type</em>'.
	 * @see model.DiagramModelNote#getBorderType()
	 * @see #getDiagramModelNote()
	 * @generated
	 */
	EAttribute getDiagramModelNote_BorderType();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image</em>'.
	 * @see model.DiagramModelImage
	 * @generated
	 */
	EClass getDiagramModelImage();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Connection</em>'.
	 * @see model.DiagramModelConnection
	 * @generated
	 */
	EClass getDiagramModelConnection();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelConnection#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see model.DiagramModelConnection#getText()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Text();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelConnection#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see model.DiagramModelConnection#getTextPosition()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_TextPosition();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see model.DiagramModelConnection#getSource()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see model.DiagramModelConnection#getTarget()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link model.DiagramModelConnection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see model.DiagramModelConnection#getBendpoints()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.DiagramModelConnection#getType()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Type();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelConnection#connect(model.DiagramModelObject, model.DiagramModelObject) <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see model.DiagramModelConnection#connect(model.DiagramModelObject, model.DiagramModelObject)
	 * @generated
	 */
	EOperation getDiagramModelConnection__Connect__DiagramModelObject_DiagramModelObject();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelConnection#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see model.DiagramModelConnection#disconnect()
	 * @generated
	 */
	EOperation getDiagramModelConnection__Disconnect();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelConnection#reconnect() <em>Reconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect</em>' operation.
	 * @see model.DiagramModelConnection#reconnect()
	 * @generated
	 */
	EOperation getDiagramModelConnection__Reconnect();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Bendpoint</em>'.
	 * @see model.DiagramModelBendpoint
	 * @generated
	 */
	EClass getDiagramModelBendpoint();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelBendpoint#getStartX <em>Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start X</em>'.
	 * @see model.DiagramModelBendpoint#getStartX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartX();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelBendpoint#getStartY <em>Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Y</em>'.
	 * @see model.DiagramModelBendpoint#getStartY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartY();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelBendpoint#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see model.DiagramModelBendpoint#getEndX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndX();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelBendpoint#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see model.DiagramModelBendpoint#getEndY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndY();

	/**
	 * Returns the meta object for class '{@link model.LineObject <em>Line Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Object</em>'.
	 * @see model.LineObject
	 * @generated
	 */
	EClass getLineObject();

	/**
	 * Returns the meta object for the attribute '{@link model.LineObject#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see model.LineObject#getLineWidth()
	 * @see #getLineObject()
	 * @generated
	 */
	EAttribute getLineObject_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link model.LineObject#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see model.LineObject#getLineColor()
	 * @see #getLineObject()
	 * @generated
	 */
	EAttribute getLineObject_LineColor();

	/**
	 * Returns the meta object for class '{@link model.FontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Attribute</em>'.
	 * @see model.FontAttribute
	 * @generated
	 */
	EClass getFontAttribute();

	/**
	 * Returns the meta object for the attribute '{@link model.FontAttribute#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see model.FontAttribute#getFont()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_Font();

	/**
	 * Returns the meta object for the attribute '{@link model.FontAttribute#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see model.FontAttribute#getFontColor()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_FontColor();

	/**
	 * Returns the meta object for class '{@link model.TextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Position</em>'.
	 * @see model.TextPosition
	 * @generated
	 */
	EClass getTextPosition();

	/**
	 * Returns the meta object for the attribute '{@link model.TextPosition#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see model.TextPosition#getTextPosition()
	 * @see #getTextPosition()
	 * @generated
	 */
	EAttribute getTextPosition_TextPosition();

	/**
	 * Returns the meta object for class '{@link model.TextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Alignment</em>'.
	 * @see model.TextAlignment
	 * @generated
	 */
	EClass getTextAlignment();

	/**
	 * Returns the meta object for the attribute '{@link model.TextAlignment#getTextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alignment</em>'.
	 * @see model.TextAlignment#getTextAlignment()
	 * @see #getTextAlignment()
	 * @generated
	 */
	EAttribute getTextAlignment_TextAlignment();

	/**
	 * Returns the meta object for the '{@link model.TextAlignment#getDefaultTextAlignment() <em>Get Default Text Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Text Alignment</em>' operation.
	 * @see model.TextAlignment#getDefaultTextAlignment()
	 * @generated
	 */
	EOperation getTextAlignment__GetDefaultTextAlignment();

	/**
	 * Returns the meta object for class '{@link model.BorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Object</em>'.
	 * @see model.BorderObject
	 * @generated
	 */
	EClass getBorderObject();

	/**
	 * Returns the meta object for the attribute '{@link model.BorderObject#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see model.BorderObject#getBorderColor()
	 * @see #getBorderObject()
	 * @generated
	 */
	EAttribute getBorderObject_BorderColor();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image Provider</em>'.
	 * @see model.DiagramModelImageProvider
	 * @generated
	 */
	EClass getDiagramModelImageProvider();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelImageProvider#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see model.DiagramModelImageProvider#getImagePath()
	 * @see #getDiagramModelImageProvider()
	 * @generated
	 */
	EAttribute getDiagramModelImageProvider_ImagePath();

	/**
	 * Returns the meta object for class '{@link model.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see model.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link model.Bounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see model.Bounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link model.Bounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see model.Bounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link model.Bounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.Bounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link model.Bounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see model.Bounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for the '{@link model.Bounds#getCopy() <em>Get Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Copy</em>' operation.
	 * @see model.Bounds#getCopy()
	 * @generated
	 */
	EOperation getBounds__GetCopy();

	/**
	 * Returns the meta object for class '{@link model.Lockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lockable</em>'.
	 * @see model.Lockable
	 * @generated
	 */
	EClass getLockable();

	/**
	 * Returns the meta object for the attribute '{@link model.Lockable#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see model.Lockable#isLocked()
	 * @see #getLockable()
	 * @generated
	 */
	EAttribute getLockable_Locked();

	/**
	 * Returns the meta object for class '{@link model.ArchimateDiagramModel <em>Archimate Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate Diagram Model</em>'.
	 * @see model.ArchimateDiagramModel
	 * @generated
	 */
	EClass getArchimateDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link model.ArchimateDiagramModel#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see model.ArchimateDiagramModel#getViewpoint()
	 * @see #getArchimateDiagramModel()
	 * @generated
	 */
	EAttribute getArchimateDiagramModel_Viewpoint();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Archimate Object</em>'.
	 * @see model.DiagramModelArchimateObject
	 * @generated
	 */
	EClass getDiagramModelArchimateObject();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelArchimateObject#getArchimateElement <em>Archimate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archimate Element</em>'.
	 * @see model.DiagramModelArchimateObject#getArchimateElement()
	 * @see #getDiagramModelArchimateObject()
	 * @generated
	 */
	EReference getDiagramModelArchimateObject_ArchimateElement();

	/**
	 * Returns the meta object for the attribute '{@link model.DiagramModelArchimateObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.DiagramModelArchimateObject#getType()
	 * @see #getDiagramModelArchimateObject()
	 * @generated
	 */
	EAttribute getDiagramModelArchimateObject_Type();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelArchimateObject#addArchimateElementToModel(model.Folder) <em>Add Archimate Element To Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Archimate Element To Model</em>' operation.
	 * @see model.DiagramModelArchimateObject#addArchimateElementToModel(model.Folder)
	 * @generated
	 */
	EOperation getDiagramModelArchimateObject__AddArchimateElementToModel__Folder();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelArchimateObject#removeArchimateElementFromModel() <em>Remove Archimate Element From Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Archimate Element From Model</em>' operation.
	 * @see model.DiagramModelArchimateObject#removeArchimateElementFromModel()
	 * @generated
	 */
	EOperation getDiagramModelArchimateObject__RemoveArchimateElementFromModel();

	/**
	 * Returns the meta object for class '{@link model.DiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Archimate Connection</em>'.
	 * @see model.DiagramModelArchimateConnection
	 * @generated
	 */
	EClass getDiagramModelArchimateConnection();

	/**
	 * Returns the meta object for the reference '{@link model.DiagramModelArchimateConnection#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see model.DiagramModelArchimateConnection#getRelationship()
	 * @see #getDiagramModelArchimateConnection()
	 * @generated
	 */
	EReference getDiagramModelArchimateConnection_Relationship();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelArchimateConnection#addRelationshipToModel(model.Folder) <em>Add Relationship To Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Relationship To Model</em>' operation.
	 * @see model.DiagramModelArchimateConnection#addRelationshipToModel(model.Folder)
	 * @generated
	 */
	EOperation getDiagramModelArchimateConnection__AddRelationshipToModel__Folder();

	/**
	 * Returns the meta object for the '{@link model.DiagramModelArchimateConnection#removeRelationshipFromModel() <em>Remove Relationship From Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Relationship From Model</em>' operation.
	 * @see model.DiagramModelArchimateConnection#removeRelationshipFromModel()
	 * @generated
	 */
	EOperation getDiagramModelArchimateConnection__RemoveRelationshipFromModel();

	/**
	 * Returns the meta object for class '{@link model.SketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model</em>'.
	 * @see model.SketchModel
	 * @generated
	 */
	EClass getSketchModel();

	/**
	 * Returns the meta object for the attribute '{@link model.SketchModel#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see model.SketchModel#getBackground()
	 * @see #getSketchModel()
	 * @generated
	 */
	EAttribute getSketchModel_Background();

	/**
	 * Returns the meta object for class '{@link model.SketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Sticky</em>'.
	 * @see model.SketchModelSticky
	 * @generated
	 */
	EClass getSketchModelSticky();

	/**
	 * Returns the meta object for class '{@link model.SketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Actor</em>'.
	 * @see model.SketchModelActor
	 * @generated
	 */
	EClass getSketchModelActor();

	/**
	 * Returns the meta object for enum '{@link model.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Folder Type</em>'.
	 * @see model.FolderType
	 * @generated
	 */
	EEnum getFolderType();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File" serializeable="false"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.Adapter <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Adapter
		 * @see model.impl.ModelPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '<em><b>Get Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTER___GET_ADAPTER__OBJECT = eINSTANCE.getAdapter__GetAdapter__Object();

		/**
		 * The meta object literal for the '<em><b>Set Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADAPTER___SET_ADAPTER__OBJECT_OBJECT = eINSTANCE.getAdapter__SetAdapter__Object_Object();

		/**
		 * The meta object literal for the '{@link model.Identifier <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Identifier
		 * @see model.impl.ModelPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link model.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PropertyImpl
		 * @see model.impl.ModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link model.Properties <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Properties
		 * @see model.impl.ModelPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

		/**
		 * The meta object literal for the '{@link model.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MetadataImpl
		 * @see model.impl.ModelPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ENTRIES = eINSTANCE.getMetadata_Entries();

		/**
		 * The meta object literal for the '{@link model.Nameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Nameable
		 * @see model.impl.ModelPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

		/**
		 * The meta object literal for the '{@link model.TextContent <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.TextContent
		 * @see model.impl.ModelPackageImpl#getTextContent()
		 * @generated
		 */
		EClass TEXT_CONTENT = eINSTANCE.getTextContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__CONTENT = eINSTANCE.getTextContent_Content();

		/**
		 * The meta object literal for the '{@link model.Documentable <em>Documentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Documentable
		 * @see model.impl.ModelPackageImpl#getDocumentable()
		 * @generated
		 */
		EClass DOCUMENTABLE = eINSTANCE.getDocumentable();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTABLE__DOCUMENTATION = eINSTANCE.getDocumentable_Documentation();

		/**
		 * The meta object literal for the '{@link model.Cloneable <em>Cloneable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Cloneable
		 * @see model.impl.ModelPackageImpl#getCloneable()
		 * @generated
		 */
		EClass CLONEABLE = eINSTANCE.getCloneable();

		/**
		 * The meta object literal for the '<em><b>Get Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLONEABLE___GET_COPY = eINSTANCE.getCloneable__GetCopy();

		/**
		 * The meta object literal for the '{@link model.FolderContainer <em>Folder Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.FolderContainer
		 * @see model.impl.ModelPackageImpl#getFolderContainer()
		 * @generated
		 */
		EClass FOLDER_CONTAINER = eINSTANCE.getFolderContainer();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_CONTAINER__FOLDERS = eINSTANCE.getFolderContainer_Folders();

		/**
		 * The meta object literal for the '{@link model.ArchimateModelElement <em>Archimate Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ArchimateModelElement
		 * @see model.impl.ModelPackageImpl#getArchimateModelElement()
		 * @generated
		 */
		EClass ARCHIMATE_MODEL_ELEMENT = eINSTANCE.getArchimateModelElement();

		/**
		 * The meta object literal for the '<em><b>Archimate Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL = eINSTANCE.getArchimateModelElement_ArchimateModel();

		/**
		 * The meta object literal for the '{@link model.impl.ArchimateModelImpl <em>Archimate Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArchimateModelImpl
		 * @see model.impl.ModelPackageImpl#getArchimateModel()
		 * @generated
		 */
		EClass ARCHIMATE_MODEL = eINSTANCE.getArchimateModel();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__PURPOSE = eINSTANCE.getArchimateModel_Purpose();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__FILE = eINSTANCE.getArchimateModel_File();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__VERSION = eINSTANCE.getArchimateModel_Version();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIMATE_MODEL__METADATA = eINSTANCE.getArchimateModel_Metadata();

		/**
		 * The meta object literal for the '<em><b>Set Defaults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___SET_DEFAULTS = eINSTANCE.getArchimateModel__SetDefaults();

		/**
		 * The meta object literal for the '<em><b>Add Derived Relations Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___ADD_DERIVED_RELATIONS_FOLDER = eINSTANCE.getArchimateModel__AddDerivedRelationsFolder();

		/**
		 * The meta object literal for the '<em><b>Remove Derived Relations Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___REMOVE_DERIVED_RELATIONS_FOLDER = eINSTANCE.getArchimateModel__RemoveDerivedRelationsFolder();

		/**
		 * The meta object literal for the '<em><b>Get Default Folder For Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___GET_DEFAULT_FOLDER_FOR_ELEMENT__EOBJECT = eINSTANCE.getArchimateModel__GetDefaultFolderForElement__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Default Diagram Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___GET_DEFAULT_DIAGRAM_MODEL = eINSTANCE.getArchimateModel__GetDefaultDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Get Diagram Models</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___GET_DIAGRAM_MODELS = eINSTANCE.getArchimateModel__GetDiagramModels();

		/**
		 * The meta object literal for the '<em><b>Get Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIMATE_MODEL___GET_FOLDER__FOLDERTYPE = eINSTANCE.getArchimateModel__GetFolder__FolderType();

		/**
		 * The meta object literal for the '{@link model.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FolderImpl
		 * @see model.impl.ModelPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__ELEMENTS = eINSTANCE.getFolder_Elements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__TYPE = eINSTANCE.getFolder_Type();

		/**
		 * The meta object literal for the '{@link model.impl.ArchimateComponentImpl <em>Archimate Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArchimateComponentImpl
		 * @see model.impl.ModelPackageImpl#getArchimateComponent()
		 * @generated
		 */
		EClass ARCHIMATE_COMPONENT = eINSTANCE.getArchimateComponent();

		/**
		 * The meta object literal for the '{@link model.impl.ArchimateElementImpl <em>Archimate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArchimateElementImpl
		 * @see model.impl.ModelPackageImpl#getArchimateElement()
		 * @generated
		 */
		EClass ARCHIMATE_ELEMENT = eINSTANCE.getArchimateElement();

		/**
		 * The meta object literal for the '{@link model.JunctionElement <em>Junction Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.JunctionElement
		 * @see model.impl.ModelPackageImpl#getJunctionElement()
		 * @generated
		 */
		EClass JUNCTION_ELEMENT = eINSTANCE.getJunctionElement();

		/**
		 * The meta object literal for the '{@link model.InterfaceElement <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.InterfaceElement
		 * @see model.impl.ModelPackageImpl#getInterfaceElement()
		 * @generated
		 */
		EClass INTERFACE_ELEMENT = eINSTANCE.getInterfaceElement();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ELEMENT__INTERFACE_TYPE = eINSTANCE.getInterfaceElement_InterfaceType();

		/**
		 * The meta object literal for the '{@link model.ServiceElement <em>Service Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ServiceElement
		 * @see model.impl.ModelPackageImpl#getServiceElement()
		 * @generated
		 */
		EClass SERVICE_ELEMENT = eINSTANCE.getServiceElement();

		/**
		 * The meta object literal for the '{@link model.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.JunctionImpl
		 * @see model.impl.ModelPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link model.impl.AndJunctionImpl <em>And Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AndJunctionImpl
		 * @see model.impl.ModelPackageImpl#getAndJunction()
		 * @generated
		 */
		EClass AND_JUNCTION = eINSTANCE.getAndJunction();

		/**
		 * The meta object literal for the '{@link model.impl.OrJunctionImpl <em>Or Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OrJunctionImpl
		 * @see model.impl.ModelPackageImpl#getOrJunction()
		 * @generated
		 */
		EClass OR_JUNCTION = eINSTANCE.getOrJunction();

		/**
		 * The meta object literal for the '{@link model.BusinessLayerElement <em>Business Layer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BusinessLayerElement
		 * @see model.impl.ModelPackageImpl#getBusinessLayerElement()
		 * @generated
		 */
		EClass BUSINESS_LAYER_ELEMENT = eINSTANCE.getBusinessLayerElement();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessActivityImpl <em>Business Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessActivityImpl
		 * @see model.impl.ModelPackageImpl#getBusinessActivity()
		 * @generated
		 */
		EClass BUSINESS_ACTIVITY = eINSTANCE.getBusinessActivity();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessActorImpl <em>Business Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessActorImpl
		 * @see model.impl.ModelPackageImpl#getBusinessActor()
		 * @generated
		 */
		EClass BUSINESS_ACTOR = eINSTANCE.getBusinessActor();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessCollaborationImpl <em>Business Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessCollaborationImpl
		 * @see model.impl.ModelPackageImpl#getBusinessCollaboration()
		 * @generated
		 */
		EClass BUSINESS_COLLABORATION = eINSTANCE.getBusinessCollaboration();

		/**
		 * The meta object literal for the '{@link model.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ContractImpl
		 * @see model.impl.ModelPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessEventImpl <em>Business Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessEventImpl
		 * @see model.impl.ModelPackageImpl#getBusinessEvent()
		 * @generated
		 */
		EClass BUSINESS_EVENT = eINSTANCE.getBusinessEvent();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessFunctionImpl <em>Business Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessFunctionImpl
		 * @see model.impl.ModelPackageImpl#getBusinessFunction()
		 * @generated
		 */
		EClass BUSINESS_FUNCTION = eINSTANCE.getBusinessFunction();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessInteractionImpl <em>Business Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessInteractionImpl
		 * @see model.impl.ModelPackageImpl#getBusinessInteraction()
		 * @generated
		 */
		EClass BUSINESS_INTERACTION = eINSTANCE.getBusinessInteraction();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessInterfaceImpl <em>Business Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessInterfaceImpl
		 * @see model.impl.ModelPackageImpl#getBusinessInterface()
		 * @generated
		 */
		EClass BUSINESS_INTERFACE = eINSTANCE.getBusinessInterface();

		/**
		 * The meta object literal for the '{@link model.impl.MeaningImpl <em>Meaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MeaningImpl
		 * @see model.impl.ModelPackageImpl#getMeaning()
		 * @generated
		 */
		EClass MEANING = eINSTANCE.getMeaning();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessObjectImpl <em>Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessObjectImpl
		 * @see model.impl.ModelPackageImpl#getBusinessObject()
		 * @generated
		 */
		EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessProcessImpl <em>Business Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessProcessImpl
		 * @see model.impl.ModelPackageImpl#getBusinessProcess()
		 * @generated
		 */
		EClass BUSINESS_PROCESS = eINSTANCE.getBusinessProcess();

		/**
		 * The meta object literal for the '{@link model.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ProductImpl
		 * @see model.impl.ModelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link model.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RepresentationImpl
		 * @see model.impl.ModelPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessRoleImpl <em>Business Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessRoleImpl
		 * @see model.impl.ModelPackageImpl#getBusinessRole()
		 * @generated
		 */
		EClass BUSINESS_ROLE = eINSTANCE.getBusinessRole();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessServiceImpl <em>Business Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessServiceImpl
		 * @see model.impl.ModelPackageImpl#getBusinessService()
		 * @generated
		 */
		EClass BUSINESS_SERVICE = eINSTANCE.getBusinessService();

		/**
		 * The meta object literal for the '{@link model.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ValueImpl
		 * @see model.impl.ModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link model.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LocationImpl
		 * @see model.impl.ModelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link model.ApplicationLayerElement <em>Application Layer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ApplicationLayerElement
		 * @see model.impl.ModelPackageImpl#getApplicationLayerElement()
		 * @generated
		 */
		EClass APPLICATION_LAYER_ELEMENT = eINSTANCE.getApplicationLayerElement();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationCollaborationImpl <em>Application Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationCollaborationImpl
		 * @see model.impl.ModelPackageImpl#getApplicationCollaboration()
		 * @generated
		 */
		EClass APPLICATION_COLLABORATION = eINSTANCE.getApplicationCollaboration();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationComponentImpl
		 * @see model.impl.ModelPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationFunctionImpl <em>Application Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationFunctionImpl
		 * @see model.impl.ModelPackageImpl#getApplicationFunction()
		 * @generated
		 */
		EClass APPLICATION_FUNCTION = eINSTANCE.getApplicationFunction();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationInteractionImpl <em>Application Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationInteractionImpl
		 * @see model.impl.ModelPackageImpl#getApplicationInteraction()
		 * @generated
		 */
		EClass APPLICATION_INTERACTION = eINSTANCE.getApplicationInteraction();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationInterfaceImpl <em>Application Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationInterfaceImpl
		 * @see model.impl.ModelPackageImpl#getApplicationInterface()
		 * @generated
		 */
		EClass APPLICATION_INTERFACE = eINSTANCE.getApplicationInterface();

		/**
		 * The meta object literal for the '{@link model.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DataObjectImpl
		 * @see model.impl.ModelPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link model.impl.ApplicationServiceImpl <em>Application Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ApplicationServiceImpl
		 * @see model.impl.ModelPackageImpl#getApplicationService()
		 * @generated
		 */
		EClass APPLICATION_SERVICE = eINSTANCE.getApplicationService();

		/**
		 * The meta object literal for the '{@link model.TechnologyLayerElement <em>Technology Layer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.TechnologyLayerElement
		 * @see model.impl.ModelPackageImpl#getTechnologyLayerElement()
		 * @generated
		 */
		EClass TECHNOLOGY_LAYER_ELEMENT = eINSTANCE.getTechnologyLayerElement();

		/**
		 * The meta object literal for the '{@link model.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArtifactImpl
		 * @see model.impl.ModelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link model.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CommunicationPathImpl
		 * @see model.impl.ModelPackageImpl#getCommunicationPath()
		 * @generated
		 */
		EClass COMMUNICATION_PATH = eINSTANCE.getCommunicationPath();

		/**
		 * The meta object literal for the '{@link model.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NetworkImpl
		 * @see model.impl.ModelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '{@link model.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InfrastructureInterfaceImpl
		 * @see model.impl.ModelPackageImpl#getInfrastructureInterface()
		 * @generated
		 */
		EClass INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface();

		/**
		 * The meta object literal for the '{@link model.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InfrastructureServiceImpl
		 * @see model.impl.ModelPackageImpl#getInfrastructureService()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SERVICE = eINSTANCE.getInfrastructureService();

		/**
		 * The meta object literal for the '{@link model.impl.InfrastructureFunctionImpl <em>Infrastructure Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InfrastructureFunctionImpl
		 * @see model.impl.ModelPackageImpl#getInfrastructureFunction()
		 * @generated
		 */
		EClass INFRASTRUCTURE_FUNCTION = eINSTANCE.getInfrastructureFunction();

		/**
		 * The meta object literal for the '{@link model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NodeImpl
		 * @see model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link model.impl.SystemSoftwareImpl <em>System Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SystemSoftwareImpl
		 * @see model.impl.ModelPackageImpl#getSystemSoftware()
		 * @generated
		 */
		EClass SYSTEM_SOFTWARE = eINSTANCE.getSystemSoftware();

		/**
		 * The meta object literal for the '{@link model.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DeviceImpl
		 * @see model.impl.ModelPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link model.impl.MotivationElementImpl <em>Motivation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MotivationElementImpl
		 * @see model.impl.ModelPackageImpl#getMotivationElement()
		 * @generated
		 */
		EClass MOTIVATION_ELEMENT = eINSTANCE.getMotivationElement();

		/**
		 * The meta object literal for the '{@link model.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StakeholderImpl
		 * @see model.impl.ModelPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '{@link model.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DriverImpl
		 * @see model.impl.ModelPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '{@link model.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AssessmentImpl
		 * @see model.impl.ModelPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '{@link model.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.GoalImpl
		 * @see model.impl.ModelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link model.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RequirementImpl
		 * @see model.impl.ModelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link model.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ConstraintImpl
		 * @see model.impl.ModelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link model.impl.PrincipleImpl <em>Principle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PrincipleImpl
		 * @see model.impl.ModelPackageImpl#getPrinciple()
		 * @generated
		 */
		EClass PRINCIPLE = eINSTANCE.getPrinciple();

		/**
		 * The meta object literal for the '{@link model.impl.ImplementationMigrationElementImpl <em>Implementation Migration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ImplementationMigrationElementImpl
		 * @see model.impl.ModelPackageImpl#getImplementationMigrationElement()
		 * @generated
		 */
		EClass IMPLEMENTATION_MIGRATION_ELEMENT = eINSTANCE.getImplementationMigrationElement();

		/**
		 * The meta object literal for the '{@link model.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.WorkPackageImpl
		 * @see model.impl.ModelPackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '{@link model.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DeliverableImpl
		 * @see model.impl.ModelPackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();

		/**
		 * The meta object literal for the '{@link model.impl.PlateauImpl <em>Plateau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PlateauImpl
		 * @see model.impl.ModelPackageImpl#getPlateau()
		 * @generated
		 */
		EClass PLATEAU = eINSTANCE.getPlateau();

		/**
		 * The meta object literal for the '{@link model.impl.GapImpl <em>Gap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.GapImpl
		 * @see model.impl.ModelPackageImpl#getGap()
		 * @generated
		 */
		EClass GAP = eINSTANCE.getGap();

		/**
		 * The meta object literal for the '{@link model.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RelationshipImpl
		 * @see model.impl.ModelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link model.impl.AccessRelationshipImpl <em>Access Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AccessRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getAccessRelationship()
		 * @generated
		 */
		EClass ACCESS_RELATIONSHIP = eINSTANCE.getAccessRelationship();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RELATIONSHIP__ACCESS_TYPE = eINSTANCE.getAccessRelationship_AccessType();

		/**
		 * The meta object literal for the '{@link model.impl.AggregationRelationshipImpl <em>Aggregation Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AggregationRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getAggregationRelationship()
		 * @generated
		 */
		EClass AGGREGATION_RELATIONSHIP = eINSTANCE.getAggregationRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.AssignmentRelationshipImpl <em>Assignment Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AssignmentRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getAssignmentRelationship()
		 * @generated
		 */
		EClass ASSIGNMENT_RELATIONSHIP = eINSTANCE.getAssignmentRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.AssociationRelationshipImpl <em>Association Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AssociationRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getAssociationRelationship()
		 * @generated
		 */
		EClass ASSOCIATION_RELATIONSHIP = eINSTANCE.getAssociationRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.CompositionRelationshipImpl <em>Composition Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CompositionRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getCompositionRelationship()
		 * @generated
		 */
		EClass COMPOSITION_RELATIONSHIP = eINSTANCE.getCompositionRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.FlowRelationshipImpl <em>Flow Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FlowRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getFlowRelationship()
		 * @generated
		 */
		EClass FLOW_RELATIONSHIP = eINSTANCE.getFlowRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.RealisationRelationshipImpl <em>Realisation Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RealisationRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getRealisationRelationship()
		 * @generated
		 */
		EClass REALISATION_RELATIONSHIP = eINSTANCE.getRealisationRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.SpecialisationRelationshipImpl <em>Specialisation Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SpecialisationRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getSpecialisationRelationship()
		 * @generated
		 */
		EClass SPECIALISATION_RELATIONSHIP = eINSTANCE.getSpecialisationRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.TriggeringRelationshipImpl <em>Triggering Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TriggeringRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getTriggeringRelationship()
		 * @generated
		 */
		EClass TRIGGERING_RELATIONSHIP = eINSTANCE.getTriggeringRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.UsedByRelationshipImpl <em>Used By Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.UsedByRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getUsedByRelationship()
		 * @generated
		 */
		EClass USED_BY_RELATIONSHIP = eINSTANCE.getUsedByRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.InfluenceRelationshipImpl <em>Influence Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InfluenceRelationshipImpl
		 * @see model.impl.ModelPackageImpl#getInfluenceRelationship()
		 * @generated
		 */
		EClass INFLUENCE_RELATIONSHIP = eINSTANCE.getInfluenceRelationship();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelComponentImpl <em>Diagram Model Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelComponentImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelComponent()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_COMPONENT = eINSTANCE.getDiagramModelComponent();

		/**
		 * The meta object literal for the '<em><b>Diagram Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL = eINSTANCE.getDiagramModelComponent_DiagramModel();

		/**
		 * The meta object literal for the '{@link model.DiagramModelContainer <em>Diagram Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.DiagramModelContainer
		 * @see model.impl.ModelPackageImpl#getDiagramModelContainer()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_CONTAINER = eINSTANCE.getDiagramModelContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONTAINER__CHILDREN = eINSTANCE.getDiagramModelContainer_Children();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelImpl <em>Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModel()
		 * @generated
		 */
		EClass DIAGRAM_MODEL = eINSTANCE.getDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Connection Router Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = eINSTANCE.getDiagramModel_ConnectionRouterType();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelReferenceImpl <em>Diagram Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelReferenceImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelReference()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_REFERENCE = eINSTANCE.getDiagramModelReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL = eINSTANCE.getDiagramModelReference_ReferencedModel();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelObjectImpl <em>Diagram Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelObjectImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelObject()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_OBJECT = eINSTANCE.getDiagramModelObject();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__BOUNDS = eINSTANCE.getDiagramModelObject_Bounds();

		/**
		 * The meta object literal for the '<em><b>Source Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS = eINSTANCE.getDiagramModelObject_SourceConnections();

		/**
		 * The meta object literal for the '<em><b>Target Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS = eINSTANCE.getDiagramModelObject_TargetConnections();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_OBJECT__FILL_COLOR = eINSTANCE.getDiagramModelObject_FillColor();

		/**
		 * The meta object literal for the '<em><b>Add Connection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION = eINSTANCE.getDiagramModelObject__AddConnection__DiagramModelConnection();

		/**
		 * The meta object literal for the '<em><b>Remove Connection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION = eINSTANCE.getDiagramModelObject__RemoveConnection__DiagramModelConnection();

		/**
		 * The meta object literal for the '<em><b>Set Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT = eINSTANCE.getDiagramModelObject__SetBounds__int_int_int_int();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelGroupImpl <em>Diagram Model Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelGroupImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelGroup()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_GROUP = eINSTANCE.getDiagramModelGroup();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelNoteImpl <em>Diagram Model Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelNoteImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelNote()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_NOTE = eINSTANCE.getDiagramModelNote();

		/**
		 * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_NOTE__BORDER_TYPE = eINSTANCE.getDiagramModelNote_BorderType();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelImageImpl <em>Diagram Model Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelImageImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelImage()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_IMAGE = eINSTANCE.getDiagramModelImage();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelConnectionImpl <em>Diagram Model Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelConnectionImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelConnection()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_CONNECTION = eINSTANCE.getDiagramModelConnection();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TEXT = eINSTANCE.getDiagramModelConnection_Text();

		/**
		 * The meta object literal for the '<em><b>Text Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TEXT_POSITION = eINSTANCE.getDiagramModelConnection_TextPosition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__SOURCE = eINSTANCE.getDiagramModelConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__TARGET = eINSTANCE.getDiagramModelConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__BENDPOINTS = eINSTANCE.getDiagramModelConnection_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TYPE = eINSTANCE.getDiagramModelConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT = eINSTANCE.getDiagramModelConnection__Connect__DiagramModelObject_DiagramModelObject();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_CONNECTION___DISCONNECT = eINSTANCE.getDiagramModelConnection__Disconnect();

		/**
		 * The meta object literal for the '<em><b>Reconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_CONNECTION___RECONNECT = eINSTANCE.getDiagramModelConnection__Reconnect();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelBendpointImpl <em>Diagram Model Bendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelBendpointImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelBendpoint()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_BENDPOINT = eINSTANCE.getDiagramModelBendpoint();

		/**
		 * The meta object literal for the '<em><b>Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__START_X = eINSTANCE.getDiagramModelBendpoint_StartX();

		/**
		 * The meta object literal for the '<em><b>Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__START_Y = eINSTANCE.getDiagramModelBendpoint_StartY();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__END_X = eINSTANCE.getDiagramModelBendpoint_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__END_Y = eINSTANCE.getDiagramModelBendpoint_EndY();

		/**
		 * The meta object literal for the '{@link model.LineObject <em>Line Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.LineObject
		 * @see model.impl.ModelPackageImpl#getLineObject()
		 * @generated
		 */
		EClass LINE_OBJECT = eINSTANCE.getLineObject();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OBJECT__LINE_WIDTH = eINSTANCE.getLineObject_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OBJECT__LINE_COLOR = eINSTANCE.getLineObject_LineColor();

		/**
		 * The meta object literal for the '{@link model.FontAttribute <em>Font Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.FontAttribute
		 * @see model.impl.ModelPackageImpl#getFontAttribute()
		 * @generated
		 */
		EClass FONT_ATTRIBUTE = eINSTANCE.getFontAttribute();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__FONT = eINSTANCE.getFontAttribute_Font();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__FONT_COLOR = eINSTANCE.getFontAttribute_FontColor();

		/**
		 * The meta object literal for the '{@link model.TextPosition <em>Text Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.TextPosition
		 * @see model.impl.ModelPackageImpl#getTextPosition()
		 * @generated
		 */
		EClass TEXT_POSITION = eINSTANCE.getTextPosition();

		/**
		 * The meta object literal for the '<em><b>Text Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_POSITION__TEXT_POSITION = eINSTANCE.getTextPosition_TextPosition();

		/**
		 * The meta object literal for the '{@link model.TextAlignment <em>Text Alignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.TextAlignment
		 * @see model.impl.ModelPackageImpl#getTextAlignment()
		 * @generated
		 */
		EClass TEXT_ALIGNMENT = eINSTANCE.getTextAlignment();

		/**
		 * The meta object literal for the '<em><b>Text Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ALIGNMENT__TEXT_ALIGNMENT = eINSTANCE.getTextAlignment_TextAlignment();

		/**
		 * The meta object literal for the '<em><b>Get Default Text Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_ALIGNMENT___GET_DEFAULT_TEXT_ALIGNMENT = eINSTANCE.getTextAlignment__GetDefaultTextAlignment();

		/**
		 * The meta object literal for the '{@link model.BorderObject <em>Border Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BorderObject
		 * @see model.impl.ModelPackageImpl#getBorderObject()
		 * @generated
		 */
		EClass BORDER_OBJECT = eINSTANCE.getBorderObject();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_OBJECT__BORDER_COLOR = eINSTANCE.getBorderObject_BorderColor();

		/**
		 * The meta object literal for the '{@link model.DiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.DiagramModelImageProvider
		 * @see model.impl.ModelPackageImpl#getDiagramModelImageProvider()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_IMAGE_PROVIDER = eINSTANCE.getDiagramModelImageProvider();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH = eINSTANCE.getDiagramModelImageProvider_ImagePath();

		/**
		 * The meta object literal for the '{@link model.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BoundsImpl
		 * @see model.impl.ModelPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '<em><b>Get Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOUNDS___GET_COPY = eINSTANCE.getBounds__GetCopy();

		/**
		 * The meta object literal for the '{@link model.Lockable <em>Lockable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Lockable
		 * @see model.impl.ModelPackageImpl#getLockable()
		 * @generated
		 */
		EClass LOCKABLE = eINSTANCE.getLockable();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCKABLE__LOCKED = eINSTANCE.getLockable_Locked();

		/**
		 * The meta object literal for the '{@link model.impl.ArchimateDiagramModelImpl <em>Archimate Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArchimateDiagramModelImpl
		 * @see model.impl.ModelPackageImpl#getArchimateDiagramModel()
		 * @generated
		 */
		EClass ARCHIMATE_DIAGRAM_MODEL = eINSTANCE.getArchimateDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT = eINSTANCE.getArchimateDiagramModel_Viewpoint();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelArchimateObjectImpl <em>Diagram Model Archimate Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelArchimateObjectImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelArchimateObject()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ARCHIMATE_OBJECT = eINSTANCE.getDiagramModelArchimateObject();

		/**
		 * The meta object literal for the '<em><b>Archimate Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT = eINSTANCE.getDiagramModelArchimateObject_ArchimateElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE = eINSTANCE.getDiagramModelArchimateObject_Type();

		/**
		 * The meta object literal for the '<em><b>Add Archimate Element To Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_ARCHIMATE_OBJECT___ADD_ARCHIMATE_ELEMENT_TO_MODEL__FOLDER = eINSTANCE.getDiagramModelArchimateObject__AddArchimateElementToModel__Folder();

		/**
		 * The meta object literal for the '<em><b>Remove Archimate Element From Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_ARCHIMATE_OBJECT___REMOVE_ARCHIMATE_ELEMENT_FROM_MODEL = eINSTANCE.getDiagramModelArchimateObject__RemoveArchimateElementFromModel();

		/**
		 * The meta object literal for the '{@link model.impl.DiagramModelArchimateConnectionImpl <em>Diagram Model Archimate Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DiagramModelArchimateConnectionImpl
		 * @see model.impl.ModelPackageImpl#getDiagramModelArchimateConnection()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ARCHIMATE_CONNECTION = eINSTANCE.getDiagramModelArchimateConnection();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP = eINSTANCE.getDiagramModelArchimateConnection_Relationship();

		/**
		 * The meta object literal for the '<em><b>Add Relationship To Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_ARCHIMATE_CONNECTION___ADD_RELATIONSHIP_TO_MODEL__FOLDER = eINSTANCE.getDiagramModelArchimateConnection__AddRelationshipToModel__Folder();

		/**
		 * The meta object literal for the '<em><b>Remove Relationship From Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIAGRAM_MODEL_ARCHIMATE_CONNECTION___REMOVE_RELATIONSHIP_FROM_MODEL = eINSTANCE.getDiagramModelArchimateConnection__RemoveRelationshipFromModel();

		/**
		 * The meta object literal for the '{@link model.impl.SketchModelImpl <em>Sketch Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SketchModelImpl
		 * @see model.impl.ModelPackageImpl#getSketchModel()
		 * @generated
		 */
		EClass SKETCH_MODEL = eINSTANCE.getSketchModel();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKETCH_MODEL__BACKGROUND = eINSTANCE.getSketchModel_Background();

		/**
		 * The meta object literal for the '{@link model.impl.SketchModelStickyImpl <em>Sketch Model Sticky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SketchModelStickyImpl
		 * @see model.impl.ModelPackageImpl#getSketchModelSticky()
		 * @generated
		 */
		EClass SKETCH_MODEL_STICKY = eINSTANCE.getSketchModelSticky();

		/**
		 * The meta object literal for the '{@link model.impl.SketchModelActorImpl <em>Sketch Model Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SketchModelActorImpl
		 * @see model.impl.ModelPackageImpl#getSketchModelActor()
		 * @generated
		 */
		EClass SKETCH_MODEL_ACTOR = eINSTANCE.getSketchModelActor();

		/**
		 * The meta object literal for the '{@link model.FolderType <em>Folder Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.FolderType
		 * @see model.impl.ModelPackageImpl#getFolderType()
		 * @generated
		 */
		EEnum FOLDER_TYPE = eINSTANCE.getFolderType();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see model.impl.ModelPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //ModelPackage
