package test.leetCode.week1;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {3, 7, 3, 2, 5, 2, 5};
        System.out.print(singleNumberByOr(arr));
    }

    // return one single number with time complexity O(n)
    public static int singleNumber(int[] nums) {

        int distinctSum = Arrays.stream(nums).distinct().sum();

        int sum = Arrays.stream(nums).sum();

        return 2 * distinctSum - sum;
    }

    public static int singleNumberByOr(int[] nums) {

        int item = 0;
        for (int i : nums) {
            item ^= i;
        }
        return item;
    }
}
