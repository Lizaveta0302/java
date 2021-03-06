package internetShop.entity.bucket;

import internetShop.entity.User;
import internetShop.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bucket extends internetShop.entity.Entity {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bucket")
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 10)
    private Set<Product> products;

    @OneToOne(mappedBy = "bucket")
    private User user;
}
