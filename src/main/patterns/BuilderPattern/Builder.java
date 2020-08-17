package main.patterns.BuilderPattern;

public interface Builder {
    void setType(Type type);
    void setWalls(Wall wall);
    void setRoof(Roof roof);
}
