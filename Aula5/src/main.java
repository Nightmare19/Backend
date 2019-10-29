/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Alexandre
 */
public class main {
    public static void main(String[] args){
        Point a = new Point(3,0);
        Point b = new Point(2,6);
        Point c = new Point(4,6);
        Point topLeftPoint = new Point();
        
        Point p1 = new Point(3,1);
        Point p2 = new Point(2,3);
        
        Triangle t = new Triangle(a,b,c);
        
        
        double base = t.calculateBase();
        System.out.println(base);
       
        double area = t.calculateArea();
        System.out.println(area);
        
        Rectangle r = new Rectangle(new Point(0,3),5,3);
        System.out.println("Contains " + r.contains(p1));
        
        double perimetro = r.calculatePerimetro();
        System.out.println(perimetro);
        
        
        
        
    
     
    }
}
