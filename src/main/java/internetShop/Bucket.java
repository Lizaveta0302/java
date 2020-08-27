package internetShop;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Data
public class Bucket {

    @Getter
    private static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct(Product prod) {
        products.add(prod);
    }
}
