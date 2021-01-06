package patterns.порождающие.prototype;

public class PrototypeApplication {

    public static void main(String[] args) {
        Project project = new Project("Java");
        Project copyProject = (Project) project.copy();

        System.out.println(project + " " + copyProject);
    }
}
