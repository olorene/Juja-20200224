package ua.com.juja.secondModule;

public class Study {
    public static void main(String[] args) {
//        Звичайний цикл
//        loopNormal();
//        loopRecurtion();

//        Нормальний подвійний цикл
//        loopTowNormal();
//        loopTowRecursion();

//        Печатаем переобор типа
//        i j
//        1 1
//        1 2
//        1 3
//        2 2
//        2 3
//        3 3
//        loopTowOpt();
//        System.out.println("=============");
//        loopTowOptRec();

//        System.out.println(coinRecursion(-1));

//        permutation();

        matrix();
    }

    private static void matrix() {
        int[][] matrixA = {{1, 2, 3}, {2, 3}, {4, 5, 6}};
        int[][] matrixB = {{1, 2}, {4, 5}, {6, 7}};
//
//        for (int i = 0; i < matrixA.length; i++) {
//            System.out.println(matrixA[i].length);
//        }
//        System.out.println("========================");
//        System.out.println(matrixA.length);
//        System.out.println(matrixA[matrixA.length-1].length);
//        System.out.println("==============================");

        int[][] matrixC = {{1, 2, 3, 4}/*, {1, 2, 3}*/, {1, 2, 3, 4}};
        int[][] matrixD = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

//        int matrixCRow = matrixC.length;
//        int matrixCCol = matrixC[matrixC.length - 1].length;
//        System.out.println(matrixC.length);
//        System.out.println(matrixC[matrixC.length-1].length);
//        System.out.println(matrixD.length);
//        int matrixDRow = matrixD.length;
//        int matrixDCol = matrixD[matrixD.length - 1].length;
//        System.out.println(matrixD[matrixD.length-1].length);
//        System.out.println("=============");
//
//        System.out.println("Matrix C MxK-" + matrixCRow + "x" + matrixCCol);
//        System.out.println("Matrix D NxM-" + matrixDRow + "x" + matrixDCol);

        for (int i = 0; i < matrixD.length; i++) {
            for (int j = 0; j < matrixD.length; j++) {
                int result = 0;

                for (int k = 0; k < matrixD.length; k++) {
                    result += matrixC[j][k] * matrixD[k][i];
                }
                System.out.println(result);
            }
//            System.out.println();
        }
    }

    private static void permutation() {
        int[] arr = {10, 20, 30};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        String tmpVar = "HelloWorld!";
        swap(arr, 0, 1, tmpVar);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(tmpVar);
    }
    private static void swap(int[] matrix, int firstPosition, int secondPosition, String tmpVar){
        int tmp = matrix[firstPosition];
        matrix[firstPosition] = matrix[secondPosition];
        matrix[secondPosition] = tmp;

        tmpVar = tmpVar + " + Ha ha ha";
    }

    private static void array() {
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10 ,11, 12},
//                {13, 14, 15 ,16}};
        int[][] array0 = new int[2][3];
        int[][] array1 = new int[][]{new int[]{0,0,0,0}, new int[]{0,0,0}};
        int[][] array2 = new int[][]{{0,0,0}, {0,0,0}};
        int[][] array3 = {{0,0,0}, {0,0,0}};

        System.out.println(array1[0].length);

        System.out.println("arr[i][j]");
        for (int row = 0, col; row < array1.length; row++) {
            for (col = 0; col < array1[row].length - 1; col++) {
                System.out.print("arr[" + row + "][" + col + "] - " + array1[row][col] + "; ");
            }
            System.out.println("arr[" + row + "][" + col + "] - " + array1[row][col]);
        }
    }

    private static int coinRecursion(int amountForExchange) {
        int[] coins = {1, 2, 5, 10, 25, 50};

        if (amountForExchange <= 0) {
            return 0;
        }

        return coinRecursion(coins, amountForExchange, coins.length - 1);
    }

    private static int coinRecursion(int[] nominals, int amountForExchage, int coin) {
        if (amountForExchage == 0 || coin == 0) {
            return 1;
        }
        if (amountForExchage >= nominals[coin]) {
            return coinRecursion(nominals, amountForExchage - nominals[coin], coin) +
                    coinRecursion(nominals, amountForExchage, coin - 1);
        }

        return coinRecursion(nominals, amountForExchage, coin - 1);
    }

//    private static int exchAmountOfCoinsRecursion(int amountForExchange) {
//        int[] valueOfCoins = {1, 2};

//        for (int i = 0; i <= amountForExchange / valueOfCoins[i]; i++) {
//            return exchAmountOfCoinsRecursion(amountForExchange, valueOfCoins[i]);
//        }
//
//        return 0;
//    }
//    private static int exchAmountOfCoinsRecursion(int amountForExchange, int valueOfCoin) {
//
//        if (amountForExchange < 0) {
//            return 1;
//        } else {
//            return exchAmountOfCoinsRecursion(amountForExchange - valueOfCoin, valueOfCoin);
//        }
//
//    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int stack = 0;
        int countVariant = 0;

        for (int i2 = 0; i2 <= amountForExchange / 2; i2++) {
            for (int i1 = 0; i1 <= amountForExchange; i1++) {
                stack = (i2 * 2 + i1);
                if (stack == amountForExchange) {
                    countVariant += 1;
                    System.out.println("i2-" + i2+ " i1-" + i1);
                }
            }
        }

        return countVariant;
    }
    private static void loopTowOptRec() {
        int[] arr = {1, 2, 3};
        System.out.println("i j");
        int i = 0;
        int j = 0;

        loopTowOptRec(arr, i, j);

    }

    private static void loopTowOptRec(int[] arr, int i, int j) {

        System.out.println(arr[i] + " " + arr[j]);
        if (i < arr.length - 1) {
            if (j < arr.length - 1) {
                loopTowOptRec(arr, i, j + 1);
            } else {
                j = i + 1;
                loopTowOptRec(arr, i + 1, j);
            }
        }

    }
//=======================================================================================================
    private static void loopTowOpt() {
        int[] arr = {1, 2, 3};

        System.out.println("i j");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    private static void loopTowRecursion() {
        int i = 0;
        int j = 0;

        loopTowRecursion(i, j);
    }

    private static void loopTowRecursion(int i, int j) {
        System.out.println(i + " " + j);
        if (j < 2) {
            loopTowRecursion(i, j + 1);
        } else if (i < 2){
            loopTowRecursion(i + 1, 0);
        }
    }

    private static void loopTowNormal() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    private static void loopNormal() {
        int[] arr = {1, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void loopRecurtion() {
        int[] arr = {1, 2, 3, 4};
        loopRecurtion(arr, arr.length - 1);
    }

    public static void loopRecurtion(int[] arr, int i) {
        if (i == 0) {
            System.out.println(arr[i]);
        } else {
            loopRecurtion(arr, i - 1);
            System.out.println(arr[i]);
        }
    }

}
