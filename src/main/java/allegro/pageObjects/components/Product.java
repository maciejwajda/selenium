package allegro.pageObjects.components;

import com.google.common.collect.Ordering;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

@Data
public class Product {
    private String name;
    private BigDecimal price;
    private int size;

    public Product(String name, BigDecimal price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public static Product getFromWebElement(WebElement element) {
        String size = element.findElement(By.xpath(".//div[@class='bec3e46']//dd[last()]")).getText();
        String name = element.findElement(By.xpath(".//h2/a")).getText();
        String price = element.findElement(By.xpath(".//span[@class='e82f23a']")).getText();
        price = price.replace("zł", "").replace(",", ".").trim();
        return new Product(name, new BigDecimal(price), new Integer(size));
    }


    public static final Ordering<Product> DESC = new Ordering<Product>() {
        @Override
        public int compare(Product left, Product right) {
            return right.getPrice().compareTo(left.getPrice());
        }
    };
}