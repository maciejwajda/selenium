package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsMenu extends AbstractPageObject{

    @FindBy(linkText = "Komputery")
    private WebElement computers;

    public ComputersSubCategoryMenu selectComputers(){
        computers.click();
        return new ComputersSubCategoryMenu();
    }
}
