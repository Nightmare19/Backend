/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class NumericalUtilities {

    int soma = 0;

    public static int sumOfNaturalNumbersUpTo(int n) {
        int soma = 0;
        for (int i = n; n >= 1; i--) {
            soma += i;
        }
        return (soma);
    }

    public static int sumOfNaturalNumbersBetween(int p, int s) {
        int soma = 0;
        for (int i = p; i <= s; i++) {
            soma += i;
        }
        return (soma);
    }

    public static int sumOfEvenNumbersBetween(int min, int max) {
        int soma = 0;
        int i = 0;
        while (i < max) {
            if (i % 2 == 0) {
                soma++;
            }
            i++;
        }
        return (soma);
    }

    public static int numberOfDivisorsOf(int num) {
        int cout = 0;
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                cout += i;
            }
        }
        return cout;
    }

    public static boolean isPrime(int numero) {
        int res = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                res += 1;
            }
        }
        return res == 2;
    }
}
