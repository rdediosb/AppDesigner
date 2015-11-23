/**
 * Generated with Acceleo
 */
package containers.components;

// Start of user code for imports
import containers.ContainersFactory;
import containers.ContainersPackage;
import containers.Env;
import containers.PortMapping;
import containers.Service;
import containers.Volume;

import containers.parts.ContainersViewsRepository;
import containers.parts.ServicePropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for envs ReferencesTable
	 */
	protected ReferencesTableSettings envsSettings;
	
	/**
	 * Settings for volumes ReferencesTable
	 */
	private ReferencesTableSettings volumesSettings;
	
	/**
	 * Settings for ports ReferencesTable
	 */
	protected ReferencesTableSettings portsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject service, String editing_mode) {
		super(editingContext, service, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContainersViewsRepository.class;
		partKey = ContainersViewsRepository.Service.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Service service = (Service)elt;
			final ServicePropertiesEditionPart basePart = (ServicePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContainersViewsRepository.Service.image))
				basePart.setImage(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, service.getImage()));
			
			if (isAccessible(ContainersViewsRepository.Service.envs)) {
				envsSettings = new ReferencesTableSettings(service, ContainersPackage.eINSTANCE.getService_Envs());
				basePart.initEnvs(envsSettings);
			}
			if (isAccessible(ContainersViewsRepository.Service.volumes)) {
				volumesSettings = new ReferencesTableSettings(service, ContainersPackage.eINSTANCE.getService_Volumes());
				basePart.initVolumes(volumesSettings);
			}
			if (isAccessible(ContainersViewsRepository.Service.ports)) {
				portsSettings = new ReferencesTableSettings(service, ContainersPackage.eINSTANCE.getService_Ports());
				basePart.initPorts(portsSettings);
			}
			if (isAccessible(ContainersViewsRepository.Service.command))
				basePart.setCommand(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, service.getCommand()));
			
			// init filters
			
			if (isAccessible(ContainersViewsRepository.Service.envs)) {
				basePart.addFilterToEnvs(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Env); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for envs
				// End of user code
			}
			if (isAccessible(ContainersViewsRepository.Service.volumes)) {
				basePart.addFilterToVolumes(new EObjectFilter(ContainersPackage.Literals.VOLUME));
				// Start of user code for additional businessfilters for volumes
				// End of user code
			}
			if (isAccessible(ContainersViewsRepository.Service.ports)) {
				basePart.addFilterToPorts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof PortMapping); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ports
				// End of user code
			}
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ContainersViewsRepository.Service.image) {
			return ContainersPackage.eINSTANCE.getService_Image();
		}
		if (editorKey == ContainersViewsRepository.Service.envs) {
			return ContainersPackage.eINSTANCE.getService_Envs();
		}
		if (editorKey == ContainersViewsRepository.Service.volumes) {
			return ContainersPackage.eINSTANCE.getService_Volumes();
		}
		if (editorKey == ContainersViewsRepository.Service.ports) {
			return ContainersPackage.eINSTANCE.getService_Ports();
		}
		if (editorKey == ContainersViewsRepository.Service.command) {
			return ContainersPackage.eINSTANCE.getService_Command();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Service service = (Service)semanticObject;
		if (ContainersViewsRepository.Service.image == event.getAffectedEditor()) {
			service.setImage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ContainersViewsRepository.Service.envs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, envsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				envsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				envsSettings.move(event.getNewIndex(), (Env) event.getNewValue());
			}
		}
		if (ContainersViewsRepository.Service.volumes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Volume) {
					volumesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				volumesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				volumesSettings.move(event.getNewIndex(), (Volume) event.getNewValue());
			}
		}
		if (ContainersViewsRepository.Service.ports == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, portsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				portsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				portsSettings.move(event.getNewIndex(), (PortMapping) event.getNewValue());
			}
		}
		if (ContainersViewsRepository.Service.command == event.getAffectedEditor()) {
			service.setCommand((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ServicePropertiesEditionPart basePart = (ServicePropertiesEditionPart)editingPart;
			if (ContainersPackage.eINSTANCE.getService_Image().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.Service.image)) {
				if (msg.getNewValue() != null) {
					basePart.setImage(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setImage("");
				}
			}
			if (ContainersPackage.eINSTANCE.getService_Envs().equals(msg.getFeature()) && isAccessible(ContainersViewsRepository.Service.envs))
				basePart.updateEnvs();
			if (ContainersPackage.eINSTANCE.getService_Volumes().equals(msg.getFeature())  && isAccessible(ContainersViewsRepository.Service.volumes))
				basePart.updateVolumes();
			if (ContainersPackage.eINSTANCE.getService_Ports().equals(msg.getFeature()) && isAccessible(ContainersViewsRepository.Service.ports))
				basePart.updatePorts();
			if (ContainersPackage.eINSTANCE.getService_Command().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.Service.command)) {
				if (msg.getNewValue() != null) {
					basePart.setCommand(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCommand("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ContainersPackage.eINSTANCE.getService_Image(),
			ContainersPackage.eINSTANCE.getService_Envs(),
			ContainersPackage.eINSTANCE.getService_Volumes(),
			ContainersPackage.eINSTANCE.getService_Ports(),
			ContainersPackage.eINSTANCE.getService_Command()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ContainersViewsRepository.Service.image == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getService_Image().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getService_Image().getEAttributeType(), newValue);
				}
				if (ContainersViewsRepository.Service.command == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getService_Command().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getService_Command().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
