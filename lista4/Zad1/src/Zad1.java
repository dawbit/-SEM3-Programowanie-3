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
        System.out.println("Wprowadź liczby oddzielone spacjami-dowolna iloscia");
        String tekst=in.nextLine().trim();

        String [] numericArray = tekst.split("\\s+");

        double sum=0;
        boolean sprawdzenie=true;

        for (int i=0; i<2; i++) {
            try{
                System.out.println(numericArray[i]);
                sum += Double.parseDouble(numericArray[i]);
                } 
            catch(NumberFormatException e){
                sprawdzenie = false;
                System.out.println("to nie sa liczby");
                break;
                }
        }

        if (sprawdzenie) System.out.println("Suma: "+sum);
    }

}
