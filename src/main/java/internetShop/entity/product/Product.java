package internetShop.entity.product;

import internetShop.customerAnnotation.CustomProduct;
import internetShop.entity.Country;
import internetShop.entity.bucket.Bucket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Accessors(chain = true)
@Inheritance(strategy = InheritanceType.JOINED)
@CustomProduct
public class Product extends internetShop.entity.Entity {

    private String name;

    @Transient
    private String createdBy;

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
