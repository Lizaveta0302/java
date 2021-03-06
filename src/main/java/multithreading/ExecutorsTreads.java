package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsTreads {

    public ExecutorService executorService;

    public ExecutorsTreads(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Runnable task1() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " execute task1");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    public Callable<Integer> task2() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " execute task2");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 123;
        };
    }
}
