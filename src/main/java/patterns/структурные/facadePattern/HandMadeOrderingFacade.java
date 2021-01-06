package patterns.структурные.facadePattern;

public class HandMadeOrderingFacade {

    private PaymentService paymentService;
    private HandMadeService handMadeService;
    private ShippingService shippingService;

    public HandMadeOrderingFacade() {
        this.paymentService = new PaymentService();
        this.handMadeService = new HandMadeService();
        this.shippingService = new ShippingService();
    }

    public void orderHandMadeItem(String name, int price, String address) {
        paymentService.pay(price);
        handMadeService.makeHandMade(name);
        shippingService.deliverOrder(address);
    }
}
