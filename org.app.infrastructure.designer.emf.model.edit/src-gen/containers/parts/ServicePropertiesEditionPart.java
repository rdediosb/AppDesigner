/**
 * Generated with Acceleo
 */
package containers.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ServicePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the link
	 * 
	 */
	public EObject getLink();

	/**
	 * Init the link
	 * @param settings the combo setting
	 */
	public void initLink(EObjectFlatComboSettings settings);

	/**
	 * Defines a new link
	 * @param newValue the new link to set
	 * 
	 */
	public void setLink(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLinkButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the link edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the link edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLink(ViewerFilter filter);


	/**
	 * @return the image
	 * 
	 */
	public String getImage();

	/**
	 * Defines a new image
	 * @param newValue the new image to set
	 * 
	 */
	public void setImage(String newValue);




	/**
	 * Init the envs
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEnvs(ReferencesTableSettings settings);

	/**
	 * Update the envs
	 * @param newValue the envs to update
	 * 
	 */
	public void updateEnvs();

	/**
	 * Adds the given filter to the envs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnvs(ViewerFilter filter);

	/**
	 * Adds the given filter to the envs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnvs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the envs table
	 * 
	 */
	public boolean isContainedInEnvsTable(EObject element);




	/**
	 * Init the volumes
	 * @param settings settings for the volumes ReferencesTable 
	 */
	public void initVolumes(ReferencesTableSettings settings);

	/**
	 * Update the volumes
	 * @param newValue the volumes to update
	 * 
	 */
	public void updateVolumes();

	/**
	 * Adds the given filter to the volumes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVolumes(ViewerFilter filter);

	/**
	 * Adds the given filter to the volumes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVolumes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the volumes table
	 * 
	 */
	public boolean isContainedInVolumesTable(EObject element);




	/**
	 * Init the ports
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPorts(ReferencesTableSettings settings);

	/**
	 * Update the ports
	 * @param newValue the ports to update
	 * 
	 */
	public void updatePorts();

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ports table
	 * 
	 */
	public boolean isContainedInPortsTable(EObject element);


	/**
	 * @return the command
	 * 
	 */
	public String getCommand();

	/**
	 * Defines a new command
	 * @param newValue the new command to set
	 * 
	 */
	public void setCommand(String newValue);





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
