package patterns.структурные.facadePattern;

public class PaymentService {
    public void pay(int price) {
        System.out.println("Payment is paid - " + price + "$");
    }
}
