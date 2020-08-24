package sort.shellSort;

import java.util.Arrays;

public class ShellSort {

    private static int[] shellSort(int[] arr) {
        int j;
        for (int mid = arr.length / 2; mid > 0; mid /= 2) {
            for (int i = mid; i < arr.length; i++) {
                int tmp = arr[i];
                for (j = i; j >= mid && tmp < arr[j - mid]; j -= mid) {
                    arr[j] = arr[j - mid];
                }
                arr[j] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 9, 2, 1, 7};
        System.out.println(Arrays.toString(shellSort(arr)));
    }
}
