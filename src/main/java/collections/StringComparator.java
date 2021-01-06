package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StringComparator implements Comparator<String> {


    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new StringComparator());
        map.put(null, null);
        map.put("bhjk", null);
        map.put("bjh", "jnlljk");

        System.out.println(map);
    }

    @Override
    public int compare(String str1, String str2) {
        return str1.equals(str2) ? str1.compareTo(str2) : str1.length() - str2.length();
    }
}
