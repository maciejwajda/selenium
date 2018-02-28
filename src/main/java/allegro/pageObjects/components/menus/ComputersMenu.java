package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.components.menus.DiscksAndMemoriesMenu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersMenu extends AbstractPageObject {

    @FindBy(linkText = "Dyski i pamięci przenośne")
    private WebElement disksAndMemories;

    public DiscksAndMemoriesMenu selectDisksAndMemories(){
        disksAndMemories.click();
        return new DiscksAndMemoriesMenu();
    }
}
