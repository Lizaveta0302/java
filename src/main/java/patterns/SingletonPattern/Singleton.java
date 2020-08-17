package main.java.patterns.SingletonPattern;

public final class Singleton {
    private static Singleton object;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getObject(String value) {
        if (object == null) {
            object = new Singleton(value);
        }
        return object;
    }
}
