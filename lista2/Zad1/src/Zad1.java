/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.util.*;

public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Podaj a: ");
        double a = in.nextDouble();
        
        System.out.print("Podaj b: ");
        double b = in.nextDouble();
        
        if(b == 0){
            System.out.print("Nie mozna dzielic przez 0!\n");
        }
        else{
            System.out.printf(Locale.GERMANY, "a / b =  %g\n", (a / b)); 
        }
        
        System.out.printf(Locale.GERMANY, "a + b =  %g\n", (a + b));     
    }
    
}
