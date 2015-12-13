/**
 */
package containers.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import containers.Compose;
import containers.Service;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see containers.util.ContainersResourceFactoryImpl
 * @generated
 */
public class ContainersResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public ContainersResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException
	{
		Compose compose = (Compose)this.contents.get(0);
	    
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {

            String file2 = this.getURI().path().replace("/resource", "");
            String path = file2.substring(0, file2.lastIndexOf("/"));
            
            ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
            String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
            path = workspaceLocation + path + "/docker-compose.yml";
     
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);
            
    		for(Service service :compose.getServices())
    		{
    			String name = service.getName();
    			String image = service.getImage();
    			int host_port = service.getHost_port();
    			int container_port = service.getContainer_port(); 
    			Service link = service.getLink();
    			
    			pw.println(name+":");
    			pw.println("\timage: "+image);
    			pw.println("\tports:");
    			pw.println("\t - \""+container_port+":"+host_port+"\"");
    			if(link != null){
    				pw.println("\tlinks:");
    				pw.println("\t - "+ link.getName());
    			}
    		}
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

        try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		super.doSave(outputStream, options);
	}
} //ContainersResourceImpl
