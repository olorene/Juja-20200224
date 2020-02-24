package ua.com.juja.secondModule;

import java.util.Arrays;

public class RecurtionTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        strangeIteration(array);
    }

    private static void strangeIteration(int[] arr){
        int[] newArray = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int elemental = arr[i];
            System.out.println(elemental);
            newArray[i] = arr[counter++];
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static void f(int x) {
        System.out.print(" " + x);
        if (x < 15) {
            f(2 * x);
        } else {
            System.out.print(" |");
        }
        System.out.print(" " + x);
    }
}
