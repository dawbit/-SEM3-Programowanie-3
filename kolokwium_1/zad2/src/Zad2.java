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

public class Zad2 {
    
    static class Algorytm {

        int maxIndex(int [] tab) {
            int max=tab[0], index=0, iterator=0;
            for (int i: tab)
            {
                if (max<i) {
                    index=iterator;
                    max=i;
                }
                iterator++;
            }
            return index;
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
        System.out.println("Index w tablicy najwiekszego elementu: "+dane.maxIndex(tab));  
    }
    
}