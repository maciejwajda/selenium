package allegro.pageObjects.pages;

import allegro.pageObjects.components.menus.DisksAndMemoriesMenu;

public class DisksAndMemoriesPage extends AbstractProductsListPage {

    public final DisksAndMemoriesMenu categoryMenu;

    public DisksAndMemoriesPage() {
        super();
        this.categoryMenu = new DisksAndMemoriesMenu();
    }
}
