package internetShop;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class BucketHandler {
    @Getter
    private static Bucket bucket = new Bucket();

    public static void addToTheBucket(int num) {
        Optional<Product> product = Optional.ofNullable(ProductListHandler.getProd().get(num));
        product.ifPresent(Bucket::addProduct);
    }

    public static void deleteFromBucket(int del) {
        Bucket.getProducts().remove(del);
    }

    public static void clearBucket() {
        Bucket.getProducts().clear();
    }

    public static void showProductsInTheBucket() {
        log.info("Products in the bucket: ");
        Bucket.getProducts().forEach(System.out::println);
    }
}
