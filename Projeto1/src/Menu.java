/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
public class Menu {

    public enum Command {
        CREATE_ARMY, INSPECT_ARMY, PLAY, QUIT;
    }

    public static void printmenu(){
        for (int i = 0; i < Command.values().length; i++) {
            System.out.println((i+1)+". "+Command.values()[i]);
        }
    }
}
