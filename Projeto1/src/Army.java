import java.util.Random;
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
public class Army {
   
     private ArrayList<FightingForce> attackForce;
     private ArrayList<FightingForce> defenseForce;

    Army(int catapult, int infantry, int cavalry, int side) {        
        attackForce = new ArrayList<>();
        defenseForce = new ArrayList<>();
    }

    Army(Random enemy_catapult, Random enemy_cavalry, Random enemy_infantry, int side) {
        attackForce = new ArrayList<>();
        defenseForce = new ArrayList<>();
    }

   

    @Override
    public String toString() {
        String output ="Força de Ataque: \n";
        String output2 = "Força da Defesa: \n";
        for (int i = 0; i < attackForce.size(); i++) {
            output += attackForce.get(i).toString();
        }
        for (int i = 0; i < defenseForce.size(); i++) {
            output2 += defenseForce.get(i).toString();
        }
        return output + output2;
         
    }
    
 
}
