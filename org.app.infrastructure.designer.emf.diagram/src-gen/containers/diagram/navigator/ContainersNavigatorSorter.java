package containers.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import containers.diagram.part.ContainersVisualIDRegistry;

/**
 * @generated
 */
public class ContainersNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ContainersNavigatorItem) {
			ContainersNavigatorItem item = (ContainersNavigatorItem) element;
			return ContainersVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
