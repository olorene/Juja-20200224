package ua.com.juja.secondModuleRestart;

public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int size = 4;
        int[][] array = new int[size][size];
        printMatrix.fillMatrix(array);
        printMatrix.printMatrix(array);
        System.out.println(array[1][2]);

        ArrayUtils.rotateAntiClockwise(array);
        printMatrix.printMatrix(array);

//        matrix.case_Array();
//        matrix.case_Matrix();
/*        int[][] newMatrix = {
                {1, 2, 3},
                {1, 2 ,3},
                {1, 2, 3},

        };
        System.out.println(newMatrix.length);*/

/*        int[][] array =  {
            { 1,2,3,4,5 },
            { 5,6,7,8,6 },
            { 9,0,1,2,7 },
            { 3,4,5,6,8 },
            { 3,4,5,6,8 },
            { 3,4,5,6,8 }
        };*/

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
        int[][] matrix3 = new int[3][4];
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[0][2] = 3;
        matrix3[0][3] = 3;

        matrix3[1][0] = 1;
        matrix3[1][1] = 2;
        matrix3[1][2] = 3;

        matrix3[2][0] = 1;
        matrix3[2][1] = 2;
        matrix3[2][2] = 3;

        matrix3[3][0] = 1;
        matrix3[3][1] = 2;
        matrix3[3][2] = 3;




    }
}
