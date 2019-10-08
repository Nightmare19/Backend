/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class ArrayUtilities {

    static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += array[i];
            } else {
                str += array[i] + ",";
            }

        }
        return str;
    }

    static int maximumOf(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    static int minimumOf(int[] array) {
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean contains(int[] array, int valor) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                res = 1;
                break;
            }
        }
        return res == 1;
    }

    public static boolean containsDuplicates(int[] array) {
        int repetido = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repetido = 1;
                }
            }
        }
        return repetido == 1;
    }

    public static int indexOf(int[] array, int valor) {
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static int[] add(int[] array, int valor) {
        int[] arrayValor = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayValor[i] = array[i];
        }
        arrayValor[array.length] = valor;
        return arrayValor;
    }

    public static int[] remove(int[] array, int valor) {
        int[] arrayValor = new int[array.length - 1];
        int index = indexOf(array, valor);
        if (index == -1) {
            return array;
        } else {

        }

        return arrayValor;
    }
}
