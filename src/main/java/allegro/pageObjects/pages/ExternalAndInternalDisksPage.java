package allegro.pageObjects.pages;

import allegro.pageObjects.components.filters.DiskSpaceFilter;

public class ExternalAndInternalDisksPage extends AbstractProductListPage{

    public final DiskSpaceFilter diskSpaceFilter;

    public ExternalAndInternalDisksPage() {
        super();
        this.diskSpaceFilter = new DiskSpaceFilter();
    }

}
