package allegro.pageObjects.pages;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.CategoryMenu;

import static config.Browser.driver;

public abstract class AbstractPage extends AbstractPageObject {

//    protected static String URL;
    private CategoryMenu categoryMenu;

    public AbstractPage(){
        super();
//        setUrl();
        this.categoryMenu = new CategoryMenu();
    }

//    public <T>T navigate(Class<T> type){
//        return this.navigate();
//    }
//
//    public <T>T navigate(){
//        driver.get(URL);
//        return (T)this;
//    }

    public CategoryMenu openCategoryMenu() {
        return categoryMenu.openCategoryMenu();
    }

//    protected abstract void setUrl();
}
