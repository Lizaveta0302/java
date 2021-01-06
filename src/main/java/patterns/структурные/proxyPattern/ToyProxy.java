package patterns.структурные.proxyPattern;

public class ToyProxy implements Product {

    Product toy = new Toy();

    @Override
    public void madeProduct() {
        System.out.println("Proxy is invoked..");
        toy.madeProduct();
    }
}
