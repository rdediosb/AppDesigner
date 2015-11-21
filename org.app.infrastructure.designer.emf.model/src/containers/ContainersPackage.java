/**
 */
package containers;

import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "containers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/rdediosb/AppDesigner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "containers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersPackage eINSTANCE = containers.impl.ContainersPackageImpl.init();

	/**
	 * The meta object id for the '{@link containers.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see containers.impl.ContainerImpl
	 * @see containers.impl.ContainersPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ARCHIMATE_MODEL = ModelPackage.NODE__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = ModelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ModelPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = ModelPackage.NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROPERTIES = ModelPackage.NODE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ModelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___GET_ADAPTER__OBJECT = ModelPackage.NODE___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___SET_ADAPTER__OBJECT_OBJECT = ModelPackage.NODE___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___GET_COPY = ModelPackage.NODE___GET_COPY;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ModelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link containers.impl.LinkRelationshipImpl <em>Link Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see containers.impl.LinkRelationshipImpl
	 * @see containers.impl.ContainersPackageImpl#getLinkRelationship()
	 * @generated
	 */
	int LINK_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__ARCHIMATE_MODEL = ModelPackage.ASSOCIATION_RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__ID = ModelPackage.ASSOCIATION_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__NAME = ModelPackage.ASSOCIATION_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__DOCUMENTATION = ModelPackage.ASSOCIATION_RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__PROPERTIES = ModelPackage.ASSOCIATION_RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__SOURCE = ModelPackage.ASSOCIATION_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP__TARGET = ModelPackage.ASSOCIATION_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Link Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP_FEATURE_COUNT = ModelPackage.ASSOCIATION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP___GET_ADAPTER__OBJECT = ModelPackage.ASSOCIATION_RELATIONSHIP___GET_ADAPTER__OBJECT;

	/**
	 * The operation id for the '<em>Set Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT = ModelPackage.ASSOCIATION_RELATIONSHIP___SET_ADAPTER__OBJECT_OBJECT;

	/**
	 * The operation id for the '<em>Get Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP___GET_COPY = ModelPackage.ASSOCIATION_RELATIONSHIP___GET_COPY;

	/**
	 * The number of operations of the '<em>Link Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RELATIONSHIP_OPERATION_COUNT = ModelPackage.ASSOCIATION_RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link containers.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see containers.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link containers.LinkRelationship <em>Link Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Relationship</em>'.
	 * @see containers.LinkRelationship
	 * @generated
	 */
	EClass getLinkRelationship();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainersFactory getContainersFactory();

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
		 * The meta object literal for the '{@link containers.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see containers.impl.ContainerImpl
		 * @see containers.impl.ContainersPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link containers.impl.LinkRelationshipImpl <em>Link Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see containers.impl.LinkRelationshipImpl
		 * @see containers.impl.ContainersPackageImpl#getLinkRelationship()
		 * @generated
		 */
		EClass LINK_RELATIONSHIP = eINSTANCE.getLinkRelationship();

	}

} //ContainersPackage
