package streamAPI.test;

import org.junit.Before;
import org.junit.Test;
import streamAPI.StreamApiExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StreamApiExampleTest {
    private List<Integer> list;
    private List<Integer> resultList;

    @Before
    public void init() {
        list = Arrays.asList(3, 8000000, 200, 1, 45, 6000000, 5);
        resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(6);
        resultList.add(10);
        resultList.add(90);
        resultList.add(400);
        resultList.add(12000000);
        resultList.add(16000000);
    }

    @Test
    public void processMultiplesTesting() {
        resultList.clear();
        resultList.add(6000000);
        resultList.add(8000000);
        assertTrue(StreamApiExample.processMultiples(list).equals(resultList));
    }

    @Test
    public void increaseValueTesting() {
        assertTrue(StreamApiExample.increaseValue(list).equals(resultList));
    }

    @Test
    public void parallelIncreaseValueTesting() {
        Stream<Integer> stream = StreamApiExample.parallelIncreaseValue(list).stream();
        Stream<Integer> streamOrder = StreamApiExample.parallelIncreaseValue(list).stream();
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();
        streamOrder.forEachOrdered(e -> System.out.print(e + " "));
        assertTrue(StreamApiExample.parallelIncreaseValue(list).equals(resultList));
    }
}
