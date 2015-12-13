package org.app.infrastructure.designer.emf.diagram.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import containers.Service;

public class ContainerPropertyDialog extends TitleAreaDialog{

	protected Service service;
	protected String selection;
	
	public ContainerPropertyDialog(Shell parentShell, Service srv) {
		super(parentShell);
		service = srv;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
		createButton(parent, IDialogConstants.OK_ID, "Select", false);
	}
	
	public String getResult()
	{
		return this.selection;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(service.getName());
	}

	@Override
	protected Point getInitialSize() {
		return new Point(638, 455);
	}
}
