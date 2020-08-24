package test;

import multithreading.CommonValue;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

public class CommonValueTest {

    @Test
    public void incrementCommonValueTesting() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        CommonValue synchronizedValue = new CommonValue();

        for (int i = 0; i < 15; i++) {
            executorService.submit(() -> synchronizedValue.increment());
        }

        Thread.sleep(1000);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        synchronizedValue.showMap();

        assertEquals(synchronizedValue.getCount(), 15);
    }
}
