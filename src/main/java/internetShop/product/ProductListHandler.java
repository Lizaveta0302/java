package internetShop.product;

import internetShop.category.Category;
import internetShop.category.FoodCategory;
import internetShop.category.NotFoodCategory;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ProductListHandler {

    @Getter
    private static List<Product> prod = new ArrayList<>();

    public static void init() {
        prod.add(new Milk("CoconutMilk", 5, new FoodCategory("12.09.2020"), 2.7));
        prod.add(new Product("bread", 3, new FoodCategory("15.11.2020")));
        prod.add(new Product("cup", 7, new NotFoodCategory("22.10.2020")));
        prod.add(new Product("tea", 2, new FoodCategory("04.12.2020")));
    }

    public static void addProduct(String name, long price, Category category) {
        Product newProduct = new Product(name, price, category);
        prod.add(newProduct);
    }

    public static void showProductList() {
        log.info("Product List: ");
        prod.forEach(System.out::println);
    }
}