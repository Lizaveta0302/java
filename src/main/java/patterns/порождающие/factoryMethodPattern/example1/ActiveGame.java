package patterns.порождающие.factoryMethodPattern.example1;

public class ActiveGame implements Game {
    @Override
    public void play() {
        System.out.println("it is an activeGame...");
    }
}
