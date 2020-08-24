package patterns.builderPattern;

public interface Builder {
    void setType(Type type);
    void setWalls(Wall wall);
    void setRoof(Roof roof);
}
