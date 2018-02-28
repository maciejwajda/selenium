package allegro.pageObjects.components;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//@Data
public class Product {
    private String name;
    private String price;

    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }

    public static Product getFromWebElement(WebElement element){
        String name = element.findElement(By.xpath("//h2/a")).getText();
        String price = element.findElement(By.xpath("//span")).getText();
        return new Product(name, price);
    }
}
