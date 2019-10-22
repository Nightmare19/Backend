/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point(5,6);
        height = 5.0;
        width = 6.0;
 
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double calculateBase(){
        
    }
    
    public double calculateArea(){
        double base = calculateBase();
        double altura =;
        double area = altura * base; 
        return area;
    }
    
    public double calculatePerimetro(){
        double base = ;
        double altura = ;
        double perimetro = (base*2) + (altura*2);
        return perimetro;
    }
    
    
    
}
