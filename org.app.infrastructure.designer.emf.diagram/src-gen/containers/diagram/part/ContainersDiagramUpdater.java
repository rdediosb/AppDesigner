package containers.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import containers.Application;
import containers.Compose;
import containers.ContainersPackage;
import containers.Service;
import containers.diagram.edit.parts.ApplicationEditPart;
import containers.diagram.edit.parts.ComposeEditPart;
import containers.diagram.edit.parts.ServiceAppEditPart;
import containers.diagram.edit.parts.ServiceEditPart;
import containers.diagram.edit.parts.ServiceLinkEditPart;
import containers.diagram.providers.ContainersElementTypes;

/**
 * @generated
 */
public class ContainersDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ContainersNodeDescriptor> getSemanticChildren(View view) {
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ComposeEditPart.VISUAL_ID:
			return getCompose_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ContainersNodeDescriptor> getCompose_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Compose modelElement = (Compose) view.getElement();
		LinkedList<ContainersNodeDescriptor> result = new LinkedList<ContainersNodeDescriptor>();
		for (Iterator<?> it = modelElement.getServices().iterator(); it.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = ContainersVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
				result.add(new ContainersNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getApplications().iterator(); it.hasNext();) {
			Application childElement = (Application) it.next();
			int visualID = ContainersVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationEditPart.VISUAL_ID) {
				result.add(new ContainersNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ContainersLinkDescriptor> getContainedLinks(View view) {
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ComposeEditPart.VISUAL_ID:
			return getCompose_1000ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001ContainedLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ContainersLinkDescriptor> getIncomingLinks(View view) {
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2001IncomingLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ContainersLinkDescriptor> getOutgoingLinks(View view) {
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2001OutgoingLinks(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getCompose_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getService_2001ContainedLinks(View view) {
		Service modelElement = (Service) view.getElement();
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Service_Link_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Service_App_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getApplication_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getService_2001IncomingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Service_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getApplication_2002IncomingLinks(View view) {
		Application modelElement = (Application) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Service_App_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getService_2001OutgoingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Service_Link_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Service_App_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ContainersLinkDescriptor> getApplication_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ContainersLinkDescriptor> getIncomingFeatureModelFacetLinks_Service_Link_4001(
			Service target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContainersPackage.eINSTANCE.getService_Link()) {
				result.add(new ContainersLinkDescriptor(setting.getEObject(), target,
						ContainersElementTypes.ServiceLink_4001, ServiceLinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ContainersLinkDescriptor> getIncomingFeatureModelFacetLinks_Service_App_4002(
			Application target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContainersPackage.eINSTANCE.getService_App()) {
				result.add(new ContainersLinkDescriptor(setting.getEObject(), target,
						ContainersElementTypes.ServiceApp_4002, ServiceAppEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ContainersLinkDescriptor> getOutgoingFeatureModelFacetLinks_Service_Link_4001(
			Service source) {
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		Service destination = source.getLink();
		if (destination == null) {
			return result;
		}
		result.add(new ContainersLinkDescriptor(source, destination, ContainersElementTypes.ServiceLink_4001,
				ServiceLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ContainersLinkDescriptor> getOutgoingFeatureModelFacetLinks_Service_App_4002(
			Service source) {
		LinkedList<ContainersLinkDescriptor> result = new LinkedList<ContainersLinkDescriptor>();
		Application destination = source.getApp();
		if (destination == null) {
			return result;
		}
		result.add(new ContainersLinkDescriptor(source, destination, ContainersElementTypes.ServiceApp_4002,
				ServiceAppEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ContainersNodeDescriptor> getSemanticChildren(View view) {
			return ContainersDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ContainersLinkDescriptor> getContainedLinks(View view) {
			return ContainersDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ContainersLinkDescriptor> getIncomingLinks(View view) {
			return ContainersDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ContainersLinkDescriptor> getOutgoingLinks(View view) {
			return ContainersDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
