package internetShop.service;

import internetShop.entity.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    Optional<Product> getProduct(Long id);

    Product getProduct(String name);

    List<Product> getProducts();

    void saveProduct(Product product);

    void deleteProduct(Long id);
}