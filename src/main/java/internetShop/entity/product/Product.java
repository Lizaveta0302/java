package internetShop.entity.product;

import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
@Inheritance(strategy = InheritanceType.JOINED)
public class Product extends internetShop.entity.Entity {

    private String name;

    private double price;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    private Country country;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bucket")
    private Bucket bucket;
}
