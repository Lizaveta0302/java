package patterns.поведенческие.commandPattern;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setCommand(new MakeCommand());
        manager.setCommand(new ShippingCommand());
        manager.makeOrder();
    }
}
