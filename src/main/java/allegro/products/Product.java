package allegro.products;

import com.google.common.collect.Ordering;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Product {
    public final String name;
    public final BigDecimal price;
    public final int size;


    public Product(String name, BigDecimal price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public static final Ordering<Product> ORDERED_BY_PRICE_DESC = new Ordering<Product>() {
        @Override
        public int compare(Product left, Product right) {
            return right.price.compareTo(left.price);
        }
    };
}