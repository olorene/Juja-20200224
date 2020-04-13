package ua.com.juja.secondModuleRestart;

import ua.com.juja.helloWorld.PrintArray;

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
 * [[1, 2]      [[3, 1],
 *  [3, 4]] ->   [4, 2]]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[][] matrixCub = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
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
//        System.out.println("This is row " + matrix.length );
//        System.out.println("This is col " + matrix[0].length );


//        String[][] matrix = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "i"}};
//        String[][] matrix = {{"A", "B"}, {"C", "D"}};
/*        String[][] matrix = {{"A", "B", "C", "D"},
                            {"E", "F", "G", "H"},
                            {"i", "J", "K", "L"},
                            {"M", "N", "O", "P"}};
        int len = matrix.length - 1;
        System.out.println("Length " + len);
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len - 1; j++) {
                System.out.println("ij=" + i +  j + " - j(len-i)=" + j + (len - i));
                System.out.println(matrix[i][j] + " " + matrix[j][len-i]);
                printMatrix.printMatrix(matrix);

                String tmp = matrix[j][len - i];
                matrix[j][len - i] = matrix[i][j];
                matrix[i][j] = tmp;
                printMatrix.printMatrix(matrix);

                System.out.println("===============");
            }
        }
        String tmp = matrix[len][len];
        matrix[len][len] = matrix[len][0];
        matrix[len][0] = tmp;*/

/*        int[][] matrixFor = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43}} */;

        int[][] matrixFor = {
                {00, 01, 02, 03, 04},
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
        };

        int[][] matrixResult = {
                {13, 12, 11, 10},
                {23, 22, 21, 20},
                {33, 32, 31, 30},
                {43, 42, 41, 40}} ;

//        int[][] testMatrix = new int[][] {null};
//        int[][] testMatrix = new int[0][];
        int[][] testMatrix = new int[][] {{0, 0}, null};
        System.out.println(testMatrix.length);
//        printMatrix.printMatrix(matrixFor);
        rotateClockwise(testMatrix);
//        printMatrix.printMatrix(matrixFor);



/*        int[][] oldArray = {
                {10, 20, 30, 40},
                {11, 21, 31, 41},
                {12, 22, 32, 42},
                {13, 23, 33, 43}};
        int[][] newExpectedArray = {
                {13, 12, 11, 10},
                {23, 22, 21, 20},
                {33, 32, 31, 30},
                {43, 42, 41, 40}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");*/


    }

    private static void testCode(int[][] matrix) {
        System.out.println("========================");
        printMatrix.printMatrix(matrix);
//        System.out.println(Arrays.deepToString(matrix));
        if (rotateClockwise(matrix) != null) {
            printMatrix.printMatrix(matrix);
//            System.out.println(Arrays.deepToString(matrix));
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
        if (arg[0] == null) {
            System.out.println("new int[][]{null}");
            return null;
        }

//        длина не равна ширине,
        if (arg.length != arg[0].length) {
            System.out.println("длина не равна ширине,");
            return null;
        }
//        есть строки разной длины,
        for (int i = 0; i < arg.length; i++) {
//        есть строки с null вместо одномерных массивов
            if (arg[i] == null) {
                System.out.println("есть строки с null вместо одномерных массивов");
                return null;
            }
            if (arg[0].length != arg[i].length ) {
                System.out.println("есть строки разной длины,");
                return null;
            }
//        Элемент null
        }

        int size = arg.length;
        int maxValue = arg.length - 1;

        for (int row = 0; row < size / 2; row++) {
            for (int col = row; col < maxValue - row; col++) {

                int tmp = arg[row][col];
//                System.out.println("tmp = " + row  + "_" +  col);

                arg[row][col] = arg[maxValue-col][row];
//                System.out.println(row + "_" + col + " = " + (maxValue-col) + "_" + row);

                arg[maxValue-col][row] = arg[maxValue - row][maxValue - col];
//                System.out.println((maxValue-col)  + "_" + (row) + " = " + (maxValue - row)  + "_" + (maxValue - col));

                arg[maxValue - row][maxValue - col] = arg[col][maxValue - row];
//                System.out.println((maxValue - row)  + "_" +  (maxValue - col) + " = " + col  + "_" + (maxValue - row));

                arg[col][maxValue - row] = tmp;
//                System.out.println(col  + "_" +  (maxValue - row) + " = tmp");
//                System.out.println("//////////");
            }
//            System.out.println("==");
        }

        return arg;
    }

    public static void rotateAntiClockwise(int[][] matrix) {
        int size = matrix.length;
        int maxValue = size - 1;
        for (int row = 0; row < size / 2; row++) // border -> center
        {
            for (int col = row; col < maxValue - row; col++) // left -> right
            {
                // меняем местами 4 угла
                int tmp = matrix[row][col];
                matrix[row][col]  = matrix[col][maxValue - row];
                matrix[col][maxValue - row] = matrix[maxValue - row][maxValue - col];
                matrix[maxValue - row][maxValue - col] = matrix[maxValue - col][row];
                matrix[maxValue - col][row] = tmp;
            }
        }
    }

}
