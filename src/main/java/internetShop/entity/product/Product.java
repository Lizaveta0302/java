package internetShop.entity.product;

import internetShop.entity.Entity;
import internetShop.entity.category.Category;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Entity {

    private static final long serialVersionUID = -2032557459708996723L;
    private String name;

    private double price;

    private Category category;

}
