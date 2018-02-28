package allegro.pageObjects.pages;

import allegro.pageObjects.components.filters.DiskSpaceFilter;
import allegro.pageObjects.components.menus.DiscksAndMemoriesMenu;
import allegro.pageObjects.components.sorters.ProductSorter;

public class ExternalAndInternalDisksPage {

    public final DiskSpaceFilter diskSpaceFilter;
    public final ProductSorter productSorter;

    public ExternalAndInternalDisksPage() {
        this.diskSpaceFilter = new DiskSpaceFilter();
        this.productSorter = new ProductSorter();
    }

}
