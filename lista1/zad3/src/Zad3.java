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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = in.nextInt();
        System.out.println("Podaj druga liczbe: ");     
        int b = in.nextInt();
        System.out.println("Wczytane liczby, to: a=" + a +" i b=" + b);
        System.out.println("Dodawanie: "+ (a+b));
        System.out.println("Odejmowanie: "+ (a-b));
        System.out.println("Mnozenie: "+ (a*b));
        System.out.println("Dzielenie: "+ (a/b));
    }
    
}
