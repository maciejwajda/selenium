package allegro.pageObjects.pages;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.menus.CategoryMenu;


public abstract class AbstractPage extends AbstractPageObject {

   public final CategoryMenu categoryMenu;

    public AbstractPage(){
        super();
        this.categoryMenu = new CategoryMenu();
    }

}
