package kz.epam.tam.module3.matrixmultiplication.core;

public class MatrixMultiplicator {

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
