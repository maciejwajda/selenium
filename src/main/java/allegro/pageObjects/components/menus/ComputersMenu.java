package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.DisksAndMemoriesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersMenu extends AbstractSubCategoryMenu{

    @FindBy(xpath = SUB_CATEGORY_XPATH + "//*[text()='Dyski i pamięci przenośne']")
    private WebElement disksAndMemories;

    public DisksAndMemoriesPage selectDisksAndMemories(){
        disksAndMemories.click();
        return new DisksAndMemoriesPage();
    }
}
