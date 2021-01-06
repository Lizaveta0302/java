package internetShop.entity.product;

import internetShop.customerAnnotation.CustomProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@CustomProduct(createdBy = "Lisa")
//@Inheritance
//@Table(appliesTo = "product")
public class Milk extends FoodProduct {
    @CustomProduct
    private double fatContent;

    @CustomProduct()
    public void analyzingProduct() {
    }

}
