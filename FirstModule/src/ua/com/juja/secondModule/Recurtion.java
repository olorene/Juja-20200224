package ua.com.juja.secondModule;

import java.util.Arrays;

public class Recurtion {
    public static boolean debugMode = true;

    public static void main(String[] args) {
        int[] emptyArray = {};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        int[] backSortedArray = {100, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] randomSortedArray = {64, 1, 2, 23, 7, 123, 5, 2, 0, -1};
        int[] sortSmallArray = {1, 2, 3, 4, 5, 6};
        int[] unsortSmallArray = {4, 6, 3, 1, 5, 2, 7};
        int[] verySmallArray1 = {3, 1, 2, 4};

//        debugMode = true;
        info(sort(verySmallArray1));

//        prArr(verySmallArray1);
//        int start = 0;
//        int end  = verySmallArray1.length - 1;
//        int middle = (start + end) / 2;
//        System.out.println("START-" + start + " MIDDLE-" + middle + " END-" + end);
//        mergeArray(verySmallArray1,start, middle, end);



    }

    private static void mergeSort(int[] array, int start, int end) {
        if (end - start < 1) return;

        int middle = (start + end) / 2;

        mergeSort(array, start, middle);
        mergeSort(array,middle + 1, end);
        debug(array, " Before merge start=" + start + " end=" + end);
        mergeArray(array, start, middle, end);
        debug(array, " After merge start=" + start + " end=" + end);
    }

    private static void mergeArray(int[] array, int start, int middle, int end) {
        int[] buffer = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        for (int k = start; k <= end; k++) {
            if (j > end || (i <= middle && array[i] <= array[j])) {
                buffer[k - start] = array[i++];
            } else {
                buffer[k - start] = array[j++];
            }
        }
        for (int k = start; k <= end; k++) {
            array[k] = buffer[k - start];
        }
//        prArr(array);
    }

//    private static void prArr(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//    }

    private static void info(int[] array) {
        boolean oldDebugMode = debugMode;
        debugMode = true;
        debug(array);
        debugMode = oldDebugMode;
    }

    private static void debug(int[] array) {
        debug(array, "");
    }

    private static void debug(int[] array, String message) {
        if (!debugMode) return;
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("}" + message);
    }

    private static int[] sort(int[] array) {
        mergeSort(array, 0, array.length - 1);

        return array;
    }
}
