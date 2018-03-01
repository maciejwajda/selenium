package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.util.List;

public class ProductList extends AbstractPageObject {

    @FindBy(xpath = "//section[descendant::h2[text()='lista promowanych ofert']]//section[descendant::article]")
    private WebElement list;

    public List<WebElement> getProducts(){
        return list.findElements(By.xpath(".//article"));
    }

    public static String getName(WebElement element){
        return element.findElement(By.xpath(".//h2/a")).getText();
    }

    public static BigDecimal getPrice(WebElement element){
        String price = element.findElement(By.xpath(".//span[@class='e82f23a']")).
                getText().
                replace("zł", "").replace(",", ".").trim();
        return new BigDecimal(price);
    }

    public static int getSize(WebElement element){
        String size = element.findElement(By.xpath(".//div[@class='bec3e46']//dd[last()]")).getText();
        return new Integer(size);
    }

}
