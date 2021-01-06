package patterns.порождающие.builderPattern.example2;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void buildProject() {
        builder.buildLanguage();
        builder.buildFramework();
    }
}
