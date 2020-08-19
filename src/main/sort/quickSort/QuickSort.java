package main.sort.quickSort;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr, int start, int end) {
        int pos = start + (end - start) / 2;
        int l = start;
        int r = end;
        int middle = arr[pos];

        while (l < r) {
            while (arr[l] < middle) {
                l++;
            }
            while (arr[r] > middle) {
                r--;
            }
            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        if (start < r)
            quickSort(arr, start, r);
        if (end > l)
            quickSort(arr, l, end);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 2, 1, 8};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }
}
