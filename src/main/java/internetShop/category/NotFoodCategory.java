package internetShop.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class NotFoodCategory implements Category, Serializable {
    private String lifeTime;
}
