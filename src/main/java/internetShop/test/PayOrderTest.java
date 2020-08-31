package internetShop.test;

import internetShop.bucket.Bucket;
import internetShop.bucket.BucketHandler;
import internetShop.category.FoodCategory;
import internetShop.currency.USDCurrencyConvert;
import internetShop.order.CachePayOrder;
import internetShop.order.Order;
import internetShop.product.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayOrderTest {

    @Test
    public void cachePayOrderTesting() {
        Bucket.addProduct(new Product("ew", 3.4, new FoodCategory("2020-11-23")));
        Bucket.addProduct(new Product("efwew", 1.5, new FoodCategory("2020-11-23")));
        Order order = new CachePayOrder();
        double price = order.pay(BucketHandler.getBucket(), new USDCurrencyConvert());
        assertEquals(2.646, price, 0.0);
    }
}
