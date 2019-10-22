/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class MatrixUtilities {

    static void show(int[][] matrix) {
        System.out.println("\n" + "show:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    static boolean isMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
        if (matrix[0].length == matrix[1].length && matrix[1].length == matrix[2].length) {
            System.out.println("É Matriz!");
        } else {
            System.out.println("Não É Matriz!");
        }
        return true;
    }

    static boolean isIdentity(int[][] matrix) {
        boolean identity = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    identity = false;
                } else if (i != j && matrix[i][j] != 0) {
                    identity = false;
                }
            }
        }
        return identity;
    }

    static int[][] multiplyBy(int[][] matrix, int constante) {
        int[][] produto = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                produto[i][j] = matrix[i][j] * constante;
            }
        }
        return produto;
    }

    static boolean areCompatibleForSum(int[][] matrixA, int[][] matrixB) {                
        if(isMatrix(matrixA) && isMatrix(matrixB)){
            if(matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length)
                return true;
            else{
                return false;
            }
        }
        else{
            return false;
        }                      
    }

    static int sumOf(int[][] matrix, int[][] matrix2) {
        int produto = 0;
        System.out.println("\n" + "sumOf:");
        if (matrix[0].length == matrix2[0].length && matrix[1].length == matrix2[1].length && matrix[2].length == matrix2[2].length) {
            System.out.println("É compatível para soma!");
        } else {
            System.out.println("Não é compatível para soma!");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                produto = matrix[i][j] + matrix2[i][j];
                System.out.print(produto);
            }
            System.out.println("");
        }
        return produto;
    }
}
