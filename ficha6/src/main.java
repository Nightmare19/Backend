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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle car = new Car(5,2000,"Fiat","Siecento",4000,"white");
        System.out.println(car.toString());
        Vehicle motorcycle = new Motorcycle(2,2000,"Yamaha","mt 07",10000,"white");
        System.out.println(motorcycle);
    }
    
}
