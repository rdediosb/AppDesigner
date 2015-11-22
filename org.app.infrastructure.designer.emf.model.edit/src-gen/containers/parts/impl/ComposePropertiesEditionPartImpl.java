/**
 * Generated with Acceleo
 */
package containers.parts.impl;

// Start of user code for imports
import containers.parts.ComposePropertiesEditionPart;
import containers.parts.ContainersViewsRepository;

import containers.providers.ContainersMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class ComposePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ComposePropertiesEditionPart {

	protected ReferencesTable services;
	protected List<ViewerFilter> servicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> servicesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ComposePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence composeStep = new BindingCompositionSequence(propertiesEditionComponent);
		composeStep
			.addStep(ContainersViewsRepository.Compose.Properties.class)
			.addStep(ContainersViewsRepository.Compose.Properties.services);
		
		
		composer = new PartComposer(composeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContainersViewsRepository.Compose.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ContainersViewsRepository.Compose.Properties.services) {
					return createServicesAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ContainersMessages.ComposePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createServicesAdvancedTableComposition(Composite parent) {
		this.services = new ReferencesTable(getDescription(ContainersViewsRepository.Compose.Properties.services, ContainersMessages.ComposePropertiesEditionPart_ServicesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComposePropertiesEditionPartImpl.this, ContainersViewsRepository.Compose.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				services.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComposePropertiesEditionPartImpl.this, ContainersViewsRepository.Compose.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				services.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComposePropertiesEditionPartImpl.this, ContainersViewsRepository.Compose.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				services.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComposePropertiesEditionPartImpl.this, ContainersViewsRepository.Compose.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				services.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.servicesFilters) {
			this.services.addFilter(filter);
		}
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Compose.Properties.services, ContainersViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComposePropertiesEditionPartImpl.this, ContainersViewsRepository.Compose.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.setLowerBound(0);
		this.services.setUpperBound(-1);
		services.setID(ContainersViewsRepository.Compose.Properties.services);
		services.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createServicesAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ComposePropertiesEditionPart#initServices(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		services.setContentProvider(contentProvider);
		services.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Compose.Properties.services);
		if (eefElementEditorReadOnlyState && services.isEnabled()) {
			services.setEnabled(false);
			services.setToolTipText(ContainersMessages.Compose_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !services.isEnabled()) {
			services.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ComposePropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ComposePropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
		if (this.services != null) {
			this.services.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ComposePropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ComposePropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContainersMessages.Compose_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
