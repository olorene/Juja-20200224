package ua.com.juja.helloWorld;
import java.util.Arrays;

/**
 * Created by Vlad on 18.10.2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        int [] arr1 = {5, 4, 3, 2, 1, 0};
//        int [] arr2 = {4, 3, 5, 2, 7, 3};
//        int [] arr = {0,0,0,0,0,0};
//        int [] arr1 = {0};
//        int [] arr2= {1};

//        IterationArray.invert(arr);
//        PrintArray.print(ArrayFilter.filterEven(arr));
//        PrintArray.print(Merger.merge(arr1,arr2));
//        Merger.merge(arr1, arr2);

        int[] result = Merger.merge(new int[]{1, 1}, new int[]{1});

        PrintArray.print(result);
//        if (!Arrays.equals(result, new int[]{1, 2, 3})) {
//            throw new AssertionError();
//        }

        System.out.print("OK");
    }
}