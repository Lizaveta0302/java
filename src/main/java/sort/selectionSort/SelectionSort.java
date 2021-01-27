package sort.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int minPos;
        int minValue;
        for (int i = 0; i < arr.length; i++) {
            minPos = i;
            minValue = arr[i];
            for (int y = i; y < arr.length; y++) {
                if (arr[y] < minValue) {
                    minPos = y;
                    minValue = arr[y];
                }
            }
            arr[minPos] = arr[i];
            arr[i] = minValue;
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            swap(arr, i, min(arr, i));
        }
        return arr;
    }

    private static int min(int[] arr, int l) {
        int min = l;
        for (int i = l + 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    private static void swap(int[] arr, int i, int y) {
        int tmp = arr[i];
        arr[i] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 6, 6, 4, 44, 4, 4, 7};
        //System.out.println(Arrays.toString(selection(arr)));
        System.out.println(Arrays.toString(arr));
    }
}
