package main.patterns.factoryMethodPattern;

public class GameFactory {

    public Game getGame(GameTypes type) {
        Game game = null;
        switch (type) {
            case SPORT:
                game = new SportGame();
                break;
            case ACTIVE:
                game = new ActiveGame();
                break;
            default:
                throw new IllegalArgumentException("Wrong game type:" + type);
        }
        return game;
    }
}
