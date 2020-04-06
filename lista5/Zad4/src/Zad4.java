/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.util.Scanner;

public class Zad4 {
    
    static class Algorytm {

        int minIndex(int [] tab) {
            int min=tab[0], index=0, iterator=0;
            for (int i: tab)
            {
                if (min>i) {
                    index=iterator;
                    min=i;
                }
                iterator++;
            }
            return index;
        };
        
        double srednia(int [] tab) {
            int suma = 0;
            for(int i : tab) {
                suma += i;
            }
            return (double)suma/tab.length;
        };
    };
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        
        System.out.println("Wprowadź liczby oddzielone spacjami");
        String text=in.nextLine().trim();
        
        int tab [] = new int[text.split("\\s+").length];
        
            boolean ok=true;
            int it=0;
            for (String s: text.split("\\s+")) {
                try{
                    tab [it] = Integer.parseInt(s);
                    it++;
                } catch(NumberFormatException e){
                    ok = false;
                    System.out.println("Dane nie są liczbami");
                    break;
                }
            }
        Algorytm dane = new Algorytm();
        System.out.println("Index w tablicy najmniejszego elementu: "+dane.minIndex(tab));
        System.out.println("Srednia: "+dane.srednia(tab));    
    }
    
}