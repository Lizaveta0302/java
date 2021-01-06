package patterns.порождающие.abstractFactoryPattern;

public class WebTeamFactory implements TeamFactory {
    @Override
    public Team createTeam() {
        return new Team(new JavaProgrammer(), new QATester());
    }
}
