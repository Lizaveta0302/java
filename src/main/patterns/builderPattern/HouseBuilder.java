package main.patterns.builderPattern;

public class HouseBuilder implements Builder {
    private Type type;
    private Wall wall;
    private Roof roof;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setWalls(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public House getResult() {
        return new House(type, wall, roof);
    }
}
