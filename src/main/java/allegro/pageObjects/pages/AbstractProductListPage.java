package allegro.pageObjects.pages;

import allegro.pageObjects.components.sorters.ProductSorter;

public abstract class AbstractProductListPage extends AbstractPage{

    public final ProductSorter productSorter;

    public AbstractProductListPage() {
        this.productSorter = new ProductSorter();
    }
}
