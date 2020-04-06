import java.util.Scanner;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
public class Zad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kat: ");
        double kat = in.nextDouble();
        double rad = ((kat*Math.PI)/(180));
        System.out.println("Kat "+kat+"\n=Rad "+rad);
    }
    
}
