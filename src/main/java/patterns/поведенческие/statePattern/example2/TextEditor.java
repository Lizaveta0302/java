package patterns.поведенческие.statePattern.example2;

public class TextEditor {

    private WritingState state;

    public void setState(WritingState state) {
        this.state = state;
    }

    public void type(String world){
        state.type(world);
    }
}
