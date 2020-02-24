package ua.com.juja.helloWorld;

/**
 * Created by Vlad on 27.10.2017.
 */
public class IterationArray
{
    public static void invert(int[] arr) {
        printArr(arr);
        System.out.println("");
        for (int k = (arr.length / 2) - 1; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value);
        }
    }
}
