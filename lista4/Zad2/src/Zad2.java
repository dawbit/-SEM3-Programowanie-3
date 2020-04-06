
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


public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String text = inputScanner.nextLine();
        text = text.replaceAll("  *", " ");
        text = text.trim(); 
        String[] convert = text.split(" ");
        int sum = 0;
        for(int i = 0; i < convert.length; i++) {
            sum += Integer.parseInt(convert[i]);
        }
        System.out.print(sum);
    }
    
}
