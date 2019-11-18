/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
class Infantry extends FightingForce {

    public Infantry() {
        super(25, 75, (double) (Math.random() * (1 - 0) + 1) + 0);
    }

    @Override
    public String toString() {
        return "Infantry: " + "Attack(" + attack + ") " + "Defense(" + defense + ") ";
    }

}
