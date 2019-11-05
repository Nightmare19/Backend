
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
public class Figure {

    private ArrayList<Shape> shapes;

    public Figure() {
    }

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    
    public void add (Shape shape){
        this.shapes.add(shape);
    }
    
}
