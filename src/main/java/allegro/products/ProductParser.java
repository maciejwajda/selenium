package allegro.products;

import allegro.pageObjects.components.ProductElement;
import allegro.pageObjects.components.ProductList;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ProductParser {

    public static List<Product> findAllProducts(ProductList productList) {
        int count = 5;
        while (true) {
            count--;
            try {
                return productList.getProducts().stream().
                        map(ProductParser::getProductFromWebElement).
                        collect(Collectors.toList());
            } catch (StaleElementReferenceException e) {
                if (count == 0)
                    throw e;
            }
        }
    }

    private static Product getProductFromWebElement(WebElement productElement) {
        ProductElement product = new ProductElement(productElement);
        return new Product(product.name, product.price, product.size);
    }
}
