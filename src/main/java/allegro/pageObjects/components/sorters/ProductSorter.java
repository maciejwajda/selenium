package allegro.pageObjects.components.sorters;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSorter extends AbstractPageObject{

    @FindBy(xpath = "//*[@id='opbox-listing-sort']/div/button")
    private WebElement sorterOpen;
    @FindBy(xpath = "//*[@id='opbox-listing-sort']//li[descendant::span[text()='cena']]//a[text()='od najwyższej']")
    private WebElement fromTopPrice;

    public void sortByPriceDesc(){
        sorterOpen.click();
        fromTopPrice.click();
    }
}
