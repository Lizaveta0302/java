package test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MyLinkedList list = new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.reverseRecursively();

        System.out.println(list);
        //duplicateCharacterInStringWithMap("Programmer");

        int k = 5;
        k = (++k) + (++k);
        System.out.println(k);
    }

    public static void duplicateCharacterInString(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = i; y < arr.length - 1; y++) {
                if (i != y && arr[i] == arr[y]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void duplicateCharacterInStringWithMap(String str) {

        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int n = 1;
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], n);
            }
        }

        for (Character ch : map.keySet()) {
            if (map.get(ch) != 1) {
                System.out.println(ch + " - " + map.get(ch));
            }
        }
    }

    public static String reverseStringRecursively(String str) {

        if (str.length() < 2) return str;

        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }

    public static String reverseStringIteratively(String str) {

        char[] arr = str.toCharArray();
        char[] reverseArr = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            reverseArr[j] = arr[i];
        }

        return Arrays.toString(reverseArr);
    }

    public static int fibb(int n) {
        if (n <= 1) {
            return n;
        }
        return fibb(n - 1) + fibb(n - 2);
    }

    public static boolean isPalindrome(int n) {

        return n == reverse(n);
    }

    public static int reverse2(int n) {

        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }
    private static int fibb2(int n) {

        int n1 = 0;
        int n2 = 1;
        int s = 0;
        if (n == 1 || n == 2) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            s = n1 + n2;
            System.out.print(" " + s);
            n1 = n2;
            n2 = s;
        }

        System.out.println();
        return s;
        //return fibb(n - 1) + fibb(n - 2);
    }

    private static long dup3(int[] arr) {
        int XOR = 0;
        long n = arr.length;
        // long xor = (n % 4 == 0) ? n : (n % 4 == 1) ? 1 : (n % 4 == 2) ? n + 1 : 0;
        for (int i = 0; i < arr.length; i++) {
            XOR ^= arr[i];
        }
        return XOR;
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return reverse(n / 10);
        }
    }

    public static void dup1(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void dup2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            t = arr[i];
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
