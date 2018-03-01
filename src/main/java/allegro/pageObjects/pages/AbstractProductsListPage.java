package allegro.pageObjects.pages;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.ProductList;
import allegro.pageObjects.components.sorters.ProductSorter;

public abstract class AbstractProductsListPage extends AbstractPageObject{

    public final ProductSorter productSorter;
    public final ProductList productsList;

    public AbstractProductsListPage() {
        super();
        this.productSorter = new ProductSorter();
        this.productsList = new ProductList();
    }
}
