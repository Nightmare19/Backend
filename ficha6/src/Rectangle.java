

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class Rectangle extends Shape{
    private Point topLeftPoint;
    private double height;
    private double width;


    public Rectangle() {
        this.topLeftPoint = new Point(5,0);
        height = 5.0;
        width = 6.0;
 
    }
    public Rectangle(Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height= height;
        this.width= width;
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
   
    public double calculateArea(){
        double area = height * width; 
        return area;
    }
    
    public double calculatePerimetro(){

        double perimetro = (width*2) + (height*2);
        return perimetro;
    }
    
    public boolean contains(Point point){
        boolean contains = false;
        Point topRightCorner = new Point(topLeftPoint.getX()+ width, topLeftPoint.getY());
        Point bottomRightCorner = new Point(topLeftPoint.getX()+ width,topLeftPoint.getY()-height);
        Point bottomLeftCorner = new Point(topLeftPoint.getX(),topLeftPoint.getY()-height);
        
        if(point.getX()> topLeftPoint.getX() && point.getX()< topRightCorner.getX() && point.getY()>bottomRightCorner.getY() && point.getY()<topRightCorner.getY()){
            contains = true;
        }
        return contains;
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
