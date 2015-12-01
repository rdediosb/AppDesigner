package org.app.infrastructure.designer.emf.diagram.dialogs;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import containers.Service;

public class DockerImageDialogCellEditor extends ExtendedDialogCellEditor {

	private Object eObject;
	
	public DockerImageDialogCellEditor(Composite composite, ILabelProvider labelProvider, Object object) {
		super(composite, labelProvider);
		eObject = object;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		ServicePropertiesDialog dialog = new ServicePropertiesDialog(cellEditorWindow.getShell(), (Service)eObject);

		dialog.open();

		return dialog.getResult();
	}

}
