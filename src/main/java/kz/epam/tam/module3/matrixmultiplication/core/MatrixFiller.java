package kz.epam.tam.module3.matrixmultiplication.core;

import java.util.Scanner;

public class MatrixFiller {

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
}
