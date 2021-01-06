package patterns.структурные.proxyPattern;

public class Main {

    public static void main(String[] args) {

        Product toyProxy = new ToyProxy();
        toyProxy.madeProduct();
    }
}
