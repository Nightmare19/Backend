/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class CharacterUtilities {

    static char lowerLetterSuccessorOf(char letra) {
        if (letra == 'z') {
            return 'a';
        } else {
            letra++;
        }
        return letra;
    }

    static char lowerLetterPredecessorOf(char letra) {
        if (letra == 'a') {
            return 'z';
        } else {
            letra--;
        }
        return letra;

    }

    static char lowerLetterSuccessorStepsOf(char letra, int steps) {
        for (int i = 0; i < steps; i++) {
            if (letra == 'z') {
                letra = 'a';
            } else {
                letra++;
            }
        }
        return letra;
    }

    static char lowerLetterPredecessorStepsOf(char letra, int steps) {
        for (int i = 0; i < steps; i++) {
            if (letra == 'a') {
                letra = 'z';
            } else {
                letra--;
            }
        }
        return letra;
    }

    static int occurrencesOfCharacterIn(char letra, char[] array) {
        int conta = 0;
        for (int i = 0; i < array.length; i++) {
            if (letra == array[i]) {
                conta++;
            }
        }
        return conta;
    }

    static void replaceCharacterln(char[] array, char oldChar, char newChar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar) {
                array[i] = newChar;
            }
        }
    }

    static char[] concatenationOf(char[] array, char[] array2) {
        char[] c = new char[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            c[i] = array[i];
        }
        for (int j = 0; j < array2.length; j++) {
            c[j + array.length] = array2[j];
        }
        return c;
    }
    public static char[] copyOfPartOf(char[] array, int indexStart, int indexEnd) {
        char[] partOfArray = new char[(indexEnd - indexStart)+1];
        int index = 0;
        for (int i = indexStart; i <= indexEnd; i++) {
            partOfArray[index] = array[i];
            index++;
        }
        return partOfArray;
    }
    
    
}