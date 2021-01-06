package patterns.порождающие.abstractFactoryPattern;

public class Team {
    Programmer programmer;
    Tester tester;

    public Team(Programmer programmer, Tester tester) {
        this.programmer = programmer;
        this.tester = tester;
    }

    public Team() {
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public Tester getTester() {
        return tester;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }
}
