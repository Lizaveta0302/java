package collections.map;

import org.junit.Test;


class MyMapTest {

    @Test
    public void testMyMap() {

        MyMap<String, Integer> map = new MyMap<>();
        map.put("sd", 1);
        map.put("cds", 2);
        map.put("cdsf", 1);
        assert (map.get("sd").equals(1));

        assert (map.get("cds").equals(2));

    }

}