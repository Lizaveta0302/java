package patterns.порождающие.factoryMethodPattern.example1;

public class Main {
    public static void main(String[] args) {
        /*GameFactory factory = new GameFactory();

        Game sport = factory.getGame(GameTypes.SPORT);
        Game active = factory.getGame(GameTypes.ACTIVE);

        sport.play();
        active.play();*/

        int[] arr = new int[]{1, 2, 3, 5, 5, 3, 1};

   /*     Stream.of(1, 2, 3, 5, 5, 3, 1)
                .forEach(i -> IntStream.range(0, arr.length)
                        .forEach(j -> IntStream.range(0, arr.length)
                                .filter(e -> j == i + 1)
                                .filter(s -> arr[i] == arr[j])
                                .forEach(System.out::print)
                        ));*/
    }
}
