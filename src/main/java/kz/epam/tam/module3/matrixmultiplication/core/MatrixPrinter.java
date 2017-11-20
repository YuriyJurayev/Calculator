package kz.epam.tam.module3.matrixmultiplication.core;

public class MatrixPrinter {

    public void printMatrix(int[][] matrix) {
        if (matrix.length != 0) {
            int rows = matrix.length;
            int elements = matrix[0].length;
            System.out.println("Matrix [" + rows + "][" + elements + "]: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < elements; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix [0][0]");
        }
    }

}
