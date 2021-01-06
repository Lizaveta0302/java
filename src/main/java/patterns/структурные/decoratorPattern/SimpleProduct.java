package patterns.структурные.decoratorPattern;

public class SimpleProduct implements HandMadeProduct {
    @Override
    public int getPrice() {
        return 35;
    }

    @Override
    public String getDescription() {
        return "Simple HandMade Product..";
    }
}
