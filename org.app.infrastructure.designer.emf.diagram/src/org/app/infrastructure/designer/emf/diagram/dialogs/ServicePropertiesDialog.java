package org.app.infrastructure.designer.emf.diagram.dialogs;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.Configuration;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.glassfish.jersey.client.ClientConfig;

import containers.Service;

public class ServicePropertiesDialog extends Dialog{

	private Service service;
	
	public ServicePropertiesDialog(Shell parentShell, Service srv) {
		super(parentShell);
		service = srv;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		
		Button button = new Button(container, SWT.PUSH);
		
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
				false));
		button.setText(service.getName());
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ClientConfig config = new ClientConfig();
			    Client client = ClientBuilder.newClient(config);
			    
			    URI uri = UriBuilder.fromUri("https://registry.hub.docker.com").build();
			    
			    WebTarget target = client.target(uri);
			    
			    String plainAnswer = target.path("v1").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			    
				System.out.println(plainAnswer);
			}
		});
		
		return parent;	
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Save", true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(service.getName());
	}

//	  @Override
//	  protected Point getInitialSize() {
//	    return new Point(450, 300);
//	  }
}