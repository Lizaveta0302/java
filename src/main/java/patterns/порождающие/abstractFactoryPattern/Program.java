package patterns.порождающие.abstractFactoryPattern;

public class Program {
    public static void main(String[] args) {
        TeamFactory teamFabric = new WebTeamFactory();
        Team team = teamFabric.createTeam();
        team.getProgrammer().writeCode();
        team.getTester().testingCode();
    }
}
