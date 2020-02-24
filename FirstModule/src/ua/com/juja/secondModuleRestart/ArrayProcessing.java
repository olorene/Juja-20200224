package ua.com.juja.secondModuleRestart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProcessing {
    public static int[] shuffleArray(int[] arr) {
        int[] outArr = new int[arr.length];
        List<Integer> solution = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            solution.add(arr[i]);
        }
        Collections.shuffle(solution);

        Object[] objArr = solution.toArray();
        for (int i = 0; i < objArr.length; i++ ) {
            outArr[i] = (int)(objArr[i]);

        }

        return outArr;
    }

    static void printArray(int[] arrNumShuf) {
        for (int i = 0; i < arrNumShuf.length; i++) {
            System.out.print(arrNumShuf[i]);
        }
        System.out.println();
    }

    static int[] getIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }

    public static int[] getRandomIntArray(int size) {
        int[] array = new int[size];
        array = getIntArray(size);
        array = shuffleArray(array);

        return array;
    }

    public static void main(String[] args) {
        int sizeArray = 5;
        int[] myArray = getIntArray(sizeArray);
        int[] myArrayRandom = getRandomIntArray(sizeArray);
        int[] shuflledArray = shuffleArray(myArray);

        System.out.print("myArray - ");
        printArray(myArray);
        System.out.print("myArrayRandom - ");
        printArray(myArrayRandom);
        System.out.print("shuflledArray - ");
        printArray(shuflledArray);
    }
}
