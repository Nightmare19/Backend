/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class CharacterDrawingUtilities {
    public static void drawElement (char carater){
        System.out.print(carater);
    }
    public static void drawNewLine (){
        System.out.println("");
    }

    static void drawHorizontalSegmentWith(char c,int n) {
        for (int i = 0; i < n; i++) {
            drawElement(c);
        }
    }

    static void drawFilledRectangleWith(char carater, int altura,int comprimento) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 10; j++) {
                drawElement(carater);
            }
            drawNewLine();
        }
    }

    static void drawEmptyRectangleWith(char carater, int altura, int comprimento ) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < comprimento; j++) {
            if(i==0 || i == altura-1 || j == 0 || j == comprimento-1){
                drawElement(carater);
            }else{
                drawElement(' ');
            }}    
            drawNewLine();
        }
    }
}
