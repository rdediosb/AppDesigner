/**
 * Generated with Acceleo
 */
package containers.parts;

/**
 * 
 * 
 */
public class ContainersViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Service view descriptor
	 * 
	 */
	public static class Service {
	
	public static String image = "containers::Service::image";
	
	
	public static String envs = "containers::Service::envs";
	
	
	public static String volumes = "containers::Service::volumes";
	
	
	public static String ports = "containers::Service::ports";
	
	
	public static String command = "containers::Service::command";
	
	}

	/**
	 * NamedElement view descriptor
	 * 
	 */
	public static class NamedElement {
		public static class Properties {
	
			
			public static String name = "containers::NamedElement::properties::name";
			
	
		}
	
	}

	/**
	 * Compose view descriptor
	 * 
	 */
	public static class Compose {
		public static class Properties {
	
			
			public static String services = "containers::Compose::properties::services";
			
	
		}
	
	}

	/**
	 * Env view descriptor
	 * 
	 */
	public static class Env {
		public static class Properties {
	
			
			public static String key = "containers::Env::properties::key";
			
			
			public static String value = "containers::Env::properties::value";
			
	
		}
	
	}

	/**
	 * Volume view descriptor
	 * 
	 */
	public static class Volume {
		public static class Properties {
	
			
			public static String name = "containers::Volume::properties::name";
			
	
		}
	
	}

	/**
	 * PortMapping view descriptor
	 * 
	 */
	public static class PortMapping {
		public static class Properties {
	
			
			public static String external = "containers::PortMapping::properties::external";
			
			
			public static String internal = "containers::PortMapping::properties::internal";
			
	
		}
	
	}

}
