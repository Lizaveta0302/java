package patterns.поведенческие.commandPattern;

public class ShippingCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Receiving product to the client.");
    }
}
