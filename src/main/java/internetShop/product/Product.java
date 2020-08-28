package internetShop.product;

import internetShop.category.Category;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable {

    private String name;

    private double price;

    private Category category;
}
