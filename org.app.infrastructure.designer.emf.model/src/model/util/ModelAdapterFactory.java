/**
 */
package model.util;

import model.AccessRelationship;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAdapter(model.Adapter object) {
				return createAdapterAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseTextContent(TextContent object) {
				return createTextContentAdapter();
			}
			@Override
			public Adapter caseDocumentable(Documentable object) {
				return createDocumentableAdapter();
			}
			@Override
			public Adapter caseCloneable(model.Cloneable object) {
				return createCloneableAdapter();
			}
			@Override
			public Adapter caseFolderContainer(FolderContainer object) {
				return createFolderContainerAdapter();
			}
			@Override
			public Adapter caseArchimateModelElement(ArchimateModelElement object) {
				return createArchimateModelElementAdapter();
			}
			@Override
			public Adapter caseArchimateModel(ArchimateModel object) {
				return createArchimateModelAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseArchimateComponent(ArchimateComponent object) {
				return createArchimateComponentAdapter();
			}
			@Override
			public Adapter caseArchimateElement(ArchimateElement object) {
				return createArchimateElementAdapter();
			}
			@Override
			public Adapter caseJunctionElement(JunctionElement object) {
				return createJunctionElementAdapter();
			}
			@Override
			public Adapter caseInterfaceElement(InterfaceElement object) {
				return createInterfaceElementAdapter();
			}
			@Override
			public Adapter caseServiceElement(ServiceElement object) {
				return createServiceElementAdapter();
			}
			@Override
			public Adapter caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter caseAndJunction(AndJunction object) {
				return createAndJunctionAdapter();
			}
			@Override
			public Adapter caseOrJunction(OrJunction object) {
				return createOrJunctionAdapter();
			}
			@Override
			public Adapter caseBusinessLayerElement(BusinessLayerElement object) {
				return createBusinessLayerElementAdapter();
			}
			@Override
			public Adapter caseBusinessActivity(BusinessActivity object) {
				return createBusinessActivityAdapter();
			}
			@Override
			public Adapter caseBusinessActor(BusinessActor object) {
				return createBusinessActorAdapter();
			}
			@Override
			public Adapter caseBusinessCollaboration(BusinessCollaboration object) {
				return createBusinessCollaborationAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseBusinessEvent(BusinessEvent object) {
				return createBusinessEventAdapter();
			}
			@Override
			public Adapter caseBusinessFunction(BusinessFunction object) {
				return createBusinessFunctionAdapter();
			}
			@Override
			public Adapter caseBusinessInteraction(BusinessInteraction object) {
				return createBusinessInteractionAdapter();
			}
			@Override
			public Adapter caseBusinessInterface(BusinessInterface object) {
				return createBusinessInterfaceAdapter();
			}
			@Override
			public Adapter caseMeaning(Meaning object) {
				return createMeaningAdapter();
			}
			@Override
			public Adapter caseBusinessObject(BusinessObject object) {
				return createBusinessObjectAdapter();
			}
			@Override
			public Adapter caseBusinessProcess(BusinessProcess object) {
				return createBusinessProcessAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseBusinessRole(BusinessRole object) {
				return createBusinessRoleAdapter();
			}
			@Override
			public Adapter caseBusinessService(BusinessService object) {
				return createBusinessServiceAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseApplicationLayerElement(ApplicationLayerElement object) {
				return createApplicationLayerElementAdapter();
			}
			@Override
			public Adapter caseApplicationCollaboration(ApplicationCollaboration object) {
				return createApplicationCollaborationAdapter();
			}
			@Override
			public Adapter caseApplicationComponent(ApplicationComponent object) {
				return createApplicationComponentAdapter();
			}
			@Override
			public Adapter caseApplicationFunction(ApplicationFunction object) {
				return createApplicationFunctionAdapter();
			}
			@Override
			public Adapter caseApplicationInteraction(ApplicationInteraction object) {
				return createApplicationInteractionAdapter();
			}
			@Override
			public Adapter caseApplicationInterface(ApplicationInterface object) {
				return createApplicationInterfaceAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseApplicationService(ApplicationService object) {
				return createApplicationServiceAdapter();
			}
			@Override
			public Adapter caseTechnologyLayerElement(TechnologyLayerElement object) {
				return createTechnologyLayerElementAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseCommunicationPath(CommunicationPath object) {
				return createCommunicationPathAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseInfrastructureInterface(InfrastructureInterface object) {
				return createInfrastructureInterfaceAdapter();
			}
			@Override
			public Adapter caseInfrastructureService(InfrastructureService object) {
				return createInfrastructureServiceAdapter();
			}
			@Override
			public Adapter caseInfrastructureFunction(InfrastructureFunction object) {
				return createInfrastructureFunctionAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseSystemSoftware(SystemSoftware object) {
				return createSystemSoftwareAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseMotivationElement(MotivationElement object) {
				return createMotivationElementAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseDriver(Driver object) {
				return createDriverAdapter();
			}
			@Override
			public Adapter caseAssessment(Assessment object) {
				return createAssessmentAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter casePrinciple(Principle object) {
				return createPrincipleAdapter();
			}
			@Override
			public Adapter caseImplementationMigrationElement(ImplementationMigrationElement object) {
				return createImplementationMigrationElementAdapter();
			}
			@Override
			public Adapter caseWorkPackage(WorkPackage object) {
				return createWorkPackageAdapter();
			}
			@Override
			public Adapter caseDeliverable(Deliverable object) {
				return createDeliverableAdapter();
			}
			@Override
			public Adapter casePlateau(Plateau object) {
				return createPlateauAdapter();
			}
			@Override
			public Adapter caseGap(Gap object) {
				return createGapAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseAccessRelationship(AccessRelationship object) {
				return createAccessRelationshipAdapter();
			}
			@Override
			public Adapter caseAggregationRelationship(AggregationRelationship object) {
				return createAggregationRelationshipAdapter();
			}
			@Override
			public Adapter caseAssignmentRelationship(AssignmentRelationship object) {
				return createAssignmentRelationshipAdapter();
			}
			@Override
			public Adapter caseAssociationRelationship(AssociationRelationship object) {
				return createAssociationRelationshipAdapter();
			}
			@Override
			public Adapter caseCompositionRelationship(CompositionRelationship object) {
				return createCompositionRelationshipAdapter();
			}
			@Override
			public Adapter caseFlowRelationship(FlowRelationship object) {
				return createFlowRelationshipAdapter();
			}
			@Override
			public Adapter caseRealisationRelationship(RealisationRelationship object) {
				return createRealisationRelationshipAdapter();
			}
			@Override
			public Adapter caseSpecialisationRelationship(SpecialisationRelationship object) {
				return createSpecialisationRelationshipAdapter();
			}
			@Override
			public Adapter caseTriggeringRelationship(TriggeringRelationship object) {
				return createTriggeringRelationshipAdapter();
			}
			@Override
			public Adapter caseUsedByRelationship(UsedByRelationship object) {
				return createUsedByRelationshipAdapter();
			}
			@Override
			public Adapter caseInfluenceRelationship(InfluenceRelationship object) {
				return createInfluenceRelationshipAdapter();
			}
			@Override
			public Adapter caseDiagramModelComponent(DiagramModelComponent object) {
				return createDiagramModelComponentAdapter();
			}
			@Override
			public Adapter caseDiagramModelContainer(DiagramModelContainer object) {
				return createDiagramModelContainerAdapter();
			}
			@Override
			public Adapter caseDiagramModel(DiagramModel object) {
				return createDiagramModelAdapter();
			}
			@Override
			public Adapter caseDiagramModelReference(DiagramModelReference object) {
				return createDiagramModelReferenceAdapter();
			}
			@Override
			public Adapter caseDiagramModelObject(DiagramModelObject object) {
				return createDiagramModelObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelGroup(DiagramModelGroup object) {
				return createDiagramModelGroupAdapter();
			}
			@Override
			public Adapter caseDiagramModelNote(DiagramModelNote object) {
				return createDiagramModelNoteAdapter();
			}
			@Override
			public Adapter caseDiagramModelImage(DiagramModelImage object) {
				return createDiagramModelImageAdapter();
			}
			@Override
			public Adapter caseDiagramModelConnection(DiagramModelConnection object) {
				return createDiagramModelConnectionAdapter();
			}
			@Override
			public Adapter caseDiagramModelBendpoint(DiagramModelBendpoint object) {
				return createDiagramModelBendpointAdapter();
			}
			@Override
			public Adapter caseLineObject(LineObject object) {
				return createLineObjectAdapter();
			}
			@Override
			public Adapter caseFontAttribute(FontAttribute object) {
				return createFontAttributeAdapter();
			}
			@Override
			public Adapter caseTextPosition(TextPosition object) {
				return createTextPositionAdapter();
			}
			@Override
			public Adapter caseTextAlignment(TextAlignment object) {
				return createTextAlignmentAdapter();
			}
			@Override
			public Adapter caseBorderObject(BorderObject object) {
				return createBorderObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelImageProvider(DiagramModelImageProvider object) {
				return createDiagramModelImageProviderAdapter();
			}
			@Override
			public Adapter caseBounds(Bounds object) {
				return createBoundsAdapter();
			}
			@Override
			public Adapter caseLockable(Lockable object) {
				return createLockableAdapter();
			}
			@Override
			public Adapter caseArchimateDiagramModel(ArchimateDiagramModel object) {
				return createArchimateDiagramModelAdapter();
			}
			@Override
			public Adapter caseDiagramModelArchimateObject(DiagramModelArchimateObject object) {
				return createDiagramModelArchimateObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelArchimateConnection(DiagramModelArchimateConnection object) {
				return createDiagramModelArchimateConnectionAdapter();
			}
			@Override
			public Adapter caseSketchModel(SketchModel object) {
				return createSketchModelAdapter();
			}
			@Override
			public Adapter caseSketchModelSticky(SketchModelSticky object) {
				return createSketchModelStickyAdapter();
			}
			@Override
			public Adapter caseSketchModelActor(SketchModelActor object) {
				return createSketchModelActorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Adapter
	 * @generated
	 */
	public Adapter createAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TextContent
	 * @generated
	 */
	public Adapter createTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Documentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Documentable
	 * @generated
	 */
	public Adapter createDocumentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Cloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Cloneable
	 * @generated
	 */
	public Adapter createCloneableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FolderContainer
	 * @generated
	 */
	public Adapter createFolderContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArchimateModelElement <em>Archimate Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArchimateModelElement
	 * @generated
	 */
	public Adapter createArchimateModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArchimateModel <em>Archimate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArchimateModel
	 * @generated
	 */
	public Adapter createArchimateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArchimateComponent <em>Archimate Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArchimateComponent
	 * @generated
	 */
	public Adapter createArchimateComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArchimateElement <em>Archimate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArchimateElement
	 * @generated
	 */
	public Adapter createArchimateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.JunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.JunctionElement
	 * @generated
	 */
	public Adapter createJunctionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceElement
	 * @generated
	 */
	public Adapter createInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ServiceElement
	 * @generated
	 */
	public Adapter createServiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AndJunction
	 * @generated
	 */
	public Adapter createAndJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.OrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.OrJunction
	 * @generated
	 */
	public Adapter createOrJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessLayerElement <em>Business Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessLayerElement
	 * @generated
	 */
	public Adapter createBusinessLayerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessActivity <em>Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessActivity
	 * @generated
	 */
	public Adapter createBusinessActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessActor
	 * @generated
	 */
	public Adapter createBusinessActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessCollaboration <em>Business Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessCollaboration
	 * @generated
	 */
	public Adapter createBusinessCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessEvent <em>Business Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessEvent
	 * @generated
	 */
	public Adapter createBusinessEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessFunction <em>Business Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessFunction
	 * @generated
	 */
	public Adapter createBusinessFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessInteraction <em>Business Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessInteraction
	 * @generated
	 */
	public Adapter createBusinessInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessInterface <em>Business Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessInterface
	 * @generated
	 */
	public Adapter createBusinessInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Meaning
	 * @generated
	 */
	public Adapter createMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessObject
	 * @generated
	 */
	public Adapter createBusinessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessProcess
	 * @generated
	 */
	public Adapter createBusinessProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessRole
	 * @generated
	 */
	public Adapter createBusinessRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessService <em>Business Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessService
	 * @generated
	 */
	public Adapter createBusinessServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationLayerElement <em>Application Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationLayerElement
	 * @generated
	 */
	public Adapter createApplicationLayerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationCollaboration <em>Application Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationCollaboration
	 * @generated
	 */
	public Adapter createApplicationCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationComponent
	 * @generated
	 */
	public Adapter createApplicationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationFunction <em>Application Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationFunction
	 * @generated
	 */
	public Adapter createApplicationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationInteraction <em>Application Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationInteraction
	 * @generated
	 */
	public Adapter createApplicationInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationInterface <em>Application Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationInterface
	 * @generated
	 */
	public Adapter createApplicationInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ApplicationService <em>Application Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ApplicationService
	 * @generated
	 */
	public Adapter createApplicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TechnologyLayerElement <em>Technology Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TechnologyLayerElement
	 * @generated
	 */
	public Adapter createTechnologyLayerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CommunicationPath
	 * @generated
	 */
	public Adapter createCommunicationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InfrastructureInterface <em>Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InfrastructureInterface
	 * @generated
	 */
	public Adapter createInfrastructureInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InfrastructureService <em>Infrastructure Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InfrastructureService
	 * @generated
	 */
	public Adapter createInfrastructureServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InfrastructureFunction <em>Infrastructure Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InfrastructureFunction
	 * @generated
	 */
	public Adapter createInfrastructureFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SystemSoftware <em>System Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SystemSoftware
	 * @generated
	 */
	public Adapter createSystemSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MotivationElement <em>Motivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MotivationElement
	 * @generated
	 */
	public Adapter createMotivationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Assessment
	 * @generated
	 */
	public Adapter createAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Principle
	 * @generated
	 */
	public Adapter createPrincipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ImplementationMigrationElement <em>Implementation Migration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ImplementationMigrationElement
	 * @generated
	 */
	public Adapter createImplementationMigrationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.WorkPackage
	 * @generated
	 */
	public Adapter createWorkPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Deliverable
	 * @generated
	 */
	public Adapter createDeliverableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Plateau <em>Plateau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Plateau
	 * @generated
	 */
	public Adapter createPlateauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Gap
	 * @generated
	 */
	public Adapter createGapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AccessRelationship <em>Access Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AccessRelationship
	 * @generated
	 */
	public Adapter createAccessRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AggregationRelationship <em>Aggregation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AggregationRelationship
	 * @generated
	 */
	public Adapter createAggregationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AssignmentRelationship <em>Assignment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AssignmentRelationship
	 * @generated
	 */
	public Adapter createAssignmentRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AssociationRelationship
	 * @generated
	 */
	public Adapter createAssociationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CompositionRelationship <em>Composition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CompositionRelationship
	 * @generated
	 */
	public Adapter createCompositionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FlowRelationship <em>Flow Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FlowRelationship
	 * @generated
	 */
	public Adapter createFlowRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RealisationRelationship <em>Realisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RealisationRelationship
	 * @generated
	 */
	public Adapter createRealisationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SpecialisationRelationship <em>Specialisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SpecialisationRelationship
	 * @generated
	 */
	public Adapter createSpecialisationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TriggeringRelationship <em>Triggering Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TriggeringRelationship
	 * @generated
	 */
	public Adapter createTriggeringRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.UsedByRelationship <em>Used By Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.UsedByRelationship
	 * @generated
	 */
	public Adapter createUsedByRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InfluenceRelationship <em>Influence Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InfluenceRelationship
	 * @generated
	 */
	public Adapter createInfluenceRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelComponent
	 * @generated
	 */
	public Adapter createDiagramModelComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelContainer
	 * @generated
	 */
	public Adapter createDiagramModelContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModel
	 * @generated
	 */
	public Adapter createDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelReference
	 * @generated
	 */
	public Adapter createDiagramModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelObject
	 * @generated
	 */
	public Adapter createDiagramModelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelGroup
	 * @generated
	 */
	public Adapter createDiagramModelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelNote
	 * @generated
	 */
	public Adapter createDiagramModelNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelImage
	 * @generated
	 */
	public Adapter createDiagramModelImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelConnection
	 * @generated
	 */
	public Adapter createDiagramModelConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelBendpoint
	 * @generated
	 */
	public Adapter createDiagramModelBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LineObject <em>Line Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LineObject
	 * @generated
	 */
	public Adapter createLineObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FontAttribute
	 * @generated
	 */
	public Adapter createFontAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TextPosition
	 * @generated
	 */
	public Adapter createTextPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TextAlignment
	 * @generated
	 */
	public Adapter createTextAlignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BorderObject
	 * @generated
	 */
	public Adapter createBorderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelImageProvider
	 * @generated
	 */
	public Adapter createDiagramModelImageProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Bounds
	 * @generated
	 */
	public Adapter createBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Lockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Lockable
	 * @generated
	 */
	public Adapter createLockableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArchimateDiagramModel <em>Archimate Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArchimateDiagramModel
	 * @generated
	 */
	public Adapter createArchimateDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelArchimateObject
	 * @generated
	 */
	public Adapter createDiagramModelArchimateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DiagramModelArchimateConnection
	 * @generated
	 */
	public Adapter createDiagramModelArchimateConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SketchModel
	 * @generated
	 */
	public Adapter createSketchModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SketchModelSticky
	 * @generated
	 */
	public Adapter createSketchModelStickyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SketchModelActor
	 * @generated
	 */
	public Adapter createSketchModelActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
