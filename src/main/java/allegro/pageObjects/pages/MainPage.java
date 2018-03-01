package allegro.pageObjects.pages;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.menus.MainCategoryMenu;

import static config.Browser.driver;

public class MainPage extends AbstractPageObject {

    public final MainCategoryMenu categoryMenu;
    private static final String URL = "https://allegro.pl/";

    public MainPage() {
        super();
        this.categoryMenu = new MainCategoryMenu();
    }

    public MainPage navigate() {
        driver.get(URL);
        return this;
    }
}
