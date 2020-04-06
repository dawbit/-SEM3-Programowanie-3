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

public class Zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        String tekst;
        System.out.println("Wprowadź tekst");
        while (!(tekst=in.nextLine()).equals(""))
            System.out.println(tekst.trim());
        }
    
}
