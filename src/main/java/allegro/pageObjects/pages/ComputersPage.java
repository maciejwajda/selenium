package allegro.pageObjects.pages;

import allegro.pageObjects.components.menus.ComputersMenu;

public class ComputersPage extends AbstractProductsListPage {

    public final ComputersMenu categoryMenu;

    public ComputersPage() {
        super();
        this.categoryMenu = new ComputersMenu();
    }
}
