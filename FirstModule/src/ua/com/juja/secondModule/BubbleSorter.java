package ua.com.juja.secondModule;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int [] arr = {2,6,3,5,1,4};

        sort(arr);

    }

    public static void sort(int[] arr) {

        System.out.println(Arrays.toString(arr));

// 4-5 3-4 2-3 1-2 0-1 4-5 3-4 2-3 1-2 4-5 3-4 2-3 4-5 3-4 4-5
//        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
        for (int barrier = 0; barrier <= arr.length - 1; barrier++) {
//            for (int index = 0; index < barrier; index++) {
            for (int index = arr.length - 1; index > barrier; index--) {

                System.out.println((index - 1) + " - " + index);
                System.out.println(Arrays.toString(arr));
                if (arr[index - 1] > arr[index]) {
                    int tmp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}