package internetShop.repository;

import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import internetShop.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCountry(Country country);

    List<Product> findAllByBucket(Bucket bucket);

    Product findByName(String name);
}
