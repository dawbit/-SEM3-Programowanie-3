/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/**
 *
 * @author Dawid Bitner
 */
public class Zad2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Random rand = new Random();
        Scanner input = new Scanner (System.in);
        System.out.print("Podaj liczbe liczb losowych: ");
        int liczba = input.nextInt();
        int random;
        String wynik;
        try (PrintWriter zapis = new PrintWriter("wynik.txt", "UTF-8")) {
            for (int i = 0; i<liczba; i++) {
                random=rand.nextInt(liczba);
                wynik=Integer.toString(random);
                zapis.println(wynik);
            }
        }
    }    
}
