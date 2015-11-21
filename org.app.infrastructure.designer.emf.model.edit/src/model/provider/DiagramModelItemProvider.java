/**
 */
package model.provider;


import containers.provider.ContainersEditPlugin;

import java.util.Collection;
import java.util.List;

import model.DiagramModel;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link model.DiagramModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramModelItemProvider 
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
	public DiagramModelItemProvider(AdapterFactory adapterFactory) {
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
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDiagramModelPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addConnectionRouterTypePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Diagram Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramModelComponent_diagramModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramModelComponent_diagramModel_feature", "_UI_DiagramModelComponent_type"),
				 ModelPackage.Literals.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL,
				 false,
				 false,
				 false,
				 null,
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
	 * This adds a property descriptor for the Connection Router Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionRouterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramModel_connectionRouterType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramModel_connectionRouterType_feature", "_UI_DiagramModel_type"),
				 ModelPackage.Literals.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN);
			childrenFeatures.add(ModelPackage.Literals.PROPERTIES__PROPERTIES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiagramModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiagramModel_type") :
			getString("_UI_DiagramModel_type") + " " + label;
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

		switch (notification.getFeatureID(DiagramModel.class)) {
			case ModelPackage.DIAGRAM_MODEL__ID:
			case ModelPackage.DIAGRAM_MODEL__NAME:
			case ModelPackage.DIAGRAM_MODEL__DOCUMENTATION:
			case ModelPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.DIAGRAM_MODEL__CHILDREN:
			case ModelPackage.DIAGRAM_MODEL__PROPERTIES:
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
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createDiagramModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createDiagramModelGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createDiagramModelNote()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createDiagramModelImage()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createDiagramModelArchimateObject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createSketchModelSticky()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN,
				 ModelFactory.eINSTANCE.createSketchModelActor()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.PROPERTIES__PROPERTIES,
				 ModelFactory.eINSTANCE.createProperty()));
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
