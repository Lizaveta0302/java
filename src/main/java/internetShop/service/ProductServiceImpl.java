package internetShop.service;

import internetShop.dao.ProductDao;
import internetShop.entity.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;


public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

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

    @Override
    public void saveProduct(Product product) {
        if (Objects.isNull(product.getId())) {
            productDao.create(product);
        } else {
            productDao.update(product);
        }
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.delete(id);
    }
}
