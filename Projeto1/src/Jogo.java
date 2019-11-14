
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
       
        
        player = new Army(30, 20, 50, 50);
    }

    private void InspectArmy() {
        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
/*
    private void Play() {
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
   /* 
    private void Main_menuCriar() {
        Main_menu[] Options = Main_menu.values();
        for (int i = 0; i < Options.length; i++) {
            Main_menu[] Options = Options[i];
            String name = Option.name();
            System.out.println(name);
        }
    }
    */
    public static void main(String[] args) {
        
        //Main_menuCriar();
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------Menu----------------- ");
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
