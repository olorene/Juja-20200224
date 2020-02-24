package ua.com.juja.secondModuleRestart;

import java.util.Arrays;

public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            for (int location = k; location > 0; location--) {
                if (arr[location] < arr[location - 1]) {
                    int tmp = arr[location];
                    arr[location] = arr[location - 1];
                    arr[location - 1] = tmp;
                }
            }
//            ArrayProcessing.printArray(arr);
        }
    }

    public static void sortOptimise(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int position = Arrays.binarySearch(arr, 0, k - 1, arr[k]);
            System.out.println(position);

            if (position < 0) {
                position = -(position);
            }
            System.out.println(position);
            ArrayProcessing.printArray(arr);

//            System.arraycopy(arr, 0, arr, );

//            System.arraycopy(arr, 0, sortedArray, 0, k + 1);
//            int posititon = Arrays.binarySearch()
//            System.out.println(posititon);
//            System.out.println(k);
//            ArrayProcessing.printArray(sortedArray);

        }
    }

    public static void main(String[] args) {
        int sizeArray = 2;
        int[] array = ArrayProcessing.getRandomIntArray(sizeArray);
        ArrayProcessing.printArray(array);

        sortOptimise(array);


//        sort(array);
//        ArrayProcessing.printArray(array);

/*        int[] array2 = new int[6];
        System.arraycopy(array, 0, array2, 3, 3);
        ArrayProcessing.printArray(array2);*/

 /*       int[] array3 = {1, 3, 4, 8};
        ArrayProcessing.printArray(array3);
        int finded = Arrays.binarySearch(array3, 0, 2, 8);
        System.out.println("finded " + finded);
*/

    }
}
