package collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Test {

    public static void main(String a[]) {
        TreeMap<Empl, String> tm = new TreeMap<Empl, String>(new MyNameComp().thenComparing(new MySalaryComp()));
        tm.put(new Empl("zzz", 3000), "RAM");
        tm.put(new Empl("aaa", 6000), "JOHN");
        tm.put(new Empl(null, 0), "AOHN");
        tm.put(new Empl(null, 500), "AOHN1");
        tm.put(new Empl("xxx", 2000), "BOHN");
        Set<Empl> keys = tm.keySet();
        for (Empl key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
    }
}

class MyNameComp implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        if (Objects.isNull(e1.getName()) || Objects.isNull(e2.getName())) {
            return -1;
        } else if (e1.getName().length() - e2.getName().length() > 0) {
            return 1;
        } else return 0;
    }
}


class MySalaryComp implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getSalary() - e2.getSalary();
    }
}

class Empl {

    private String name;
    private int salary;

    public Empl(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
}