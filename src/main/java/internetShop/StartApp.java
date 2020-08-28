package internetShop;

import internetShop.bucket.Bucket;
import internetShop.bucket.BucketHandler;
import internetShop.product.ProductListHandler;

import java.util.Scanner;

import static java.lang.System.exit;

public class StartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductListHandler.init();
        BucketHandler.deserialize();
        System.out.println("It is an Internet Shop! Please, choose the action you want to do ");
        System.out.println(" 1-Show product list \n 2-Add product to the bucket \n 3-Show products in the bucket \n 4-Delete product from the bucket \n 5-Clear the bucket \n 6-exit");
        while (true) {
            System.out.println("Your choice: ");
            String input = sc.nextLine();
            switch (input) {
                case "1": {
                    ProductListHandler.showProductList();
                    break;
                }
                case "2": {
                    ProductListHandler.showProductList();
                    System.out.println("Choose product,  please:");
                    String num = sc.nextLine();
                    if (Integer.parseInt(num) < ProductListHandler.getProd().size()) {
                        BucketHandler.addToTheBucket(Integer.parseInt(num));
                    } else {
                        System.out.println("Wrong input..");
                    }
                    break;
                }
                case "3": {
                    BucketHandler.showProductsInTheBucket();
                    break;
                }
                case "4": {
                    BucketHandler.showProductsInTheBucket();
                    System.out.println("Enter the product number to be deleted: ");
                    String in = sc.nextLine();
                    if (Integer.parseInt(in) < Bucket.getProducts().size()) {
                        BucketHandler.deleteFromBucket(Integer.parseInt(in));
                    } else {
                        System.out.println("Wrong number");
                    }
                    break;
                }
                case "5": {
                    System.out.println("Clear the bucket");
                    System.out.println("Are you sure? y/n");
                    String in = sc.nextLine();
                    if (in.equals("y")) {
                        BucketHandler.clearBucket();
                        System.out.println("All done");
                    } else {
                        System.out.println("The bucket is not cleaned..");
                    }
                    break;
                }
                case "6": {
                    BucketHandler.serialize();
                    System.out.println("Bye");
                    exit(0);
                }
                default: {
                    System.out.println("Wrong input, try again..");
                    break;
                }
            }
        }
    }
}
