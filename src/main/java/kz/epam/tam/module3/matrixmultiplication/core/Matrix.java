package kz.epam.tam.module3.matrixmultiplication.core;

public class Matrix {

    public void multiplicateMatrices(){
        MatrixFiller filler = new MatrixFiller();
        MatrixMultiplicator multiplicator = new MatrixMultiplicator();
        MatrixPrinter printer = new MatrixPrinter();
        int [][] matrixA = filler.fillMatrix();
        int [][] matrixB = filler.fillMatrix();
        int [][] matrixC = multiplicator.multMatrices(matrixA,matrixB);
            if(matrixC != null) {
            printer.printMatrix(matrixA);
            printer.printMatrix(matrixB);
            printer.printMatrix(matrixC);
        }
            else{
            System.out.println("Invalid dimension of:");
            printer.printMatrix(matrixA);
            printer.printMatrix(matrixB);
        }
    }
}
