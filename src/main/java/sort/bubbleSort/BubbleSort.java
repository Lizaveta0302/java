package sort.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = arr.length - 1; y > i; y--) {
                if (arr[y - 1] > arr[y]) {
                    int c = arr[y];
                    arr[y] = arr[y - 1];
                    arr[y - 1] = c;
                }
            }
        }
        return arr;
    }

    public static int[] bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = i; y < arr.length; y++) {
                if (arr[i] >= arr[y]) {
                    int tmp = arr[i];
                    arr[i] = arr[y];
                    arr[y] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 6};
        System.out.println(Arrays.toString(bubble(arr)));
    }
}
