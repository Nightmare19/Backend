/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class Ficha3Test {

    public static void main(String[] args) {
        char letra = 'a';
        int steps = 2;
        char[] array ={'a','b','c','a'}; 
        char[] array2 ={'a','b','c','a'};
        char a = CharacterUtilities.lowerLetterSuccessorOf(letra);
        System.out.println(a);
        char b = CharacterUtilities.lowerLetterPredecessorOf(letra);
        System.out.println(b);
        char c = CharacterUtilities.lowerLetterSuccessorStepsOf(letra,steps);
        System.out.println(c);
        char d = CharacterUtilities.lowerLetterPredecessorStepsOf(letra,steps);
        System.out.println(d);
        int e = CharacterUtilities.occurrencesOfCharacterIn(letra,array);
        System.out.println(e);
        char[] g = CharacterUtilities.concatenationOf(array,array2);
        System.out.println(g);
    }
}
