package allegro.pageObjects.components.sorters;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PageLoader;

import static config.Browser.driver;


public class ProductSorter extends AbstractPageObject{

    @FindBy(xpath = "//*[@id='opbox-listing-sort']/div/button")
    private WebElement sorterOpen;
    @FindBy(xpath = "//*[@id='opbox-listing-sort']//li[descendant::span[text()='cena']]//a[text()='od najwyższej']")
    private WebElement fromTopPrice;

    public void sortByPriceDesc(){
        sorterOpen.click();
        fromTopPrice.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(sorterOpen, "cena: od najwyższej"));
//        PageLoader.waitForLoad(sorterOpen);
    }

}
