package internetShop.entity.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class NotFoodCategory implements Category, Serializable {
    private static final long serialVersionUID = -5840210389991225718L;
    private String lifeTime;
}
