package internetShop.product;

import internetShop.category.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
public class Milk extends Product {

    @Getter
    @Setter
    private double fatContent;

    public Milk(String name, long price, Category category, double fatContent) {
        super(name, price, category);
        this.fatContent = fatContent;
    }
}
