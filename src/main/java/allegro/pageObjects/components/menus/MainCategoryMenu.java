package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.ElectronicsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainCategoryMenu extends AbstractPageObject{

    @FindBy(xpath = "//div[@data-dropdown-id='categories_dropdown']")
    private WebElement categoryMenuOpen;
    @FindBy(xpath = "//a[@data-analytics-click-value='Elektronika']")
    private WebElement electronics;

    public MainCategoryMenu openCategoryMenu(){
        categoryMenuOpen.click();
        return this;
    }

    public ElectronicsPage selectElectronicsCategory(){
        electronics.click();
        return new ElectronicsPage();
    }

}
