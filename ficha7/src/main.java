
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
public class main {

    public static void main(String[] args) {
        
        String st = menu.Command.START.name();
        System.out.println(st);
        String sg = menu.Command.SAVE_GAME.name();
        System.out.println(sg);
        String lg = menu.Command.LOAD_GAME.name();
        System.out.println(lg);
        String lc = menu.Command.HIGH_CORES.name();
        System.out.println(lc);
        String q = menu.Command.QUIT.name();
        System.out.println(q);
        
        input = menu.input();
        System.out.println(input);
        

    }

}
