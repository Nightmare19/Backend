/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class ArrayUtilities {

    static String toString(int[] array) {
          String str = "";
          for(int i = 0; i<array.length;i++){
              if(i == array.length -1){
                  str +=array[i];
              }
              else{
              str +=array[i] + ",";
              }
              
          }
          return str;
    }

    static int maximumOf(int[] array) {
        int max = 0;
        for (int i = 0; i<array.length;i++){
            if(array[i]>max)
                max = array[i];
        }
        return max;
     
    }

    static int minimumOf(int[] array) {
        int min = 10;
        for (int i = 0; i<array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }

    static int [] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i =0; i<array.length; i++){
            copy[i]=array[i];
        }
        return copy;
    }
}
