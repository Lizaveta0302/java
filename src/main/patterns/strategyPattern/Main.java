package main.patterns.strategyPattern;

public class Main {
    public static void main(String[] args) {
        ConfigurationStrategy strategy = new XmlConfiguration();
        Context context = new Context();
        context.config(strategy);
    }
}
