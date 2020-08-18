package main.patterns.factoryMethodPattern;

public class SportGame implements Game{
    @Override
    public void play() {
        System.out.println("It is a sportGame...");
    }
}
