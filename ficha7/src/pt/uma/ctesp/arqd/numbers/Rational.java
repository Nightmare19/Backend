/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arqd.numbers;

import java.util.Objects;

/**
 *
 * @author David.JARDIM
 */
public class Rational implements Comparable<Rational> {

    private int numerator;
    private int denominator;

    public Rational() {
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numerator, this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rational other = (Rational) obj;
        if (this.numerator != other.numerator) {
            return false;
        }
        if (this.denominator != other.denominator) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Rational o) {
        return this.numerator * this.denominator - o.numerator * o.denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
    
    

}
