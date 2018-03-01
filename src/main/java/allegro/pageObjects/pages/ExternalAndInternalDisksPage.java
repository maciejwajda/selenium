package allegro.pageObjects.pages;

import allegro.pageObjects.components.filters.DiskSizeFilter;

public class ExternalAndInternalDisksPage extends AbstractProductsListPage {

    public final DiskSizeFilter diskSizeFilter;

    public ExternalAndInternalDisksPage() {
        super();
        this.diskSizeFilter = new DiskSizeFilter();
    }

}
