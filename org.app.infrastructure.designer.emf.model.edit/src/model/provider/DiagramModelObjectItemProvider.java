/**
 */
package model.provider;


import java.util.Collection;
import java.util.List;

import model.DiagramModelObject;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.DiagramModelObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramModelObjectItemProvider extends DiagramModelComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelObjectItemProvider(AdapterFactory adapterFactory) {
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

			addFontPropertyDescriptor(object);
			addFontColorPropertyDescriptor(object);
			addLineWidthPropertyDescriptor(object);
			addLineColorPropertyDescriptor(object);
			addTextAlignmentPropertyDescriptor(object);
			addTargetConnectionsPropertyDescriptor(object);
			addFillColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FontAttribute_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FontAttribute_font_feature", "_UI_FontAttribute_type"),
				 ModelPackage.Literals.FONT_ATTRIBUTE__FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FontAttribute_fontColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FontAttribute_fontColor_feature", "_UI_FontAttribute_type"),
				 ModelPackage.Literals.FONT_ATTRIBUTE__FONT_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineObject_lineWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineObject_lineWidth_feature", "_UI_LineObject_type"),
				 ModelPackage.Literals.LINE_OBJECT__LINE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineObject_lineColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineObject_lineColor_feature", "_UI_LineObject_type"),
				 ModelPackage.Literals.LINE_OBJECT__LINE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextAlignment_textAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextAlignment_textAlignment_feature", "_UI_TextAlignment_type"),
				 ModelPackage.Literals.TEXT_ALIGNMENT__TEXT_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramModelObject_targetConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramModelObject_targetConnections_feature", "_UI_DiagramModelObject_type"),
				 ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramModelObject_fillColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramModelObject_fillColor_feature", "_UI_DiagramModelObject_type"),
				 ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__FILL_COLOR,
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
			childrenFeatures.add(ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__BOUNDS);
			childrenFeatures.add(ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS);
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
		String label = ((DiagramModelObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiagramModelObject_type") :
			getString("_UI_DiagramModelObject_type") + " " + label;
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

		switch (notification.getFeatureID(DiagramModelObject.class)) {
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
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
				(ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__BOUNDS,
				 ModelFactory.eINSTANCE.createBounds()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS,
				 ModelFactory.eINSTANCE.createDiagramModelConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS,
				 ModelFactory.eINSTANCE.createDiagramModelArchimateConnection()));
	}

}
