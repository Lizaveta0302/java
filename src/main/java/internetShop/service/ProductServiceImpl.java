package internetShop.service;

import internetShop.entity.product.Product;
import internetShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product getProduct(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveProduct(Product product) {
        if (Objects.isNull(product.getId())) {
            productRepository.save(product);
        }
    }

    @Transactional
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

