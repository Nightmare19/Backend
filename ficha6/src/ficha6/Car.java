/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6;

/**
 *
 * @author Alexandre
 */
public class Car extends Vehicle{
    private int door;
    
    public Car(){
        super();
        this.door =0;
        
    }

    public Car(int door, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.door = door;
    }
    

    @Override
    public String toString() {
        return "Este carro tem " + door + " portas " + super.toString(); 
    }
    
    
}
