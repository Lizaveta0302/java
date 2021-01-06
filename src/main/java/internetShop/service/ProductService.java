package internetShop.service;

import internetShop.entity.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product getProduct(Long id);

    Product getProduct(String name);

    List<Product> getProducts();

    void saveProduct(Product product);

    void deleteProduct(Long id);

    void selfInvocation();
}