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
public class Zad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a=5;
        double b=2;
        double c=3;
        double d=4;
        System.out.println("a=5, b=2, c=3, d=4\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj x: ");
        double x = in.nextDouble();
        double wa=(a*Math.pow(x, 2)+(b*x)+c);
        double wb=(a*Math.pow(x, 3)+(b*Math.pow(x, 2))+(c*x)+d);
        System.out.println("A(x)= "+wa);
        System.out.println("B(x)= "+wb);
    }
}
