
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;
    
    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }
    
    public Triangle(final Point a,final Point b,final Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public Point getA(){
        return a;
    }
    
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }
    
    public void setA(Point a){
       this.a= a;
    }
    
    public void setB(Point b){
       this.b= b;
    }  
    public void setC(Point c){
       this.c= c;
    }
    
    public double calculateBase(){
       return b.distanceTo(c);
    }
    public double calculateHeigth(){
       return b.distanceTo(c);
    }
    public double calculateArea(){
       double base = calculateBase();
       double altura = calculateHeigth();
       double area = (base*altura)/2;
       return area;
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
