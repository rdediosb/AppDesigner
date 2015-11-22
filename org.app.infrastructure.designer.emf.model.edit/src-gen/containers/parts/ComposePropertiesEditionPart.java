/**
 * Generated with Acceleo
 */
package containers.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ComposePropertiesEditionPart {



	/**
	 * Init the services
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initServices(ReferencesTableSettings settings);

	/**
	 * Update the services
	 * @param newValue the services to update
	 * 
	 */
	public void updateServices();

	/**
	 * Adds the given filter to the services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the services table
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
