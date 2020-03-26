package ua.com.juja.secondModuleRestart;

public class printMatrix {
    public static void printMatrix(int[][] matrixReuslt) {
        for (int i = 0; i < matrixReuslt.length; i++) {
            for (int j = 0; j < matrixReuslt[0].length; j++) {
                System.out.print(matrixReuslt[i][j] + " ");
            }
            System.out.println();
        }
    }
}