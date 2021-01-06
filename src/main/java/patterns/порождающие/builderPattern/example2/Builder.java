package patterns.порождающие.builderPattern.example2;

public abstract class Builder {

    Project project;

    public Builder(Project project) {
        this.project = project;
    }

    abstract void buildLanguage();

    abstract void buildFramework();

    Project getProject() {
        return project;
    }
}
