package internetShop.exceptions;

public class ProductIsNotAddedException extends RuntimeException {

    public ProductIsNotAddedException() {
        super("Prod is not added...");
    }

    public ProductIsNotAddedException(String message) {
        super(message);
    }
}
