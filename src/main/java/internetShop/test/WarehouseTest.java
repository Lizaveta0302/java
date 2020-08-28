package internetShop.test;

import internetShop.Warehouse;
import internetShop.category.FoodCategory;
import internetShop.category.NotFoodCategory;
import internetShop.product.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarehouseTest {
    private Warehouse warehouse = new Warehouse(new HashMap<>());
    private Product product;

    @Test
    @Before
    public void addProductToWarehouseTesting() {
        product = new Product("sce", 23, new FoodCategory("2020-11-23"));
        warehouse.addProductToWarehouse(product, 2);
        warehouse.addProductToWarehouse(new Product("sce", 23, new FoodCategory("2020-08-28")), 2);
        warehouse.addProductToWarehouse(new Product("sce", 23, new NotFoodCategory("2020-09-28")), 2);
        assertEquals(2, warehouse.getStore().size());
    }

    @Test
    public void deleteFromWarehouseTesting() {
        warehouse.deleteProductFromWarehouse(product);
        assertEquals(1, warehouse.getStore().size());
    }
}
