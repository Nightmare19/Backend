/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
class Catapult extends FightingForce {

    public Catapult() {
        super(100, 1, (double) (Math.random() * (1 - 0) + 1) + 0);
    }

    @Override
    public String toString() {
        return "Catapult: " + "Attack(" + attack + ") " + "Defense(" + defense + ")";
    }

}
