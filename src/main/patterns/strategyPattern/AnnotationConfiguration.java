package main.patterns.strategyPattern;

public class AnnotationConfiguration implements ConfigurationStrategy{
    @Override
    public void configure() {
        System.out.println("Configuration with annotations");
    }
}
