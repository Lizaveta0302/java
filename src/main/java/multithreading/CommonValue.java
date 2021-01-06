package multithreading;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CommonValue {

    private int num = 0;

    private List<Long> timeList;
    private Map<String, List> resultMap = new HashMap<>();

    @Synchronized
    public void increment() {
        timeList = new ArrayList<>();
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num = num + 1;
        timeList.add((long) getCount());
        timeList.add(System.currentTimeMillis() - start);
        resultMap.put(Thread.currentThread().getName(), timeList);
    }

    public void showMap() {
        String mapAsString = resultMap.keySet().stream()
                .map(key -> key + ", Value/Time: " + resultMap.get(key))
                .collect(Collectors.joining("; ", "(", ")"));
        System.out.println(mapAsString);
    }

    public int getCount() {
        return num;
    }
}