package containers.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import containers.diagram.edit.parts.ComposeEditPart;
import containers.diagram.edit.parts.ContainersEditPartFactory;
import containers.diagram.part.ContainersVisualIDRegistry;

/**
 * @generated
 */
public class ContainersEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ContainersEditPartProvider() {
		super(new ContainersEditPartFactory(), ContainersVisualIDRegistry.TYPED_INSTANCE, ComposeEditPart.MODEL_ID);
	}

}
