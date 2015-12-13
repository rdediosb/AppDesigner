package org.app.infrastructure.designer.emf.diagram.dialogs;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import containers.ContainersPackage;
import containers.Service;

public class DockerImageDialogCellEditor extends ExtendedDialogCellEditor {

	private Object eObject;
	
	private EStructuralFeature feature;
	
	private ContainerPropertyDialog dialog;
			
	public DockerImageDialogCellEditor(Composite composite, ILabelProvider labelProvider, Object object, EStructuralFeature sfeature) {
		super(composite, labelProvider);
		eObject = object;
		feature = sfeature;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		if(feature == ContainersPackage.Literals.SERVICE__IMAGE)
		{
			dialog = new ServiceImageDialog(cellEditorWindow.getShell(), (Service)eObject);
		}
		else if(feature == ContainersPackage.Literals.SERVICE__ENVS)
		{
			dialog = new ServiceEnvsDialog(cellEditorWindow.getShell(), (Service)eObject);
		}
		dialog.open();

		return dialog.getResult();
	}

}
