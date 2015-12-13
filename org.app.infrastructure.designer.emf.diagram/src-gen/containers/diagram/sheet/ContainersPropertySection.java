
package containers.diagram.sheet;

import org.app.infrastructure.designer.emf.diagram.dialogs.DockerImageDialogCellEditor;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import containers.ContainersPackage;

/**
 * @generated
 */
public class ContainersPropertySection extends DefaultPropertySection implements IPropertySourceProvider {

	/**
	* Modify/unwrap selection.
	* @generated
	*/
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

	/**
	* @generated NOT
	*/
	@Override
	public IPropertySource getPropertySource(Object object) {

		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips) {
					@Override
					protected IPropertyDescriptor createPropertyDescriptor(
							IItemPropertyDescriptor itemPropertyDescriptor) {
						return new PropertyDescriptor(object, itemPropertyDescriptor) {
							@Override
							public CellEditor createPropertyEditor(Composite composite) {
								EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor
										.getFeature(this.object);
								if (feature == ContainersPackage.Literals.SERVICE__IMAGE) {
									System.out.println("lalalala");

									return new DockerImageDialogCellEditor(composite, getEditLabelProvider(), object);

								}
								return super.createPropertyEditor(composite);
							}
						};
					}
				};
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}
}
