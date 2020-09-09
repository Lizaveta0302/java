package internetShop.service;

import internetShop.dao.ProductDao;
import internetShop.entity.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product getProduct(Long id) {
        return productDao.read(id);
    }

    @Override
    public Product getProduct(String name) {
        return productDao.findByName(name);
    }

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveProduct(Product product) {
        if (Objects.isNull(product.getId())) {
            productDao.create(product);
        } else {
            productDao.update(product);
        }
    }

    @Transactional
    @Override
    public void deleteProduct(Long id) {
        productDao.delete(id);
    }
}

