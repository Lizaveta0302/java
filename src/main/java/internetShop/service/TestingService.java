package internetShop.service;

import internetShop.entity.product.Product;
import org.springframework.stereotype.Service;

@Service
public class TestingService {
    String testing() {
        Product product = new Product();
        product.setName("TestRepo");
        return product.getName();
    }
}
