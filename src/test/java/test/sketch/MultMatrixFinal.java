package test.sketch;

import java.util.Scanner;

public class MultMatrixFinal {

    private Scanner scanner = new Scanner(System.in);


    public int[][] fillMatrix() {

        System.out.println("Please enter number of Matrix rows");
        int r = scanner.nextInt();
        System.out.println("Please enter number of Matrix elements(columns)");
        int e = scanner.nextInt();
        int[][] matrix = new int[r][e];

        for (int i = 0; i < r; i++) {
            System.out.println("Please enter elements for the row");
            for (int j = 0; j < e; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
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
    public int[][] multMatrices(int[][]matrixA,int[][]matrixB){
        int rA = matrixA.length;
        int eA = matrixA[0].length;
        int eB = matrixB[0].length;
        int[][] result = new int[rA][eB];
        for (int r = 0; r < rA; r++) { //2 iter
            for (int c = 0; c < eB; c++) { //4  iter
                for (int k = 0; k < eA; k++) { //3  iter
                    result[r][c] = result[r][c] + matrixA[r][k] * matrixB[k][c];
                }
            }
        }
        return result;
    }
}
