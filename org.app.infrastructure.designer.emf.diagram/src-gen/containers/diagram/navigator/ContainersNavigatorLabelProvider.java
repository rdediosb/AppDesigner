package containers.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import containers.diagram.edit.parts.ApplicationEditPart;
import containers.diagram.edit.parts.ApplicationNameEditPart;
import containers.diagram.edit.parts.ComposeEditPart;
import containers.diagram.edit.parts.ServiceAppEditPart;
import containers.diagram.edit.parts.ServiceEditPart;
import containers.diagram.edit.parts.ServiceLinkEditPart;
import containers.diagram.edit.parts.ServiceNameEditPart;
import containers.diagram.part.ContainersDiagramEditorPlugin;
import containers.diagram.part.ContainersVisualIDRegistry;
import containers.diagram.providers.ContainersElementTypes;
import containers.diagram.providers.ContainersParserProvider;

/**
 * @generated
 */
public class ContainersNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ContainersDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ContainersDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ContainersNavigatorItem && !isOwnView(((ContainersNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ContainersNavigatorGroup) {
			ContainersNavigatorGroup group = (ContainersNavigatorGroup) element;
			return ContainersDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ContainersNavigatorItem) {
			ContainersNavigatorItem navigatorItem = (ContainersNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ComposeEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://github.com/rdediosb/AppDesigner?Compose", //$NON-NLS-1$
					ContainersElementTypes.Compose_1000);
		case ServiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/rdediosb/AppDesigner?Service", //$NON-NLS-1$
					ContainersElementTypes.Service_2001);
		case ApplicationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/rdediosb/AppDesigner?Application", //$NON-NLS-1$
					ContainersElementTypes.Application_2002);
		case ServiceLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/rdediosb/AppDesigner?Service?link", //$NON-NLS-1$
					ContainersElementTypes.ServiceLink_4001);
		case ServiceAppEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/rdediosb/AppDesigner?Service?app", //$NON-NLS-1$
					ContainersElementTypes.ServiceApp_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ContainersDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ContainersElementTypes.isKnownElementType(elementType)) {
			image = ContainersElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ContainersNavigatorGroup) {
			ContainersNavigatorGroup group = (ContainersNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ContainersNavigatorItem) {
			ContainersNavigatorItem navigatorItem = (ContainersNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ContainersVisualIDRegistry.getVisualID(view)) {
		case ComposeEditPart.VISUAL_ID:
			return getCompose_1000Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001Text(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_2002Text(view);
		case ServiceLinkEditPart.VISUAL_ID:
			return getServiceLink_4001Text(view);
		case ServiceAppEditPart.VISUAL_ID:
			return getServiceApp_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCompose_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getService_2001Text(View view) {
		IParser parser = ContainersParserProvider.getParser(ContainersElementTypes.Service_2001,
				view.getElement() != null ? view.getElement() : view,
				ContainersVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ContainersDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplication_2002Text(View view) {
		IParser parser = ContainersParserProvider.getParser(ContainersElementTypes.Application_2002,
				view.getElement() != null ? view.getElement() : view,
				ContainersVisualIDRegistry.getType(ApplicationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ContainersDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getServiceApp_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ComposeEditPart.MODEL_ID.equals(ContainersVisualIDRegistry.getModelID(view));
	}

}
