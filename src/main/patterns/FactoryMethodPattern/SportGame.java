package main.patterns.FactoryMethodPattern;

public class SportGame implements Game{
    @Override
    public void play() {
        System.out.println("It is a sportGame...");
    }
}
