package kz.epam.tam.module3.matrixmultiplication;

import java.util.Scanner;

public class MultMatrices {

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

    public int[][] multMatrices(int[][]matrixA,int[][]matrixB){
        if (matrixA.length == 0){
            return new int[0][0];
        }
        if (matrixA[0].length != matrixB.length){
            return null;
        }
        int rA = matrixA.length;
        int eA = matrixA[0].length;
        int eB = matrixB[0].length;
        int[][] result = new int[rA][eB];
        for (int r = 0; r < rA; r++) {
            for (int c = 0; c < eB; c++) {
                for (int k = 0; k < eA; k++) {
                    result[r][c] = result[r][c] + matrixA[r][k] * matrixB[k][c];
                }
            }
        }
        return result;
    }
}
