package test.sketch;

import java.util.Scanner;

public class MultMatrixVer2 {


    public void test() {

        int r;
        int e;
        Scanner scanner = new Scanner(System.in);
        //fill matrices rows and columns
        System.out.println("Please enter number of rows.Matrix A");
        r = scanner.nextInt();
        System.out.println("Please enter number of elements(columns).Matrix A");
        e = scanner.nextInt();
        int[][] matrixA = new int[r][e];
        System.out.println("Please enter number of rows.Matrix B");
        r = scanner.nextInt();
        System.out.println("Please enter number of elements(columns).Matrix B");
        e = scanner.nextInt();
        int[][] matrixB = new int[r][e];
        System.out.println("Please enter number of rows.Matrix C");
        r = scanner.nextInt();
        System.out.println("Please enter number of elements(columns).Matrix C");
        e = scanner.nextInt();
        int[][] matrixC = new int[r][e];

        int aR = matrixA.length;
        int aE = matrixA[0].length;
        int bR = matrixB.length;
        int bE = matrixB[0].length;
        int cR = matrixC.length;
        int cE = matrixC[0].length;

        //fill elements
        System.out.println("Please enter elements for the first row. Matrix A");
        for (int i = 0; i < aR; i++) { //2 iter
            for (int j = 0; j < aE; j++) { //3 iter
                matrixA[i][j] = scanner.nextInt();
            }
            System.out.println("Please enter elements for the second row. Matrix A");
        }
        //fill elements
        System.out.println("Please enter elements for the first row. Matrix B");
        for (int a = 0; a < bR; a++) { //2 iter
            for (int b = 0; b < bE; b++) { //3 iter
                matrixB[a][b] = scanner.nextInt();
            }
            System.out.println("Please enter elements for the next row. Matrix B");
        }

        System.out.println("Matrix A [" + aR + "][" + aE + "]: ");
        System.out.println("Matrix B [" + bR + "][" + bE + "]: ");
        System.out.println("Result Matrix C [" + cR + "][" + cE + "]: ");

        ///multiply
        for (int r1 = 0; r1 < aR; r1++) { //2 iter
            for (int c = 0; c < bE; c++) { //4  iter
                for (int k = 0; k < aE; k++) { //3  iter
                    matrixC[r1][c] = matrixC[r1][c] + matrixA[r1][k] * matrixB[k][c];
                }
                System.out.print(matrixC[r1][c] + " ");
            }
            System.out.println(",");
        }
    }
}