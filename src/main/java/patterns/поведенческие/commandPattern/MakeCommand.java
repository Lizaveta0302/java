package patterns.поведенческие.commandPattern;

public class MakeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Making the product.");
    }
}
