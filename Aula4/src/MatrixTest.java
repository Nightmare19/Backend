/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class MatrixTest {
   
    public static void main(String[] args) {
        int[][] matrix = {
            {4,1,0},
            {0,1,0},
            {0,0,1}
        };
        int constante = 2;
        int [][] matrix2 = {
            {2,1,1},
            {1,2,1},
            {1,1,2}
        };
        char carater = 'a';
        MatrixUtilities.show(matrix);
        boolean isMatrix = MatrixUtilities.isMatrix(matrix);
        boolean isIdentity = MatrixUtilities.isIdentity(matrix);
        System.out.println("Matriz identidade: " + isIdentity);
        int[][] multiplyBy = MatrixUtilities.multiplyBy(matrix, constante);
        MatrixUtilities.show(multiplyBy);
        boolean areCompatibleForSum = MatrixUtilities.areCompatibleForSum(matrix, matrix2);
        int sumOf = MatrixUtilities.sumOf(matrix, matrix2);
        CharacterDrawingUtilities.drawElement(carater);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('x',10);
        CharacterDrawingUtilities.drawFilledRectangleWith('x',10,10);
        CharacterDrawingUtilities.drawEmptyRectangleWith('x',10,10);
    }
   
}