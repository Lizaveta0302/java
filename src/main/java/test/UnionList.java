package test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionList {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(3);
        list1.add(8);
        list1.add(5);
        list1.add(6);

        list2.add(1);
        list2.add(3);
        list2.add(6);

        getUnionLists(list1, list2);

        System.out.println(list1.stream().reduce(Integer::sum));

        System.out.println(isPalindrome(123321));

    }

    private static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int k = 0;
        while (n > 0) {
            k = k * 10 + n % 10;
            n /= 10;
        }
        return k;
    }


    private static List<Integer> getUnionLists(List<Integer> list1, List<Integer> list2) {

        Set<Integer> unionSet1 = new HashSet<>(list1);
        Set<Integer> unionSet2 = new HashSet<>(list2);

        List<Integer> newList = new LinkedList<>();

        for (Integer el : unionSet2) {
            if (unionSet1.contains(el)) {
                newList.add(el);
            }
        }
        unionSet1.stream().map(el -> unionSet2.contains(el) ? newList.add(el) : "").collect(Collectors.toList());
        System.out.println(newList);
        return newList;
    }
}