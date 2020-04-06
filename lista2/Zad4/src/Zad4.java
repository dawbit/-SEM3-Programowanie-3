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

public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Podaj a: ");
        try{
            a = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
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
        
        System.out.print("Podaj c: ");
        try{
            c = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        if(a == 0){
            System.out.print("Podano bledne dane!\n");
            return;
        }
        
        double delta = b*b - 4*a*c;

        if(delta < 0)
            System.out.print("Brak rozwiazan!");
        else if(delta == 0)
            System.out.print("x1 = x2 = " + (-b/(2*a)) + "\n");
        else
            System.out.print("x1 = " + ((-b-Math.sqrt(delta))/(2*a)) + "\nx2 = " + ((-b+Math.sqrt(delta))/(2*a)) + "\n");        
    }
    
}
