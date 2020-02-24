package ua.com.juja.secondModule;

import java.util.Arrays;
import java.util.Random;

public class InsertionSorter {
    public static void main(String[] args) {
        int[] array = new int[256 * 1024];
        Random rnd = new Random(0);
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }
        long t1 = System.nanoTime();
        InsertionSorter.sort(array);
        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);

//        int [] arr = {4, 3, 6, 5, 2, 1};
//        System.out.println(Arrays.toString(arr));
//
//        arr = runClass.insertSortUpgrade(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

    public static int [] insertSortUpgrade(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int newElement = arr[index];
            int position = Arrays.binarySearch(arr, 0, index, newElement);

            if (position < 0) {
                position = -(position) - 1;
            }

            System.arraycopy(arr, position, arr, position + 1, index - position);
            arr[position] = newElement;
        }

        return arr;

    }
}
