
package containers.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
		paletteContainer.add(createLink2CreationTool());
		paletteContainer.add(createApplication3CreationTool());
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
	private ToolEntry createLink2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ContainersElementTypes.ServiceLink_4001);
		types.add(ContainersElementTypes.ServiceApp_4002);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Link2CreationTool_title,
				Messages.Link2CreationTool_desc, types);
		entry.setId("createLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContainersDiagramEditorPlugin
				.findImageDescriptor("/org.app.infrastructure.designer.emf.model.edit/icons/full/obj16/Link.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createApplication3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Application3CreationTool_title,
				Messages.Application3CreationTool_desc,
				Collections.singletonList(ContainersElementTypes.Application_2002));
		entry.setId("createApplication3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ContainersDiagramEditorPlugin.findImageDescriptor(
				"/org.app.infrastructure.designer.emf.model.edit/icons/full/obj16/Application.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
