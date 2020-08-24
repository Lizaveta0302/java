package sort.mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int length) {

        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];

        if (length < 2)
            return;

        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, length - mid);

        mergeSort(l, mid);
        mergeSort(r, length - mid);
        merge(arr, l, r, mid, length - mid);
    }

    private static void merge(int[] arr, int[] l, int[] r, int l_size, int r_size) {

        int ls = 0;
        int rs = 0;
        int n = 0;

        while (ls < l_size && rs < r_size) {
            if (l[ls] <= r[rs]) {
                arr[n++] = l[ls++];
            } else {
                arr[n++] = r[rs++];
            }
        }
        while (ls < l_size) {
            arr[n++] = l[ls++];
        }
        while (rs < r_size) {
            arr[n++] = r[rs++];
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 234, 1, 14, 43, 2};
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
