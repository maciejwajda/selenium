package allegro.pageObjects.pages;

import allegro.pageObjects.components.ComputersSubCategoryMenu;
import allegro.pageObjects.components.ElectronicsMenu;

public class ElectronicsPage extends AbstractPage{

    private ElectronicsMenu electronicsMenu = new ElectronicsMenu();

    public ComputersSubCategoryMenu selectComputers() {
        return electronicsMenu.selectComputers();
    }
}
