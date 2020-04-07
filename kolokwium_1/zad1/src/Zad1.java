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
        double r, l, h;
        System.out.print("Podaj promien stozka: ");
        
        try{
            r = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        System.out.print("Podaj tworzaca stozka: ");
        
        try{
            l = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        h = Math.sqrt(Math.pow(l,2)-Math.pow(r,2));
        
        if(r <= 0 || l <= 0 || h <= 0){
            System.out.print("tworzaca/promien/wysokosc musi byc wieksza od 0!\n");
            return;
        }
        
        System.out.print("Pb = " + ((Math.PI)*r*l) +"\nPc = " + ((Math.PI)*r*(r*l)) +"\nV = " + ((Math.PI)*r*r*h) + "\n");        
    }
    
}
