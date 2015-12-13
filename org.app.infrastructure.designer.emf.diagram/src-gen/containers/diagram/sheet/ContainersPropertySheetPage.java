package containers.diagram.sheet;

import org.eclipse.ui.views.properties.PropertySheetPage;

public class ContainersPropertySheetPage extends PropertySheetPage {

	   public ContainersPropertySheetPage()
	   {
	      super();
	      setSorter(new ContainersPropertySheetSorter());
	   }
}
