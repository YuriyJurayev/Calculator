package test.scratch;

import org.testng.annotations.Test;

public class MultMatrixVer1 {

    @Test
    public void MultiplyMatrix () {
        int[][] matrixA = new int[2][3];
        int[][] matrixB = new int[3][4];
        int[][] matrixC = new int[2][4];

        /*for (int row = 0; row < matrixA.length; row++) {
            for (int i = 0; i < matrixA[row].length; i++) {
                matrixA[row][i] = i+1;
                System.out.print(matrixA[row][i]);
            }
            System.out.println(",");
        }*/

        //hardcode and print a value
        System.out.println("------matrixA-------");
        System.out.println("------first row-------");
        System.out.println(matrixA[0][0]=1);
        System.out.println(matrixA[0][1]=3);
        System.out.println(matrixA[0][2]=2);
        System.out.println("------second row-------");
        System.out.println(matrixA[1][0]=0);
        System.out.println(matrixA[1][1]=4);
        System.out.println(matrixA[1][2]=-1);


        /*for (int row = 0; row < matrixB.length; row++) {
            for (int i = 0; i < matrixB[row].length; i++) {
                matrixB[row][i] = i+1;
                System.out.print(matrixB[row][i]);
            }
            System.out.println(",");
        }*/

        //hardcode and print a value
        System.out.println("------matrixB-------");
        System.out.println("------first row-------");
        System.out.print(matrixB[0][0]=2);
        System.out.print(matrixB[0][1]=0);
        System.out.print(matrixB[0][2]=-1);
        System.out.println(matrixB[0][3]=1);
        System.out.println("------second row-------");
        System.out.print(matrixB[1][0]=3);
        System.out.print(matrixB[1][1]=-2);
        System.out.print(matrixB[1][2]=1);
        System.out.println(matrixB[1][3]=2);
        System.out.println("------third row-------");
        System.out.print(matrixB[2][0]=0);
        System.out.print(matrixB[2][1]=1);
        System.out.print(matrixB[2][2]=2);
        System.out.println(matrixB[2][3]=3);

        /* multiply
        matrixC[0][0] = (matrixA[0][0] * matrixB[0][0])+(matrixA[0][1] * matrixB[1][0])+(matrixA[0][2] * matrixB[2][0]);  ///a11*b11+a12*b21+a13*b31=c11
        System.out.println("matrixC11:" + matrixC[0][0]);
        matrixC[0][1] = (matrixA[0][0] * matrixB[0][1])+(matrixA[0][1] * matrixB[1][1])+(matrixA[0][2] * matrixB[2][1]);  ///a11*b12+a12*b22+a13*b32=c12
        System.out.println("matrixC12:" + matrixC[0][1]);
        matrixC[0][2] = (matrixA[0][0] * matrixB[0][2])+(matrixA[0][1] * matrixB[1][2])+(matrixA[0][2] * matrixB[2][2]);  ///a11*b13+a12*b23+a13*b33=c13
        System.out.println("matrixC13:" + matrixC[0][2]);
        matrixC[0][3] = (matrixA[0][0] * matrixB[0][3])+(matrixA[0][1] * matrixB[1][3])+(matrixA[0][2] * matrixB[2][3]);  ///a11*b14+a12*b24+a13*b34=c14
        System.out.println("matrixC14:" + matrixC[0][3]);

        matrixC[1][0] = (matrixA[1][0] * matrixB[0][0])+(matrixA[1][1] * matrixB[1][0])+(matrixA[1][2] * matrixB[2][0]);  ///a21*b11+a22*b21+a23*b31=c21
        System.out.println("matrixC21:" + matrixC[1][0]);
        matrixC[1][1] = (matrixA[1][0] * matrixB[0][1])+(matrixA[1][1] * matrixB[1][1])+(matrixA[1][2] * matrixB[2][1]);  ///a21*b12+a22*b22+a23*b32=c22
        System.out.println("matrixC22:" + matrixC[1][1]);
        matrixC[1][2] = (matrixA[1][0] * matrixB[0][2])+(matrixA[1][1] * matrixB[1][2])+(matrixA[1][2] * matrixB[2][2]);  ///a21*b13+a22*b23+a23*b33=c23
        System.out.println("matrixC23:" + matrixC[1][2]);
        matrixC[1][3] = (matrixA[1][0] * matrixB[0][3])+(matrixA[1][1] * matrixB[1][3])+(matrixA[1][2] * matrixB[2][3]);  ///a21*b14+a22*b24+a23*b34=c24
        System.out.println("matrixC24:" + matrixC[1][3]);*/

        //multiply within the loop
        System.out.println("----------matrixC------------");
        for (int r = 0; r < matrixA.length; r++) { //2 iter
            for (int c = 0; c < matrixB[0].length; c++) { //4  iter
                for (int k = 0; k < matrixA[0].length; k++) { //3  iter
                    matrixC[r][c] = matrixC[r][c] + matrixA[r][k] * matrixB[k][c];
                            }
                System.out.print(matrixC[r][c] + " ");
            }
            System.out.println(",");
        }

    }
}