package allegro.products;

import allegro.pageObjects.components.ProductEntry;
import allegro.pageObjects.components.ProductList;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import static allegro.pageObjects.components.ProductList.*;

public class ProductParser {

    public static List<Product> findAllProducts(ProductList productList) {
        int count = 5;
        while (true) {
            count--;
            try {
                return productList.getProducts().stream().
                        map(ProductParser::getFromWebElement).
                        collect(Collectors.toList());
            } catch (StaleElementReferenceException e) {
                if (count == 0)
                    throw e;
            }
        }
    }

    private static Product getFromWebElement(WebElement element) {
        ProductEntry productEntry = new ProductEntry(element);
        return new Product(productEntry.name, productEntry.price, productEntry.size);
    }
}
