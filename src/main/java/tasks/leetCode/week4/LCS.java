package tasks.leetCode.week4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Longest Common Subsequence
public class LCS {

    private static List<Character> res = new LinkedList<>();

    public static void main(String[] args) {

        String str1 = "LISARITAEEXRITAEELISARITAEE";
        String str2 = "LISARITAEEX";

        System.out.println(lcs(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
        Collections.reverse(res);
        System.out.println(res);
    }

    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    public static int lcs(char[] str1, char[] str2, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        } else if (str1[m - 1] == str2[n - 1]) {
            res.add(str1[m - 1]);
            return 1 + lcs(str1, str2, m - 1, n - 1);
        } else {
            return lcs(str1, str2, m - 1, n);
        }
    }
}
