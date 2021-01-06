package patterns.порождающие.builderPattern.example2;

public class BuildProjectApplication {

    public static void main(String[] args) {

        Project project = new Project();
        Builder builder = new CRMProjectBuilder(project);
        Director director = new Director(builder);

        director.buildProject();
        System.out.println(builder.getProject());
    }
}
