package ua.com.juja.secondModule;

import java.util.Arrays;

public class SelectionSorter {
    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
/*
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
*/

        for (int i = 0; i < arr.length-1; i++){
            int minElement = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (minElement > arr[j]) {
                    minElement = arr[j];
                    minIndex = j;
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = minElement;
        }

        System.out.println(Arrays.toString(arr));
/*        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minIndex = barrier;
            int min = arr[minIndex]

            for (int index = barrier + 1; index < arr.length; index++) {
                if (min > arr[index]) {
                    min = arr[index];
                    minIndex = index;
                }
            }

            arr[minIndex] = arr[barrier];
            arr[barrier] = min;
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
