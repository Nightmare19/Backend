/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arqd.aula7;

import pt.uma.ctesp.arqd.students.StudentComparatorByName;
import pt.uma.ctesp.arqd.students.Student;
import pt.uma.ctesp.arqd.numbers.Rational;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author David.JARDIM
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rational r1 = new Rational(7, 3);
        Rational r2 = new Rational(2, 5);
        Rational r3 = new Rational(2, 6);
        Rational r4 = new Rational(2, 7);
        
        ArrayList<Rational> rationals = new ArrayList<>();
        
        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);
        
        System.out.println(rationals.toString());
        Collections.sort(rationals);
        System.out.println(rationals.toString());
        
        Student s1 = new Student(2000, "David");
        Student s2 = new Student(1001, "Pedro");
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        
        System.out.println(students.toString());
        Collections.sort(students);
        System.out.println(students.toString());
        
        Collections.sort(students, new StudentComparatorByName());
        System.out.println(students.toString());
        
    }
    
}
