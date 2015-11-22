/**
 * Generated with Acceleo
 */
package containers.components;

// Start of user code for imports
import containers.ContainersPackage;
import containers.PortMapping;

import containers.parts.ContainersViewsRepository;
import containers.parts.PortMappingPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class PortMappingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PortMappingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject portMapping, String editing_mode) {
		super(editingContext, portMapping, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContainersViewsRepository.class;
		partKey = ContainersViewsRepository.PortMapping.class;
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
			
			final PortMapping portMapping = (PortMapping)elt;
			final PortMappingPropertiesEditionPart basePart = (PortMappingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContainersViewsRepository.PortMapping.Properties.external)) {
				basePart.setExternal(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, portMapping.getExternal()));
			}
			
			if (isAccessible(ContainersViewsRepository.PortMapping.Properties.internal)) {
				basePart.setInternal(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, portMapping.getInternal()));
			}
			
			// init filters
			
			
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
		if (editorKey == ContainersViewsRepository.PortMapping.Properties.external) {
			return ContainersPackage.eINSTANCE.getPortMapping_External();
		}
		if (editorKey == ContainersViewsRepository.PortMapping.Properties.internal) {
			return ContainersPackage.eINSTANCE.getPortMapping_Internal();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PortMapping portMapping = (PortMapping)semanticObject;
		if (ContainersViewsRepository.PortMapping.Properties.external == event.getAffectedEditor()) {
			portMapping.setExternal((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ContainersViewsRepository.PortMapping.Properties.internal == event.getAffectedEditor()) {
			portMapping.setInternal((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PortMappingPropertiesEditionPart basePart = (PortMappingPropertiesEditionPart)editingPart;
			if (ContainersPackage.eINSTANCE.getPortMapping_External().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.PortMapping.Properties.external)) {
				if (msg.getNewValue() != null) {
					basePart.setExternal(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setExternal("");
				}
			}
			if (ContainersPackage.eINSTANCE.getPortMapping_Internal().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.PortMapping.Properties.internal)) {
				if (msg.getNewValue() != null) {
					basePart.setInternal(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setInternal("");
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
			ContainersPackage.eINSTANCE.getPortMapping_External(),
			ContainersPackage.eINSTANCE.getPortMapping_Internal()		);
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
				if (ContainersViewsRepository.PortMapping.Properties.external == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getPortMapping_External().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getPortMapping_External().getEAttributeType(), newValue);
				}
				if (ContainersViewsRepository.PortMapping.Properties.internal == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getPortMapping_Internal().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getPortMapping_Internal().getEAttributeType(), newValue);
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
