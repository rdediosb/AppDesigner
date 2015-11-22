/**
 * Generated with Acceleo
 */
package containers.components;

// Start of user code for imports
import containers.ContainersPackage;
import containers.Env;

import containers.parts.ContainersViewsRepository;
import containers.parts.EnvPropertiesEditionPart;

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
public class EnvPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EnvPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject env, String editing_mode) {
		super(editingContext, env, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContainersViewsRepository.class;
		partKey = ContainersViewsRepository.Env.class;
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
			
			final Env env = (Env)elt;
			final EnvPropertiesEditionPart basePart = (EnvPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContainersViewsRepository.Env.Properties.key))
				basePart.setKey(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, env.getKey()));
			
			if (isAccessible(ContainersViewsRepository.Env.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, env.getValue()));
			
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
		if (editorKey == ContainersViewsRepository.Env.Properties.key) {
			return ContainersPackage.eINSTANCE.getEnv_Key();
		}
		if (editorKey == ContainersViewsRepository.Env.Properties.value) {
			return ContainersPackage.eINSTANCE.getEnv_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Env env = (Env)semanticObject;
		if (ContainersViewsRepository.Env.Properties.key == event.getAffectedEditor()) {
			env.setKey((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ContainersViewsRepository.Env.Properties.value == event.getAffectedEditor()) {
			env.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			EnvPropertiesEditionPart basePart = (EnvPropertiesEditionPart)editingPart;
			if (ContainersPackage.eINSTANCE.getEnv_Key().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.Env.Properties.key)) {
				if (msg.getNewValue() != null) {
					basePart.setKey(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setKey("");
				}
			}
			if (ContainersPackage.eINSTANCE.getEnv_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ContainersViewsRepository.Env.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setValue("");
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
			ContainersPackage.eINSTANCE.getEnv_Key(),
			ContainersPackage.eINSTANCE.getEnv_Value()		);
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
				if (ContainersViewsRepository.Env.Properties.key == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getEnv_Key().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getEnv_Key().getEAttributeType(), newValue);
				}
				if (ContainersViewsRepository.Env.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ContainersPackage.eINSTANCE.getEnv_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContainersPackage.eINSTANCE.getEnv_Value().getEAttributeType(), newValue);
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
