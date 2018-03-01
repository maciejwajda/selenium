package allegro.pageObjects.components.menus;

import allegro.pageObjects.AbstractPageObject;
import allegro.pageObjects.pages.ComputersPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsMenu extends AbstractPageObject{

    @FindBy(xpath = "//div[@data-box-name='category bez darmowej dostawy']//a[text()='Komputery']")
    private WebElement computers;

    public ComputersPage selectComputers(){
        computers.click();
        return new ComputersPage();
    }
}
