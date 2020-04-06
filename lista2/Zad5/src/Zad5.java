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

class Algorytm{
    public void metoda(double a, double b, double c, double d, double e, double f){
            double W = a*e - b*d;
            double Wx = c*e - b*f;
            double Wy = a*f - c*d;

            if(W != 0 && (a!=0 || b!=0 || d!=0 || e!=0)){
                System.out.printf("x1 = %g\n", Wx / W);
                System.out.printf("x2 = %g\n", Wy / W);
            }
            else if(Wx != 0 && Wy != 0 && (a!=0 || b!=0 || d!=0 || e!=0))
                System.out.println("Uklad rownan jest sprzeczny!");
            else
                System.out.println("Uklad rownan jest nieoznaczony!");
        }
}

public class Zad5 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        double a, b, c, d, e, f;
        
        System.out.print("Podaj a b c d e f: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        e = in.nextDouble();
        f = in.nextDouble();
        
        Algorytm at = new Algorytm();
        at.metoda(a, b, c, d, e, f);
    }
}