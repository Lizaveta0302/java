package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

    private static Stream<Integer> stream;

    public static List<Integer> processMultiples(List<Integer> list) {
        stream = list.stream().sorted();
        return stream.filter(e -> {
            return (e % 2000000) == 0;
        }).collect(Collectors.toList());
    }

    public static List<Integer> increaseValue(List<Integer> list) {
        stream = list.stream().sorted();
        return stream.map(e -> e * 2).collect(Collectors.toList());
    }

    public static List<Integer> parallelIncreaseValue(List<Integer> list) {
        stream = list.stream().sorted();
        return stream.parallel().map(e -> e * 2).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(87);
        stream = list.stream();
        list.add(32);
        list.add(24);
        stream.forEach(e -> System.out.println(e));
    }
}