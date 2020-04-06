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

public class Zad3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in, "Cp1250");
    String tekst;
    System.out.println("Wprowadź tekst");
    tekst=in.nextLine();
    
    StringTokenizer tekst2 = new StringTokenizer(tekst);
    tekst="";
    
    while (tekst2.hasMoreTokens()) {
        tekst+=tekst2.nextToken()+" ";
    }
    
    System.out.println(tekst);
    
    }
    
}
