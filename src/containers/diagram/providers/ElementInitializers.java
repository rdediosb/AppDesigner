package containers.diagram.providers;

import containers.diagram.part.ContainersDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ContainersDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ContainersDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
