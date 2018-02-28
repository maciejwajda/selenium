package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.ExternalAndInternalDisksPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscksAndMemoriesMenu extends AbstractPageObject{

    @FindBy(linkText = "Dyski zewnętrzne i przenośne")
    private WebElement externalAndInternalDiscks;

    public ExternalAndInternalDisksPage selectExternalAndInternalDiscks(){
        externalAndInternalDiscks.click();
        return new ExternalAndInternalDisksPage();
    }
}
