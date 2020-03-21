package ua.com.juja.secondModuleRestart;

public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.case_Array();
        matrix.case_Matrix();

    }
    public void case_Array() {
        int[] array = {1, 2, 3};
        int[] array2 = new int[3];
        array2[0] = 4;
        array2[1] = 4;
        array2[2] = 4;

    }
    public void case_Matrix(){
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 1;
        matrix[1][1] = 2;
        matrix[1][2] = 3;


    }
}
