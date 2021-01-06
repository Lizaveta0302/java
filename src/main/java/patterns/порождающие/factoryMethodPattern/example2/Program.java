package patterns.порождающие.factoryMethodPattern.example2;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory javaFactory = new JavaDeveloperFactory();
        Developer javaDeveloper = javaFactory.createDeveloper();
        javaDeveloper.writeCode();

        DeveloperFactory cppFactory = new CppDeveloperFactory();
        cppFactory.createDeveloper().writeCode();

    }
}
