/**
 */
package model.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ADAPTER: {
				Adapter adapter = (Adapter)theEObject;
				T result = caseAdapter(adapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NAMEABLE: {
				Nameable nameable = (Nameable)theEObject;
				T result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_CONTENT: {
				TextContent textContent = (TextContent)theEObject;
				T result = caseTextContent(textContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOCUMENTABLE: {
				Documentable documentable = (Documentable)theEObject;
				T result = caseDocumentable(documentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CLONEABLE: {
				model.Cloneable cloneable = (model.Cloneable)theEObject;
				T result = caseCloneable(cloneable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FOLDER_CONTAINER: {
				FolderContainer folderContainer = (FolderContainer)theEObject;
				T result = caseFolderContainer(folderContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARCHIMATE_MODEL_ELEMENT: {
				ArchimateModelElement archimateModelElement = (ArchimateModelElement)theEObject;
				T result = caseArchimateModelElement(archimateModelElement);
				if (result == null) result = caseAdapter(archimateModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARCHIMATE_MODEL: {
				ArchimateModel archimateModel = (ArchimateModel)theEObject;
				T result = caseArchimateModel(archimateModel);
				if (result == null) result = caseFolderContainer(archimateModel);
				if (result == null) result = caseNameable(archimateModel);
				if (result == null) result = caseIdentifier(archimateModel);
				if (result == null) result = caseArchimateModelElement(archimateModel);
				if (result == null) result = caseProperties(archimateModel);
				if (result == null) result = caseAdapter(archimateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseArchimateModelElement(folder);
				if (result == null) result = caseFolderContainer(folder);
				if (result == null) result = caseNameable(folder);
				if (result == null) result = caseIdentifier(folder);
				if (result == null) result = caseDocumentable(folder);
				if (result == null) result = caseProperties(folder);
				if (result == null) result = caseAdapter(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARCHIMATE_COMPONENT: {
				ArchimateComponent archimateComponent = (ArchimateComponent)theEObject;
				T result = caseArchimateComponent(archimateComponent);
				if (result == null) result = caseArchimateModelElement(archimateComponent);
				if (result == null) result = caseIdentifier(archimateComponent);
				if (result == null) result = caseCloneable(archimateComponent);
				if (result == null) result = caseNameable(archimateComponent);
				if (result == null) result = caseDocumentable(archimateComponent);
				if (result == null) result = caseProperties(archimateComponent);
				if (result == null) result = caseAdapter(archimateComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARCHIMATE_ELEMENT: {
				ArchimateElement archimateElement = (ArchimateElement)theEObject;
				T result = caseArchimateElement(archimateElement);
				if (result == null) result = caseArchimateComponent(archimateElement);
				if (result == null) result = caseArchimateModelElement(archimateElement);
				if (result == null) result = caseIdentifier(archimateElement);
				if (result == null) result = caseCloneable(archimateElement);
				if (result == null) result = caseNameable(archimateElement);
				if (result == null) result = caseDocumentable(archimateElement);
				if (result == null) result = caseProperties(archimateElement);
				if (result == null) result = caseAdapter(archimateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JUNCTION_ELEMENT: {
				JunctionElement junctionElement = (JunctionElement)theEObject;
				T result = caseJunctionElement(junctionElement);
				if (result == null) result = caseArchimateElement(junctionElement);
				if (result == null) result = caseArchimateComponent(junctionElement);
				if (result == null) result = caseArchimateModelElement(junctionElement);
				if (result == null) result = caseIdentifier(junctionElement);
				if (result == null) result = caseCloneable(junctionElement);
				if (result == null) result = caseNameable(junctionElement);
				if (result == null) result = caseDocumentable(junctionElement);
				if (result == null) result = caseProperties(junctionElement);
				if (result == null) result = caseAdapter(junctionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_ELEMENT: {
				InterfaceElement interfaceElement = (InterfaceElement)theEObject;
				T result = caseInterfaceElement(interfaceElement);
				if (result == null) result = caseArchimateElement(interfaceElement);
				if (result == null) result = caseArchimateComponent(interfaceElement);
				if (result == null) result = caseArchimateModelElement(interfaceElement);
				if (result == null) result = caseIdentifier(interfaceElement);
				if (result == null) result = caseCloneable(interfaceElement);
				if (result == null) result = caseNameable(interfaceElement);
				if (result == null) result = caseDocumentable(interfaceElement);
				if (result == null) result = caseProperties(interfaceElement);
				if (result == null) result = caseAdapter(interfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SERVICE_ELEMENT: {
				ServiceElement serviceElement = (ServiceElement)theEObject;
				T result = caseServiceElement(serviceElement);
				if (result == null) result = caseArchimateElement(serviceElement);
				if (result == null) result = caseArchimateComponent(serviceElement);
				if (result == null) result = caseArchimateModelElement(serviceElement);
				if (result == null) result = caseIdentifier(serviceElement);
				if (result == null) result = caseCloneable(serviceElement);
				if (result == null) result = caseNameable(serviceElement);
				if (result == null) result = caseDocumentable(serviceElement);
				if (result == null) result = caseProperties(serviceElement);
				if (result == null) result = caseAdapter(serviceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseJunctionElement(junction);
				if (result == null) result = caseArchimateElement(junction);
				if (result == null) result = caseArchimateComponent(junction);
				if (result == null) result = caseArchimateModelElement(junction);
				if (result == null) result = caseIdentifier(junction);
				if (result == null) result = caseCloneable(junction);
				if (result == null) result = caseNameable(junction);
				if (result == null) result = caseDocumentable(junction);
				if (result == null) result = caseProperties(junction);
				if (result == null) result = caseAdapter(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AND_JUNCTION: {
				AndJunction andJunction = (AndJunction)theEObject;
				T result = caseAndJunction(andJunction);
				if (result == null) result = caseJunctionElement(andJunction);
				if (result == null) result = caseArchimateElement(andJunction);
				if (result == null) result = caseArchimateComponent(andJunction);
				if (result == null) result = caseArchimateModelElement(andJunction);
				if (result == null) result = caseIdentifier(andJunction);
				if (result == null) result = caseCloneable(andJunction);
				if (result == null) result = caseNameable(andJunction);
				if (result == null) result = caseDocumentable(andJunction);
				if (result == null) result = caseProperties(andJunction);
				if (result == null) result = caseAdapter(andJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OR_JUNCTION: {
				OrJunction orJunction = (OrJunction)theEObject;
				T result = caseOrJunction(orJunction);
				if (result == null) result = caseJunctionElement(orJunction);
				if (result == null) result = caseArchimateElement(orJunction);
				if (result == null) result = caseArchimateComponent(orJunction);
				if (result == null) result = caseArchimateModelElement(orJunction);
				if (result == null) result = caseIdentifier(orJunction);
				if (result == null) result = caseCloneable(orJunction);
				if (result == null) result = caseNameable(orJunction);
				if (result == null) result = caseDocumentable(orJunction);
				if (result == null) result = caseProperties(orJunction);
				if (result == null) result = caseAdapter(orJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_LAYER_ELEMENT: {
				BusinessLayerElement businessLayerElement = (BusinessLayerElement)theEObject;
				T result = caseBusinessLayerElement(businessLayerElement);
				if (result == null) result = caseArchimateElement(businessLayerElement);
				if (result == null) result = caseArchimateComponent(businessLayerElement);
				if (result == null) result = caseArchimateModelElement(businessLayerElement);
				if (result == null) result = caseIdentifier(businessLayerElement);
				if (result == null) result = caseCloneable(businessLayerElement);
				if (result == null) result = caseNameable(businessLayerElement);
				if (result == null) result = caseDocumentable(businessLayerElement);
				if (result == null) result = caseProperties(businessLayerElement);
				if (result == null) result = caseAdapter(businessLayerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_ACTIVITY: {
				BusinessActivity businessActivity = (BusinessActivity)theEObject;
				T result = caseBusinessActivity(businessActivity);
				if (result == null) result = caseBusinessLayerElement(businessActivity);
				if (result == null) result = caseArchimateElement(businessActivity);
				if (result == null) result = caseArchimateComponent(businessActivity);
				if (result == null) result = caseArchimateModelElement(businessActivity);
				if (result == null) result = caseIdentifier(businessActivity);
				if (result == null) result = caseCloneable(businessActivity);
				if (result == null) result = caseNameable(businessActivity);
				if (result == null) result = caseDocumentable(businessActivity);
				if (result == null) result = caseProperties(businessActivity);
				if (result == null) result = caseAdapter(businessActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_ACTOR: {
				BusinessActor businessActor = (BusinessActor)theEObject;
				T result = caseBusinessActor(businessActor);
				if (result == null) result = caseBusinessLayerElement(businessActor);
				if (result == null) result = caseArchimateElement(businessActor);
				if (result == null) result = caseArchimateComponent(businessActor);
				if (result == null) result = caseArchimateModelElement(businessActor);
				if (result == null) result = caseIdentifier(businessActor);
				if (result == null) result = caseCloneable(businessActor);
				if (result == null) result = caseNameable(businessActor);
				if (result == null) result = caseDocumentable(businessActor);
				if (result == null) result = caseProperties(businessActor);
				if (result == null) result = caseAdapter(businessActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_COLLABORATION: {
				BusinessCollaboration businessCollaboration = (BusinessCollaboration)theEObject;
				T result = caseBusinessCollaboration(businessCollaboration);
				if (result == null) result = caseBusinessLayerElement(businessCollaboration);
				if (result == null) result = caseArchimateElement(businessCollaboration);
				if (result == null) result = caseArchimateComponent(businessCollaboration);
				if (result == null) result = caseArchimateModelElement(businessCollaboration);
				if (result == null) result = caseIdentifier(businessCollaboration);
				if (result == null) result = caseCloneable(businessCollaboration);
				if (result == null) result = caseNameable(businessCollaboration);
				if (result == null) result = caseDocumentable(businessCollaboration);
				if (result == null) result = caseProperties(businessCollaboration);
				if (result == null) result = caseAdapter(businessCollaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseBusinessLayerElement(contract);
				if (result == null) result = caseArchimateElement(contract);
				if (result == null) result = caseArchimateComponent(contract);
				if (result == null) result = caseArchimateModelElement(contract);
				if (result == null) result = caseIdentifier(contract);
				if (result == null) result = caseCloneable(contract);
				if (result == null) result = caseNameable(contract);
				if (result == null) result = caseDocumentable(contract);
				if (result == null) result = caseProperties(contract);
				if (result == null) result = caseAdapter(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_EVENT: {
				BusinessEvent businessEvent = (BusinessEvent)theEObject;
				T result = caseBusinessEvent(businessEvent);
				if (result == null) result = caseBusinessLayerElement(businessEvent);
				if (result == null) result = caseArchimateElement(businessEvent);
				if (result == null) result = caseArchimateComponent(businessEvent);
				if (result == null) result = caseArchimateModelElement(businessEvent);
				if (result == null) result = caseIdentifier(businessEvent);
				if (result == null) result = caseCloneable(businessEvent);
				if (result == null) result = caseNameable(businessEvent);
				if (result == null) result = caseDocumentable(businessEvent);
				if (result == null) result = caseProperties(businessEvent);
				if (result == null) result = caseAdapter(businessEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_FUNCTION: {
				BusinessFunction businessFunction = (BusinessFunction)theEObject;
				T result = caseBusinessFunction(businessFunction);
				if (result == null) result = caseBusinessLayerElement(businessFunction);
				if (result == null) result = caseArchimateElement(businessFunction);
				if (result == null) result = caseArchimateComponent(businessFunction);
				if (result == null) result = caseArchimateModelElement(businessFunction);
				if (result == null) result = caseIdentifier(businessFunction);
				if (result == null) result = caseCloneable(businessFunction);
				if (result == null) result = caseNameable(businessFunction);
				if (result == null) result = caseDocumentable(businessFunction);
				if (result == null) result = caseProperties(businessFunction);
				if (result == null) result = caseAdapter(businessFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_INTERACTION: {
				BusinessInteraction businessInteraction = (BusinessInteraction)theEObject;
				T result = caseBusinessInteraction(businessInteraction);
				if (result == null) result = caseBusinessLayerElement(businessInteraction);
				if (result == null) result = caseArchimateElement(businessInteraction);
				if (result == null) result = caseArchimateComponent(businessInteraction);
				if (result == null) result = caseArchimateModelElement(businessInteraction);
				if (result == null) result = caseIdentifier(businessInteraction);
				if (result == null) result = caseCloneable(businessInteraction);
				if (result == null) result = caseNameable(businessInteraction);
				if (result == null) result = caseDocumentable(businessInteraction);
				if (result == null) result = caseProperties(businessInteraction);
				if (result == null) result = caseAdapter(businessInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_INTERFACE: {
				BusinessInterface businessInterface = (BusinessInterface)theEObject;
				T result = caseBusinessInterface(businessInterface);
				if (result == null) result = caseBusinessLayerElement(businessInterface);
				if (result == null) result = caseInterfaceElement(businessInterface);
				if (result == null) result = caseArchimateElement(businessInterface);
				if (result == null) result = caseArchimateComponent(businessInterface);
				if (result == null) result = caseArchimateModelElement(businessInterface);
				if (result == null) result = caseIdentifier(businessInterface);
				if (result == null) result = caseCloneable(businessInterface);
				if (result == null) result = caseNameable(businessInterface);
				if (result == null) result = caseDocumentable(businessInterface);
				if (result == null) result = caseProperties(businessInterface);
				if (result == null) result = caseAdapter(businessInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MEANING: {
				Meaning meaning = (Meaning)theEObject;
				T result = caseMeaning(meaning);
				if (result == null) result = caseBusinessLayerElement(meaning);
				if (result == null) result = caseArchimateElement(meaning);
				if (result == null) result = caseArchimateComponent(meaning);
				if (result == null) result = caseArchimateModelElement(meaning);
				if (result == null) result = caseIdentifier(meaning);
				if (result == null) result = caseCloneable(meaning);
				if (result == null) result = caseNameable(meaning);
				if (result == null) result = caseDocumentable(meaning);
				if (result == null) result = caseProperties(meaning);
				if (result == null) result = caseAdapter(meaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_OBJECT: {
				BusinessObject businessObject = (BusinessObject)theEObject;
				T result = caseBusinessObject(businessObject);
				if (result == null) result = caseBusinessLayerElement(businessObject);
				if (result == null) result = caseArchimateElement(businessObject);
				if (result == null) result = caseArchimateComponent(businessObject);
				if (result == null) result = caseArchimateModelElement(businessObject);
				if (result == null) result = caseIdentifier(businessObject);
				if (result == null) result = caseCloneable(businessObject);
				if (result == null) result = caseNameable(businessObject);
				if (result == null) result = caseDocumentable(businessObject);
				if (result == null) result = caseProperties(businessObject);
				if (result == null) result = caseAdapter(businessObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_PROCESS: {
				BusinessProcess businessProcess = (BusinessProcess)theEObject;
				T result = caseBusinessProcess(businessProcess);
				if (result == null) result = caseBusinessLayerElement(businessProcess);
				if (result == null) result = caseArchimateElement(businessProcess);
				if (result == null) result = caseArchimateComponent(businessProcess);
				if (result == null) result = caseArchimateModelElement(businessProcess);
				if (result == null) result = caseIdentifier(businessProcess);
				if (result == null) result = caseCloneable(businessProcess);
				if (result == null) result = caseNameable(businessProcess);
				if (result == null) result = caseDocumentable(businessProcess);
				if (result == null) result = caseProperties(businessProcess);
				if (result == null) result = caseAdapter(businessProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseBusinessLayerElement(product);
				if (result == null) result = caseArchimateElement(product);
				if (result == null) result = caseArchimateComponent(product);
				if (result == null) result = caseArchimateModelElement(product);
				if (result == null) result = caseIdentifier(product);
				if (result == null) result = caseCloneable(product);
				if (result == null) result = caseNameable(product);
				if (result == null) result = caseDocumentable(product);
				if (result == null) result = caseProperties(product);
				if (result == null) result = caseAdapter(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = caseBusinessLayerElement(representation);
				if (result == null) result = caseArchimateElement(representation);
				if (result == null) result = caseArchimateComponent(representation);
				if (result == null) result = caseArchimateModelElement(representation);
				if (result == null) result = caseIdentifier(representation);
				if (result == null) result = caseCloneable(representation);
				if (result == null) result = caseNameable(representation);
				if (result == null) result = caseDocumentable(representation);
				if (result == null) result = caseProperties(representation);
				if (result == null) result = caseAdapter(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_ROLE: {
				BusinessRole businessRole = (BusinessRole)theEObject;
				T result = caseBusinessRole(businessRole);
				if (result == null) result = caseBusinessLayerElement(businessRole);
				if (result == null) result = caseArchimateElement(businessRole);
				if (result == null) result = caseArchimateComponent(businessRole);
				if (result == null) result = caseArchimateModelElement(businessRole);
				if (result == null) result = caseIdentifier(businessRole);
				if (result == null) result = caseCloneable(businessRole);
				if (result == null) result = caseNameable(businessRole);
				if (result == null) result = caseDocumentable(businessRole);
				if (result == null) result = caseProperties(businessRole);
				if (result == null) result = caseAdapter(businessRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUSINESS_SERVICE: {
				BusinessService businessService = (BusinessService)theEObject;
				T result = caseBusinessService(businessService);
				if (result == null) result = caseBusinessLayerElement(businessService);
				if (result == null) result = caseServiceElement(businessService);
				if (result == null) result = caseArchimateElement(businessService);
				if (result == null) result = caseArchimateComponent(businessService);
				if (result == null) result = caseArchimateModelElement(businessService);
				if (result == null) result = caseIdentifier(businessService);
				if (result == null) result = caseCloneable(businessService);
				if (result == null) result = caseNameable(businessService);
				if (result == null) result = caseDocumentable(businessService);
				if (result == null) result = caseProperties(businessService);
				if (result == null) result = caseAdapter(businessService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseBusinessLayerElement(value);
				if (result == null) result = caseArchimateElement(value);
				if (result == null) result = caseArchimateComponent(value);
				if (result == null) result = caseArchimateModelElement(value);
				if (result == null) result = caseIdentifier(value);
				if (result == null) result = caseCloneable(value);
				if (result == null) result = caseNameable(value);
				if (result == null) result = caseDocumentable(value);
				if (result == null) result = caseProperties(value);
				if (result == null) result = caseAdapter(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseBusinessLayerElement(location);
				if (result == null) result = caseArchimateElement(location);
				if (result == null) result = caseArchimateComponent(location);
				if (result == null) result = caseArchimateModelElement(location);
				if (result == null) result = caseIdentifier(location);
				if (result == null) result = caseCloneable(location);
				if (result == null) result = caseNameable(location);
				if (result == null) result = caseDocumentable(location);
				if (result == null) result = caseProperties(location);
				if (result == null) result = caseAdapter(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_LAYER_ELEMENT: {
				ApplicationLayerElement applicationLayerElement = (ApplicationLayerElement)theEObject;
				T result = caseApplicationLayerElement(applicationLayerElement);
				if (result == null) result = caseArchimateElement(applicationLayerElement);
				if (result == null) result = caseArchimateComponent(applicationLayerElement);
				if (result == null) result = caseArchimateModelElement(applicationLayerElement);
				if (result == null) result = caseIdentifier(applicationLayerElement);
				if (result == null) result = caseCloneable(applicationLayerElement);
				if (result == null) result = caseNameable(applicationLayerElement);
				if (result == null) result = caseDocumentable(applicationLayerElement);
				if (result == null) result = caseProperties(applicationLayerElement);
				if (result == null) result = caseAdapter(applicationLayerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_COLLABORATION: {
				ApplicationCollaboration applicationCollaboration = (ApplicationCollaboration)theEObject;
				T result = caseApplicationCollaboration(applicationCollaboration);
				if (result == null) result = caseApplicationLayerElement(applicationCollaboration);
				if (result == null) result = caseArchimateElement(applicationCollaboration);
				if (result == null) result = caseArchimateComponent(applicationCollaboration);
				if (result == null) result = caseArchimateModelElement(applicationCollaboration);
				if (result == null) result = caseIdentifier(applicationCollaboration);
				if (result == null) result = caseCloneable(applicationCollaboration);
				if (result == null) result = caseNameable(applicationCollaboration);
				if (result == null) result = caseDocumentable(applicationCollaboration);
				if (result == null) result = caseProperties(applicationCollaboration);
				if (result == null) result = caseAdapter(applicationCollaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_COMPONENT: {
				ApplicationComponent applicationComponent = (ApplicationComponent)theEObject;
				T result = caseApplicationComponent(applicationComponent);
				if (result == null) result = caseApplicationLayerElement(applicationComponent);
				if (result == null) result = caseArchimateElement(applicationComponent);
				if (result == null) result = caseArchimateComponent(applicationComponent);
				if (result == null) result = caseArchimateModelElement(applicationComponent);
				if (result == null) result = caseIdentifier(applicationComponent);
				if (result == null) result = caseCloneable(applicationComponent);
				if (result == null) result = caseNameable(applicationComponent);
				if (result == null) result = caseDocumentable(applicationComponent);
				if (result == null) result = caseProperties(applicationComponent);
				if (result == null) result = caseAdapter(applicationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_FUNCTION: {
				ApplicationFunction applicationFunction = (ApplicationFunction)theEObject;
				T result = caseApplicationFunction(applicationFunction);
				if (result == null) result = caseApplicationLayerElement(applicationFunction);
				if (result == null) result = caseArchimateElement(applicationFunction);
				if (result == null) result = caseArchimateComponent(applicationFunction);
				if (result == null) result = caseArchimateModelElement(applicationFunction);
				if (result == null) result = caseIdentifier(applicationFunction);
				if (result == null) result = caseCloneable(applicationFunction);
				if (result == null) result = caseNameable(applicationFunction);
				if (result == null) result = caseDocumentable(applicationFunction);
				if (result == null) result = caseProperties(applicationFunction);
				if (result == null) result = caseAdapter(applicationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_INTERACTION: {
				ApplicationInteraction applicationInteraction = (ApplicationInteraction)theEObject;
				T result = caseApplicationInteraction(applicationInteraction);
				if (result == null) result = caseApplicationLayerElement(applicationInteraction);
				if (result == null) result = caseArchimateElement(applicationInteraction);
				if (result == null) result = caseArchimateComponent(applicationInteraction);
				if (result == null) result = caseArchimateModelElement(applicationInteraction);
				if (result == null) result = caseIdentifier(applicationInteraction);
				if (result == null) result = caseCloneable(applicationInteraction);
				if (result == null) result = caseNameable(applicationInteraction);
				if (result == null) result = caseDocumentable(applicationInteraction);
				if (result == null) result = caseProperties(applicationInteraction);
				if (result == null) result = caseAdapter(applicationInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_INTERFACE: {
				ApplicationInterface applicationInterface = (ApplicationInterface)theEObject;
				T result = caseApplicationInterface(applicationInterface);
				if (result == null) result = caseApplicationLayerElement(applicationInterface);
				if (result == null) result = caseInterfaceElement(applicationInterface);
				if (result == null) result = caseArchimateElement(applicationInterface);
				if (result == null) result = caseArchimateComponent(applicationInterface);
				if (result == null) result = caseArchimateModelElement(applicationInterface);
				if (result == null) result = caseIdentifier(applicationInterface);
				if (result == null) result = caseCloneable(applicationInterface);
				if (result == null) result = caseNameable(applicationInterface);
				if (result == null) result = caseDocumentable(applicationInterface);
				if (result == null) result = caseProperties(applicationInterface);
				if (result == null) result = caseAdapter(applicationInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_OBJECT: {
				DataObject dataObject = (DataObject)theEObject;
				T result = caseDataObject(dataObject);
				if (result == null) result = caseApplicationLayerElement(dataObject);
				if (result == null) result = caseArchimateElement(dataObject);
				if (result == null) result = caseArchimateComponent(dataObject);
				if (result == null) result = caseArchimateModelElement(dataObject);
				if (result == null) result = caseIdentifier(dataObject);
				if (result == null) result = caseCloneable(dataObject);
				if (result == null) result = caseNameable(dataObject);
				if (result == null) result = caseDocumentable(dataObject);
				if (result == null) result = caseProperties(dataObject);
				if (result == null) result = caseAdapter(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.APPLICATION_SERVICE: {
				ApplicationService applicationService = (ApplicationService)theEObject;
				T result = caseApplicationService(applicationService);
				if (result == null) result = caseApplicationLayerElement(applicationService);
				if (result == null) result = caseServiceElement(applicationService);
				if (result == null) result = caseArchimateElement(applicationService);
				if (result == null) result = caseArchimateComponent(applicationService);
				if (result == null) result = caseArchimateModelElement(applicationService);
				if (result == null) result = caseIdentifier(applicationService);
				if (result == null) result = caseCloneable(applicationService);
				if (result == null) result = caseNameable(applicationService);
				if (result == null) result = caseDocumentable(applicationService);
				if (result == null) result = caseProperties(applicationService);
				if (result == null) result = caseAdapter(applicationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TECHNOLOGY_LAYER_ELEMENT: {
				TechnologyLayerElement technologyLayerElement = (TechnologyLayerElement)theEObject;
				T result = caseTechnologyLayerElement(technologyLayerElement);
				if (result == null) result = caseArchimateElement(technologyLayerElement);
				if (result == null) result = caseArchimateComponent(technologyLayerElement);
				if (result == null) result = caseArchimateModelElement(technologyLayerElement);
				if (result == null) result = caseIdentifier(technologyLayerElement);
				if (result == null) result = caseCloneable(technologyLayerElement);
				if (result == null) result = caseNameable(technologyLayerElement);
				if (result == null) result = caseDocumentable(technologyLayerElement);
				if (result == null) result = caseProperties(technologyLayerElement);
				if (result == null) result = caseAdapter(technologyLayerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseTechnologyLayerElement(artifact);
				if (result == null) result = caseArchimateElement(artifact);
				if (result == null) result = caseArchimateComponent(artifact);
				if (result == null) result = caseArchimateModelElement(artifact);
				if (result == null) result = caseIdentifier(artifact);
				if (result == null) result = caseCloneable(artifact);
				if (result == null) result = caseNameable(artifact);
				if (result == null) result = caseDocumentable(artifact);
				if (result == null) result = caseProperties(artifact);
				if (result == null) result = caseAdapter(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMMUNICATION_PATH: {
				CommunicationPath communicationPath = (CommunicationPath)theEObject;
				T result = caseCommunicationPath(communicationPath);
				if (result == null) result = caseTechnologyLayerElement(communicationPath);
				if (result == null) result = caseArchimateElement(communicationPath);
				if (result == null) result = caseArchimateComponent(communicationPath);
				if (result == null) result = caseArchimateModelElement(communicationPath);
				if (result == null) result = caseIdentifier(communicationPath);
				if (result == null) result = caseCloneable(communicationPath);
				if (result == null) result = caseNameable(communicationPath);
				if (result == null) result = caseDocumentable(communicationPath);
				if (result == null) result = caseProperties(communicationPath);
				if (result == null) result = caseAdapter(communicationPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseTechnologyLayerElement(network);
				if (result == null) result = caseArchimateElement(network);
				if (result == null) result = caseArchimateComponent(network);
				if (result == null) result = caseArchimateModelElement(network);
				if (result == null) result = caseIdentifier(network);
				if (result == null) result = caseCloneable(network);
				if (result == null) result = caseNameable(network);
				if (result == null) result = caseDocumentable(network);
				if (result == null) result = caseProperties(network);
				if (result == null) result = caseAdapter(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INFRASTRUCTURE_INTERFACE: {
				InfrastructureInterface infrastructureInterface = (InfrastructureInterface)theEObject;
				T result = caseInfrastructureInterface(infrastructureInterface);
				if (result == null) result = caseTechnologyLayerElement(infrastructureInterface);
				if (result == null) result = caseInterfaceElement(infrastructureInterface);
				if (result == null) result = caseArchimateElement(infrastructureInterface);
				if (result == null) result = caseArchimateComponent(infrastructureInterface);
				if (result == null) result = caseArchimateModelElement(infrastructureInterface);
				if (result == null) result = caseIdentifier(infrastructureInterface);
				if (result == null) result = caseCloneable(infrastructureInterface);
				if (result == null) result = caseNameable(infrastructureInterface);
				if (result == null) result = caseDocumentable(infrastructureInterface);
				if (result == null) result = caseProperties(infrastructureInterface);
				if (result == null) result = caseAdapter(infrastructureInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INFRASTRUCTURE_SERVICE: {
				InfrastructureService infrastructureService = (InfrastructureService)theEObject;
				T result = caseInfrastructureService(infrastructureService);
				if (result == null) result = caseTechnologyLayerElement(infrastructureService);
				if (result == null) result = caseServiceElement(infrastructureService);
				if (result == null) result = caseArchimateElement(infrastructureService);
				if (result == null) result = caseArchimateComponent(infrastructureService);
				if (result == null) result = caseArchimateModelElement(infrastructureService);
				if (result == null) result = caseIdentifier(infrastructureService);
				if (result == null) result = caseCloneable(infrastructureService);
				if (result == null) result = caseNameable(infrastructureService);
				if (result == null) result = caseDocumentable(infrastructureService);
				if (result == null) result = caseProperties(infrastructureService);
				if (result == null) result = caseAdapter(infrastructureService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INFRASTRUCTURE_FUNCTION: {
				InfrastructureFunction infrastructureFunction = (InfrastructureFunction)theEObject;
				T result = caseInfrastructureFunction(infrastructureFunction);
				if (result == null) result = caseTechnologyLayerElement(infrastructureFunction);
				if (result == null) result = caseArchimateElement(infrastructureFunction);
				if (result == null) result = caseArchimateComponent(infrastructureFunction);
				if (result == null) result = caseArchimateModelElement(infrastructureFunction);
				if (result == null) result = caseIdentifier(infrastructureFunction);
				if (result == null) result = caseCloneable(infrastructureFunction);
				if (result == null) result = caseNameable(infrastructureFunction);
				if (result == null) result = caseDocumentable(infrastructureFunction);
				if (result == null) result = caseProperties(infrastructureFunction);
				if (result == null) result = caseAdapter(infrastructureFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseTechnologyLayerElement(node);
				if (result == null) result = caseArchimateElement(node);
				if (result == null) result = caseArchimateComponent(node);
				if (result == null) result = caseArchimateModelElement(node);
				if (result == null) result = caseIdentifier(node);
				if (result == null) result = caseCloneable(node);
				if (result == null) result = caseNameable(node);
				if (result == null) result = caseDocumentable(node);
				if (result == null) result = caseProperties(node);
				if (result == null) result = caseAdapter(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM_SOFTWARE: {
				SystemSoftware systemSoftware = (SystemSoftware)theEObject;
				T result = caseSystemSoftware(systemSoftware);
				if (result == null) result = caseTechnologyLayerElement(systemSoftware);
				if (result == null) result = caseArchimateElement(systemSoftware);
				if (result == null) result = caseArchimateComponent(systemSoftware);
				if (result == null) result = caseArchimateModelElement(systemSoftware);
				if (result == null) result = caseIdentifier(systemSoftware);
				if (result == null) result = caseCloneable(systemSoftware);
				if (result == null) result = caseNameable(systemSoftware);
				if (result == null) result = caseDocumentable(systemSoftware);
				if (result == null) result = caseProperties(systemSoftware);
				if (result == null) result = caseAdapter(systemSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseTechnologyLayerElement(device);
				if (result == null) result = caseArchimateElement(device);
				if (result == null) result = caseArchimateComponent(device);
				if (result == null) result = caseArchimateModelElement(device);
				if (result == null) result = caseIdentifier(device);
				if (result == null) result = caseCloneable(device);
				if (result == null) result = caseNameable(device);
				if (result == null) result = caseDocumentable(device);
				if (result == null) result = caseProperties(device);
				if (result == null) result = caseAdapter(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MOTIVATION_ELEMENT: {
				MotivationElement motivationElement = (MotivationElement)theEObject;
				T result = caseMotivationElement(motivationElement);
				if (result == null) result = caseArchimateElement(motivationElement);
				if (result == null) result = caseArchimateComponent(motivationElement);
				if (result == null) result = caseArchimateModelElement(motivationElement);
				if (result == null) result = caseIdentifier(motivationElement);
				if (result == null) result = caseCloneable(motivationElement);
				if (result == null) result = caseNameable(motivationElement);
				if (result == null) result = caseDocumentable(motivationElement);
				if (result == null) result = caseProperties(motivationElement);
				if (result == null) result = caseAdapter(motivationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseMotivationElement(stakeholder);
				if (result == null) result = caseArchimateElement(stakeholder);
				if (result == null) result = caseArchimateComponent(stakeholder);
				if (result == null) result = caseArchimateModelElement(stakeholder);
				if (result == null) result = caseIdentifier(stakeholder);
				if (result == null) result = caseCloneable(stakeholder);
				if (result == null) result = caseNameable(stakeholder);
				if (result == null) result = caseDocumentable(stakeholder);
				if (result == null) result = caseProperties(stakeholder);
				if (result == null) result = caseAdapter(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DRIVER: {
				Driver driver = (Driver)theEObject;
				T result = caseDriver(driver);
				if (result == null) result = caseMotivationElement(driver);
				if (result == null) result = caseArchimateElement(driver);
				if (result == null) result = caseArchimateComponent(driver);
				if (result == null) result = caseArchimateModelElement(driver);
				if (result == null) result = caseIdentifier(driver);
				if (result == null) result = caseCloneable(driver);
				if (result == null) result = caseNameable(driver);
				if (result == null) result = caseDocumentable(driver);
				if (result == null) result = caseProperties(driver);
				if (result == null) result = caseAdapter(driver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ASSESSMENT: {
				Assessment assessment = (Assessment)theEObject;
				T result = caseAssessment(assessment);
				if (result == null) result = caseMotivationElement(assessment);
				if (result == null) result = caseArchimateElement(assessment);
				if (result == null) result = caseArchimateComponent(assessment);
				if (result == null) result = caseArchimateModelElement(assessment);
				if (result == null) result = caseIdentifier(assessment);
				if (result == null) result = caseCloneable(assessment);
				if (result == null) result = caseNameable(assessment);
				if (result == null) result = caseDocumentable(assessment);
				if (result == null) result = caseProperties(assessment);
				if (result == null) result = caseAdapter(assessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseMotivationElement(goal);
				if (result == null) result = caseArchimateElement(goal);
				if (result == null) result = caseArchimateComponent(goal);
				if (result == null) result = caseArchimateModelElement(goal);
				if (result == null) result = caseIdentifier(goal);
				if (result == null) result = caseCloneable(goal);
				if (result == null) result = caseNameable(goal);
				if (result == null) result = caseDocumentable(goal);
				if (result == null) result = caseProperties(goal);
				if (result == null) result = caseAdapter(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseMotivationElement(requirement);
				if (result == null) result = caseArchimateElement(requirement);
				if (result == null) result = caseArchimateComponent(requirement);
				if (result == null) result = caseArchimateModelElement(requirement);
				if (result == null) result = caseIdentifier(requirement);
				if (result == null) result = caseCloneable(requirement);
				if (result == null) result = caseNameable(requirement);
				if (result == null) result = caseDocumentable(requirement);
				if (result == null) result = caseProperties(requirement);
				if (result == null) result = caseAdapter(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseMotivationElement(constraint);
				if (result == null) result = caseArchimateElement(constraint);
				if (result == null) result = caseArchimateComponent(constraint);
				if (result == null) result = caseArchimateModelElement(constraint);
				if (result == null) result = caseIdentifier(constraint);
				if (result == null) result = caseCloneable(constraint);
				if (result == null) result = caseNameable(constraint);
				if (result == null) result = caseDocumentable(constraint);
				if (result == null) result = caseProperties(constraint);
				if (result == null) result = caseAdapter(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRINCIPLE: {
				Principle principle = (Principle)theEObject;
				T result = casePrinciple(principle);
				if (result == null) result = caseMotivationElement(principle);
				if (result == null) result = caseArchimateElement(principle);
				if (result == null) result = caseArchimateComponent(principle);
				if (result == null) result = caseArchimateModelElement(principle);
				if (result == null) result = caseIdentifier(principle);
				if (result == null) result = caseCloneable(principle);
				if (result == null) result = caseNameable(principle);
				if (result == null) result = caseDocumentable(principle);
				if (result == null) result = caseProperties(principle);
				if (result == null) result = caseAdapter(principle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPLEMENTATION_MIGRATION_ELEMENT: {
				ImplementationMigrationElement implementationMigrationElement = (ImplementationMigrationElement)theEObject;
				T result = caseImplementationMigrationElement(implementationMigrationElement);
				if (result == null) result = caseArchimateElement(implementationMigrationElement);
				if (result == null) result = caseArchimateComponent(implementationMigrationElement);
				if (result == null) result = caseArchimateModelElement(implementationMigrationElement);
				if (result == null) result = caseIdentifier(implementationMigrationElement);
				if (result == null) result = caseCloneable(implementationMigrationElement);
				if (result == null) result = caseNameable(implementationMigrationElement);
				if (result == null) result = caseDocumentable(implementationMigrationElement);
				if (result == null) result = caseProperties(implementationMigrationElement);
				if (result == null) result = caseAdapter(implementationMigrationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WORK_PACKAGE: {
				WorkPackage workPackage = (WorkPackage)theEObject;
				T result = caseWorkPackage(workPackage);
				if (result == null) result = caseImplementationMigrationElement(workPackage);
				if (result == null) result = caseArchimateElement(workPackage);
				if (result == null) result = caseArchimateComponent(workPackage);
				if (result == null) result = caseArchimateModelElement(workPackage);
				if (result == null) result = caseIdentifier(workPackage);
				if (result == null) result = caseCloneable(workPackage);
				if (result == null) result = caseNameable(workPackage);
				if (result == null) result = caseDocumentable(workPackage);
				if (result == null) result = caseProperties(workPackage);
				if (result == null) result = caseAdapter(workPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DELIVERABLE: {
				Deliverable deliverable = (Deliverable)theEObject;
				T result = caseDeliverable(deliverable);
				if (result == null) result = caseImplementationMigrationElement(deliverable);
				if (result == null) result = caseArchimateElement(deliverable);
				if (result == null) result = caseArchimateComponent(deliverable);
				if (result == null) result = caseArchimateModelElement(deliverable);
				if (result == null) result = caseIdentifier(deliverable);
				if (result == null) result = caseCloneable(deliverable);
				if (result == null) result = caseNameable(deliverable);
				if (result == null) result = caseDocumentable(deliverable);
				if (result == null) result = caseProperties(deliverable);
				if (result == null) result = caseAdapter(deliverable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PLATEAU: {
				Plateau plateau = (Plateau)theEObject;
				T result = casePlateau(plateau);
				if (result == null) result = caseImplementationMigrationElement(plateau);
				if (result == null) result = caseArchimateElement(plateau);
				if (result == null) result = caseArchimateComponent(plateau);
				if (result == null) result = caseArchimateModelElement(plateau);
				if (result == null) result = caseIdentifier(plateau);
				if (result == null) result = caseCloneable(plateau);
				if (result == null) result = caseNameable(plateau);
				if (result == null) result = caseDocumentable(plateau);
				if (result == null) result = caseProperties(plateau);
				if (result == null) result = caseAdapter(plateau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GAP: {
				Gap gap = (Gap)theEObject;
				T result = caseGap(gap);
				if (result == null) result = caseImplementationMigrationElement(gap);
				if (result == null) result = caseArchimateElement(gap);
				if (result == null) result = caseArchimateComponent(gap);
				if (result == null) result = caseArchimateModelElement(gap);
				if (result == null) result = caseIdentifier(gap);
				if (result == null) result = caseCloneable(gap);
				if (result == null) result = caseNameable(gap);
				if (result == null) result = caseDocumentable(gap);
				if (result == null) result = caseProperties(gap);
				if (result == null) result = caseAdapter(gap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseArchimateComponent(relationship);
				if (result == null) result = caseArchimateModelElement(relationship);
				if (result == null) result = caseIdentifier(relationship);
				if (result == null) result = caseCloneable(relationship);
				if (result == null) result = caseNameable(relationship);
				if (result == null) result = caseDocumentable(relationship);
				if (result == null) result = caseProperties(relationship);
				if (result == null) result = caseAdapter(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCESS_RELATIONSHIP: {
				AccessRelationship accessRelationship = (AccessRelationship)theEObject;
				T result = caseAccessRelationship(accessRelationship);
				if (result == null) result = caseRelationship(accessRelationship);
				if (result == null) result = caseArchimateComponent(accessRelationship);
				if (result == null) result = caseArchimateModelElement(accessRelationship);
				if (result == null) result = caseIdentifier(accessRelationship);
				if (result == null) result = caseCloneable(accessRelationship);
				if (result == null) result = caseNameable(accessRelationship);
				if (result == null) result = caseDocumentable(accessRelationship);
				if (result == null) result = caseProperties(accessRelationship);
				if (result == null) result = caseAdapter(accessRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AGGREGATION_RELATIONSHIP: {
				AggregationRelationship aggregationRelationship = (AggregationRelationship)theEObject;
				T result = caseAggregationRelationship(aggregationRelationship);
				if (result == null) result = caseRelationship(aggregationRelationship);
				if (result == null) result = caseArchimateComponent(aggregationRelationship);
				if (result == null) result = caseArchimateModelElement(aggregationRelationship);
				if (result == null) result = caseIdentifier(aggregationRelationship);
				if (result == null) result = caseCloneable(aggregationRelationship);
				if (result == null) result = caseNameable(aggregationRelationship);
				if (result == null) result = caseDocumentable(aggregationRelationship);
				if (result == null) result = caseProperties(aggregationRelationship);
				if (result == null) result = caseAdapter(aggregationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ASSIGNMENT_RELATIONSHIP: {
				AssignmentRelationship assignmentRelationship = (AssignmentRelationship)theEObject;
				T result = caseAssignmentRelationship(assignmentRelationship);
				if (result == null) result = caseRelationship(assignmentRelationship);
				if (result == null) result = caseArchimateComponent(assignmentRelationship);
				if (result == null) result = caseArchimateModelElement(assignmentRelationship);
				if (result == null) result = caseIdentifier(assignmentRelationship);
				if (result == null) result = caseCloneable(assignmentRelationship);
				if (result == null) result = caseNameable(assignmentRelationship);
				if (result == null) result = caseDocumentable(assignmentRelationship);
				if (result == null) result = caseProperties(assignmentRelationship);
				if (result == null) result = caseAdapter(assignmentRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ASSOCIATION_RELATIONSHIP: {
				AssociationRelationship associationRelationship = (AssociationRelationship)theEObject;
				T result = caseAssociationRelationship(associationRelationship);
				if (result == null) result = caseRelationship(associationRelationship);
				if (result == null) result = caseArchimateComponent(associationRelationship);
				if (result == null) result = caseArchimateModelElement(associationRelationship);
				if (result == null) result = caseIdentifier(associationRelationship);
				if (result == null) result = caseCloneable(associationRelationship);
				if (result == null) result = caseNameable(associationRelationship);
				if (result == null) result = caseDocumentable(associationRelationship);
				if (result == null) result = caseProperties(associationRelationship);
				if (result == null) result = caseAdapter(associationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPOSITION_RELATIONSHIP: {
				CompositionRelationship compositionRelationship = (CompositionRelationship)theEObject;
				T result = caseCompositionRelationship(compositionRelationship);
				if (result == null) result = caseRelationship(compositionRelationship);
				if (result == null) result = caseArchimateComponent(compositionRelationship);
				if (result == null) result = caseArchimateModelElement(compositionRelationship);
				if (result == null) result = caseIdentifier(compositionRelationship);
				if (result == null) result = caseCloneable(compositionRelationship);
				if (result == null) result = caseNameable(compositionRelationship);
				if (result == null) result = caseDocumentable(compositionRelationship);
				if (result == null) result = caseProperties(compositionRelationship);
				if (result == null) result = caseAdapter(compositionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FLOW_RELATIONSHIP: {
				FlowRelationship flowRelationship = (FlowRelationship)theEObject;
				T result = caseFlowRelationship(flowRelationship);
				if (result == null) result = caseRelationship(flowRelationship);
				if (result == null) result = caseArchimateComponent(flowRelationship);
				if (result == null) result = caseArchimateModelElement(flowRelationship);
				if (result == null) result = caseIdentifier(flowRelationship);
				if (result == null) result = caseCloneable(flowRelationship);
				if (result == null) result = caseNameable(flowRelationship);
				if (result == null) result = caseDocumentable(flowRelationship);
				if (result == null) result = caseProperties(flowRelationship);
				if (result == null) result = caseAdapter(flowRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REALISATION_RELATIONSHIP: {
				RealisationRelationship realisationRelationship = (RealisationRelationship)theEObject;
				T result = caseRealisationRelationship(realisationRelationship);
				if (result == null) result = caseRelationship(realisationRelationship);
				if (result == null) result = caseArchimateComponent(realisationRelationship);
				if (result == null) result = caseArchimateModelElement(realisationRelationship);
				if (result == null) result = caseIdentifier(realisationRelationship);
				if (result == null) result = caseCloneable(realisationRelationship);
				if (result == null) result = caseNameable(realisationRelationship);
				if (result == null) result = caseDocumentable(realisationRelationship);
				if (result == null) result = caseProperties(realisationRelationship);
				if (result == null) result = caseAdapter(realisationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPECIALISATION_RELATIONSHIP: {
				SpecialisationRelationship specialisationRelationship = (SpecialisationRelationship)theEObject;
				T result = caseSpecialisationRelationship(specialisationRelationship);
				if (result == null) result = caseRelationship(specialisationRelationship);
				if (result == null) result = caseArchimateComponent(specialisationRelationship);
				if (result == null) result = caseArchimateModelElement(specialisationRelationship);
				if (result == null) result = caseIdentifier(specialisationRelationship);
				if (result == null) result = caseCloneable(specialisationRelationship);
				if (result == null) result = caseNameable(specialisationRelationship);
				if (result == null) result = caseDocumentable(specialisationRelationship);
				if (result == null) result = caseProperties(specialisationRelationship);
				if (result == null) result = caseAdapter(specialisationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRIGGERING_RELATIONSHIP: {
				TriggeringRelationship triggeringRelationship = (TriggeringRelationship)theEObject;
				T result = caseTriggeringRelationship(triggeringRelationship);
				if (result == null) result = caseRelationship(triggeringRelationship);
				if (result == null) result = caseArchimateComponent(triggeringRelationship);
				if (result == null) result = caseArchimateModelElement(triggeringRelationship);
				if (result == null) result = caseIdentifier(triggeringRelationship);
				if (result == null) result = caseCloneable(triggeringRelationship);
				if (result == null) result = caseNameable(triggeringRelationship);
				if (result == null) result = caseDocumentable(triggeringRelationship);
				if (result == null) result = caseProperties(triggeringRelationship);
				if (result == null) result = caseAdapter(triggeringRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USED_BY_RELATIONSHIP: {
				UsedByRelationship usedByRelationship = (UsedByRelationship)theEObject;
				T result = caseUsedByRelationship(usedByRelationship);
				if (result == null) result = caseRelationship(usedByRelationship);
				if (result == null) result = caseArchimateComponent(usedByRelationship);
				if (result == null) result = caseArchimateModelElement(usedByRelationship);
				if (result == null) result = caseIdentifier(usedByRelationship);
				if (result == null) result = caseCloneable(usedByRelationship);
				if (result == null) result = caseNameable(usedByRelationship);
				if (result == null) result = caseDocumentable(usedByRelationship);
				if (result == null) result = caseProperties(usedByRelationship);
				if (result == null) result = caseAdapter(usedByRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INFLUENCE_RELATIONSHIP: {
				InfluenceRelationship influenceRelationship = (InfluenceRelationship)theEObject;
				T result = caseInfluenceRelationship(influenceRelationship);
				if (result == null) result = caseRelationship(influenceRelationship);
				if (result == null) result = caseArchimateComponent(influenceRelationship);
				if (result == null) result = caseArchimateModelElement(influenceRelationship);
				if (result == null) result = caseIdentifier(influenceRelationship);
				if (result == null) result = caseCloneable(influenceRelationship);
				if (result == null) result = caseNameable(influenceRelationship);
				if (result == null) result = caseDocumentable(influenceRelationship);
				if (result == null) result = caseProperties(influenceRelationship);
				if (result == null) result = caseAdapter(influenceRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_COMPONENT: {
				DiagramModelComponent diagramModelComponent = (DiagramModelComponent)theEObject;
				T result = caseDiagramModelComponent(diagramModelComponent);
				if (result == null) result = caseIdentifier(diagramModelComponent);
				if (result == null) result = caseCloneable(diagramModelComponent);
				if (result == null) result = caseAdapter(diagramModelComponent);
				if (result == null) result = caseNameable(diagramModelComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_CONTAINER: {
				DiagramModelContainer diagramModelContainer = (DiagramModelContainer)theEObject;
				T result = caseDiagramModelContainer(diagramModelContainer);
				if (result == null) result = caseDiagramModelComponent(diagramModelContainer);
				if (result == null) result = caseIdentifier(diagramModelContainer);
				if (result == null) result = caseCloneable(diagramModelContainer);
				if (result == null) result = caseAdapter(diagramModelContainer);
				if (result == null) result = caseNameable(diagramModelContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL: {
				DiagramModel diagramModel = (DiagramModel)theEObject;
				T result = caseDiagramModel(diagramModel);
				if (result == null) result = caseArchimateModelElement(diagramModel);
				if (result == null) result = caseDiagramModelContainer(diagramModel);
				if (result == null) result = caseDocumentable(diagramModel);
				if (result == null) result = caseProperties(diagramModel);
				if (result == null) result = caseDiagramModelComponent(diagramModel);
				if (result == null) result = caseAdapter(diagramModel);
				if (result == null) result = caseIdentifier(diagramModel);
				if (result == null) result = caseCloneable(diagramModel);
				if (result == null) result = caseNameable(diagramModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_REFERENCE: {
				DiagramModelReference diagramModelReference = (DiagramModelReference)theEObject;
				T result = caseDiagramModelReference(diagramModelReference);
				if (result == null) result = caseDiagramModelObject(diagramModelReference);
				if (result == null) result = caseDiagramModelComponent(diagramModelReference);
				if (result == null) result = caseFontAttribute(diagramModelReference);
				if (result == null) result = caseLineObject(diagramModelReference);
				if (result == null) result = caseTextAlignment(diagramModelReference);
				if (result == null) result = caseIdentifier(diagramModelReference);
				if (result == null) result = caseCloneable(diagramModelReference);
				if (result == null) result = caseAdapter(diagramModelReference);
				if (result == null) result = caseNameable(diagramModelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_OBJECT: {
				DiagramModelObject diagramModelObject = (DiagramModelObject)theEObject;
				T result = caseDiagramModelObject(diagramModelObject);
				if (result == null) result = caseDiagramModelComponent(diagramModelObject);
				if (result == null) result = caseFontAttribute(diagramModelObject);
				if (result == null) result = caseLineObject(diagramModelObject);
				if (result == null) result = caseTextAlignment(diagramModelObject);
				if (result == null) result = caseIdentifier(diagramModelObject);
				if (result == null) result = caseCloneable(diagramModelObject);
				if (result == null) result = caseAdapter(diagramModelObject);
				if (result == null) result = caseNameable(diagramModelObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_GROUP: {
				DiagramModelGroup diagramModelGroup = (DiagramModelGroup)theEObject;
				T result = caseDiagramModelGroup(diagramModelGroup);
				if (result == null) result = caseDiagramModelObject(diagramModelGroup);
				if (result == null) result = caseDiagramModelContainer(diagramModelGroup);
				if (result == null) result = caseDocumentable(diagramModelGroup);
				if (result == null) result = caseProperties(diagramModelGroup);
				if (result == null) result = caseDiagramModelComponent(diagramModelGroup);
				if (result == null) result = caseFontAttribute(diagramModelGroup);
				if (result == null) result = caseLineObject(diagramModelGroup);
				if (result == null) result = caseTextAlignment(diagramModelGroup);
				if (result == null) result = caseIdentifier(diagramModelGroup);
				if (result == null) result = caseCloneable(diagramModelGroup);
				if (result == null) result = caseAdapter(diagramModelGroup);
				if (result == null) result = caseNameable(diagramModelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_NOTE: {
				DiagramModelNote diagramModelNote = (DiagramModelNote)theEObject;
				T result = caseDiagramModelNote(diagramModelNote);
				if (result == null) result = caseDiagramModelObject(diagramModelNote);
				if (result == null) result = caseTextContent(diagramModelNote);
				if (result == null) result = caseDiagramModelComponent(diagramModelNote);
				if (result == null) result = caseFontAttribute(diagramModelNote);
				if (result == null) result = caseLineObject(diagramModelNote);
				if (result == null) result = caseTextAlignment(diagramModelNote);
				if (result == null) result = caseIdentifier(diagramModelNote);
				if (result == null) result = caseCloneable(diagramModelNote);
				if (result == null) result = caseAdapter(diagramModelNote);
				if (result == null) result = caseNameable(diagramModelNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_IMAGE: {
				DiagramModelImage diagramModelImage = (DiagramModelImage)theEObject;
				T result = caseDiagramModelImage(diagramModelImage);
				if (result == null) result = caseDiagramModelObject(diagramModelImage);
				if (result == null) result = caseBorderObject(diagramModelImage);
				if (result == null) result = caseDiagramModelImageProvider(diagramModelImage);
				if (result == null) result = caseDiagramModelComponent(diagramModelImage);
				if (result == null) result = caseFontAttribute(diagramModelImage);
				if (result == null) result = caseLineObject(diagramModelImage);
				if (result == null) result = caseTextAlignment(diagramModelImage);
				if (result == null) result = caseIdentifier(diagramModelImage);
				if (result == null) result = caseCloneable(diagramModelImage);
				if (result == null) result = caseAdapter(diagramModelImage);
				if (result == null) result = caseNameable(diagramModelImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_CONNECTION: {
				DiagramModelConnection diagramModelConnection = (DiagramModelConnection)theEObject;
				T result = caseDiagramModelConnection(diagramModelConnection);
				if (result == null) result = caseDiagramModelComponent(diagramModelConnection);
				if (result == null) result = caseFontAttribute(diagramModelConnection);
				if (result == null) result = caseProperties(diagramModelConnection);
				if (result == null) result = caseDocumentable(diagramModelConnection);
				if (result == null) result = caseLineObject(diagramModelConnection);
				if (result == null) result = caseIdentifier(diagramModelConnection);
				if (result == null) result = caseCloneable(diagramModelConnection);
				if (result == null) result = caseAdapter(diagramModelConnection);
				if (result == null) result = caseNameable(diagramModelConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_BENDPOINT: {
				DiagramModelBendpoint diagramModelBendpoint = (DiagramModelBendpoint)theEObject;
				T result = caseDiagramModelBendpoint(diagramModelBendpoint);
				if (result == null) result = caseCloneable(diagramModelBendpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LINE_OBJECT: {
				LineObject lineObject = (LineObject)theEObject;
				T result = caseLineObject(lineObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FONT_ATTRIBUTE: {
				FontAttribute fontAttribute = (FontAttribute)theEObject;
				T result = caseFontAttribute(fontAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_POSITION: {
				TextPosition textPosition = (TextPosition)theEObject;
				T result = caseTextPosition(textPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEXT_ALIGNMENT: {
				TextAlignment textAlignment = (TextAlignment)theEObject;
				T result = caseTextAlignment(textAlignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BORDER_OBJECT: {
				BorderObject borderObject = (BorderObject)theEObject;
				T result = caseBorderObject(borderObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_IMAGE_PROVIDER: {
				DiagramModelImageProvider diagramModelImageProvider = (DiagramModelImageProvider)theEObject;
				T result = caseDiagramModelImageProvider(diagramModelImageProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOUNDS: {
				Bounds bounds = (Bounds)theEObject;
				T result = caseBounds(bounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCKABLE: {
				Lockable lockable = (Lockable)theEObject;
				T result = caseLockable(lockable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARCHIMATE_DIAGRAM_MODEL: {
				ArchimateDiagramModel archimateDiagramModel = (ArchimateDiagramModel)theEObject;
				T result = caseArchimateDiagramModel(archimateDiagramModel);
				if (result == null) result = caseDiagramModel(archimateDiagramModel);
				if (result == null) result = caseArchimateModelElement(archimateDiagramModel);
				if (result == null) result = caseDiagramModelContainer(archimateDiagramModel);
				if (result == null) result = caseDocumentable(archimateDiagramModel);
				if (result == null) result = caseProperties(archimateDiagramModel);
				if (result == null) result = caseDiagramModelComponent(archimateDiagramModel);
				if (result == null) result = caseAdapter(archimateDiagramModel);
				if (result == null) result = caseIdentifier(archimateDiagramModel);
				if (result == null) result = caseCloneable(archimateDiagramModel);
				if (result == null) result = caseNameable(archimateDiagramModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: {
				DiagramModelArchimateObject diagramModelArchimateObject = (DiagramModelArchimateObject)theEObject;
				T result = caseDiagramModelArchimateObject(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelObject(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelContainer(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelComponent(diagramModelArchimateObject);
				if (result == null) result = caseFontAttribute(diagramModelArchimateObject);
				if (result == null) result = caseLineObject(diagramModelArchimateObject);
				if (result == null) result = caseTextAlignment(diagramModelArchimateObject);
				if (result == null) result = caseIdentifier(diagramModelArchimateObject);
				if (result == null) result = caseCloneable(diagramModelArchimateObject);
				if (result == null) result = caseAdapter(diagramModelArchimateObject);
				if (result == null) result = caseNameable(diagramModelArchimateObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: {
				DiagramModelArchimateConnection diagramModelArchimateConnection = (DiagramModelArchimateConnection)theEObject;
				T result = caseDiagramModelArchimateConnection(diagramModelArchimateConnection);
				if (result == null) result = caseDiagramModelConnection(diagramModelArchimateConnection);
				if (result == null) result = caseDiagramModelComponent(diagramModelArchimateConnection);
				if (result == null) result = caseFontAttribute(diagramModelArchimateConnection);
				if (result == null) result = caseProperties(diagramModelArchimateConnection);
				if (result == null) result = caseDocumentable(diagramModelArchimateConnection);
				if (result == null) result = caseLineObject(diagramModelArchimateConnection);
				if (result == null) result = caseIdentifier(diagramModelArchimateConnection);
				if (result == null) result = caseCloneable(diagramModelArchimateConnection);
				if (result == null) result = caseAdapter(diagramModelArchimateConnection);
				if (result == null) result = caseNameable(diagramModelArchimateConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SKETCH_MODEL: {
				SketchModel sketchModel = (SketchModel)theEObject;
				T result = caseSketchModel(sketchModel);
				if (result == null) result = caseDiagramModel(sketchModel);
				if (result == null) result = caseArchimateModelElement(sketchModel);
				if (result == null) result = caseDiagramModelContainer(sketchModel);
				if (result == null) result = caseDocumentable(sketchModel);
				if (result == null) result = caseProperties(sketchModel);
				if (result == null) result = caseDiagramModelComponent(sketchModel);
				if (result == null) result = caseAdapter(sketchModel);
				if (result == null) result = caseIdentifier(sketchModel);
				if (result == null) result = caseCloneable(sketchModel);
				if (result == null) result = caseNameable(sketchModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SKETCH_MODEL_STICKY: {
				SketchModelSticky sketchModelSticky = (SketchModelSticky)theEObject;
				T result = caseSketchModelSticky(sketchModelSticky);
				if (result == null) result = caseDiagramModelObject(sketchModelSticky);
				if (result == null) result = caseDiagramModelContainer(sketchModelSticky);
				if (result == null) result = caseTextContent(sketchModelSticky);
				if (result == null) result = caseProperties(sketchModelSticky);
				if (result == null) result = caseDiagramModelComponent(sketchModelSticky);
				if (result == null) result = caseFontAttribute(sketchModelSticky);
				if (result == null) result = caseLineObject(sketchModelSticky);
				if (result == null) result = caseTextAlignment(sketchModelSticky);
				if (result == null) result = caseIdentifier(sketchModelSticky);
				if (result == null) result = caseCloneable(sketchModelSticky);
				if (result == null) result = caseAdapter(sketchModelSticky);
				if (result == null) result = caseNameable(sketchModelSticky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SKETCH_MODEL_ACTOR: {
				SketchModelActor sketchModelActor = (SketchModelActor)theEObject;
				T result = caseSketchModelActor(sketchModelActor);
				if (result == null) result = caseDiagramModelObject(sketchModelActor);
				if (result == null) result = caseDocumentable(sketchModelActor);
				if (result == null) result = caseProperties(sketchModelActor);
				if (result == null) result = caseDiagramModelComponent(sketchModelActor);
				if (result == null) result = caseFontAttribute(sketchModelActor);
				if (result == null) result = caseLineObject(sketchModelActor);
				if (result == null) result = caseTextAlignment(sketchModelActor);
				if (result == null) result = caseIdentifier(sketchModelActor);
				if (result == null) result = caseCloneable(sketchModelActor);
				if (result == null) result = caseAdapter(sketchModelActor);
				if (result == null) result = caseNameable(sketchModelActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapter(Adapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContent(TextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentable(Documentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloneable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloneable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloneable(model.Cloneable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderContainer(FolderContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archimate Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archimate Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateModelElement(ArchimateModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archimate Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archimate Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateModel(ArchimateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archimate Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archimate Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateComponent(ArchimateComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archimate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archimate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateElement(ArchimateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunctionElement(JunctionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceElement(InterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceElement(ServiceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJunction(AndJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJunction(OrJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Layer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Layer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessLayerElement(BusinessLayerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessActivity(BusinessActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessActor(BusinessActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessCollaboration(BusinessCollaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessEvent(BusinessEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessFunction(BusinessFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessInteraction(BusinessInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessInterface(BusinessInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeaning(Meaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessObject(BusinessObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcess(BusinessProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRole(BusinessRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessService(BusinessService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Layer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Layer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLayerElement(ApplicationLayerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationCollaboration(ApplicationCollaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationComponent(ApplicationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationFunction(ApplicationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationInteraction(ApplicationInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationInterface(ApplicationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationService(ApplicationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Layer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Layer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyLayerElement(TechnologyLayerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPath(CommunicationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureInterface(InfrastructureInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureService(InfrastructureService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureFunction(InfrastructureFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSoftware(SystemSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivationElement(MotivationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriver(Driver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessment(Assessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrinciple(Principle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Migration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Migration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationMigrationElement(ImplementationMigrationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPackage(WorkPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deliverable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliverable(Deliverable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plateau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plateau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlateau(Plateau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGap(Gap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessRelationship(AccessRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationRelationship(AggregationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentRelationship(AssignmentRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRelationship(AssociationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRelationship(CompositionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowRelationship(FlowRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realisation Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealisationRelationship(RealisationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialisation Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialisationRelationship(SpecialisationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triggering Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triggering Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggeringRelationship(TriggeringRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Used By Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Used By Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsedByRelationship(UsedByRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenceRelationship(InfluenceRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelComponent(DiagramModelComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelContainer(DiagramModelContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModel(DiagramModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelReference(DiagramModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelObject(DiagramModelObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelGroup(DiagramModelGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelNote(DiagramModelNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelImage(DiagramModelImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelConnection(DiagramModelConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Bendpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelBendpoint(DiagramModelBendpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineObject(LineObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontAttribute(FontAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPosition(TextPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Alignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Alignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAlignment(TextAlignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderObject(BorderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Image Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Image Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelImageProvider(DiagramModelImageProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBounds(Bounds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lockable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lockable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockable(Lockable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archimate Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archimate Diagram Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateDiagramModel(ArchimateDiagramModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Archimate Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Archimate Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelArchimateObject(DiagramModelArchimateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Archimate Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Archimate Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelArchimateConnection(DiagramModelArchimateConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModel(SketchModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model Sticky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model Sticky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModelSticky(SketchModelSticky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModelActor(SketchModelActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
