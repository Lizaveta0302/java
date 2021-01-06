package patterns.порождающие.builderPattern.example2;

public class Project {
    String language;
    String framework;

    public Project() {
    }

    public Project(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Project{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
