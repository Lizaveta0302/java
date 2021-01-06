package patterns.структурные.facadePattern;

public class ShippingService {

    public void deliverOrder(String address) {
        System.out.println("Order is delivered to the " + address);
    }
}
