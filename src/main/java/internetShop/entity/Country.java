package internetShop.entity;

import internetShop.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private Long id;

    private String name;

    //@Fetch(value = FetchMode.SELECT)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "country")
    private List<Product> products;
}
