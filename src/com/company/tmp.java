package com.company;

import java.util.Arrays;

public class tmp {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
        int[] array = {6, 2, 7, 4, 5};

        fun(array);
    }

    public static void fun(int[] data) {

        System.out.println(Arrays.toString(data));
/*        for (int k = 0; k < data.length - 1; k++) {
            data = swap(data, k , k + 1);
            System.out.println(Arrays.toString(data));
        }
        System.out.println(Arrays.toString(data));*/

/*        for (int k = data.length - 1; k > 0; k--) {
            swap(data, k, k - 1);
        }*/
/*        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] > data[data.length - 1]) {
                data = swap(data, k, data.length - 1);
            }
        }
        System.out.println(Arrays.toString(data));*/

        for (int k = data.length - 1; k > 0; k--) {
            if (data[k] > data[k - 1]) {
                swap(data, k, k - 1);
            }
        }
        System.out.println(Arrays.toString(data));
    }

    public static int[] swap (int[] data, int i, int j) {

        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;

        return data;
    }
}
