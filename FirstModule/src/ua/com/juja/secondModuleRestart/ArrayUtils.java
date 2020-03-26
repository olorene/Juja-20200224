package ua.com.juja.secondModuleRestart;

import java.util.Arrays;

/**
 * Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который
 * 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
 * (возможные ошибки:
 * null вместо массива,
 * одна из размерностей = 0,
 * длина не равна ширине,
 * есть строки разной длины,
 * есть строки с null вместо одномерных массивов)
 * 2) "проворачивает" массив по часовой стрелке на 90 градусов,
 * т.е [1] -> [1]
 * [[1, 2], [3, 4]] -> [[3, 1], [4, 2]]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 4, 3}};
        int[][] matrixNull = null;
        int[][] matrixZeroDimension = new int[0][0];
        int[][] matrixNotSquere = new int[2][3];
        int[][] matrixRowDiffSize = {{1, 2, 11}, {3, 4, 22}, {1, 2}};

//        testCode(matrix);
//        testCode(matrixNull);
//        testCode(matrixZeroDimension);
//        testCode(matrixNotSquere);
//        testCode(matrixRowDiffSize);
//        System.out.println(Arrays.deepToString(matrix));
        System.out.println("This is row " + matrix.length );
        System.out.println("This is col " + matrix[0].length );



    }

    private static void testCode(int[][] matrix) {
        System.out.println("========================");
        System.out.println(Arrays.deepToString(matrix));
        if (rotateClockwise(matrix) != null) {
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static int[][] rotateClockwise(int[][] arg) {
//        null вместо массива
        if (arg == null) {
            System.out.println("null вместо массива");
            return null;
        }
//        одна из размерностей = 0,
        if (arg.length == 0) {
            System.out.println("одна из размерностей = 0");
            return null;
        }
//        длина не равна ширине,
        if (arg.length != arg[0].length) {
            System.out.println("длина не равна ширине,");
            return null;
        }
//        есть строки разной длины,
        for (int i = 0; i < arg.length; i++) {
            if (arg[0].length != arg[i].length ) {
                System.out.println("есть строки разной длины,");
                return null;
            }
//        есть строки с null вместо одномерных массивов
            if (arg[i] == null) {
                System.out.println("есть строки с null вместо одномерных массивов");
                return null;
            }
        }

        return arg;
    }
}
