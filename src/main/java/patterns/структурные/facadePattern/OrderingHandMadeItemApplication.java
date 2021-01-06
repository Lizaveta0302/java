package patterns.структурные.facadePattern;

public class OrderingHandMadeItemApplication {

    public static void main(String[] args) {

        HandMadeOrderingFacade handMadeOrderingFacade = new HandMadeOrderingFacade();

        handMadeOrderingFacade.orderHandMadeItem("Big Beer Toy", 150, "26'Central street New York");
    }
}
