package patterns.порождающие.builderPattern.example2;

public class CRMProjectBuilder extends Builder {

    public CRMProjectBuilder(Project project) {
        super(project);
    }

    @Override
    void buildLanguage() {
        project.setLanguage("Java");
    }

    @Override
    void buildFramework() {
        project.setFramework("Spring");
    }
}
