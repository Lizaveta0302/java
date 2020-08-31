package internetShop.product;

import internetShop.category.Category;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 4559501247923068232L;
    private String name;

    private double price;

    private Category category;
}
