/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
class Cavalry extends FightingForce {

    public Cavalry() {
        super(50, 50, (double) (Math.random() * (1 - 0) + 1) + 0);
    }

    @Override
    public String toString() {
        return "Cavalry: " + "Attack(" + attack + ") " + "Defense(" + defense + ") ";
    }

}
