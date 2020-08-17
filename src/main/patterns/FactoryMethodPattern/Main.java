package main.patterns.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        GameFactory factory = new GameFactory();

        Game sport = factory.getGame(GameTypes.SPORT);
        Game active = factory.getGame(GameTypes.ACTIVE);

        sport.play();
        active.play();
    }
}
