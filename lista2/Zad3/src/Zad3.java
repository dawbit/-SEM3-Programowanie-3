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

public class Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double r, H;
        System.out.print("Podaj promien: ");
        
        try{
            r = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        System.out.print("Podaj wysokosc: ");
        
        try{
            H = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Błąd!" + e);
            return;
        }
        
        if(r <= 0 || H <= 0){
            System.out.print("Podano bledne dane!\n");
            return;
        }
        
        System.out.print("Pb = " + (2*Math.PI*r*H) + "\nV = " + (Math.PI*r*r*H) + "\n");        
    }
    
}
