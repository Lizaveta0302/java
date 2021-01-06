package patterns.структурные.decoratorPattern;

public class App {

    public static void main(String[] args) {

        HandMadeProduct product = new SimpleProduct();
        System.out.println(product.getPrice());
        System.out.println(product.getDescription());

        Toy toy = new Toy(product);
        System.out.println(toy.getPrice());
        System.out.println(toy.getDescription());
    }
}
