/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arqd.aula7;

/**
 *
 * @author David.JARDIM
 */
public class Menu {
    
    public enum Command{
        START, SAVEGAME, LOADGAME, HIGHSCORES, QUIT; 
    }
    
    public void printCommands(){
        Command[] commands = Command.values();
        for (int i = 0; i < commands.length; i++) {
            System.out.println(commands[i]);
        }
    }
    
    public void selectCommand(Command command){
        switch(command){
            case START:
        }
    }
    
    
    
    
}
