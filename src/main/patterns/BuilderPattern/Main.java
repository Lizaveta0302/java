package main.patterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructUsualHouse(builder);

        House house = builder.getResult();
        System.out.println("House built:\n" + house.getType());

    }
}
