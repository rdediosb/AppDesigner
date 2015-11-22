/**
 * Generated with Acceleo
 */
package containers.providers;

import containers.util.ContainersAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ContainersEEFAdapterFactory extends ContainersAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createNamedElementAdapter()
	 * 
	 */
	public Adapter createNamedElementAdapter() {
		return new NamedElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createServiceAdapter()
	 * 
	 */
	public Adapter createServiceAdapter() {
		return new ServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createComposeAdapter()
	 * 
	 */
	public Adapter createComposeAdapter() {
		return new ComposePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createEnvAdapter()
	 * 
	 */
	public Adapter createEnvAdapter() {
		return new EnvPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createVolumeAdapter()
	 * 
	 */
	public Adapter createVolumeAdapter() {
		return new VolumePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .containers.util.ContainersAdapterFactory#createPortMappingAdapter()
	 * 
	 */
	public Adapter createPortMappingAdapter() {
		return new PortMappingPropertiesEditionProvider();
	}

}
