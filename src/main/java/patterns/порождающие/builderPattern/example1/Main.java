package patterns.порождающие.builderPattern.example1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructUsualHouse(builder);

        House house = builder.getResult();
        System.out.println("House built: " + house.getType());

    }
}
