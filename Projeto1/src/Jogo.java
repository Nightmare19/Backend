
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
public class Jogo {

    Army player;
    Army enemy;

    public Jogo() {
    }

    private void CreateArmy() {
        //ler teclado
       System.out.println("Introduza a quantidade de elementos da catapulta: ");
       
       System.out.println("Introduza a quantidade de elementos da cavalaria: ");      
       System.out.println("Introduza a quantidade de elementos da infantaria: ");

        player = new Army(30, 20, 50, 50);
        enemy = new Army(30, 20, 50, 50);
       
    }

    private void InspectArmy() {
        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
/*
    private void Play() {
    
        System.out.println("O JOGO COMEÇOU!!");
        System.out.println("");
        int turn = 0;
        while(player.defense.size() != 0 || enemy.defense.size() != 0){
            if(turn == 0){
                player.attack(enemy);
            } else {
                enemy.attack(player);
            }
        }
       
    }
*/


    public static void main(String[] args){
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------Menu----------------- ");
        Menu.printmenu();
        System.out.print("->");
        String line = scanner.nextLine();
        Menu.Command command = Menu.Command.valueOf(line);
        
        switch (command) {
            case CREATE_ARMY:
                System.out.println("1. CREATE ARMY ");
                jogo.CreateArmy();
                break;
            case INSPECT_ARMY:
                System.out.println("2. INSPECT_ARMY ");
                jogo.InspectArmy();
                break;
            case PLAY:
                System.out.println("3. PLAY ");
                break;
               // jogo.Play();
            case QUIT:
                System.out.println("4. QUIT ");
                break;

        }
    }

}
