
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
public abstract class FightingForce{
    
    protected int attack;
    protected int defense;
    protected double lucky;

    public FightingForce(int attack, int defense, double lucky) {
        this.attack = attack;
        this.defense = defense;
        this.lucky = lucky;
    }  
}
