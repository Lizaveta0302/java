package internetShop.dao;

import internetShop.entity.product.Product;

import java.util.List;

public interface ProductDao extends CrudDao<Long, Product> {
    List<Product> findAll();

    Product findByName(String name);
}
