package main.sort.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = arr.length - 1; y > i; y--) {
                if (arr[y - 1] > arr[y]) {
                    swap(arr, y, y - 1);

                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 6, 9, 4, 32, 5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
