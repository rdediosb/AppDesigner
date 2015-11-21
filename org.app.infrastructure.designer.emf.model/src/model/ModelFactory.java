/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Archimate Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archimate Model</em>'.
	 * @generated
	 */
	ArchimateModel createArchimateModel();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junction</em>'.
	 * @generated
	 */
	Junction createJunction();

	/**
	 * Returns a new object of class '<em>And Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Junction</em>'.
	 * @generated
	 */
	AndJunction createAndJunction();

	/**
	 * Returns a new object of class '<em>Or Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Junction</em>'.
	 * @generated
	 */
	OrJunction createOrJunction();

	/**
	 * Returns a new object of class '<em>Business Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Activity</em>'.
	 * @generated
	 */
	BusinessActivity createBusinessActivity();

	/**
	 * Returns a new object of class '<em>Business Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Actor</em>'.
	 * @generated
	 */
	BusinessActor createBusinessActor();

	/**
	 * Returns a new object of class '<em>Business Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Collaboration</em>'.
	 * @generated
	 */
	BusinessCollaboration createBusinessCollaboration();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Business Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Event</em>'.
	 * @generated
	 */
	BusinessEvent createBusinessEvent();

	/**
	 * Returns a new object of class '<em>Business Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Function</em>'.
	 * @generated
	 */
	BusinessFunction createBusinessFunction();

	/**
	 * Returns a new object of class '<em>Business Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Interaction</em>'.
	 * @generated
	 */
	BusinessInteraction createBusinessInteraction();

	/**
	 * Returns a new object of class '<em>Business Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Interface</em>'.
	 * @generated
	 */
	BusinessInterface createBusinessInterface();

	/**
	 * Returns a new object of class '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meaning</em>'.
	 * @generated
	 */
	Meaning createMeaning();

	/**
	 * Returns a new object of class '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Object</em>'.
	 * @generated
	 */
	BusinessObject createBusinessObject();

	/**
	 * Returns a new object of class '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process</em>'.
	 * @generated
	 */
	BusinessProcess createBusinessProcess();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Business Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Role</em>'.
	 * @generated
	 */
	BusinessRole createBusinessRole();

	/**
	 * Returns a new object of class '<em>Business Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Service</em>'.
	 * @generated
	 */
	BusinessService createBusinessService();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Application Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Collaboration</em>'.
	 * @generated
	 */
	ApplicationCollaboration createApplicationCollaboration();

	/**
	 * Returns a new object of class '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Component</em>'.
	 * @generated
	 */
	ApplicationComponent createApplicationComponent();

	/**
	 * Returns a new object of class '<em>Application Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Function</em>'.
	 * @generated
	 */
	ApplicationFunction createApplicationFunction();

	/**
	 * Returns a new object of class '<em>Application Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Interaction</em>'.
	 * @generated
	 */
	ApplicationInteraction createApplicationInteraction();

	/**
	 * Returns a new object of class '<em>Application Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Interface</em>'.
	 * @generated
	 */
	ApplicationInterface createApplicationInterface();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>Application Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Service</em>'.
	 * @generated
	 */
	ApplicationService createApplicationService();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Path</em>'.
	 * @generated
	 */
	CommunicationPath createCommunicationPath();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Infrastructure Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Interface</em>'.
	 * @generated
	 */
	InfrastructureInterface createInfrastructureInterface();

	/**
	 * Returns a new object of class '<em>Infrastructure Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Service</em>'.
	 * @generated
	 */
	InfrastructureService createInfrastructureService();

	/**
	 * Returns a new object of class '<em>Infrastructure Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Function</em>'.
	 * @generated
	 */
	InfrastructureFunction createInfrastructureFunction();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>System Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Software</em>'.
	 * @generated
	 */
	SystemSoftware createSystemSoftware();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

	/**
	 * Returns a new object of class '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment</em>'.
	 * @generated
	 */
	Assessment createAssessment();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principle</em>'.
	 * @generated
	 */
	Principle createPrinciple();

	/**
	 * Returns a new object of class '<em>Work Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Package</em>'.
	 * @generated
	 */
	WorkPackage createWorkPackage();

	/**
	 * Returns a new object of class '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deliverable</em>'.
	 * @generated
	 */
	Deliverable createDeliverable();

	/**
	 * Returns a new object of class '<em>Plateau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plateau</em>'.
	 * @generated
	 */
	Plateau createPlateau();

	/**
	 * Returns a new object of class '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gap</em>'.
	 * @generated
	 */
	Gap createGap();

	/**
	 * Returns a new object of class '<em>Access Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Relationship</em>'.
	 * @generated
	 */
	AccessRelationship createAccessRelationship();

	/**
	 * Returns a new object of class '<em>Aggregation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Relationship</em>'.
	 * @generated
	 */
	AggregationRelationship createAggregationRelationship();

	/**
	 * Returns a new object of class '<em>Assignment Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Relationship</em>'.
	 * @generated
	 */
	AssignmentRelationship createAssignmentRelationship();

	/**
	 * Returns a new object of class '<em>Association Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Relationship</em>'.
	 * @generated
	 */
	AssociationRelationship createAssociationRelationship();

	/**
	 * Returns a new object of class '<em>Composition Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Relationship</em>'.
	 * @generated
	 */
	CompositionRelationship createCompositionRelationship();

	/**
	 * Returns a new object of class '<em>Flow Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Relationship</em>'.
	 * @generated
	 */
	FlowRelationship createFlowRelationship();

	/**
	 * Returns a new object of class '<em>Realisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realisation Relationship</em>'.
	 * @generated
	 */
	RealisationRelationship createRealisationRelationship();

	/**
	 * Returns a new object of class '<em>Specialisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation Relationship</em>'.
	 * @generated
	 */
	SpecialisationRelationship createSpecialisationRelationship();

	/**
	 * Returns a new object of class '<em>Triggering Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triggering Relationship</em>'.
	 * @generated
	 */
	TriggeringRelationship createTriggeringRelationship();

	/**
	 * Returns a new object of class '<em>Used By Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used By Relationship</em>'.
	 * @generated
	 */
	UsedByRelationship createUsedByRelationship();

	/**
	 * Returns a new object of class '<em>Influence Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence Relationship</em>'.
	 * @generated
	 */
	InfluenceRelationship createInfluenceRelationship();

	/**
	 * Returns a new object of class '<em>Diagram Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Reference</em>'.
	 * @generated
	 */
	DiagramModelReference createDiagramModelReference();

	/**
	 * Returns a new object of class '<em>Diagram Model Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Group</em>'.
	 * @generated
	 */
	DiagramModelGroup createDiagramModelGroup();

	/**
	 * Returns a new object of class '<em>Diagram Model Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Note</em>'.
	 * @generated
	 */
	DiagramModelNote createDiagramModelNote();

	/**
	 * Returns a new object of class '<em>Diagram Model Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Image</em>'.
	 * @generated
	 */
	DiagramModelImage createDiagramModelImage();

	/**
	 * Returns a new object of class '<em>Diagram Model Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Connection</em>'.
	 * @generated
	 */
	DiagramModelConnection createDiagramModelConnection();

	/**
	 * Returns a new object of class '<em>Diagram Model Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Bendpoint</em>'.
	 * @generated
	 */
	DiagramModelBendpoint createDiagramModelBendpoint();

	/**
	 * Returns a new object of class '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounds</em>'.
	 * @generated
	 */
	Bounds createBounds();

	/**
	 * Returns a new object of class '<em>Archimate Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archimate Diagram Model</em>'.
	 * @generated
	 */
	ArchimateDiagramModel createArchimateDiagramModel();

	/**
	 * Returns a new object of class '<em>Diagram Model Archimate Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Archimate Object</em>'.
	 * @generated
	 */
	DiagramModelArchimateObject createDiagramModelArchimateObject();

	/**
	 * Returns a new object of class '<em>Diagram Model Archimate Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Archimate Connection</em>'.
	 * @generated
	 */
	DiagramModelArchimateConnection createDiagramModelArchimateConnection();

	/**
	 * Returns a new object of class '<em>Sketch Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model</em>'.
	 * @generated
	 */
	SketchModel createSketchModel();

	/**
	 * Returns a new object of class '<em>Sketch Model Sticky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model Sticky</em>'.
	 * @generated
	 */
	SketchModelSticky createSketchModelSticky();

	/**
	 * Returns a new object of class '<em>Sketch Model Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model Actor</em>'.
	 * @generated
	 */
	SketchModelActor createSketchModelActor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
