package patterns.поведенческие.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void makeOrder() {
        commands.forEach(Command::execute);
    }
}
