/**
 * Generated with Acceleo
 */
package containers.parts.forms;

// Start of user code for imports
import containers.parts.ContainersViewsRepository;
import containers.parts.ServicePropertiesEditionPart;

import containers.providers.ContainersMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class ServicePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ServicePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer link;
	protected Text image;
	protected ReferencesTable envs;
	protected List<ViewerFilter> envsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> envsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable volumes;
	protected List<ViewerFilter> volumesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> volumesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ports;
	protected List<ViewerFilter> portsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portsFilters = new ArrayList<ViewerFilter>();
	protected Text command;



	/**
	 * For {@link ISection} use only.
	 */
	public ServicePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ServicePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence serviceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = serviceStep.addStep(ContainersViewsRepository.Service.Properties.class);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.name);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.link);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.image);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.envs);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.volumes);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.ports);
		propertiesStep.addStep(ContainersViewsRepository.Service.Properties.command);
		
		
		composer = new PartComposer(serviceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContainersViewsRepository.Service.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.link) {
					return createLinkFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContainersViewsRepository.Service.Properties.image) {
					return createImageText(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.envs) {
					return createEnvsTableComposition(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.volumes) {
					return createVolumesReferencesTable(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.ports) {
					return createPortsTableComposition(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.Service.Properties.command) {
					return createCommandText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ContainersMessages.ServicePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ContainersViewsRepository.Service.Properties.name, ContainersMessages.ServicePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServicePropertiesEditionPartForm.this,
							ContainersViewsRepository.Service.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									ContainersViewsRepository.Service.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContainersViewsRepository.Service.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.name, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createLinkFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ContainersViewsRepository.Service.Properties.link, ContainersMessages.ServicePropertiesEditionPart_LinkLabel);
		link = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContainersViewsRepository.Service.Properties.link, ContainersViewsRepository.FORM_KIND));
		widgetFactory.adapt(link);
		link.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData linkData = new GridData(GridData.FILL_HORIZONTAL);
		link.setLayoutData(linkData);
		link.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.link, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLink()));
			}

		});
		link.setID(ContainersViewsRepository.Service.Properties.link);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.link, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLinkFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createImageText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ContainersViewsRepository.Service.Properties.image, ContainersMessages.ServicePropertiesEditionPart_ImageLabel);
		image = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		image.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData imageData = new GridData(GridData.FILL_HORIZONTAL);
		image.setLayoutData(imageData);
		image.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServicePropertiesEditionPartForm.this,
							ContainersViewsRepository.Service.Properties.image,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, image.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									ContainersViewsRepository.Service.Properties.image,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, image.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		image.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.image, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, image.getText()));
				}
			}
		});
		EditingUtils.setID(image, ContainersViewsRepository.Service.Properties.image);
		EditingUtils.setEEFtype(image, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.image, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createImageText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEnvsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.envs = new ReferencesTable(getDescription(ContainersViewsRepository.Service.Properties.envs, ContainersMessages.ServicePropertiesEditionPart_EnvsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.envs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				envs.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.envs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				envs.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.envs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				envs.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.envs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				envs.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.envsFilters) {
			this.envs.addFilter(filter);
		}
		this.envs.setHelpText(propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.envs, ContainersViewsRepository.FORM_KIND));
		this.envs.createControls(parent, widgetFactory);
		this.envs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.envs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData envsData = new GridData(GridData.FILL_HORIZONTAL);
		envsData.horizontalSpan = 3;
		this.envs.setLayoutData(envsData);
		this.envs.setLowerBound(0);
		this.envs.setUpperBound(-1);
		envs.setID(ContainersViewsRepository.Service.Properties.envs);
		envs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEnvsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createVolumesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.volumes = new ReferencesTable(getDescription(ContainersViewsRepository.Service.Properties.volumes, ContainersMessages.ServicePropertiesEditionPart_VolumesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addVolumes(); }
			public void handleEdit(EObject element) { editVolumes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveVolumes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromVolumes(element); }
			public void navigateTo(EObject element) { }
		});
		this.volumes.setHelpText(propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.volumes, ContainersViewsRepository.FORM_KIND));
		this.volumes.createControls(parent, widgetFactory);
		this.volumes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.volumes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData volumesData = new GridData(GridData.FILL_HORIZONTAL);
		volumesData.horizontalSpan = 3;
		this.volumes.setLayoutData(volumesData);
		this.volumes.disableMove();
		volumes.setID(ContainersViewsRepository.Service.Properties.volumes);
		volumes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createVolumesReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addVolumes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(volumes.getInput(), volumesFilters, volumesBusinessFilters,
		"volumes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.volumes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				volumes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveVolumes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.volumes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		volumes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromVolumes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.volumes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		volumes.refresh();
	}

	/**
	 * 
	 */
	protected void editVolumes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				volumes.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ports = new ReferencesTable(getDescription(ContainersViewsRepository.Service.Properties.ports, ContainersMessages.ServicePropertiesEditionPart_PortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ports.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.portsFilters) {
			this.ports.addFilter(filter);
		}
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.ports, ContainersViewsRepository.FORM_KIND));
		this.ports.createControls(parent, widgetFactory);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portsData = new GridData(GridData.FILL_HORIZONTAL);
		portsData.horizontalSpan = 3;
		this.ports.setLayoutData(portsData);
		this.ports.setLowerBound(0);
		this.ports.setUpperBound(-1);
		ports.setID(ContainersViewsRepository.Service.Properties.ports);
		ports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPortsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCommandText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ContainersViewsRepository.Service.Properties.command, ContainersMessages.ServicePropertiesEditionPart_CommandLabel);
		command = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		command.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commandData = new GridData(GridData.FILL_HORIZONTAL);
		command.setLayoutData(commandData);
		command.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ServicePropertiesEditionPartForm.this,
							ContainersViewsRepository.Service.Properties.command,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, command.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									ContainersViewsRepository.Service.Properties.command,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, command.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		command.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ServicePropertiesEditionPartForm.this, ContainersViewsRepository.Service.Properties.command, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, command.getText()));
				}
			}
		});
		EditingUtils.setID(command, ContainersViewsRepository.Service.Properties.command);
		EditingUtils.setEEFtype(command, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.Service.Properties.command, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommandText

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
	 * @see containers.parts.ServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#getLink()
	 * 
	 */
	public EObject getLink() {
		if (link.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) link.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#initLink(EObjectFlatComboSettings)
	 */
	public void initLink(EObjectFlatComboSettings settings) {
		link.setInput(settings);
		if (current != null) {
			link.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.link);
		if (eefElementEditorReadOnlyState && link.isEnabled()) {
			link.setEnabled(false);
			link.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !link.isEnabled()) {
			link.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#setLink(EObject newValue)
	 * 
	 */
	public void setLink(EObject newValue) {
		if (newValue != null) {
			link.setSelection(new StructuredSelection(newValue));
		} else {
			link.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.link);
		if (eefElementEditorReadOnlyState && link.isEnabled()) {
			link.setEnabled(false);
			link.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !link.isEnabled()) {
			link.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#setLinkButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLinkButtonMode(ButtonsModeEnum newValue) {
		link.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addFilterLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLink(ViewerFilter filter) {
		link.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addBusinessFilterLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLink(ViewerFilter filter) {
		link.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#getImage()
	 * 
	 */
	public String getImage() {
		return image.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#setImage(String newValue)
	 * 
	 */
	public void setImage(String newValue) {
		if (newValue != null) {
			image.setText(newValue);
		} else {
			image.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.image);
		if (eefElementEditorReadOnlyState && image.isEnabled()) {
			image.setEnabled(false);
			image.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !image.isEnabled()) {
			image.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#initEnvs(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEnvs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		envs.setContentProvider(contentProvider);
		envs.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.envs);
		if (eefElementEditorReadOnlyState && envs.isEnabled()) {
			envs.setEnabled(false);
			envs.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !envs.isEnabled()) {
			envs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#updateEnvs()
	 * 
	 */
	public void updateEnvs() {
	envs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addFilterEnvs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEnvs(ViewerFilter filter) {
		envsFilters.add(filter);
		if (this.envs != null) {
			this.envs.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addBusinessFilterEnvs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEnvs(ViewerFilter filter) {
		envsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#isContainedInEnvsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEnvsTable(EObject element) {
		return ((ReferencesTableSettings)envs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#initVolumes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initVolumes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		volumes.setContentProvider(contentProvider);
		volumes.setInput(settings);
		volumesBusinessFilters.clear();
		volumesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.volumes);
		if (eefElementEditorReadOnlyState && volumes.getTable().isEnabled()) {
			volumes.setEnabled(false);
			volumes.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !volumes.getTable().isEnabled()) {
			volumes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#updateVolumes()
	 * 
	 */
	public void updateVolumes() {
	volumes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addFilterVolumes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVolumes(ViewerFilter filter) {
		volumesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addBusinessFilterVolumes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVolumes(ViewerFilter filter) {
		volumesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#isContainedInVolumesTable(EObject element)
	 * 
	 */
	public boolean isContainedInVolumesTable(EObject element) {
		return ((ReferencesTableSettings)volumes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#initPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ports.setContentProvider(contentProvider);
		ports.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.ports);
		if (eefElementEditorReadOnlyState && ports.isEnabled()) {
			ports.setEnabled(false);
			ports.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ports.isEnabled()) {
			ports.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#updatePorts()
	 * 
	 */
	public void updatePorts() {
	ports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addFilterPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPorts(ViewerFilter filter) {
		portsFilters.add(filter);
		if (this.ports != null) {
			this.ports.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#addBusinessFilterPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter) {
		portsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#isContainedInPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPortsTable(EObject element) {
		return ((ReferencesTableSettings)ports.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#getCommand()
	 * 
	 */
	public String getCommand() {
		return command.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.ServicePropertiesEditionPart#setCommand(String newValue)
	 * 
	 */
	public void setCommand(String newValue) {
		if (newValue != null) {
			command.setText(newValue);
		} else {
			command.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.Service.Properties.command);
		if (eefElementEditorReadOnlyState && command.isEnabled()) {
			command.setEnabled(false);
			command.setToolTipText(ContainersMessages.Service_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !command.isEnabled()) {
			command.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContainersMessages.Service_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
