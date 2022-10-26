/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.andrepinto_evaluacionnice02;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author andre
 */
public class AndrePinto_EvaluacionNICE02 {

    public static void main(String[] args) {
      String words;
      Scanner leer=new Scanner(System.in);
      
      System.out.print("Introduzca las palabas:");
      words=leer.nextLine();
      sortInnerContent(words);
     
    }
    public static void sortInnerContent(String words){
          
           String [] parts = words.split(" ");
           for(int i=0;i<parts[i].length();i++){
               
//               for(int j=1;j<parts[i].length()-1;j++){
//                  Arrays.sort(parts[i], 1, parts[i].length()-1));
////                   System.out.println(Array.sort(parts[i],1,);
//               }
               System.out.println(parts[i].length());
               System.out.println(parts[i]);
           }
       
          
    }
}
