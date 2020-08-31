package internetShop.bucket;

import internetShop.product.ProductListHandler;
import internetShop.product.Product;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

@Slf4j
public class BucketHandler {
    @Getter
    private static Bucket bucket = new Bucket();

    private static String filename = "bucket.txt";

    public static void serialize() {
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(Bucket.getProducts());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialize() {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Bucket.setProducts((ArrayList<Product>) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

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
