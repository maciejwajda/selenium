package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsMenu extends AbstractPageObject{

    @FindBy(linkText = "Komputery")
    private WebElement computers;

    public ComputersMenu selectComputers(){
        computers.click();
        return new ComputersMenu();
    }
}
