package allegro.pageObjects.pages;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.menus.ElectronicsMenu;

public class ElectronicsPage extends AbstractPageObject {

    public final ElectronicsMenu categoryMenu;

    public ElectronicsPage(){
        super();
        this.categoryMenu = new ElectronicsMenu();
    }
}
