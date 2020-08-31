package internetShop.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class FoodCategory implements Category, Serializable {
    private static final long serialVersionUID = -3247825817805488698L;
    private String expirationDate;
}
