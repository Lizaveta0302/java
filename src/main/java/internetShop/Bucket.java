package internetShop;

import java.util.ArrayList;

public class Bucket {

    private static ArrayList<Product> products = new ArrayList<>();

    public Bucket() {
    }

    public Bucket(ArrayList<Product> product) {
        products = product;
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> product) {
        products = product;
    }
}
