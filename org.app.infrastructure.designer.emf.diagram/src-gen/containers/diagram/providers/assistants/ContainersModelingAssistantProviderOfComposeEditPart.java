package containers.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import containers.diagram.providers.ContainersElementTypes;
import containers.diagram.providers.ContainersModelingAssistantProvider;

/**
 * @generated
 */
public class ContainersModelingAssistantProviderOfComposeEditPart extends ContainersModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ContainersElementTypes.Service_2001);
		types.add(ContainersElementTypes.Application_2002);
		return types;
	}

}
