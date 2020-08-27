package internetShop;

import java.util.Scanner;

public class BucketHandler {
    private static Bucket bucket = new Bucket();

    private static Scanner sc = new Scanner(System.in);

    public static void addToTheBucket(int num) {
        Product product = ProductListHandler.getProd().get(num);
        if (product != null) {
            bucket.addProduct(product);
        }
    }

    public static void deleteFromBucket(int del) {
        bucket.getProducts().remove(del);
    }

    public static void clearBucket() {
        BucketHandler.getBucket().getProducts().clear();
    }

    public static void showProductsInTheBucket() {
        System.out.println("Products in the bucket: ");
        bucket.getProducts().stream().forEach(p -> System.out.println(p.toString()));
    }

    public static Bucket getBucket() {
        return bucket;
    }
}
