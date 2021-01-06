package patterns.поведенческие.strategyPattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.config(new XmlConfiguration());

        context.config(new AnnotationConfiguration());
    }
}
