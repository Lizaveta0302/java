package main.patterns.FactoryMethodPattern;

public class ActiveGame implements Game {
    @Override
    public void play() {
        System.out.println("it is an activeGame...");
    }
}
