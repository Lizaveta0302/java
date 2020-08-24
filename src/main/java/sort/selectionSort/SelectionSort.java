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

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
