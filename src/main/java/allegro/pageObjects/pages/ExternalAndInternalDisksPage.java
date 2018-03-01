package allegro.pageObjects.pages;

import allegro.pageObjects.components.filters.DiskSpaceFilter;

public class ExternalAndInternalDisksPage extends AbstractProductsListPage {

    public final DiskSpaceFilter diskSpaceFilter;

    public ExternalAndInternalDisksPage() {
        super();
        this.diskSpaceFilter = new DiskSpaceFilter();
    }

}
