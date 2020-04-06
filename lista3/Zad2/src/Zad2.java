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

public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        String tekst;
        int i=0;
        System.out.println("Wprowadz zdanie, w celu sprawdzenia ilosci wystapien litery a");
        tekst=in.nextLine();
        for (char a : tekst.toCharArray()) {
          if (a == 'a') {
            i++;
          }
        }
        System.out.println("Litera a wystapila "+i+" razy");
    }   
}
