package test;

import multithreading.CallableThread;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import static org.junit.Assert.*;

public class CallableThreadTest {

    private Callable callable;
    private FutureTask task;
    private Thread thread;

    @Before
    public void initCallableThread() {
        callable = new CallableThread("Callable Thread");
        task = new FutureTask(callable);

        thread = new Thread(task);
        thread.start();
    }

    @Test
    public void creatingCallableThreadTest() {
        assertTrue(thread.isAlive());
    }

    @Test
    public void resultCallableThreadTest() throws ExecutionException, InterruptedException {
        assertEquals(task.get(), 5);
    }

    @After
    public void checkInterruptedCallableTest() {
        assertFalse(thread.isInterrupted());
    }
}
