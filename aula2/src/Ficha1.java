/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
import java.util.Scanner;
class Main {

  public static float perimetro(float a,float b){
    return(a+b)*2;
  }

  public static float volume(float c,float a,float l){
    return(c*a*l);
  }

  public static float temperatura(float f){
    return((f-32.0f)*(5.0f/9.0f));
  }

  public static int segundos(int[] i,int[] f){
    int hora=f[0]-i[0];
    int minuto=f[1]-i[1];
    return(hora*3600+minuto*60);
  }

  public static float max(int[] a){
    int max=0;
    for(int i=0;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }
    }
    return(max);
  }
/*
  public static float min(int[] a){
    return();
  }

  public static float avg(int a){
    return();
  }
*/
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Perimetro");
    System.out.println(perimetro(3,4));
    System.out.println("Volume");
    System.out.println(volume(3,4,2));
    System.out.println("temperatura em farenheit->");
    float fare = scan.nextLong();
    System.out.println(temperatura(fare)+"º");
    int[] ihora={17,00};
    int[] fhora={21,30};
    System.out.println("Tempo inicial "+ihora[0]+":"+ihora[1]+" Tempo final "+fhora[0]+":"+fhora[1]);
    System.out.println("Tempo Segundos->"+segundos(ihora,fhora));
  }
}