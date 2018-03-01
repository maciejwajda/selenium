package allegro.pageObjects.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.math.BigDecimal;

public class ProductElement {

    private WebElement element;
    public final String name;
    public final BigDecimal price;
    public final int size;

    public ProductElement(WebElement element){
        this.element = element;
        this.name = getName();
        this.size = getSize();
        this.price = getPrice();
    }

    private String getName(){
        return element.findElement(By.xpath(".//h2/a")).getText();
    }

    private BigDecimal getPrice(){
        String price = element.findElement(By.xpath(".//div[following-sibling::span[text()='kup teraz']]")).
                getText().
                replace("zł", "").replace(",", ".").trim();
        return new BigDecimal(price);
    }

    private int getSize(){
        String size = element.findElement(By.xpath(".//dd[preceding-sibling::dt[text()='Pojemność dysku (GB)']]")).
                getText();
        return new Integer(size);
    }
}
