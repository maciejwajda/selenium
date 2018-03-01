package allegro.pageObjects.components;

import allegro.products.Product;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

public class ProductEntry {

    private WebElement element;
    public final String name;
    public final BigDecimal price;
    public final int size;

    public ProductEntry(WebElement element){
        this.element = element;
        this.name = getName();
        this.size = getSize();
        this.price = getPrice();
    }

    private String getName(){
        return element.findElement(By.xpath(".//h2/a")).getText();
    }

    private BigDecimal getPrice(){
        String price = element.findElement(By.xpath(".//span[@class='e82f23a']")).
                getText().
                replace("zł", "").replace(",", ".").trim();
        return new BigDecimal(price);
    }

    private int getSize(){
        String size = element.findElement(By.xpath(".//div[@class='bec3e46']//dd[last()]")).getText();
        return new Integer(size);
    }
}
