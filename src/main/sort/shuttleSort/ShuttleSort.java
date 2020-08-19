package main.sort.shuttleSort;

import java.util.Arrays;

public class ShuttleSort {

    public static int[] shuttleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i);
                int right = i - 1;
                int left = right - 1;
                while (left >= 0) {
                    if (arr[right] < arr[left]) {
                        swap(arr, right);
                    }
                    left--;
                    right--;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int a) {
        int temp = arr[a];
        arr[a] = arr[a - 1];
        arr[a - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {32, 4, 6, 8, 2, 43, 1};
        System.out.println(Arrays.toString(shuttleSort(arr)));
    }
}
