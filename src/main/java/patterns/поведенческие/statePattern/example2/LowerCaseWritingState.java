package patterns.поведенческие.statePattern.example2;

public class LowerCaseWritingState implements WritingState {
    @Override
    public void type(String world) {
        System.out.println(world.toLowerCase());
    }
}
