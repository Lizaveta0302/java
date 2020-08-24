package multithreading.test;

import multithreading.NewThread;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NewThreadTest {

    @Test
    public void creatingNewThreadTest() {
        NewThread thread = new NewThread("New Thread");
        thread.start();
        assertTrue(thread.isAlive());
    }
}
