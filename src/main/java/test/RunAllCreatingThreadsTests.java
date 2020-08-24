package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CallableThreadTest.class, ExecutorsThreadsTest.class,
        NewThreadTest.class, RunnableThreadTest.class})
public class RunAllCreatingThreadsTests {
}
