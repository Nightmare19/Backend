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

       // System.out.println("=====================================================================");
        double percentagem_ataque = (double) side / 100;
        double percentagem_defesa = 1 - percentagem_ataque;
        /////////////catapulta/////////////////
        int catapult_ataque = (int) (catapult * percentagem_ataque);
        int catapult_defesa = (int) (catapult - catapult_ataque);
        /////////////cavalaria/////////////////
        int cavalry_ataque = (int) (cavalry * percentagem_ataque);
        int cavalry_defesa = (int) (cavalry - cavalry_ataque);
        /////////////infantaria/////////////////
        int infantry_ataque = (int) (infantry * percentagem_ataque);
        int infantry_defesa = (int) (infantry - infantry_ataque);

        for (int i = 0; i < catapult_ataque; i++) {
            attackForce.add(new Catapult());
        }
        for (int i = 0; i < catapult_defesa; i++) {
            defenseForce.add(new Catapult());
        }
        for (int i = 0; i < cavalry_ataque; i++) {
            attackForce.add(new Cavalry());
        }
        for (int i = 0; i < cavalry_defesa; i++) {
            defenseForce.add(new Cavalry());
        }
        for (int i = 0; i < infantry_ataque; i++) {
            attackForce.add(new Infantry());
        }
        for (int i = 0; i < infantry_defesa; i++) {
            defenseForce.add(new Infantry());
        }

    }

    public double fightingForce_soma(ArrayList<FightingForce> attack) {
        double contador = 0;
        for (int i = 0; i < attack.size(); i++) {
            contador += attack.get(i).attack * attack.get(i).lucky;
        }
        return contador;
    }

    public void attackForce(ArrayList<FightingForce> defense, ArrayList<FightingForce> attack) {
        double valor_ataque = this.fightingForce_soma(attack);
        for (int i = 0; i < defense.size(); i++) {
            if (valor_ataque >= defense.get(i).defense) {
                valor_ataque -= defense.get(i).defense;
                defense.remove(i);
            }
        }
    }

    public ArrayList<FightingForce> getAttackForce() {
        return attackForce;
    }

    public ArrayList<FightingForce> getDefenseForce() {
        return defenseForce;
    }

    public void setAttackForce(ArrayList<FightingForce> attackForce) {
        this.attackForce = attackForce;
    }

    public void setDefenseForce(ArrayList<FightingForce> defenseForce) {
        this.defenseForce = defenseForce;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
