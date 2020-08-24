package multithreading.test;

import multithreading.RunnableThread;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnableThreadTest {

    private Thread thread;
    RunnableThread runnableThread;

    @Test
    public void creatingThreadTest() {
        runnableThread = new RunnableThread("Runnable");
        thread = new Thread(runnableThread);
        thread.start();
        assertEquals(runnableThread.getThreadName(), "Runnable");
    }
}
