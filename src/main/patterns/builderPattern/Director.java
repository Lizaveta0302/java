package main.patterns.builderPattern;

public class Director {
    public void constructUsualHouse(Builder builder) {
        builder.setType(Type.USUAL_HOUSE);
        builder.setWalls(new Wall("redbrick"));
        builder.setRoof(new Roof(5));
    }
    public void constructAmericanHouse(Builder builder) {
        builder.setType(Type.AMERICAN_HOUSE);
        builder.setWalls(new Wall("corrugation"));
        builder.setRoof(new Roof(12));
    }
}
