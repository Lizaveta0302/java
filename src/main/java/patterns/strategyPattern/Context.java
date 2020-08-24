package patterns.strategyPattern;

public class Context {

    public void config(ConfigurationStrategy configurationStrategy){
        configurationStrategy.configure();
    }

}
