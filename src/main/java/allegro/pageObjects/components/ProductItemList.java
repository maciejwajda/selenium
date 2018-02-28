package allegro.pageObjects.components;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ProductItemList extends AbstractPageObject{

    @FindBy(xpath="//section[descendant::h2[text()='lista promowanych ofert']]//section[descendant::article]")
    private WebElement list;

    public List<Product> findAllProducts(){
        List<WebElement> productsElements = list.findElements(By.tagName("article"));
        System.out.println("START");
        for(WebElement e : productsElements){
            String name = e.findElement(By.xpath("//h2/a")).getText();
            String price = e.findElement(By.xpath("//span")).getText();
            System.out.println("Name "+ name + "Price " + price);
        }
//        productsElements.stream().forEach(e -> System.out.println(e.getText()));
        System.out.println("END");
        return productsElements.stream().map(Product::getFromWebElement).collect(Collectors.toList());
    }
}
