/**
 * Generated with Acceleo
 */
package containers.providers;

import containers.parts.ContainersViewsRepository;

import containers.parts.forms.ComposePropertiesEditionPartForm;
import containers.parts.forms.EnvPropertiesEditionPartForm;
import containers.parts.forms.NamedElementPropertiesEditionPartForm;
import containers.parts.forms.PortMappingPropertiesEditionPartForm;
import containers.parts.forms.ServicePropertiesEditionPartForm;
import containers.parts.forms.VolumePropertiesEditionPartForm;

import containers.parts.impl.ComposePropertiesEditionPartImpl;
import containers.parts.impl.EnvPropertiesEditionPartImpl;
import containers.parts.impl.NamedElementPropertiesEditionPartImpl;
import containers.parts.impl.PortMappingPropertiesEditionPartImpl;
import containers.parts.impl.ServicePropertiesEditionPartImpl;
import containers.parts.impl.VolumePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class ContainersPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ContainersViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ContainersViewsRepository.Service.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new ServicePropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new ServicePropertiesEditionPartForm(component);
		}
		if (key == ContainersViewsRepository.NamedElement.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new NamedElementPropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new NamedElementPropertiesEditionPartForm(component);
		}
		if (key == ContainersViewsRepository.Compose.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new ComposePropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new ComposePropertiesEditionPartForm(component);
		}
		if (key == ContainersViewsRepository.Env.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new EnvPropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new EnvPropertiesEditionPartForm(component);
		}
		if (key == ContainersViewsRepository.Volume.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new VolumePropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new VolumePropertiesEditionPartForm(component);
		}
		if (key == ContainersViewsRepository.PortMapping.class) {
			if (kind == ContainersViewsRepository.SWT_KIND)
				return new PortMappingPropertiesEditionPartImpl(component);
			if (kind == ContainersViewsRepository.FORM_KIND)
				return new PortMappingPropertiesEditionPartForm(component);
		}
		return null;
	}

}
