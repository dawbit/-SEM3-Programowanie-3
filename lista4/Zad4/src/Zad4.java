
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
public class Zad4 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        String wejscie = inputScanner.nextLine();
        String[] slowa = wejscie.split("\\s+");
        System.out.print("Ilosc slow: "+slowa.length);
        
        
    }
}