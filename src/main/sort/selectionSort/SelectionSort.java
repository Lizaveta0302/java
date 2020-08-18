package main.sort.selectionSort;

import main.sort.bubbleSort.BubbleSort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int y = i; y < arr.length; y++) {
                if (arr[y] < arr[min]) {
                    min = y;
                }
            }
            BubbleSort.swap(arr, min, i);
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
