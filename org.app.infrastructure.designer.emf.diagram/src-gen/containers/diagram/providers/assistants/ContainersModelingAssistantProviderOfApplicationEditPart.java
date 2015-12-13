package containers.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import containers.diagram.edit.parts.ApplicationEditPart;
import containers.diagram.providers.ContainersElementTypes;
import containers.diagram.providers.ContainersModelingAssistantProvider;

/**
 * @generated
 */
public class ContainersModelingAssistantProviderOfApplicationEditPart extends ContainersModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ApplicationEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ApplicationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ContainersElementTypes.ServiceApp_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ApplicationEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ApplicationEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ContainersElementTypes.ServiceApp_4002) {
			types.add(ContainersElementTypes.Service_2001);
		}
		return types;
	}

}
