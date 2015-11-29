package org.app.infrastructure.designer.emf.diagram.dialogs;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.glassfish.jersey.client.ClientConfig;

import containers.Service;

public class ServicePropertiesDialog extends Dialog{

	private Service service;
	private Text text;
	private Table table;
	
	public ServicePropertiesDialog(Shell parentShell, Service srv) {
		super(parentShell);
		service = srv;
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		FillLayout fl_container = new FillLayout(SWT.HORIZONTAL);
		fl_container.marginHeight = 10;
		fl_container.marginWidth = 10;
		container.setLayout(fl_container);
		GridData gd_container = new GridData(GridData.FILL_BOTH);
		gd_container.grabExcessHorizontalSpace = false;
		container.setLayoutData(gd_container);
		
		Group grpServiceConfiguration = new Group(container, SWT.NONE);
		grpServiceConfiguration.setText("Select Docker Image");
		
		text = new Text(grpServiceConfiguration, SWT.BORDER);
		text.setBounds(57, 15, 244, 19);
		
		table = new Table(grpServiceConfiguration, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(21, 47, 385, 129);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnImage = new TableColumn(table, SWT.CENTER);
		tblclmnImage.setWidth(100);
		tblclmnImage.setText("Image");
		
		Button btnSearch = new Button(grpServiceConfiguration, SWT.NONE);
		btnSearch.setBounds(307, 11, 69, 28);
		btnSearch.setText("Search");

		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				ClientConfig config = new ClientConfig();
				Client client = ClientBuilder.newClient(config);

//				URI uri = UriBuilder.fromUri("https://registry.hub.docker.com/v1/search?q="+text.getText()).build();
				URI uri = UriBuilder.fromUri("https://registry.hub.docker.com/v1").build();
				
				WebTarget target = client.target(uri);
				
				Object plainAnswer = target.path("search").queryParam("q", text.getText()).request().accept(MediaType.TEXT_PLAIN).get(String.class);    
		        
				System.out.println(plainAnswer);
			}
		});
		
		return area;
		
//		Composite container = (Composite) super.createDialogArea(parent);
//
//		Button button = new Button(container, SWT.PUSH);
//
//		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
//				false));
//		button.setText(service.getName());
//		button.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//
//				ClientConfig config = new ClientConfig();
//				Client client = ClientBuilder.newClient(config);
//
//				URI uri = UriBuilder.fromUri("https://registry.hub.docker.com").build();
//
//				WebTarget target = client.target(uri);
//
//				String plainAnswer = target.path("v1").request().accept(MediaType.TEXT_PLAIN).get(String.class);
//
//				System.out.println("");
//			}
//		});
//
//		return parent;	
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Save", true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(service.getName());
	}

	@Override
	protected Point getInitialSize() {
		return new Point(450, 375);
	}
}
