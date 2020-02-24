package ua.com.juja.secondModule;

/**
 * Created by Vlad on 02.12.2017.
 */
public class Matirx
{
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] matrixB = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3},{1, 2, 3}};
/*        10 20 30
        10 20 30*/

//        int[][] matrixA = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
//        int[][] matrixB = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
/*        6 12 18
        6 12 18
        6 12 18*/

        printMatrix(matrixA);
        separator();
        printMatrix(matrixB);
        separator();

        System.out.println(matrixA.length);
        System.out.println(matrixA[matrixA.length - 1].length);

//              matrixB          matrixA
//          row(2) X col(4) = row(4) X col(2)
//
        int rowC = matrixA.length;
        int colC = matrixB[matrixB.length - 1].length;
        int[][] matrixC = new int[rowC][colC];
        multipleMatrix(matrixA, matrixB, matrixC);

        printMatrix(matrixC);

    }

    private static void multipleMatrix(int[][] matrixA, int[][] matrixB, int[][] matrixC) {
        for (int rowA = 0; rowA < matrixA.length; rowA++) {
            for (int colB = 0; colB < matrixB[matrixB.length - 1].length; colB++) {
                int result = 0;
                for (int rowB = 0; rowB < matrixB.length; rowB++) {
                    result += matrixA[rowA][rowB] * matrixB[rowB][colB];
                }
                matrixC[rowA][colB] = result;
//                System.out.print(result + " ");
            }
//            System.out.println();
        }
    }

    private static void separator() {
        System.out.println("====================");
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
