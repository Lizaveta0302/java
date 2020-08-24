package collections.map;

import java.util.Arrays;

public class MyMap<K, V> {
    private int size;
    private int defaultCapacity = 16;
    private MyEntry<K, V>[] values = new MyEntry[defaultCapacity];

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void ensureCapacity() {
        if (size == values.length) {
            values = Arrays.copyOf(values, values.length * 2);
        }
    }

    public void put(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert) {
            ensureCapacity();
            values[size++] = new MyEntry<>(key, value);
        }
    }

    public int getSize() {
        return size;
    }
}
