package main.collections.arrayList;

import java.util.Arrays;

public class MyArrayListImplementation<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private int size = 0;
    private Object elements[];

    public MyArrayListImplementation() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + "Size: " + size);
        }
        return (T) elements[i];
    }

}
