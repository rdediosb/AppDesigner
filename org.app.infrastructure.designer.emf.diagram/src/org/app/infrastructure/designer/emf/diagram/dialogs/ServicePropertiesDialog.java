package org.app.infrastructure.designer.emf.diagram.dialogs;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import containers.Service;
import containers.diagram.part.ContainersDiagramEditorPlugin;

public class ServicePropertiesDialog extends TitleAreaDialog{

	private Service service;
	private Text text;
	private Table table;
	private Button btnSearch;
	private String selection;
	  
	public ServicePropertiesDialog(Shell parentShell, Service srv) {
		super(parentShell);
		service = srv;
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		setTitleImage(ContainersDiagramEditorPlugin.getInstance().getBundledImage("/icons/docker.png"));
		
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
		text.setBounds(21, 15, 498, 19);
		
		table = new Table(grpServiceConfiguration, SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL);
		table.setBounds(21, 47, 573, 129);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn columnName = new TableColumn(table, SWT.LEFT);
		columnName.setWidth(140);
		columnName.setText("Name");
		
		TableColumn columnDescription = new TableColumn(table, SWT.LEFT);
		columnDescription.setWidth(357);
		columnDescription.setText("Description");
		
		TableColumn columnOfficial = new TableColumn(table, SWT.CENTER);
		columnOfficial.setWidth(30);
		columnOfficial.setImage(ContainersDiagramEditorPlugin.getInstance().getBundledImage("/icons/official.png"));
		
		TableColumn columnStars = new TableColumn(table, SWT.CENTER);
		columnStars.setWidth(35);
		columnStars.setImage(ContainersDiagramEditorPlugin.getInstance().getBundledImage("/icons/star.png"));
		
		table.addListener (SWT.Selection, new Listener () {
			@Override
			public void handleEvent (Event e) {
				TableItem [] selectedItem = table.getSelection();
				selection = selectedItem[0].getText(0);
			}
		});
		
		btnSearch = new Button(grpServiceConfiguration, SWT.NONE);
		btnSearch.setBounds(525, 11, 69, 28);
		btnSearch.setText("Search");

		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				ClientConfig config = new ClientConfig();
				Client client = ClientBuilder.newClient(config);

				URI uri = UriBuilder.fromUri("https://registry.hub.docker.com/v1").build();
				
				WebTarget target = client.target(uri);
				
				
				String plainAnswer = target.path("search").queryParam("q", text.getText()).request().accept(MediaType.TEXT_PLAIN).get(String.class);    
		        
				JSONObject obj = new JSONObject(plainAnswer);
				JSONArray arr = obj.getJSONArray("results");
				
				if(arr.length()>0)
				{
					table.clearAll();
				}
				
				for (int i = 0; i < arr.length(); i++)
				{
					JSONObject result = arr.getJSONObject(i);
					String name = result.getString("name");
					String description = result.getString("description");
					boolean official = result.getBoolean("is_official");
					int stars = result.getInt("star_count");
					
					TableItem item = new TableItem (table, SWT.NONE);
					item.setText (0, name);
					item.setText (1, description);
					if(official)
					{
						item.setText (2, "yes");
					}
					item.setText (3, String.valueOf(stars));

				}
			}
		});
		
		return area;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
		createButton(parent, IDialogConstants.OK_ID, "Select", false);
		parent.getShell().setDefaultButton(btnSearch);
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
		return new Point(638, 375);
	}
}
