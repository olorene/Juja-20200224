package ua.com.juja.secondModuleRestart;

import java.util.Arrays;

public class Permutator {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
//        System.out.println(Arrays.toString(arr));
        permutation(arr, arr.length);
//        permutation2(arr, arr.length);
    }
    public static void permutation(int[] list, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
                permutation(list, size - 1);
                swap(list, k, size - 1);
//                System.out.println(Arrays.toString(list) + " tmp");
            }
        }
    }

    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
