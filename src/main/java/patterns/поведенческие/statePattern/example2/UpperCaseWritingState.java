package patterns.поведенческие.statePattern.example2;

public class UpperCaseWritingState implements WritingState {
    @Override
    public void type(String world) {
        System.out.println(world.toUpperCase());
    }
}
