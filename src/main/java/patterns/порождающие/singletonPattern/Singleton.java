package patterns.порождающие.singletonPattern;

public final class Singleton {
    private static volatile Singleton object;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getObject(String value) {
        if (object == null) {
            synchronized (Singleton.class) {
                if (object == null) {
                    object = new Singleton(value);
                }
            }
        }
        return object;
    }
}
