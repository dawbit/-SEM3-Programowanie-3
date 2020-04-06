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

public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        String tekst;
        while (!(tekst=in.nextLine()).equals("quit")){
            System.out.println(tekst);
        }
        System.out.println("Podano polecenie QUIT, koniec programu");
    }
}
