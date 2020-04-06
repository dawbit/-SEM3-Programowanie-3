/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zad6 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        String tekst;
        System.out.println("Wprowadz tekst");
        tekst=in.nextLine();
        
        StringTokenizer tekst2 = new StringTokenizer(tekst);
        while (tekst2.hasMoreTokens()) {
         System.out.println(tekst2.nextToken());
     }
    }
    
}
