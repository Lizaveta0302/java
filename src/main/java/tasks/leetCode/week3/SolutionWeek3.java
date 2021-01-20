package tasks.leetCode.week3;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SolutionWeek3 {

    //Bitwise AND of Numbers Range Solution
    public static int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n = n & (n - 1);
        }
        return m & n;
    }

    //НОД
    public static int GCD(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return GCD(a % b, b);
        } else {
            return GCD(a, b % a);
        }
    }

    //Jump Game
    //Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
    //Each element in the array represents your maximum jump length at that position.
    //Determine if you are able to reach the last index.
    public static boolean canJump(int[] nums) {
        int step = 1;
        int val;

        while (step < nums.length) {
            val = nums[step];
            if (step == nums.length - 1) {
                return true;
            }
            step += val;
        }
        return false;
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        return set.stream().filter(e -> e < 10).collect(Collectors.toSet());
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> set = new HashSet<>();

        set.addAll(set1.stream().filter(el -> !set2.contains(el)).collect(Collectors.toSet()));
        set.addAll(set2.stream().filter(el -> !set1.contains(el)).collect(Collectors.toSet()));

        return set;
    }
}
