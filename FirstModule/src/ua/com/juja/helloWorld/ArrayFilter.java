package ua.com.juja.helloWorld;

/**
 * Created by Vlad on 27.10.2017.
 Отфильтровать массив так, чтобы оставить только четные элементы. Для проверки четности можно использовать
 операцию "остаток от деления" - %
 3 % 2 == 1;
 6 % 2 == 0;
 Исходящий массив, для простоты, должен быть того же размера, что и входящий. Например,
 для {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}
 */
public class ArrayFilter {
    public static int [] filterEven(int [] nums){
        int [] evenArr = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < evenArr.length; i++) {
            for (int j = counter; j < nums.length; j++) {
                counter += 1;
//                System.out.println(counter);
                if ((nums[j] % 2) == 0) {
                    evenArr[i] = nums[j];
                    break;
                }
            }
        }

        return evenArr;
    }
}
