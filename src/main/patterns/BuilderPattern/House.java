package main.patterns.BuilderPattern;

public class House {
    private final Type type;
    private final Wall wall;
    private final Roof roof;

    public House(Type type, Wall wall, Roof roof) {
        this.type = type;
        this.wall = wall;
        this.roof = roof;
    }

    public Type getType() {
        return type;
    }

    public Wall getWall() {
        return wall;
    }

    public Roof getRoof() {
        return roof;
    }
}
