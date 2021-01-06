package multithreading.multithreadingTast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Double> res = new HashSet<>();
        ArrayList<Long> time = new ArrayList<>();
        ArrayList<Thread> arrThreads = new ArrayList<>();
        ArrayList<Runnable> tasks = new ArrayList<>();


        for (int i = 0; i < TestConsts.N; i++) {
            int pos = i;
            Runnable task = () -> {
                long start = System.currentTimeMillis();
                try {
                    res.addAll(TestCalc.calculate(pos));
                } catch (TestException e) {
                    e.printStackTrace();
                }
                time.add(System.currentTimeMillis() - start);
                long r = time.stream().reduce((long) 0, Long::sum) / time.size();
                System.out.println(r);
                System.out.println(Thread.currentThread().getName());
            };
            tasks.add(task);
        }
        for (int t = 0; t < TestConsts.MAX_THREADS; t++) {
            arrThreads.add(new Thread(tasks.get(t)));
        }
        arrThreads.forEach(Thread::start);
    }
}
