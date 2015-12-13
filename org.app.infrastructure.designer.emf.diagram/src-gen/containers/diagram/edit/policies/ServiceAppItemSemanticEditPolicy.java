package containers.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import containers.diagram.providers.ContainersElementTypes;

/**
 * @generated
 */
public class ServiceAppItemSemanticEditPolicy extends ContainersBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServiceAppItemSemanticEditPolicy() {
		super(ContainersElementTypes.ServiceApp_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
