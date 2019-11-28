
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
        Scanner create = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Tipos de unidades: ");
        System.out.println("Catapult: 100 (Ataque) 1 (Defesa)");
        System.out.println("Infantry: 25 (Ataque) 75 (Defesa)");
        System.out.println("Cavalry: 50 (Ataque) 50 (Defesa)");
        System.out.println("=====================================================================");
        System.out.print("Introduza a percentagem que pretende para o ataque: ");
        int player_percentagem = create.nextInt();
        if (player_percentagem < 0 || player_percentagem > 100) {
            System.out.println("EXCEDEU O NÚMERO MÁXIMO DE PERCENTAGEM!! ");
            CreateArmy();
        }
        System.out.println("Introduza os elementos das unidades. Atenção!! No maximo 100 unidades");
        System.out.print("Introduza a quantidade de elementos da catapulta: ");
        int player_catapult = create.nextInt();
        if (player_catapult > 100 || player_catapult < 0) {
            System.out.println("EXCEDEU O NÚMERO MÁXIMO DE ELEMENTOS!! ");
            CreateArmy();
        }

        System.out.print("Introduza a quantidade de elementos da infantaria: ");
        int player_infantry = create.nextInt();
        if (player_catapult + player_infantry > 100 || player_infantry < 0) {
            System.out.println("EXCEDEU O NÚMERO MÁXIMO DE ELEMENTOS!! ");
            CreateArmy();
        }

        System.out.print("Introduza a quantidade de elementos da cavalaria: ");
        int player_cavalry = create.nextInt();
        if (player_catapult + player_cavalry + player_infantry > 100 || player_cavalry < 0) {
            System.out.println("EXCEDEU O NÚMERO MÁXIMO DE ELEMENTOS!! ");
            CreateArmy();
        } else {
            player = new Army(player_catapult, player_infantry, player_cavalry, player_percentagem);
            System.out.println("Exército criado com sucesso!!");
        }

        /////////////////////parte enemy/////////////////////////////
        int enemy_catapult = 100;
        int enemy_cavalry = 100;
        int enemy_infantry = 100;

        while (enemy_catapult + enemy_cavalry + enemy_infantry > 100) {
            enemy_catapult = (int) (0 + Math.random() * (100 - 0));
            enemy_cavalry = (int) (0 + Math.random() * (100 - 0));
            enemy_infantry = (int) (0 + Math.random() * (100 - 0));
            int enemy_percentagem = (int) (0 + Math.random() * (100 - 0));

            if (enemy_catapult + enemy_cavalry + enemy_infantry <= 100) {
                enemy = new Army(enemy_catapult, enemy_cavalry, enemy_infantry, enemy_percentagem);

            }
        }

    }

    private void InspectArmy() {
        System.out.println("Player força de ataque: \n" + player.getAttackForce() + "\nNumero total de elementos de ataque: " + player.getAttackForce().size());
        System.out.println("Player força de defesa: \n" + player.getDefenseForce() + "\nNumero total de elementos de defesa: " + player.getDefenseForce().size());
        System.out.println("=====================================================");
        System.out.println("Enemy força de ataque: \n" + enemy.getAttackForce() + "\nNumero total de elementos de ataque: " + enemy.getAttackForce().size());
        System.out.println("Enemy força de defesa: \n" + enemy.getDefenseForce() + "\nNumero total de elementos de defesa: " + enemy.getDefenseForce().size());
    }

    private void Play() {

        System.out.println("O JOGO COMEÇOU!!");
        int round = 1;

        while (player.getDefenseForce().size() != 0 && enemy.getDefenseForce().size() != 0) {
            float turn = (float) (0 + Math.random() * (1 - 0));
            System.out.println("\n------- Ronda " + round++ + " -------");
            if (turn <= 0.5 && turn >= 0) {
                System.out.println("Player ataca ");
                player.attackForce(enemy.getDefenseForce(), player.getAttackForce());
                System.out.println("Dano: " + player.fightingForce_soma(player.getAttackForce()));
            } else {
                System.out.println("Enemy ataca ");
                enemy.attackForce(player.getDefenseForce(), enemy.getAttackForce());
                System.out.println("Dano: " + enemy.fightingForce_soma(enemy.getAttackForce()));
            }
        }
        if (player.getDefenseForce().size() == 0) {
            System.out.println("\nEnemy Wins");
        } else {
            System.out.println("\nPlayer Wins");
        }
        System.out.println("=====================================================");
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);
        boolean sair_do_jogo = false;
        while (sair_do_jogo != true) {
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
                    Scanner create = new Scanner(System.in);
                    System.out.println("Pretende jogar novamente? (1) sim (2) não ");
                    int jogar_novamente = create.nextInt();
                    switch (jogar_novamente) {
                        case 1:
                            sair_do_jogo = false;
                            break;
                        case 2:
                            sair_do_jogo = true;
                            break;
                        default:
                            sair_do_jogo = true;
                            break;
                    }

                    break;
                case QUIT:
                    System.out.println("4. QUIT ");
                    sair_do_jogo = true;
                    break;

            }
        }
    }
}
