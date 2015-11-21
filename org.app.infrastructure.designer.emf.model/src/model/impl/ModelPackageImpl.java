/**
 */
package model.impl;

import containers.ContainersPackage;

import containers.impl.ContainersPackageImpl;

import java.io.File;

import model.AccessRelationship;
import model.Adapter;
import model.AggregationRelationship;
import model.AndJunction;
import model.ApplicationCollaboration;
import model.ApplicationComponent;
import model.ApplicationFunction;
import model.ApplicationInteraction;
import model.ApplicationInterface;
import model.ApplicationLayerElement;
import model.ApplicationService;
import model.ArchimateComponent;
import model.ArchimateDiagramModel;
import model.ArchimateElement;
import model.ArchimateModel;
import model.ArchimateModelElement;
import model.Artifact;
import model.Assessment;
import model.AssignmentRelationship;
import model.AssociationRelationship;
import model.BorderObject;
import model.Bounds;
import model.BusinessActivity;
import model.BusinessActor;
import model.BusinessCollaboration;
import model.BusinessEvent;
import model.BusinessFunction;
import model.BusinessInteraction;
import model.BusinessInterface;
import model.BusinessLayerElement;
import model.BusinessObject;
import model.BusinessProcess;
import model.BusinessRole;
import model.BusinessService;
import model.CommunicationPath;
import model.CompositionRelationship;
import model.Constraint;
import model.Contract;
import model.DataObject;
import model.Deliverable;
import model.Device;
import model.DiagramModel;
import model.DiagramModelArchimateConnection;
import model.DiagramModelArchimateObject;
import model.DiagramModelBendpoint;
import model.DiagramModelComponent;
import model.DiagramModelConnection;
import model.DiagramModelContainer;
import model.DiagramModelGroup;
import model.DiagramModelImage;
import model.DiagramModelImageProvider;
import model.DiagramModelNote;
import model.DiagramModelObject;
import model.DiagramModelReference;
import model.Documentable;
import model.Driver;
import model.FlowRelationship;
import model.Folder;
import model.FolderContainer;
import model.FolderType;
import model.FontAttribute;
import model.Gap;
import model.Goal;
import model.Identifier;
import model.ImplementationMigrationElement;
import model.InfluenceRelationship;
import model.InfrastructureFunction;
import model.InfrastructureInterface;
import model.InfrastructureService;
import model.InterfaceElement;
import model.Junction;
import model.JunctionElement;
import model.LineObject;
import model.Location;
import model.Lockable;
import model.Meaning;
import model.Metadata;
import model.ModelFactory;
import model.ModelPackage;
import model.MotivationElement;
import model.Nameable;
import model.Network;
import model.Node;
import model.OrJunction;
import model.Plateau;
import model.Principle;
import model.Product;
import model.Properties;
import model.Property;
import model.RealisationRelationship;
import model.Relationship;
import model.Representation;
import model.Requirement;
import model.ServiceElement;
import model.SketchModel;
import model.SketchModelActor;
import model.SketchModelSticky;
import model.SpecialisationRelationship;
import model.Stakeholder;
import model.SystemSoftware;
import model.TechnologyLayerElement;
import model.TextAlignment;
import model.TextContent;
import model.TextPosition;
import model.TriggeringRelationship;
import model.UsedByRelationship;
import model.Value;
import model.WorkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloneableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archimateModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archimateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archimateComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archimateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orJunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessLayerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessCollaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLayerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationCollaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyLayerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationMigrationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realisationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggeringRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedByRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelBendpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAlignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelImageProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archimateDiagramModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelArchimateObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramModelArchimateConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchModelStickyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchModelActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum folderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI) : ContainersPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theContainersPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdapter__GetAdapter__Object() {
		return adapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdapter__SetAdapter__Object_Object() {
		return adapterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Properties() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Entries() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameable_Name() {
		return (EAttribute)nameableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContent() {
		return textContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContent_Content() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentable() {
		return documentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentable_Documentation() {
		return (EAttribute)documentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloneable() {
		return cloneableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloneable__GetCopy() {
		return cloneableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderContainer() {
		return folderContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolderContainer_Folders() {
		return (EReference)folderContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchimateModelElement() {
		return archimateModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchimateModelElement_ArchimateModel() {
		return (EReference)archimateModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchimateModel() {
		return archimateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchimateModel_Purpose() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchimateModel_File() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchimateModel_Version() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchimateModel_Metadata() {
		return (EReference)archimateModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__SetDefaults() {
		return archimateModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__AddDerivedRelationsFolder() {
		return archimateModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__RemoveDerivedRelationsFolder() {
		return archimateModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__GetDefaultFolderForElement__EObject() {
		return archimateModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__GetDefaultDiagramModel() {
		return archimateModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__GetDiagramModels() {
		return archimateModelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchimateModel__GetFolder__FolderType() {
		return archimateModelEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Elements() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Type() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchimateComponent() {
		return archimateComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchimateElement() {
		return archimateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunctionElement() {
		return junctionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceElement() {
		return interfaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceElement_InterfaceType() {
		return (EAttribute)interfaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceElement() {
		return serviceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunction() {
		return junctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJunction() {
		return andJunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrJunction() {
		return orJunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessLayerElement() {
		return businessLayerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessActivity() {
		return businessActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessActor() {
		return businessActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessCollaboration() {
		return businessCollaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessEvent() {
		return businessEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessFunction() {
		return businessFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessInteraction() {
		return businessInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessInterface() {
		return businessInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaning() {
		return meaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObject() {
		return businessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcess() {
		return businessProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRole() {
		return businessRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessService() {
		return businessServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationLayerElement() {
		return applicationLayerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationCollaboration() {
		return applicationCollaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationFunction() {
		return applicationFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationInteraction() {
		return applicationInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationInterface() {
		return applicationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationService() {
		return applicationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyLayerElement() {
		return technologyLayerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPath() {
		return communicationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureInterface() {
		return infrastructureInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureService() {
		return infrastructureServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureFunction() {
		return infrastructureFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSoftware() {
		return systemSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationElement() {
		return motivationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessment() {
		return assessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinciple() {
		return principleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationMigrationElement() {
		return implementationMigrationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPackage() {
		return workPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverable() {
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlateau() {
		return plateauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGap() {
		return gapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessRelationship() {
		return accessRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessRelationship_AccessType() {
		return (EAttribute)accessRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationRelationship() {
		return aggregationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentRelationship() {
		return assignmentRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationRelationship() {
		return associationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionRelationship() {
		return compositionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowRelationship() {
		return flowRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealisationRelationship() {
		return realisationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialisationRelationship() {
		return specialisationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggeringRelationship() {
		return triggeringRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsedByRelationship() {
		return usedByRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluenceRelationship() {
		return influenceRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelComponent() {
		return diagramModelComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelComponent_DiagramModel() {
		return (EReference)diagramModelComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelContainer() {
		return diagramModelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelContainer_Children() {
		return (EReference)diagramModelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModel() {
		return diagramModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModel_ConnectionRouterType() {
		return (EAttribute)diagramModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelReference() {
		return diagramModelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelReference_ReferencedModel() {
		return (EReference)diagramModelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelObject() {
		return diagramModelObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelObject_Bounds() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelObject_SourceConnections() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelObject_TargetConnections() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelObject_FillColor() {
		return (EAttribute)diagramModelObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelObject__AddConnection__DiagramModelConnection() {
		return diagramModelObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelObject__RemoveConnection__DiagramModelConnection() {
		return diagramModelObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelObject__SetBounds__int_int_int_int() {
		return diagramModelObjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelGroup() {
		return diagramModelGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelNote() {
		return diagramModelNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelNote_BorderType() {
		return (EAttribute)diagramModelNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelImage() {
		return diagramModelImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelConnection() {
		return diagramModelConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelConnection_Text() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelConnection_TextPosition() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelConnection_Source() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelConnection_Target() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelConnection_Bendpoints() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelConnection_Type() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelConnection__Connect__DiagramModelObject_DiagramModelObject() {
		return diagramModelConnectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelConnection__Disconnect() {
		return diagramModelConnectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelConnection__Reconnect() {
		return diagramModelConnectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelBendpoint() {
		return diagramModelBendpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelBendpoint_StartX() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelBendpoint_StartY() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelBendpoint_EndX() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelBendpoint_EndY() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineObject() {
		return lineObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineObject_LineWidth() {
		return (EAttribute)lineObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineObject_LineColor() {
		return (EAttribute)lineObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontAttribute() {
		return fontAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontAttribute_Font() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontAttribute_FontColor() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPosition() {
		return textPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPosition_TextPosition() {
		return (EAttribute)textPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextAlignment() {
		return textAlignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAlignment_TextAlignment() {
		return (EAttribute)textAlignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextAlignment__GetDefaultTextAlignment() {
		return textAlignmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderObject() {
		return borderObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderObject_BorderColor() {
		return (EAttribute)borderObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelImageProvider() {
		return diagramModelImageProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelImageProvider_ImagePath() {
		return (EAttribute)diagramModelImageProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_X() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Y() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Width() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Height() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBounds__GetCopy() {
		return boundsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLockable() {
		return lockableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLockable_Locked() {
		return (EAttribute)lockableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchimateDiagramModel() {
		return archimateDiagramModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchimateDiagramModel_Viewpoint() {
		return (EAttribute)archimateDiagramModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelArchimateObject() {
		return diagramModelArchimateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelArchimateObject_ArchimateElement() {
		return (EReference)diagramModelArchimateObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramModelArchimateObject_Type() {
		return (EAttribute)diagramModelArchimateObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelArchimateObject__AddArchimateElementToModel__Folder() {
		return diagramModelArchimateObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelArchimateObject__RemoveArchimateElementFromModel() {
		return diagramModelArchimateObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramModelArchimateConnection() {
		return diagramModelArchimateConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramModelArchimateConnection_Relationship() {
		return (EReference)diagramModelArchimateConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelArchimateConnection__AddRelationshipToModel__Folder() {
		return diagramModelArchimateConnectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiagramModelArchimateConnection__RemoveRelationshipFromModel() {
		return diagramModelArchimateConnectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketchModel() {
		return sketchModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSketchModel_Background() {
		return (EAttribute)sketchModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketchModelSticky() {
		return sketchModelStickyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketchModelActor() {
		return sketchModelActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFolderType() {
		return folderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adapterEClass = createEClass(ADAPTER);
		createEOperation(adapterEClass, ADAPTER___GET_ADAPTER__OBJECT);
		createEOperation(adapterEClass, ADAPTER___SET_ADAPTER__OBJECT_OBJECT);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

		metadataEClass = createEClass(METADATA);
		createEReference(metadataEClass, METADATA__ENTRIES);

		nameableEClass = createEClass(NAMEABLE);
		createEAttribute(nameableEClass, NAMEABLE__NAME);

		textContentEClass = createEClass(TEXT_CONTENT);
		createEAttribute(textContentEClass, TEXT_CONTENT__CONTENT);

		documentableEClass = createEClass(DOCUMENTABLE);
		createEAttribute(documentableEClass, DOCUMENTABLE__DOCUMENTATION);

		cloneableEClass = createEClass(CLONEABLE);
		createEOperation(cloneableEClass, CLONEABLE___GET_COPY);

		folderContainerEClass = createEClass(FOLDER_CONTAINER);
		createEReference(folderContainerEClass, FOLDER_CONTAINER__FOLDERS);

		archimateModelElementEClass = createEClass(ARCHIMATE_MODEL_ELEMENT);
		createEReference(archimateModelElementEClass, ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL);

		archimateModelEClass = createEClass(ARCHIMATE_MODEL);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__PURPOSE);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__FILE);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__VERSION);
		createEReference(archimateModelEClass, ARCHIMATE_MODEL__METADATA);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___SET_DEFAULTS);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___ADD_DERIVED_RELATIONS_FOLDER);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___REMOVE_DERIVED_RELATIONS_FOLDER);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___GET_DEFAULT_FOLDER_FOR_ELEMENT__EOBJECT);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___GET_DEFAULT_DIAGRAM_MODEL);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___GET_DIAGRAM_MODELS);
		createEOperation(archimateModelEClass, ARCHIMATE_MODEL___GET_FOLDER__FOLDERTYPE);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__ELEMENTS);
		createEAttribute(folderEClass, FOLDER__TYPE);

		archimateComponentEClass = createEClass(ARCHIMATE_COMPONENT);

		archimateElementEClass = createEClass(ARCHIMATE_ELEMENT);

		junctionElementEClass = createEClass(JUNCTION_ELEMENT);

		interfaceElementEClass = createEClass(INTERFACE_ELEMENT);
		createEAttribute(interfaceElementEClass, INTERFACE_ELEMENT__INTERFACE_TYPE);

		serviceElementEClass = createEClass(SERVICE_ELEMENT);

		junctionEClass = createEClass(JUNCTION);

		andJunctionEClass = createEClass(AND_JUNCTION);

		orJunctionEClass = createEClass(OR_JUNCTION);

		businessLayerElementEClass = createEClass(BUSINESS_LAYER_ELEMENT);

		businessActivityEClass = createEClass(BUSINESS_ACTIVITY);

		businessActorEClass = createEClass(BUSINESS_ACTOR);

		businessCollaborationEClass = createEClass(BUSINESS_COLLABORATION);

		contractEClass = createEClass(CONTRACT);

		businessEventEClass = createEClass(BUSINESS_EVENT);

		businessFunctionEClass = createEClass(BUSINESS_FUNCTION);

		businessInteractionEClass = createEClass(BUSINESS_INTERACTION);

		businessInterfaceEClass = createEClass(BUSINESS_INTERFACE);

		meaningEClass = createEClass(MEANING);

		businessObjectEClass = createEClass(BUSINESS_OBJECT);

		businessProcessEClass = createEClass(BUSINESS_PROCESS);

		productEClass = createEClass(PRODUCT);

		representationEClass = createEClass(REPRESENTATION);

		businessRoleEClass = createEClass(BUSINESS_ROLE);

		businessServiceEClass = createEClass(BUSINESS_SERVICE);

		valueEClass = createEClass(VALUE);

		locationEClass = createEClass(LOCATION);

		applicationLayerElementEClass = createEClass(APPLICATION_LAYER_ELEMENT);

		applicationCollaborationEClass = createEClass(APPLICATION_COLLABORATION);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);

		applicationFunctionEClass = createEClass(APPLICATION_FUNCTION);

		applicationInteractionEClass = createEClass(APPLICATION_INTERACTION);

		applicationInterfaceEClass = createEClass(APPLICATION_INTERFACE);

		dataObjectEClass = createEClass(DATA_OBJECT);

		applicationServiceEClass = createEClass(APPLICATION_SERVICE);

		technologyLayerElementEClass = createEClass(TECHNOLOGY_LAYER_ELEMENT);

		artifactEClass = createEClass(ARTIFACT);

		communicationPathEClass = createEClass(COMMUNICATION_PATH);

		networkEClass = createEClass(NETWORK);

		infrastructureInterfaceEClass = createEClass(INFRASTRUCTURE_INTERFACE);

		infrastructureServiceEClass = createEClass(INFRASTRUCTURE_SERVICE);

		infrastructureFunctionEClass = createEClass(INFRASTRUCTURE_FUNCTION);

		nodeEClass = createEClass(NODE);

		systemSoftwareEClass = createEClass(SYSTEM_SOFTWARE);

		deviceEClass = createEClass(DEVICE);

		motivationElementEClass = createEClass(MOTIVATION_ELEMENT);

		stakeholderEClass = createEClass(STAKEHOLDER);

		driverEClass = createEClass(DRIVER);

		assessmentEClass = createEClass(ASSESSMENT);

		goalEClass = createEClass(GOAL);

		requirementEClass = createEClass(REQUIREMENT);

		constraintEClass = createEClass(CONSTRAINT);

		principleEClass = createEClass(PRINCIPLE);

		implementationMigrationElementEClass = createEClass(IMPLEMENTATION_MIGRATION_ELEMENT);

		workPackageEClass = createEClass(WORK_PACKAGE);

		deliverableEClass = createEClass(DELIVERABLE);

		plateauEClass = createEClass(PLATEAU);

		gapEClass = createEClass(GAP);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		accessRelationshipEClass = createEClass(ACCESS_RELATIONSHIP);
		createEAttribute(accessRelationshipEClass, ACCESS_RELATIONSHIP__ACCESS_TYPE);

		aggregationRelationshipEClass = createEClass(AGGREGATION_RELATIONSHIP);

		assignmentRelationshipEClass = createEClass(ASSIGNMENT_RELATIONSHIP);

		associationRelationshipEClass = createEClass(ASSOCIATION_RELATIONSHIP);

		compositionRelationshipEClass = createEClass(COMPOSITION_RELATIONSHIP);

		flowRelationshipEClass = createEClass(FLOW_RELATIONSHIP);

		realisationRelationshipEClass = createEClass(REALISATION_RELATIONSHIP);

		specialisationRelationshipEClass = createEClass(SPECIALISATION_RELATIONSHIP);

		triggeringRelationshipEClass = createEClass(TRIGGERING_RELATIONSHIP);

		usedByRelationshipEClass = createEClass(USED_BY_RELATIONSHIP);

		influenceRelationshipEClass = createEClass(INFLUENCE_RELATIONSHIP);

		diagramModelComponentEClass = createEClass(DIAGRAM_MODEL_COMPONENT);
		createEReference(diagramModelComponentEClass, DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL);

		diagramModelContainerEClass = createEClass(DIAGRAM_MODEL_CONTAINER);
		createEReference(diagramModelContainerEClass, DIAGRAM_MODEL_CONTAINER__CHILDREN);

		diagramModelEClass = createEClass(DIAGRAM_MODEL);
		createEAttribute(diagramModelEClass, DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE);

		diagramModelReferenceEClass = createEClass(DIAGRAM_MODEL_REFERENCE);
		createEReference(diagramModelReferenceEClass, DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL);

		diagramModelObjectEClass = createEClass(DIAGRAM_MODEL_OBJECT);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__BOUNDS);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS);
		createEAttribute(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__FILL_COLOR);
		createEOperation(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION);
		createEOperation(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION);
		createEOperation(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT);

		diagramModelGroupEClass = createEClass(DIAGRAM_MODEL_GROUP);

		diagramModelNoteEClass = createEClass(DIAGRAM_MODEL_NOTE);
		createEAttribute(diagramModelNoteEClass, DIAGRAM_MODEL_NOTE__BORDER_TYPE);

		diagramModelImageEClass = createEClass(DIAGRAM_MODEL_IMAGE);

		diagramModelConnectionEClass = createEClass(DIAGRAM_MODEL_CONNECTION);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TEXT);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TEXT_POSITION);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__SOURCE);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TARGET);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__BENDPOINTS);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TYPE);
		createEOperation(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT);
		createEOperation(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION___DISCONNECT);
		createEOperation(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION___RECONNECT);

		diagramModelBendpointEClass = createEClass(DIAGRAM_MODEL_BENDPOINT);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__START_X);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__START_Y);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__END_X);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__END_Y);

		lineObjectEClass = createEClass(LINE_OBJECT);
		createEAttribute(lineObjectEClass, LINE_OBJECT__LINE_WIDTH);
		createEAttribute(lineObjectEClass, LINE_OBJECT__LINE_COLOR);

		fontAttributeEClass = createEClass(FONT_ATTRIBUTE);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__FONT);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__FONT_COLOR);

		textPositionEClass = createEClass(TEXT_POSITION);
		createEAttribute(textPositionEClass, TEXT_POSITION__TEXT_POSITION);

		textAlignmentEClass = createEClass(TEXT_ALIGNMENT);
		createEAttribute(textAlignmentEClass, TEXT_ALIGNMENT__TEXT_ALIGNMENT);
		createEOperation(textAlignmentEClass, TEXT_ALIGNMENT___GET_DEFAULT_TEXT_ALIGNMENT);

		borderObjectEClass = createEClass(BORDER_OBJECT);
		createEAttribute(borderObjectEClass, BORDER_OBJECT__BORDER_COLOR);

		diagramModelImageProviderEClass = createEClass(DIAGRAM_MODEL_IMAGE_PROVIDER);
		createEAttribute(diagramModelImageProviderEClass, DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH);

		boundsEClass = createEClass(BOUNDS);
		createEAttribute(boundsEClass, BOUNDS__X);
		createEAttribute(boundsEClass, BOUNDS__Y);
		createEAttribute(boundsEClass, BOUNDS__WIDTH);
		createEAttribute(boundsEClass, BOUNDS__HEIGHT);
		createEOperation(boundsEClass, BOUNDS___GET_COPY);

		lockableEClass = createEClass(LOCKABLE);
		createEAttribute(lockableEClass, LOCKABLE__LOCKED);

		archimateDiagramModelEClass = createEClass(ARCHIMATE_DIAGRAM_MODEL);
		createEAttribute(archimateDiagramModelEClass, ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT);

		diagramModelArchimateObjectEClass = createEClass(DIAGRAM_MODEL_ARCHIMATE_OBJECT);
		createEReference(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT);
		createEAttribute(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE);
		createEOperation(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT___ADD_ARCHIMATE_ELEMENT_TO_MODEL__FOLDER);
		createEOperation(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT___REMOVE_ARCHIMATE_ELEMENT_FROM_MODEL);

		diagramModelArchimateConnectionEClass = createEClass(DIAGRAM_MODEL_ARCHIMATE_CONNECTION);
		createEReference(diagramModelArchimateConnectionEClass, DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP);
		createEOperation(diagramModelArchimateConnectionEClass, DIAGRAM_MODEL_ARCHIMATE_CONNECTION___ADD_RELATIONSHIP_TO_MODEL__FOLDER);
		createEOperation(diagramModelArchimateConnectionEClass, DIAGRAM_MODEL_ARCHIMATE_CONNECTION___REMOVE_RELATIONSHIP_FROM_MODEL);

		sketchModelEClass = createEClass(SKETCH_MODEL);
		createEAttribute(sketchModelEClass, SKETCH_MODEL__BACKGROUND);

		sketchModelStickyEClass = createEClass(SKETCH_MODEL_STICKY);

		sketchModelActorEClass = createEClass(SKETCH_MODEL_ACTOR);

		// Create enums
		folderTypeEEnum = createEEnum(FOLDER_TYPE);

		// Create data types
		fileEDataType = createEDataType(FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		archimateModelElementEClass.getESuperTypes().add(this.getAdapter());
		archimateModelEClass.getESuperTypes().add(this.getFolderContainer());
		archimateModelEClass.getESuperTypes().add(this.getNameable());
		archimateModelEClass.getESuperTypes().add(this.getIdentifier());
		archimateModelEClass.getESuperTypes().add(this.getArchimateModelElement());
		archimateModelEClass.getESuperTypes().add(this.getProperties());
		folderEClass.getESuperTypes().add(this.getArchimateModelElement());
		folderEClass.getESuperTypes().add(this.getFolderContainer());
		folderEClass.getESuperTypes().add(this.getNameable());
		folderEClass.getESuperTypes().add(this.getIdentifier());
		folderEClass.getESuperTypes().add(this.getDocumentable());
		folderEClass.getESuperTypes().add(this.getProperties());
		archimateComponentEClass.getESuperTypes().add(this.getArchimateModelElement());
		archimateComponentEClass.getESuperTypes().add(this.getIdentifier());
		archimateComponentEClass.getESuperTypes().add(this.getCloneable());
		archimateComponentEClass.getESuperTypes().add(this.getNameable());
		archimateComponentEClass.getESuperTypes().add(this.getDocumentable());
		archimateComponentEClass.getESuperTypes().add(this.getProperties());
		archimateElementEClass.getESuperTypes().add(this.getArchimateComponent());
		junctionElementEClass.getESuperTypes().add(this.getArchimateElement());
		interfaceElementEClass.getESuperTypes().add(this.getArchimateElement());
		serviceElementEClass.getESuperTypes().add(this.getArchimateElement());
		junctionEClass.getESuperTypes().add(this.getJunctionElement());
		andJunctionEClass.getESuperTypes().add(this.getJunctionElement());
		orJunctionEClass.getESuperTypes().add(this.getJunctionElement());
		businessLayerElementEClass.getESuperTypes().add(this.getArchimateElement());
		businessActivityEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessActorEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessCollaborationEClass.getESuperTypes().add(this.getBusinessLayerElement());
		contractEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessEventEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessFunctionEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessInteractionEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessInterfaceEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessInterfaceEClass.getESuperTypes().add(this.getInterfaceElement());
		meaningEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessObjectEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessProcessEClass.getESuperTypes().add(this.getBusinessLayerElement());
		productEClass.getESuperTypes().add(this.getBusinessLayerElement());
		representationEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessRoleEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessServiceEClass.getESuperTypes().add(this.getBusinessLayerElement());
		businessServiceEClass.getESuperTypes().add(this.getServiceElement());
		valueEClass.getESuperTypes().add(this.getBusinessLayerElement());
		locationEClass.getESuperTypes().add(this.getBusinessLayerElement());
		applicationLayerElementEClass.getESuperTypes().add(this.getArchimateElement());
		applicationCollaborationEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationComponentEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationFunctionEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationInteractionEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationInterfaceEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationInterfaceEClass.getESuperTypes().add(this.getInterfaceElement());
		dataObjectEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationServiceEClass.getESuperTypes().add(this.getApplicationLayerElement());
		applicationServiceEClass.getESuperTypes().add(this.getServiceElement());
		technologyLayerElementEClass.getESuperTypes().add(this.getArchimateElement());
		artifactEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		communicationPathEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		networkEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		infrastructureInterfaceEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		infrastructureInterfaceEClass.getESuperTypes().add(this.getInterfaceElement());
		infrastructureServiceEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		infrastructureServiceEClass.getESuperTypes().add(this.getServiceElement());
		infrastructureFunctionEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		nodeEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		systemSoftwareEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		deviceEClass.getESuperTypes().add(this.getTechnologyLayerElement());
		motivationElementEClass.getESuperTypes().add(this.getArchimateElement());
		stakeholderEClass.getESuperTypes().add(this.getMotivationElement());
		driverEClass.getESuperTypes().add(this.getMotivationElement());
		assessmentEClass.getESuperTypes().add(this.getMotivationElement());
		goalEClass.getESuperTypes().add(this.getMotivationElement());
		requirementEClass.getESuperTypes().add(this.getMotivationElement());
		constraintEClass.getESuperTypes().add(this.getMotivationElement());
		principleEClass.getESuperTypes().add(this.getMotivationElement());
		implementationMigrationElementEClass.getESuperTypes().add(this.getArchimateElement());
		workPackageEClass.getESuperTypes().add(this.getImplementationMigrationElement());
		deliverableEClass.getESuperTypes().add(this.getImplementationMigrationElement());
		plateauEClass.getESuperTypes().add(this.getImplementationMigrationElement());
		gapEClass.getESuperTypes().add(this.getImplementationMigrationElement());
		relationshipEClass.getESuperTypes().add(this.getArchimateComponent());
		accessRelationshipEClass.getESuperTypes().add(this.getRelationship());
		aggregationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		assignmentRelationshipEClass.getESuperTypes().add(this.getRelationship());
		associationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		compositionRelationshipEClass.getESuperTypes().add(this.getRelationship());
		flowRelationshipEClass.getESuperTypes().add(this.getRelationship());
		realisationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		specialisationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		triggeringRelationshipEClass.getESuperTypes().add(this.getRelationship());
		usedByRelationshipEClass.getESuperTypes().add(this.getRelationship());
		influenceRelationshipEClass.getESuperTypes().add(this.getRelationship());
		diagramModelComponentEClass.getESuperTypes().add(this.getIdentifier());
		diagramModelComponentEClass.getESuperTypes().add(this.getCloneable());
		diagramModelComponentEClass.getESuperTypes().add(this.getAdapter());
		diagramModelComponentEClass.getESuperTypes().add(this.getNameable());
		diagramModelContainerEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelEClass.getESuperTypes().add(this.getArchimateModelElement());
		diagramModelEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelEClass.getESuperTypes().add(this.getProperties());
		diagramModelReferenceEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelObjectEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelObjectEClass.getESuperTypes().add(this.getFontAttribute());
		diagramModelObjectEClass.getESuperTypes().add(this.getLineObject());
		diagramModelObjectEClass.getESuperTypes().add(this.getTextAlignment());
		diagramModelGroupEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelGroupEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelGroupEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelGroupEClass.getESuperTypes().add(this.getProperties());
		diagramModelNoteEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelNoteEClass.getESuperTypes().add(this.getTextContent());
		diagramModelImageEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelImageEClass.getESuperTypes().add(this.getBorderObject());
		diagramModelImageEClass.getESuperTypes().add(this.getDiagramModelImageProvider());
		diagramModelConnectionEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelConnectionEClass.getESuperTypes().add(this.getFontAttribute());
		diagramModelConnectionEClass.getESuperTypes().add(this.getProperties());
		diagramModelConnectionEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelConnectionEClass.getESuperTypes().add(this.getLineObject());
		diagramModelBendpointEClass.getESuperTypes().add(this.getCloneable());
		archimateDiagramModelEClass.getESuperTypes().add(this.getDiagramModel());
		diagramModelArchimateObjectEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelArchimateObjectEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelArchimateConnectionEClass.getESuperTypes().add(this.getDiagramModelConnection());
		sketchModelEClass.getESuperTypes().add(this.getDiagramModel());
		sketchModelStickyEClass.getESuperTypes().add(this.getDiagramModelObject());
		sketchModelStickyEClass.getESuperTypes().add(this.getDiagramModelContainer());
		sketchModelStickyEClass.getESuperTypes().add(this.getTextContent());
		sketchModelStickyEClass.getESuperTypes().add(this.getProperties());
		sketchModelActorEClass.getESuperTypes().add(this.getDiagramModelObject());
		sketchModelActorEClass.getESuperTypes().add(this.getDocumentable());
		sketchModelActorEClass.getESuperTypes().add(this.getProperties());

		// Initialize classes, features, and operations; add parameters
		initEClass(adapterEClass, Adapter.class, "Adapter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAdapter__GetAdapter__Object(), ecorePackage.getEJavaObject(), "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAdapter__SetAdapter__Object_Object(), null, "setAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", "", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", "", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadata_Entries(), this.getProperty(), null, "entries", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameable_Name(), ecorePackage.getEString(), "name", "", 0, 1, Nameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textContentEClass, TextContent.class, "TextContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextContent_Content(), ecorePackage.getEString(), "content", "", 0, 1, TextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentableEClass, Documentable.class, "Documentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentable_Documentation(), ecorePackage.getEString(), "documentation", "", 0, 1, Documentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloneableEClass, model.Cloneable.class, "Cloneable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCloneable__GetCopy(), ecorePackage.getEObject(), "getCopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(folderContainerEClass, FolderContainer.class, "FolderContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolderContainer_Folders(), this.getFolder(), null, "folders", null, 0, -1, FolderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archimateModelElementEClass, ArchimateModelElement.class, "ArchimateModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchimateModelElement_ArchimateModel(), this.getArchimateModel(), null, "archimateModel", null, 0, 1, ArchimateModelElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archimateModelEClass, ArchimateModel.class, "ArchimateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchimateModel_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, ArchimateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchimateModel_File(), this.getFile(), "file", null, 0, 1, ArchimateModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchimateModel_Version(), ecorePackage.getEString(), "version", "", 0, 1, ArchimateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchimateModel_Metadata(), this.getMetadata(), null, "metadata", null, 0, 1, ArchimateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArchimateModel__SetDefaults(), null, "setDefaults", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArchimateModel__AddDerivedRelationsFolder(), this.getFolder(), "addDerivedRelationsFolder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArchimateModel__RemoveDerivedRelationsFolder(), null, "removeDerivedRelationsFolder", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchimateModel__GetDefaultFolderForElement__EObject(), this.getFolder(), "getDefaultFolderForElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArchimateModel__GetDefaultDiagramModel(), this.getDiagramModel(), "getDefaultDiagramModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArchimateModel__GetDiagramModels(), this.getDiagramModel(), "getDiagramModels", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchimateModel__GetFolder__FolderType(), this.getFolder(), "getFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFolderType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Type(), this.getFolderType(), "type", null, 0, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archimateComponentEClass, ArchimateComponent.class, "ArchimateComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archimateElementEClass, ArchimateElement.class, "ArchimateElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(junctionElementEClass, JunctionElement.class, "JunctionElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceElementEClass, InterfaceElement.class, "InterfaceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceElement_InterfaceType(), ecorePackage.getEInt(), "interfaceType", "0", 0, 1, InterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceElementEClass, ServiceElement.class, "ServiceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(junctionEClass, Junction.class, "Junction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andJunctionEClass, AndJunction.class, "AndJunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orJunctionEClass, OrJunction.class, "OrJunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessLayerElementEClass, BusinessLayerElement.class, "BusinessLayerElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessActivityEClass, BusinessActivity.class, "BusinessActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessActorEClass, BusinessActor.class, "BusinessActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessCollaborationEClass, BusinessCollaboration.class, "BusinessCollaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessEventEClass, BusinessEvent.class, "BusinessEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessFunctionEClass, BusinessFunction.class, "BusinessFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessInteractionEClass, BusinessInteraction.class, "BusinessInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessInterfaceEClass, BusinessInterface.class, "BusinessInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meaningEClass, Meaning.class, "Meaning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessProcessEClass, BusinessProcess.class, "BusinessProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessRoleEClass, BusinessRole.class, "BusinessRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessServiceEClass, BusinessService.class, "BusinessService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationLayerElementEClass, ApplicationLayerElement.class, "ApplicationLayerElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationCollaborationEClass, ApplicationCollaboration.class, "ApplicationCollaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationComponentEClass, ApplicationComponent.class, "ApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationFunctionEClass, ApplicationFunction.class, "ApplicationFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationInteractionEClass, ApplicationInteraction.class, "ApplicationInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationInterfaceEClass, ApplicationInterface.class, "ApplicationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationServiceEClass, ApplicationService.class, "ApplicationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technologyLayerElementEClass, TechnologyLayerElement.class, "TechnologyLayerElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationPathEClass, CommunicationPath.class, "CommunicationPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructureInterfaceEClass, InfrastructureInterface.class, "InfrastructureInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructureServiceEClass, InfrastructureService.class, "InfrastructureService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infrastructureFunctionEClass, InfrastructureFunction.class, "InfrastructureFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemSoftwareEClass, SystemSoftware.class, "SystemSoftware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motivationElementEClass, MotivationElement.class, "MotivationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationMigrationElementEClass, ImplementationMigrationElement.class, "ImplementationMigrationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workPackageEClass, WorkPackage.class, "WorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plateauEClass, Plateau.class, "Plateau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gapEClass, Gap.class, "Gap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getArchimateElement(), null, "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getArchimateElement(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessRelationshipEClass, AccessRelationship.class, "AccessRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessRelationship_AccessType(), ecorePackage.getEInt(), "accessType", "0", 0, 1, AccessRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationRelationshipEClass, AggregationRelationship.class, "AggregationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentRelationshipEClass, AssignmentRelationship.class, "AssignmentRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationRelationshipEClass, AssociationRelationship.class, "AssociationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionRelationshipEClass, CompositionRelationship.class, "CompositionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowRelationshipEClass, FlowRelationship.class, "FlowRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realisationRelationshipEClass, RealisationRelationship.class, "RealisationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specialisationRelationshipEClass, SpecialisationRelationship.class, "SpecialisationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggeringRelationshipEClass, TriggeringRelationship.class, "TriggeringRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usedByRelationshipEClass, UsedByRelationship.class, "UsedByRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influenceRelationshipEClass, InfluenceRelationship.class, "InfluenceRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramModelComponentEClass, DiagramModelComponent.class, "DiagramModelComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelComponent_DiagramModel(), this.getDiagramModel(), null, "diagramModel", null, 0, 1, DiagramModelComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelContainerEClass, DiagramModelContainer.class, "DiagramModelContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelContainer_Children(), this.getDiagramModelObject(), null, "children", null, 0, -1, DiagramModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelEClass, DiagramModel.class, "DiagramModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramModel_ConnectionRouterType(), ecorePackage.getEInt(), "connectionRouterType", null, 0, 1, DiagramModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelReferenceEClass, DiagramModelReference.class, "DiagramModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelReference_ReferencedModel(), this.getDiagramModel(), null, "referencedModel", null, 0, 1, DiagramModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelObjectEClass, DiagramModelObject.class, "DiagramModelObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelObject_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, DiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramModelObject_SourceConnections(), this.getDiagramModelConnection(), null, "sourceConnections", null, 0, -1, DiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramModelObject_TargetConnections(), this.getDiagramModelConnection(), null, "targetConnections", null, 0, -1, DiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelObject_FillColor(), ecorePackage.getEString(), "fillColor", null, 0, 1, DiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiagramModelObject__AddConnection__DiagramModelConnection(), null, "addConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiagramModelConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramModelObject__RemoveConnection__DiagramModelConnection(), null, "removeConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiagramModelConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiagramModelObject__SetBounds__int_int_int_int(), null, "setBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diagramModelGroupEClass, DiagramModelGroup.class, "DiagramModelGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramModelNoteEClass, DiagramModelNote.class, "DiagramModelNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramModelNote_BorderType(), ecorePackage.getEInt(), "borderType", null, 0, 1, DiagramModelNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelImageEClass, DiagramModelImage.class, "DiagramModelImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramModelConnectionEClass, DiagramModelConnection.class, "DiagramModelConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramModelConnection_Text(), ecorePackage.getEString(), "text", "", 0, 1, DiagramModelConnection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelConnection_TextPosition(), ecorePackage.getEInt(), "textPosition", null, 0, 1, DiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramModelConnection_Source(), this.getDiagramModelObject(), null, "source", null, 0, 1, DiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramModelConnection_Target(), this.getDiagramModelObject(), null, "target", null, 0, 1, DiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramModelConnection_Bendpoints(), this.getDiagramModelBendpoint(), null, "bendpoints", null, 0, -1, DiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelConnection_Type(), ecorePackage.getEInt(), "type", null, 0, 1, DiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiagramModelConnection__Connect__DiagramModelObject_DiagramModelObject(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiagramModelObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiagramModelObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiagramModelConnection__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiagramModelConnection__Reconnect(), null, "reconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diagramModelBendpointEClass, DiagramModelBendpoint.class, "DiagramModelBendpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramModelBendpoint_StartX(), ecorePackage.getEInt(), "startX", null, 0, 1, DiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelBendpoint_StartY(), ecorePackage.getEInt(), "startY", null, 0, 1, DiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelBendpoint_EndX(), ecorePackage.getEInt(), "endX", null, 0, 1, DiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelBendpoint_EndY(), ecorePackage.getEInt(), "endY", null, 0, 1, DiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineObjectEClass, LineObject.class, "LineObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineObject_LineWidth(), ecorePackage.getEInt(), "lineWidth", "1", 0, 1, LineObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineObject_LineColor(), ecorePackage.getEString(), "lineColor", null, 0, 1, LineObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontAttributeEClass, FontAttribute.class, "FontAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontAttribute_Font(), ecorePackage.getEString(), "font", null, 0, 1, FontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontAttribute_FontColor(), ecorePackage.getEString(), "fontColor", null, 0, 1, FontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPositionEClass, TextPosition.class, "TextPosition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPosition_TextPosition(), ecorePackage.getEInt(), "textPosition", null, 0, 1, TextPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAlignmentEClass, TextAlignment.class, "TextAlignment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextAlignment_TextAlignment(), ecorePackage.getEInt(), "textAlignment", null, 0, 1, TextAlignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTextAlignment__GetDefaultTextAlignment(), ecorePackage.getEInt(), "getDefaultTextAlignment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(borderObjectEClass, BorderObject.class, "BorderObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorderObject_BorderColor(), ecorePackage.getEString(), "borderColor", null, 0, 1, BorderObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelImageProviderEClass, DiagramModelImageProvider.class, "DiagramModelImageProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramModelImageProvider_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, DiagramModelImageProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBounds_X(), ecorePackage.getEInt(), "x", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBounds__GetCopy(), this.getBounds(), "getCopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lockableEClass, Lockable.class, "Lockable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLockable_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, Lockable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archimateDiagramModelEClass, ArchimateDiagramModel.class, "ArchimateDiagramModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchimateDiagramModel_Viewpoint(), ecorePackage.getEInt(), "viewpoint", null, 0, 1, ArchimateDiagramModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramModelArchimateObjectEClass, DiagramModelArchimateObject.class, "DiagramModelArchimateObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelArchimateObject_ArchimateElement(), this.getArchimateElement(), null, "archimateElement", null, 0, 1, DiagramModelArchimateObject.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramModelArchimateObject_Type(), ecorePackage.getEInt(), "type", "0", 0, 1, DiagramModelArchimateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiagramModelArchimateObject__AddArchimateElementToModel__Folder(), null, "addArchimateElementToModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFolder(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiagramModelArchimateObject__RemoveArchimateElementFromModel(), null, "removeArchimateElementFromModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diagramModelArchimateConnectionEClass, DiagramModelArchimateConnection.class, "DiagramModelArchimateConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramModelArchimateConnection_Relationship(), this.getRelationship(), null, "relationship", null, 0, 1, DiagramModelArchimateConnection.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiagramModelArchimateConnection__AddRelationshipToModel__Folder(), null, "addRelationshipToModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFolder(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiagramModelArchimateConnection__RemoveRelationshipFromModel(), null, "removeRelationshipFromModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sketchModelEClass, SketchModel.class, "SketchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSketchModel_Background(), ecorePackage.getEInt(), "background", "1", 0, 1, SketchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sketchModelStickyEClass, SketchModelSticky.class, "SketchModelSticky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sketchModelActorEClass, SketchModelActor.class, "SketchModelActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(folderTypeEEnum, FolderType.class, "FolderType");
		addEEnumLiteral(folderTypeEEnum, FolderType.USER);
		addEEnumLiteral(folderTypeEEnum, FolderType.BUSINESS);
		addEEnumLiteral(folderTypeEEnum, FolderType.APPLICATION);
		addEEnumLiteral(folderTypeEEnum, FolderType.TECHNOLOGY);
		addEEnumLiteral(folderTypeEEnum, FolderType.CONNECTORS);
		addEEnumLiteral(folderTypeEEnum, FolderType.RELATIONS);
		addEEnumLiteral(folderTypeEEnum, FolderType.DIAGRAMS);
		addEEnumLiteral(folderTypeEEnum, FolderType.DERIVED);
		addEEnumLiteral(folderTypeEEnum, FolderType.MOTIVATION);
		addEEnumLiteral(folderTypeEEnum, FolderType.IMPLEMENTATION_MIGRATION);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getProperties_Properties(), 
		   source, 
		   new String[] {
			 "name", "property",
			 "kind", "element"
		   });	
		addAnnotation
		  (getMetadata_Entries(), 
		   source, 
		   new String[] {
			 "name", "entry",
			 "kind", "element"
		   });	
		addAnnotation
		  (getTextContent_Content(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });	
		addAnnotation
		  (getDocumentable_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });	
		addAnnotation
		  (getFolderContainer_Folders(), 
		   source, 
		   new String[] {
			 "name", "folder",
			 "kind", "element"
		   });	
		addAnnotation
		  (archimateModelEClass, 
		   source, 
		   new String[] {
			 "name", "model"
		   });	
		addAnnotation
		  (getArchimateModel_Purpose(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });	
		addAnnotation
		  (getFolder_Elements(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "kind", "element"
		   });	
		addAnnotation
		  (getDiagramModelContainer_Children(), 
		   source, 
		   new String[] {
			 "name", "child",
			 "kind", "element"
		   });	
		addAnnotation
		  (getDiagramModelReference_ReferencedModel(), 
		   source, 
		   new String[] {
			 "name", "model",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getDiagramModelObject_SourceConnections(), 
		   source, 
		   new String[] {
			 "name", "sourceConnection",
			 "kind", "element"
		   });	
		addAnnotation
		  (diagramModelGroupEClass, 
		   source, 
		   new String[] {
			 "name", "Group"
		   });	
		addAnnotation
		  (diagramModelNoteEClass, 
		   source, 
		   new String[] {
			 "name", "Note"
		   });	
		addAnnotation
		  (getDiagramModelConnection_Bendpoints(), 
		   source, 
		   new String[] {
			 "name", "bendpoint",
			 "kind", "element"
		   });	
		addAnnotation
		  (diagramModelArchimateObjectEClass, 
		   source, 
		   new String[] {
			 "name", "DiagramObject"
		   });	
		addAnnotation
		  (diagramModelArchimateConnectionEClass, 
		   source, 
		   new String[] {
			 "name", "Connection"
		   });
	}

} //ModelPackageImpl
