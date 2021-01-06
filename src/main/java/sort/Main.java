package sort;

import java.util.Arrays;

public class Main {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = i; y < arr.length; y++) {
                if (arr[y] <= arr[i]) {
                    swap(arr, i, y);
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = min(arr, i);
            swap(arr, i, min);
        }
        return arr;
    }

    public static int min(int[] arr, int low) {
        int min = low;
        for (int i = low; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 13, 5, 6, 9, 1, 4, 25, 23};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
