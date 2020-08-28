package internetShop.currency;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Currency {
    private int internationalCode;
    private String name;
    private double course;
    private long multiplicity;
}
