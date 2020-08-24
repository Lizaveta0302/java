package collections.arrayList;

import org.junit.Test;

public class MyArrayListImplementationTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testArrayList() {
        MyArrayListImplementation<Integer> list = new MyArrayListImplementation<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assert (2 == list.get(1));

        list.get(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegative() {
        MyArrayListImplementation<Integer> list = new MyArrayListImplementation<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.get(-1);
    }
}
