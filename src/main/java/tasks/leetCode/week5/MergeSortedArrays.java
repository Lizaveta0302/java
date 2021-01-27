package tasks.leetCode.week5;

import java.util.Arrays;

public class MergeSortedArrays {

    // Method 2 (O(n1 + n2) Time and O(n1 + n2) Extra Space
    public static int[] merge(int[] arr1, int[] arr2) {

        int l1 = arr1.length;
        int l2 = arr2.length;

        int i = 0, j = 0, k = 0;

        int[] res = new int[l1 + l2];

        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < l1) {
            res[k++] = arr1[i++];
        }

        while (j < l2) {
            res[k++] = arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 8, 9};
        int[] arr2 = {1, 2, 4, 7, 33};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
