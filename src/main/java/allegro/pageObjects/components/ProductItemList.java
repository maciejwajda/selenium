package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PageLoader;

import java.util.List;
import java.util.stream.Collectors;

import static config.Browser.driver;

public class ProductItemList extends AbstractPageObject{

    @FindBy(xpath="//section[descendant::h2[text()='lista promowanych ofert']]//section[descendant::article]")
    private WebElement list;

    public List<Product> findAllProducts(){
//        PageLoader.waitForLoad(null);
        List<WebElement> productsElements = list.findElements(By.xpath(".//article"));
        return productsElements.stream().map(Product::getFromWebElement).collect(Collectors.toList());
    }
}
