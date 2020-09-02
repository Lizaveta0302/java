package internetShop.dao.jdbc;

import internetShop.entity.product.Product;
import internetShop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:web/WEB-INF/dispatcher-servlet.xml"})
public class ProductJdbcDaoTest {

    private ProductService productService;
    private Product product;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addProductTesting() {
        product = new Product();
        product.setName("coffee");
        product.setPrice(28.7);
        productService.saveProduct(product);
        assert (!Objects.isNull(productService.getProduct("coffee")));
    }

    @Test(expected = Exception.class)
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Rollback(false)
    public void deleteProductTesting() {
        product = productService.getProduct("coffee");
        productService.deleteProduct(product.getId());
    }
}
