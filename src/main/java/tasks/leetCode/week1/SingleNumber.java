package tasks.leetCode.week1;

import java.util.Arrays;

public class SingleNumber {

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