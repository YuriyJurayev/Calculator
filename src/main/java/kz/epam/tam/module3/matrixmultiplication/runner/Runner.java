package kz.epam.tam.module3.matrixmultiplication.runner;

import kz.epam.tam.module3.matrixmultiplication.MultMatrices;

public class Runner {
    public static void main (String[] arg) {

        MultMatrices multMatrix = new MultMatrices();
        int [][] matrixA = multMatrix.fillMatrix();
        int [][] matrixB = multMatrix.fillMatrix();
        int [][] matrixC = multMatrix.multMatrices(matrixA,matrixB);
        if(matrixC != null) {
            multMatrix.printMatrix(matrixA);
            multMatrix.printMatrix(matrixB);
            multMatrix.printMatrix(matrixC);
        }
        else{
            System.out.println("Invalid dimension of:");
            multMatrix.printMatrix(matrixA);
            multMatrix.printMatrix(matrixB);
        }
    }
}

