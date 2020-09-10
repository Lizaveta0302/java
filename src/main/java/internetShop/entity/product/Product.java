package internetShop.entity.product;

import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id;

    private String name;

    private double price;

    //private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bucket")
    private Bucket bucket;
}
