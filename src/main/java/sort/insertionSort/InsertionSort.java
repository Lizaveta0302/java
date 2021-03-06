package sort.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int y = i - 1;
            while (y >= 0 && arr[y] > k) {
                arr[y + 1] = arr[y];
                y = y - 1;
            }
            arr[y + 1] = k;
        }
        return arr;
    }

    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 56, 8, 9, 2, 4, 9};
        System.out.println(Arrays.toString(insertion(arr)));
    }
}
