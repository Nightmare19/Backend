
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
public class menu {

    
     public enum Command {
        START, SAVE_GAME, LOAD_GAME, HIGH_CORES, QUIT;
    }
    
   public static void input(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        menu.Command command = menu.Command.valueOf(line);
        if (command == menu.Command.START) {
            System.out.println("Começou os jogo");

        } else if (command == Command.SAVE_GAME) {
            System.out.println("jogo esta gravado");

        } else if (command == Command.LOAD_GAME) {
            System.out.println("jogo carregado");

        } else if (command == Command.HIGH_CORES) {
            System.out.println("cores");

        } else if (command == Command.QUIT) {
            System.out.println("Saio do jogo");

        }

        switch (command) {
            case START:
// comecando...
                break;
            case SAVE_GAME:
// salvando...
                break;
            case LOAD_GAME:
// carregando...
                break;
            case HIGH_CORES:
// cores...
                break;

            case QUIT:
// sair...
                break;

        }
   }
    
    
    
    
    
}
