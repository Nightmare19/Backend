/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public abstract class Shape {

    private Point position;

    public Shape() {

    }

    public Shape(final Point position) {
        this.position = position;
    }

    public final Point getPosition() {
        return position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
    
    
}
