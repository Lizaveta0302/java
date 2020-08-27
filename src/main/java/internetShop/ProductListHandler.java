package internetShop;

import java.util.ArrayList;
import java.util.List;

public class ProductListHandler {

    private static List<Product> prod = new ArrayList<>();

    public static void init() {
        prod.add(new Product("milk", 5, new FoodCategory("12.09.2020")));
        prod.add(new Product("bread", 3, new FoodCategory("15.11.2020")));
        prod.add(new Product("cup", 7, new NotFoodCategory("22.10.2020")));
        prod.add(new Product("tea", 2, new FoodCategory("04.12.2020")));
    }

    public static void addProduct(String name, long price, Category category) {
        Product newProduct = new Product(name, price, category);
        prod.add(newProduct);
    }

    public static void showProductList() {
        System.out.println("Product List: ");
        prod.forEach(p -> System.out.println(p.toString()));
    }

    public static List<Product> getProd() {
        return prod;
    }
}
