package internetShop;

import lombok.*;

@Data
@AllArgsConstructor
public class Product {

    private String name;

    private long price;

    private Category category;
}
