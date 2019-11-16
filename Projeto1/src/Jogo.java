import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Introduza os elementos das unidades. Atenção!! No maximo 100 unidades");
        System.out.println("Introduza a quantidade de elementos da catapulta: ");
        String qcatapult = scanner.nextLine();
        System.out.println("Introduza a quantidade de elementos da cavalaria: ");
        String qinfantry = scanner.nextLine();
        System.out.println("Introduza a quantidade de elementos da infantaria: ");
        String qcavalry = scanner.nextLine();
        int player_catapult;
        int player_infantry;
        int player_cavalry;
        player_catapult = Integer.parseInt(qcatapult);
        player_infantry = Integer.parseInt(qinfantry);
        player_cavalry = Integer.parseInt(qcavalry);

        if (player_catapult + player_cavalry + player_infantry <= 100) {
            player = new Army(player_catapult, player_infantry, player_cavalry, 50);
        } else {
            System.out.println("EXCEDEU O NÚMERO MÁXIMO DE ELEMENTOS!! ");
            CreateArmy();
        }
        
         /////////////////////parte enemy/////////////////////////////
         Random enemy_catapult = new Random();
         Random enemy_cavalry = new Random();
         Random enemy_infantry = new Random();
         enemy_catapult.nextInt(100);
         enemy_cavalry.nextInt(100);
         enemy_infantry.nextInt(100);
         /*
         if(enemy_catapult + enemy_cavalry + enemy_infantry <=100){
         enemy = new Army(enemy_catapult, enemy_cavalry, enemy_infantry, 50);
         }else{
            
         }
        

        
        
        
         for (int i = 0; i < player_catapult; i++) {
         if (random.next() * 100 < side) {
         attack.add(new Catapult());
         } else {
         defense.add(new Catapult());
         }

         }
         */
    }

    private void InspectArmy() {
        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }

    private void Play() {

        System.out.println("O JOGO COMEÇOU!!");
        System.out.println("");
        int turn = 0;
        /*
         while (player.defense.size() != 0 || enemy.defense.size() != 0) {
         if (turn == 0) {
         player.attack(enemy);
         System.out.println(" Dano: " + attack);
         } else {
         enemy.attack(player);
         System.out.println(" Dano: " + attack);
         }
         }
         */
    }

    public static void main(String[] args) {
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
                jogo.Play();
                break;
            case QUIT:
                System.out.println("4. QUIT ");
                break;

        }

    }

}
