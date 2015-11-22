/**
 * Generated with Acceleo
 */
package containers.parts.forms;

// Start of user code for imports
import containers.parts.ContainersViewsRepository;
import containers.parts.PortMappingPropertiesEditionPart;

import containers.providers.ContainersMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class PortMappingPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, PortMappingPropertiesEditionPart {

	protected Text external;
	protected Text internal;



	/**
	 * For {@link ISection} use only.
	 */
	public PortMappingPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PortMappingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence portMappingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = portMappingStep.addStep(ContainersViewsRepository.PortMapping.Properties.class);
		propertiesStep.addStep(ContainersViewsRepository.PortMapping.Properties.external);
		propertiesStep.addStep(ContainersViewsRepository.PortMapping.Properties.internal);
		
		
		composer = new PartComposer(portMappingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContainersViewsRepository.PortMapping.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.PortMapping.Properties.external) {
					return createExternalText(widgetFactory, parent);
				}
				if (key == ContainersViewsRepository.PortMapping.Properties.internal) {
					return createInternalText(widgetFactory, parent);
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
		propertiesSection.setText(ContainersMessages.PortMappingPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createExternalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ContainersViewsRepository.PortMapping.Properties.external, ContainersMessages.PortMappingPropertiesEditionPart_ExternalLabel);
		external = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		external.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData externalData = new GridData(GridData.FILL_HORIZONTAL);
		external.setLayoutData(externalData);
		external.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortMappingPropertiesEditionPartForm.this,
							ContainersViewsRepository.PortMapping.Properties.external,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, external.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PortMappingPropertiesEditionPartForm.this,
									ContainersViewsRepository.PortMapping.Properties.external,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, external.getText()));
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
									PortMappingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		external.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortMappingPropertiesEditionPartForm.this, ContainersViewsRepository.PortMapping.Properties.external, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, external.getText()));
				}
			}
		});
		EditingUtils.setID(external, ContainersViewsRepository.PortMapping.Properties.external);
		EditingUtils.setEEFtype(external, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.PortMapping.Properties.external, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createExternalText

		// End of user code
		return parent;
	}

	
	protected Composite createInternalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ContainersViewsRepository.PortMapping.Properties.internal, ContainersMessages.PortMappingPropertiesEditionPart_InternalLabel);
		internal = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		internal.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData internalData = new GridData(GridData.FILL_HORIZONTAL);
		internal.setLayoutData(internalData);
		internal.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PortMappingPropertiesEditionPartForm.this,
							ContainersViewsRepository.PortMapping.Properties.internal,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internal.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PortMappingPropertiesEditionPartForm.this,
									ContainersViewsRepository.PortMapping.Properties.internal,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, internal.getText()));
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
									PortMappingPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		internal.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortMappingPropertiesEditionPartForm.this, ContainersViewsRepository.PortMapping.Properties.internal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internal.getText()));
				}
			}
		});
		EditingUtils.setID(internal, ContainersViewsRepository.PortMapping.Properties.internal);
		EditingUtils.setEEFtype(internal, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContainersViewsRepository.PortMapping.Properties.internal, ContainersViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInternalText

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
	 * @see containers.parts.PortMappingPropertiesEditionPart#getExternal()
	 * 
	 */
	public String getExternal() {
		return external.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.PortMappingPropertiesEditionPart#setExternal(String newValue)
	 * 
	 */
	public void setExternal(String newValue) {
		if (newValue != null) {
			external.setText(newValue);
		} else {
			external.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.PortMapping.Properties.external);
		if (eefElementEditorReadOnlyState && external.isEnabled()) {
			external.setEnabled(false);
			external.setToolTipText(ContainersMessages.PortMapping_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !external.isEnabled()) {
			external.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.PortMappingPropertiesEditionPart#getInternal()
	 * 
	 */
	public String getInternal() {
		return internal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see containers.parts.PortMappingPropertiesEditionPart#setInternal(String newValue)
	 * 
	 */
	public void setInternal(String newValue) {
		if (newValue != null) {
			internal.setText(newValue);
		} else {
			internal.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ContainersViewsRepository.PortMapping.Properties.internal);
		if (eefElementEditorReadOnlyState && internal.isEnabled()) {
			internal.setEnabled(false);
			internal.setToolTipText(ContainersMessages.PortMapping_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !internal.isEnabled()) {
			internal.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContainersMessages.PortMapping_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
