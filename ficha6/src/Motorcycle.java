/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alexandre
 */
public class Motorcycle extends Vehicle {
    
    private int wheels;

    public Motorcycle() {
        super();
        this.wheels = 0;
        
    }

    public Motorcycle(int wheels, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.wheels = wheels;
    }
    
    
    

    @Override
    public String toString() {
        return "Esta Moto tem " + wheels + " pneus " + super.toString(); 
    }
    
    
    
}
