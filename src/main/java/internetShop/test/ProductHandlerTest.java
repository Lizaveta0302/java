package internetShop.test;

import internetShop.NotFoodCategory;
import internetShop.ProductListHandler;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductHandlerTest {

    @Test
    public void initTesting() {
        ProductListHandler.init();
        assertTrue(ProductListHandler.getProd().size() == 4);
    }

    @Test
    public void addProductTesting() {
        ProductListHandler.getProd().clear();
        ProductListHandler.addProduct("Mouse", 30, new NotFoodCategory("15.10.2025"));
        ProductListHandler.addProduct("Hаmster", 35, new NotFoodCategory("25.10.2024"));
        assertTrue(ProductListHandler.getProd().size() == 2);
    }
}
