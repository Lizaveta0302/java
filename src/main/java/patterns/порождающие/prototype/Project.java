package patterns.порождающие.prototype;

public class Project implements Copyable {
    private String projectLanguage;

    public Project(String projectLanguage) {
        this.projectLanguage = projectLanguage;
    }

    public String getProjectLanguage() {
        return projectLanguage;
    }

    public void setProjectLanguage(String projectLanguage) {
        this.projectLanguage = projectLanguage;
    }

    @Override
    public Object copy() {
        return new Project(projectLanguage);
    }

    @Override
    public String toString() {
        return "Project{" +
                "language='" + projectLanguage + '\'' +
                '}';
    }
}
