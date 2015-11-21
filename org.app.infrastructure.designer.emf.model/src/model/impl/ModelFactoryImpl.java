/**
 */
package model.impl;

import model.AccessRelationship;
import model.AggregationRelationship;
import model.AndJunction;
import model.ApplicationCollaboration;
import model.ApplicationComponent;
import model.ApplicationFunction;
import model.ApplicationInteraction;
import model.ApplicationInterface;
import model.ApplicationService;
import model.ArchimateDiagramModel;
import model.ArchimateModel;
import model.Artifact;
import model.Assessment;
import model.AssignmentRelationship;
import model.AssociationRelationship;
import model.Bounds;
import model.BusinessActivity;
import model.BusinessActor;
import model.BusinessCollaboration;
import model.BusinessEvent;
import model.BusinessFunction;
import model.BusinessInteraction;
import model.BusinessInterface;
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
import model.DiagramModelArchimateConnection;
import model.DiagramModelArchimateObject;
import model.DiagramModelBendpoint;
import model.DiagramModelConnection;
import model.DiagramModelGroup;
import model.DiagramModelImage;
import model.DiagramModelNote;
import model.DiagramModelReference;
import model.Driver;
import model.FlowRelationship;
import model.Folder;
import model.FolderType;
import model.Gap;
import model.Goal;
import model.InfluenceRelationship;
import model.InfrastructureFunction;
import model.InfrastructureInterface;
import model.InfrastructureService;
import model.Junction;
import model.Location;
import model.Meaning;
import model.Metadata;
import model.ModelFactory;
import model.ModelPackage;
import model.Network;
import model.Node;
import model.OrJunction;
import model.Plateau;
import model.Principle;
import model.Product;
import model.Property;
import model.RealisationRelationship;
import model.Representation;
import model.Requirement;
import model.SketchModel;
import model.SketchModelActor;
import model.SketchModelSticky;
import model.SpecialisationRelationship;
import model.Stakeholder;
import model.SystemSoftware;
import model.TriggeringRelationship;
import model.UsedByRelationship;
import model.Value;
import model.WorkPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.PROPERTY: return createProperty();
			case ModelPackage.METADATA: return createMetadata();
			case ModelPackage.ARCHIMATE_MODEL: return createArchimateModel();
			case ModelPackage.FOLDER: return createFolder();
			case ModelPackage.JUNCTION: return createJunction();
			case ModelPackage.AND_JUNCTION: return createAndJunction();
			case ModelPackage.OR_JUNCTION: return createOrJunction();
			case ModelPackage.BUSINESS_ACTIVITY: return createBusinessActivity();
			case ModelPackage.BUSINESS_ACTOR: return createBusinessActor();
			case ModelPackage.BUSINESS_COLLABORATION: return createBusinessCollaboration();
			case ModelPackage.CONTRACT: return createContract();
			case ModelPackage.BUSINESS_EVENT: return createBusinessEvent();
			case ModelPackage.BUSINESS_FUNCTION: return createBusinessFunction();
			case ModelPackage.BUSINESS_INTERACTION: return createBusinessInteraction();
			case ModelPackage.BUSINESS_INTERFACE: return createBusinessInterface();
			case ModelPackage.MEANING: return createMeaning();
			case ModelPackage.BUSINESS_OBJECT: return createBusinessObject();
			case ModelPackage.BUSINESS_PROCESS: return createBusinessProcess();
			case ModelPackage.PRODUCT: return createProduct();
			case ModelPackage.REPRESENTATION: return createRepresentation();
			case ModelPackage.BUSINESS_ROLE: return createBusinessRole();
			case ModelPackage.BUSINESS_SERVICE: return createBusinessService();
			case ModelPackage.VALUE: return createValue();
			case ModelPackage.LOCATION: return createLocation();
			case ModelPackage.APPLICATION_COLLABORATION: return createApplicationCollaboration();
			case ModelPackage.APPLICATION_COMPONENT: return createApplicationComponent();
			case ModelPackage.APPLICATION_FUNCTION: return createApplicationFunction();
			case ModelPackage.APPLICATION_INTERACTION: return createApplicationInteraction();
			case ModelPackage.APPLICATION_INTERFACE: return createApplicationInterface();
			case ModelPackage.DATA_OBJECT: return createDataObject();
			case ModelPackage.APPLICATION_SERVICE: return createApplicationService();
			case ModelPackage.ARTIFACT: return createArtifact();
			case ModelPackage.COMMUNICATION_PATH: return createCommunicationPath();
			case ModelPackage.NETWORK: return createNetwork();
			case ModelPackage.INFRASTRUCTURE_INTERFACE: return createInfrastructureInterface();
			case ModelPackage.INFRASTRUCTURE_SERVICE: return createInfrastructureService();
			case ModelPackage.INFRASTRUCTURE_FUNCTION: return createInfrastructureFunction();
			case ModelPackage.NODE: return createNode();
			case ModelPackage.SYSTEM_SOFTWARE: return createSystemSoftware();
			case ModelPackage.DEVICE: return createDevice();
			case ModelPackage.STAKEHOLDER: return createStakeholder();
			case ModelPackage.DRIVER: return createDriver();
			case ModelPackage.ASSESSMENT: return createAssessment();
			case ModelPackage.GOAL: return createGoal();
			case ModelPackage.REQUIREMENT: return createRequirement();
			case ModelPackage.CONSTRAINT: return createConstraint();
			case ModelPackage.PRINCIPLE: return createPrinciple();
			case ModelPackage.WORK_PACKAGE: return createWorkPackage();
			case ModelPackage.DELIVERABLE: return createDeliverable();
			case ModelPackage.PLATEAU: return createPlateau();
			case ModelPackage.GAP: return createGap();
			case ModelPackage.ACCESS_RELATIONSHIP: return createAccessRelationship();
			case ModelPackage.AGGREGATION_RELATIONSHIP: return createAggregationRelationship();
			case ModelPackage.ASSIGNMENT_RELATIONSHIP: return createAssignmentRelationship();
			case ModelPackage.ASSOCIATION_RELATIONSHIP: return createAssociationRelationship();
			case ModelPackage.COMPOSITION_RELATIONSHIP: return createCompositionRelationship();
			case ModelPackage.FLOW_RELATIONSHIP: return createFlowRelationship();
			case ModelPackage.REALISATION_RELATIONSHIP: return createRealisationRelationship();
			case ModelPackage.SPECIALISATION_RELATIONSHIP: return createSpecialisationRelationship();
			case ModelPackage.TRIGGERING_RELATIONSHIP: return createTriggeringRelationship();
			case ModelPackage.USED_BY_RELATIONSHIP: return createUsedByRelationship();
			case ModelPackage.INFLUENCE_RELATIONSHIP: return createInfluenceRelationship();
			case ModelPackage.DIAGRAM_MODEL_REFERENCE: return createDiagramModelReference();
			case ModelPackage.DIAGRAM_MODEL_GROUP: return createDiagramModelGroup();
			case ModelPackage.DIAGRAM_MODEL_NOTE: return createDiagramModelNote();
			case ModelPackage.DIAGRAM_MODEL_IMAGE: return createDiagramModelImage();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION: return createDiagramModelConnection();
			case ModelPackage.DIAGRAM_MODEL_BENDPOINT: return createDiagramModelBendpoint();
			case ModelPackage.BOUNDS: return createBounds();
			case ModelPackage.ARCHIMATE_DIAGRAM_MODEL: return createArchimateDiagramModel();
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: return createDiagramModelArchimateObject();
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: return createDiagramModelArchimateConnection();
			case ModelPackage.SKETCH_MODEL: return createSketchModel();
			case ModelPackage.SKETCH_MODEL_STICKY: return createSketchModelSticky();
			case ModelPackage.SKETCH_MODEL_ACTOR: return createSketchModelActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.FOLDER_TYPE:
				return createFolderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.FOLDER_TYPE:
				return convertFolderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateModel createArchimateModel() {
		ArchimateModelImpl archimateModel = new ArchimateModelImpl();
		return archimateModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJunction createAndJunction() {
		AndJunctionImpl andJunction = new AndJunctionImpl();
		return andJunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrJunction createOrJunction() {
		OrJunctionImpl orJunction = new OrJunctionImpl();
		return orJunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActivity createBusinessActivity() {
		BusinessActivityImpl businessActivity = new BusinessActivityImpl();
		return businessActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActor createBusinessActor() {
		BusinessActorImpl businessActor = new BusinessActorImpl();
		return businessActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCollaboration createBusinessCollaboration() {
		BusinessCollaborationImpl businessCollaboration = new BusinessCollaborationImpl();
		return businessCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEvent createBusinessEvent() {
		BusinessEventImpl businessEvent = new BusinessEventImpl();
		return businessEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessFunction createBusinessFunction() {
		BusinessFunctionImpl businessFunction = new BusinessFunctionImpl();
		return businessFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInteraction createBusinessInteraction() {
		BusinessInteractionImpl businessInteraction = new BusinessInteractionImpl();
		return businessInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInterface createBusinessInterface() {
		BusinessInterfaceImpl businessInterface = new BusinessInterfaceImpl();
		return businessInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meaning createMeaning() {
		MeaningImpl meaning = new MeaningImpl();
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject createBusinessObject() {
		BusinessObjectImpl businessObject = new BusinessObjectImpl();
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcess createBusinessProcess() {
		BusinessProcessImpl businessProcess = new BusinessProcessImpl();
		return businessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRole createBusinessRole() {
		BusinessRoleImpl businessRole = new BusinessRoleImpl();
		return businessRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessService createBusinessService() {
		BusinessServiceImpl businessService = new BusinessServiceImpl();
		return businessService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationCollaboration createApplicationCollaboration() {
		ApplicationCollaborationImpl applicationCollaboration = new ApplicationCollaborationImpl();
		return applicationCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationComponent createApplicationComponent() {
		ApplicationComponentImpl applicationComponent = new ApplicationComponentImpl();
		return applicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFunction createApplicationFunction() {
		ApplicationFunctionImpl applicationFunction = new ApplicationFunctionImpl();
		return applicationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInteraction createApplicationInteraction() {
		ApplicationInteractionImpl applicationInteraction = new ApplicationInteractionImpl();
		return applicationInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInterface createApplicationInterface() {
		ApplicationInterfaceImpl applicationInterface = new ApplicationInterfaceImpl();
		return applicationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationService createApplicationService() {
		ApplicationServiceImpl applicationService = new ApplicationServiceImpl();
		return applicationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath createCommunicationPath() {
		CommunicationPathImpl communicationPath = new CommunicationPathImpl();
		return communicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureInterface createInfrastructureInterface() {
		InfrastructureInterfaceImpl infrastructureInterface = new InfrastructureInterfaceImpl();
		return infrastructureInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureService createInfrastructureService() {
		InfrastructureServiceImpl infrastructureService = new InfrastructureServiceImpl();
		return infrastructureService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFunction createInfrastructureFunction() {
		InfrastructureFunctionImpl infrastructureFunction = new InfrastructureFunctionImpl();
		return infrastructureFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSoftware createSystemSoftware() {
		SystemSoftwareImpl systemSoftware = new SystemSoftwareImpl();
		return systemSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principle createPrinciple() {
		PrincipleImpl principle = new PrincipleImpl();
		return principle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage createWorkPackage() {
		WorkPackageImpl workPackage = new WorkPackageImpl();
		return workPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deliverable createDeliverable() {
		DeliverableImpl deliverable = new DeliverableImpl();
		return deliverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plateau createPlateau() {
		PlateauImpl plateau = new PlateauImpl();
		return plateau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gap createGap() {
		GapImpl gap = new GapImpl();
		return gap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessRelationship createAccessRelationship() {
		AccessRelationshipImpl accessRelationship = new AccessRelationshipImpl();
		return accessRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationRelationship createAggregationRelationship() {
		AggregationRelationshipImpl aggregationRelationship = new AggregationRelationshipImpl();
		return aggregationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentRelationship createAssignmentRelationship() {
		AssignmentRelationshipImpl assignmentRelationship = new AssignmentRelationshipImpl();
		return assignmentRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRelationship createAssociationRelationship() {
		AssociationRelationshipImpl associationRelationship = new AssociationRelationshipImpl();
		return associationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionRelationship createCompositionRelationship() {
		CompositionRelationshipImpl compositionRelationship = new CompositionRelationshipImpl();
		return compositionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowRelationship createFlowRelationship() {
		FlowRelationshipImpl flowRelationship = new FlowRelationshipImpl();
		return flowRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealisationRelationship createRealisationRelationship() {
		RealisationRelationshipImpl realisationRelationship = new RealisationRelationshipImpl();
		return realisationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisationRelationship createSpecialisationRelationship() {
		SpecialisationRelationshipImpl specialisationRelationship = new SpecialisationRelationshipImpl();
		return specialisationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeringRelationship createTriggeringRelationship() {
		TriggeringRelationshipImpl triggeringRelationship = new TriggeringRelationshipImpl();
		return triggeringRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedByRelationship createUsedByRelationship() {
		UsedByRelationshipImpl usedByRelationship = new UsedByRelationshipImpl();
		return usedByRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenceRelationship createInfluenceRelationship() {
		InfluenceRelationshipImpl influenceRelationship = new InfluenceRelationshipImpl();
		return influenceRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelReference createDiagramModelReference() {
		DiagramModelReferenceImpl diagramModelReference = new DiagramModelReferenceImpl();
		return diagramModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelGroup createDiagramModelGroup() {
		DiagramModelGroupImpl diagramModelGroup = new DiagramModelGroupImpl();
		return diagramModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelNote createDiagramModelNote() {
		DiagramModelNoteImpl diagramModelNote = new DiagramModelNoteImpl();
		return diagramModelNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelImage createDiagramModelImage() {
		DiagramModelImageImpl diagramModelImage = new DiagramModelImageImpl();
		return diagramModelImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelConnection createDiagramModelConnection() {
		DiagramModelConnectionImpl diagramModelConnection = new DiagramModelConnectionImpl();
		return diagramModelConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelBendpoint createDiagramModelBendpoint() {
		DiagramModelBendpointImpl diagramModelBendpoint = new DiagramModelBendpointImpl();
		return diagramModelBendpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds createBounds() {
		BoundsImpl bounds = new BoundsImpl();
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateDiagramModel createArchimateDiagramModel() {
		ArchimateDiagramModelImpl archimateDiagramModel = new ArchimateDiagramModelImpl();
		return archimateDiagramModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelArchimateObject createDiagramModelArchimateObject() {
		DiagramModelArchimateObjectImpl diagramModelArchimateObject = new DiagramModelArchimateObjectImpl();
		return diagramModelArchimateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelArchimateConnection createDiagramModelArchimateConnection() {
		DiagramModelArchimateConnectionImpl diagramModelArchimateConnection = new DiagramModelArchimateConnectionImpl();
		return diagramModelArchimateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchModel createSketchModel() {
		SketchModelImpl sketchModel = new SketchModelImpl();
		return sketchModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchModelSticky createSketchModelSticky() {
		SketchModelStickyImpl sketchModelSticky = new SketchModelStickyImpl();
		return sketchModelSticky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchModelActor createSketchModelActor() {
		SketchModelActorImpl sketchModelActor = new SketchModelActorImpl();
		return sketchModelActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderType createFolderTypeFromString(EDataType eDataType, String initialValue) {
		FolderType result = FolderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFolderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
