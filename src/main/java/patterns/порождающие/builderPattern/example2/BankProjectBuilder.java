package patterns.порождающие.builderPattern.example2;

public class BankProjectBuilder extends Builder {

    public BankProjectBuilder(Project project) {
        super(project);
    }

    @Override
    void buildLanguage() {
        project.setLanguage("C++");
    }

    @Override
    void buildFramework() {
        project.setFramework("CPP");
    }
}
