package ua.com.juja.secondModule;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/*
        [20, 30, 10]
        [10, 20, 30]
        [30, 20, 10]
        [20, 10, 30]
        [30, 10, 20]
        [10, 30, 20]
*/

public class Permutator {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
//        int[] arr = {1};

//        System.out.println(arr.length);
        permutation(arr, arr.length );
    }

    public static void permutation2(int[] arr, int size) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (size < 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            swap(arr, i, arr.length - 1);
            System.out.println(Arrays.toString(arr));
//            swap(arr, i, size - 1);
        }
        permutation2(arr, size - 1);
    }

    public static void permutation(int[] list, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
                permutation(list, size - 1);
                swap(list, k, size - 1);
            }
        }
    }
    public static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
