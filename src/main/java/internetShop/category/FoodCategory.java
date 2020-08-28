package internetShop.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class FoodCategory implements Category, Serializable {
    private String expirationDate;
}
