package patterns.поведенческие.statePattern.example2;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.setState(new UpperCaseWritingState());
        editor.type("HelloWorld!");

        editor.setState(new LowerCaseWritingState());
        editor.type("HelloWorld!");
    }
}
