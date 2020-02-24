package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Vlad on 12.11.2017.
 */
public class BubleSort {
    public static void main(String[] args) {
        int[][] unsortArray0 = {{3, 2, 6}, {1, 8}};
        int[] unsortArray1 = {3, 2, 6, 1, 8};
        int[] unsortArray2 = {5, 3, 2, 1, 4};
        int[] unsortArray3 = new int[unsortArray2.length];

//        System.out.println(Arrays.toString(unsortArray1));
//        System.out.println(Arrays.equals(unsortArray1, unsortArray2));

//        System.out.println(Arrays.deepToString(unsortArray0));
        System.arraycopy(unsortArray2, 0 , unsortArray3, 0, unsortArray2.length);

//        System.out.println(Arrays.toString(unsortArray3));

        int[] unsortArray4 = Arrays.copyOf(unsortArray3, unsortArray3.length);
        System.out.println(Arrays.toString(unsortArray4));

//        bubleSort(unsortArray4);

        insertSort(unsortArray4);
        

        System.out.println(Arrays.toString(unsortArray4));
    }

    private static void insertSort(int[] unsortArray) {
        for (int i = 1; i < unsortArray.length; i++) {
            int sortElement = unsortArray[i];
            int j = i - 1;
            for (; j >= 0 && unsortArray[j] > sortElement; j--) {
                unsortArray[j + 1] = unsortArray[j];
            }
            unsortArray[j + 1] = sortElement;
            System.out.println(Arrays.toString(unsortArray));
        }
    }

    private static void bubleSort(int[] unsortArray) {
        for (int i = 0; i < unsortArray.length; i++) {
            for (int j = i; j < unsortArray.length; j++) {
                if (unsortArray[i] > unsortArray[j]) {
                    int tmp = unsortArray[i];
                    unsortArray[i] = unsortArray[j];
                    unsortArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(unsortArray));
    }
}
