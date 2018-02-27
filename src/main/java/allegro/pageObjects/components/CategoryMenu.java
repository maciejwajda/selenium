package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.ElectronicsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryMenu extends AbstractPageObject{

    @FindBy(linkText = "Kategorie")
    private WebElement categoryMenuOpen;
    @FindBy(xpath = "//a[@data-analytics-click-value='Elektronika']")
    private WebElement electronics;

    public CategoryMenu openCategoryMenu(){
        categoryMenuOpen.click();
        return this;
    }

    public ElectronicsPage selectElectronicsCategory(){
        electronics.click();
        return new ElectronicsPage();
    }

}
