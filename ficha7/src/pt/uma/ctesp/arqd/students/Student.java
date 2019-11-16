/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arqd.students;

import java.util.Objects;

/**
 *
 * @author David.JARDIM
 */
public class Student implements Comparable<Student>{
    
    private int number;
    private String name;

    public Student() {
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }        

    @Override
    public int hashCode() {
        return Objects.hash(this.number, this.name);
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
        final Student other = (Student) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    @Override
    public String toString() {
        return this.number + " - " + this.name;
    }
    
    
    
    
    
}
