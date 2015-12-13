package containers.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import containers.diagram.edit.commands.ApplicationCreateCommand;
import containers.diagram.edit.commands.ServiceCreateCommand;
import containers.diagram.providers.ContainersElementTypes;

/**
 * @generated
 */
public class ComposeItemSemanticEditPolicy extends ContainersBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComposeItemSemanticEditPolicy() {
		super(ContainersElementTypes.Compose_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ContainersElementTypes.Service_2001 == req.getElementType()) {
			return getGEFWrapper(new ServiceCreateCommand(req));
		}
		if (ContainersElementTypes.Application_2002 == req.getElementType()) {
			return getGEFWrapper(new ApplicationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
