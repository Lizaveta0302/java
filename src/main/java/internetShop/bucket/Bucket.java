package internetShop.bucket;

import internetShop.product.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class Bucket implements Serializable {

    private static final long serialVersionUID = 2857621923888034157L;
    @Getter
    @Setter
    private static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct(Product prod) {
        products.add(prod);
    }
}
