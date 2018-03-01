package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductList extends AbstractPageObject {

    @FindBy(xpath = "//section[descendant::h2[text()='lista promowanych ofert']]//section[descendant::article]")
    private WebElement list;

    public List<WebElement> getProducts(){
        return list.findElements(By.xpath(".//article"));
    }

}
