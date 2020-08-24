package test;

import multithreading.ExecutorsTreads;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExecutorsThreadsTest {

    private ExecutorsTreads executor;

    @Test
    public void executorServiceTesting() throws ExecutionException, InterruptedException {
        executor = new ExecutorsTreads(Executors.newSingleThreadExecutor());
        Future future = executor.executorService.submit(executor.task2());
        assertEquals(future.get(), 123);
        assertTrue(future.isDone());
    }
}
