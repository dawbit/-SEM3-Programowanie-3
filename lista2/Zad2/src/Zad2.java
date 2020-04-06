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

public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Podaj a: ");
        
        double a, b;
        try{
            a = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        if(a == 0){
            System.out.print("Nieprawidlowa funkcja\n");
            return;
        }
        
        System.out.print("Podaj b: ");
        try{
            b = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        System.out.print("x = " + (-b/a) + "\n");        
    }
    
}
