package internetShop.test;

import internetShop.BucketHandler;
import internetShop.NotFoodCategory;
import internetShop.Product;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class BucketHandlerTest {

    @Test
    void addToTheBucketTesting() {
        BucketHandler.getBucket().addProduct(new Product("Mouse", 30, new NotFoodCategory("15.10.2025")));
        assertTrue(BucketHandler.getBucket().getProducts().size() == 1);
    }

    @Test
    void deleteFromBucketTesting() {
        BucketHandler.getBucket().getProducts().remove(0);
        assertTrue(BucketHandler.getBucket().getProducts().isEmpty());
    }

    @Test
    void clearBucketTesting() {
        BucketHandler.getBucket().getProducts().clear();
        assertTrue(BucketHandler.getBucket().getProducts().isEmpty());
    }
}
