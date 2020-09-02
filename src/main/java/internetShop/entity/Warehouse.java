package internetShop.entity;

import internetShop.customerAnnotation.ExpiredProduct;
import internetShop.customerAnnotation.ExpiredProductAnnotationAnalyzer;
import internetShop.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.Objects;

@Data
@AllArgsConstructor
public class Warehouse {
    private Map<Product, Integer> store;

    @ExpiredProduct(enabled = false) //if true -> Expired date will not be verified
    public void addProductToWarehouse(Product product, int count) {
        if(ExpiredProductAnnotationAnalyzer.checkExpiredProduct(product, count)){
            store.put(product, count);
        }
    }

    public void deleteProductFromWarehouse(Product product) {
        if (!Objects.isNull(product)) {
            store.remove(product);
        }
    }
}
