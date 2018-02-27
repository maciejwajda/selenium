package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersSubCategoryMenu extends AbstractPageObject {

    @FindBy(linkText = "Dyski i pamięci przenośne")
    private WebElement discksAndMemories;

    public void selectDiscksAndMemories(){
        discksAndMemories.click();
    }
}
