
package containers.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import containers.diagram.providers.ContainersElementTypes;

/**
 * @generated
 */
public class ContainersPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createContainers1Group());
	}

	/**
	* Creates "containers" palette tool group
	* @generated
	*/
	private PaletteContainer createContainers1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Containers1Group_title);
		paletteContainer.setId("createContainers1Group"); //$NON-NLS-1$
		paletteContainer.add(createService1CreationTool());
		paletteContainer.add(createServiceLink2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createService1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Service1CreationTool_title,
				Messages.Service1CreationTool_desc, Collections.singletonList(ContainersElementTypes.Service_2001));
		entry.setId("createService1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContainersElementTypes.getImageDescriptor(ContainersElementTypes.Service_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServiceLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ServiceLink2CreationTool_title,
				Messages.ServiceLink2CreationTool_desc,
				Collections.singletonList(ContainersElementTypes.ServiceLink_4001));
		entry.setId("createServiceLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContainersElementTypes.getImageDescriptor(ContainersElementTypes.ServiceLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
