package internetShop.entity.product;

import internetShop.entity.Entity;
import internetShop.entity.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Product extends Entity {

    private static final long serialVersionUID = -2032557459708996723L;
    private String name;

    private double price;

    private Category category;

}
