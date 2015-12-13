package containers.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import containers.Compose;
import containers.ContainersPackage;
import containers.diagram.edit.parts.ApplicationEditPart;
import containers.diagram.edit.parts.ApplicationNameEditPart;
import containers.diagram.edit.parts.ComposeEditPart;
import containers.diagram.edit.parts.ServiceEditPart;
import containers.diagram.edit.parts.ServiceNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ContainersVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.app.infrastructure.designer.emf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComposeEditPart.MODEL_ID.equals(view.getType())) {
				return ComposeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return containers.diagram.part.ContainersVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ContainersDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ContainersPackage.eINSTANCE.getCompose().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Compose) domainElement)) {
			return ComposeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = containers.diagram.part.ContainersVisualIDRegistry.getModelID(containerView);
		if (!ComposeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComposeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = containers.diagram.part.ContainersVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComposeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComposeEditPart.VISUAL_ID:
			if (ContainersPackage.eINSTANCE.getService().isSuperTypeOf(domainElement.eClass())) {
				return ServiceEditPart.VISUAL_ID;
			}
			if (ContainersPackage.eINSTANCE.getApplication().isSuperTypeOf(domainElement.eClass())) {
				return ApplicationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = containers.diagram.part.ContainersVisualIDRegistry.getModelID(containerView);
		if (!ComposeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComposeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = containers.diagram.part.ContainersVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComposeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComposeEditPart.VISUAL_ID:
			if (ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceEditPart.VISUAL_ID:
			if (ServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationEditPart.VISUAL_ID:
			if (ApplicationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Compose element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComposeEditPart.VISUAL_ID:
			return false;
		case ServiceEditPart.VISUAL_ID:
		case ApplicationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return containers.diagram.part.ContainersVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return containers.diagram.part.ContainersVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return containers.diagram.part.ContainersVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return containers.diagram.part.ContainersVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return containers.diagram.part.ContainersVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return containers.diagram.part.ContainersVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
