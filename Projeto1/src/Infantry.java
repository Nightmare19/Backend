/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
class Infantry extends FightingForce{
    
    private int attack;
    private int defense;
    private double lucky;

    public Infantry(int attack, int defense, double lucky) {
        this.attack = 25;
        this.defense = 75;
        this.lucky = (double)(Math.random() * (1 - 0) + 1) + 0;
    }
    
    

    @Override
    public String toString() {
        return "Infantry: \n" + "Attack("+ attack + ") " + "Defense(" +defense + ")";
    }
    
    
    
}
