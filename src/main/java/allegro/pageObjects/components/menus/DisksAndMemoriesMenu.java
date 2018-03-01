package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.ExternalAndInternalDisksPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisksAndMemoriesMenu extends AbstractSubCategoryMenu{

    @FindBy(xpath = SUB_CATEGORY_XPATH + "//*[text()='Dyski zewnętrzne i przenośne']")
    private WebElement externalAndInternalDisks;

    public ExternalAndInternalDisksPage selectExternalAndInternalDisks(){
        externalAndInternalDisks.click();
        return new ExternalAndInternalDisksPage();
    }
}
