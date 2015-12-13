package containers.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import containers.ContainersPackage;
import containers.diagram.edit.parts.ApplicationEditPart;
import containers.diagram.edit.parts.ComposeEditPart;
import containers.diagram.edit.parts.ServiceEditPart;
import containers.diagram.edit.parts.ServiceLinkEditPart;
import containers.diagram.part.ContainersDiagramEditorPlugin;

/**
 * @generated
 */
public class ContainersElementTypes {

	/**
	* @generated
	*/
	private ContainersElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ContainersDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Compose_1000 = getElementType(
			"org.app.infrastructure.designer.emf.diagram.Compose_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Service_2001 = getElementType(
			"org.app.infrastructure.designer.emf.diagram.Service_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Application_2002 = getElementType(
			"org.app.infrastructure.designer.emf.diagram.Application_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ServiceLink_4001 = getElementType(
			"org.app.infrastructure.designer.emf.diagram.ServiceLink_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Compose_1000, ContainersPackage.eINSTANCE.getCompose());

			elements.put(Service_2001, ContainersPackage.eINSTANCE.getService());

			elements.put(Application_2002, ContainersPackage.eINSTANCE.getApplication());

			elements.put(ServiceLink_4001, ContainersPackage.eINSTANCE.getService_Link());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Compose_1000);
			KNOWN_ELEMENT_TYPES.add(Service_2001);
			KNOWN_ELEMENT_TYPES.add(Application_2002);
			KNOWN_ELEMENT_TYPES.add(ServiceLink_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComposeEditPart.VISUAL_ID:
			return Compose_1000;
		case ServiceEditPart.VISUAL_ID:
			return Service_2001;
		case ApplicationEditPart.VISUAL_ID:
			return Application_2002;
		case ServiceLinkEditPart.VISUAL_ID:
			return ServiceLink_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return containers.diagram.providers.ContainersElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return containers.diagram.providers.ContainersElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return containers.diagram.providers.ContainersElementTypes.getElement(elementTypeAdapter);
		}
	};

}
