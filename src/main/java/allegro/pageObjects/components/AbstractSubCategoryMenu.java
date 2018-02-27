package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbstractSubCategoryMenu extends AbstractPageObject{

    @FindBy(id = "opbox-category-tree")
    private WebElement subCategoryMenu;
}
