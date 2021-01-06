package internetShop.service;

import internetShop.customerAnnotation.CustomProductAnnotationAnalyzer;
import internetShop.customerAnnotation.ExpiredProductAnnotationAnalyzer;
import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import internetShop.entity.product.Product;
import internetShop.exceptions.ProductIsNotAddedException;
import internetShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductIsNotAddedException("HandMadeProduct is not found"));
    }

    @Override
    public Product getProduct(String name) {
        return productRepository.findByName(name);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveProduct(Product product) {
        if (Objects.isNull(product.getId())) {
            productRepository.save(product);
            ExpiredProductAnnotationAnalyzer.checkExpiredProduct(product, 1);
            CustomProductAnnotationAnalyzer.checkCustomProduct(product);
        }
        throw new ProductIsNotAddedException();
    }

    @Transactional
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void selfInvocation() {
        Product product = new Product("dssssc", "fvd", 32, new Country(), new Bucket());
        product.setId(15L);
        saveProduct(product);
        getProduct(100L);
    }
}

