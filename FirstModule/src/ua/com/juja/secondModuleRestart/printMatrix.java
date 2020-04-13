package ua.com.juja.secondModuleRestart;

public class printMatrix {
    public static void printMatrix(int[][] matrixReuslt) {
        System.out.println("---");
        for (int i = 0; i < matrixReuslt.length; i++) {
            for (int j = 0; j < matrixReuslt[0].length; j++) {
                System.out.print(matrixReuslt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(String[][] matrixReuslt) {
        System.out.println("---");
        for (int i = 0; i < matrixReuslt.length; i++) {
            for (int j = 0; j < matrixReuslt[0].length; j++) {
                System.out.print(matrixReuslt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = size * i + j;
            }
        }
    }
}