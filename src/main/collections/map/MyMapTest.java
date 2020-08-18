package main.collections.map;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {

    @Test
    public void testMyMap() {

        MyMap<String, Integer> map = new MyMap<>();
        map.put("sd", 1);
        map.put("cds", 2);
        map.put("cdsf", 1);
        assertEquals(map.get("sd"), 1);

        assertEquals(map.get("cds"), 2);

    }

}