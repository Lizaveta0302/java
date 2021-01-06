package patterns.структурные.decoratorPattern;

public class Toy implements HandMadeProduct {

    protected HandMadeProduct simpleProduct;

    public Toy(HandMadeProduct simpleProduct) {
        this.simpleProduct = simpleProduct;
    }

    @Override
    public int getPrice() {
        return this.simpleProduct.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.simpleProduct.getDescription().concat(" -> HandMade Toy..");
    }
}
