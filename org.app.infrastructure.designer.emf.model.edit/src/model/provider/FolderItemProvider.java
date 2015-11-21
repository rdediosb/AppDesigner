/**
 */
package model.provider;


import containers.ContainersFactory;

import containers.provider.ContainersEditPlugin;

import java.util.Collection;
import java.util.List;

import model.Folder;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.Folder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addArchimateModelPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Archimate Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchimateModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchimateModelElement_archimateModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchimateModelElement_archimateModel_feature", "_UI_ArchimateModelElement_type"),
				 ModelPackage.Literals.ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Nameable_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Nameable_name_feature", "_UI_Nameable_type"),
				 ModelPackage.Literals.NAMEABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identifier_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identifier_id_feature", "_UI_Identifier_type"),
				 ModelPackage.Literals.IDENTIFIER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documentable_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Documentable_documentation_feature", "_UI_Documentable_type"),
				 ModelPackage.Literals.DOCUMENTABLE__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Folder_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Folder_type_feature", "_UI_Folder_type"),
				 ModelPackage.Literals.FOLDER__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelPackage.Literals.FOLDER_CONTAINER__FOLDERS);
			childrenFeatures.add(ModelPackage.Literals.PROPERTIES__PROPERTIES);
			childrenFeatures.add(ModelPackage.Literals.FOLDER__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Folder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Folder"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Folder)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Folder_type") :
			getString("_UI_Folder_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Folder.class)) {
			case ModelPackage.FOLDER__NAME:
			case ModelPackage.FOLDER__ID:
			case ModelPackage.FOLDER__DOCUMENTATION:
			case ModelPackage.FOLDER__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.FOLDER__FOLDERS:
			case ModelPackage.FOLDER__PROPERTIES:
			case ModelPackage.FOLDER__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER_CONTAINER__FOLDERS,
				 ModelFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.PROPERTIES__PROPERTIES,
				 ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createArchimateModel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createJunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAndJunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createOrJunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessActor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createMeaning()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessObject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createRepresentation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessRole()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createApplicationService()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createInfrastructureInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createInfrastructureService()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createInfrastructureFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createSystemSoftware()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createPlateau()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createGap()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAccessRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAggregationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAssignmentRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createAssociationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createCompositionRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createFlowRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createRealisationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createSpecialisationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createTriggeringRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createUsedByRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createInfluenceRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelNote()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelImage()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelBendpoint()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createBounds()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createArchimateDiagramModel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelArchimateObject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createDiagramModelArchimateConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createSketchModel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createSketchModelSticky()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ModelFactory.eINSTANCE.createSketchModelActor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ContainersFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 ContainersFactory.eINSTANCE.createLinkRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.FOLDER__ELEMENTS,
				 XMLTypeFactory.eINSTANCE.createAnyType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModelPackage.Literals.FOLDER_CONTAINER__FOLDERS ||
			childFeature == ModelPackage.Literals.FOLDER__ELEMENTS ||
			childFeature == ModelPackage.Literals.PROPERTIES__PROPERTIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ContainersEditPlugin.INSTANCE;
	}

}
