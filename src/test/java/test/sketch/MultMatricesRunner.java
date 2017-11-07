package test.sketch;

public class MultMatricesRunner {

    public static void main (String[] arg) {

        MultMatrixFinal multMatrix = new MultMatrixFinal();
        int [][] matrixA = multMatrix.fillMatrix();
        int [][] matrixB = multMatrix.fillMatrix();
        int [][] matrixC = multMatrix.multMatrices(matrixA,matrixB);
        multMatrix.printMatrix(matrixA);
        multMatrix.printMatrix(matrixB);
        multMatrix.printMatrix(matrixC);
    }
}

