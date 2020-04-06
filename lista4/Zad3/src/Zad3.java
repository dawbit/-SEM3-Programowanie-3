
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
public class Zad3 {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        String zdanie = inputScanner.nextLine();
        String imie = "dawid";
		String zdrobnienie = "dawidek";
        
        while(!zdanie.equals("quit")) {
            if(zdanie.contains(imie) || zdanie.contains(zdrobnienie)) {
              System.out.print(zdanie + "\n");
            }
            zdanie = inputScanner.nextLine();
        }
    }
}
