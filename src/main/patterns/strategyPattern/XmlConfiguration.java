package main.patterns.strategyPattern;

public class XmlConfiguration implements ConfigurationStrategy {
    @Override
    public void configure() {
        System.out.println("Configuration with XML");
    }
}
