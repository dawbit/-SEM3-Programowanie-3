/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */

import java.util.ArrayList;
import java.util.Collections;

class Dane implements Comparable {
        private int ID;
        private String nazwisko;
        private double wynagrodzenie;
        
        public Dane() {}
        
        public Dane(int ID, String nazwisko, double wynagrodzenie) {
            this.ID=ID;
            this.nazwisko=nazwisko;
            this.wynagrodzenie=wynagrodzenie;
        }
        
        @Override
        public String toString()
        {
            return String.format("%3d %-12s %-10s", ID, nazwisko, wynagrodzenie);
        }
        
        
        @Override
        public int compareTo (Object obj)
        {
            if (this==obj) return 0;
            if (this==null) return -1;
            if (this.getClass() != obj.getClass()) return 1;
            
            Dane e = (Dane) obj;
            
            int t;
            t = Double.compare(this.wynagrodzenie, e.wynagrodzenie);
            
            return t;
        }
    }

public class Zad4 {
    
    public static void main(String[] args) {
        ArrayList<Dane> spis = new ArrayList<>();           //Korzystam z ArrayList, a nie tablic gdyż chciałem mieć dynamiczny typ danych.
                                                            //Dla normalnej tablicy deklaracja dla 6 obiektów: Dane[] spis = new Dane[6];
        
        spis.add(new Dane(1, "Bitner", 15000.0));
        spis.add(new Dane(2, "Ącki", 3550.99));
        spis.add(new Dane(3, "Nowak", 4200.99));
        spis.add(new Dane(4, "Kowalski", 2000));
        spis.add(new Dane(5, "Zieliński", 7920.11));
        
        Collections.sort(spis);
        
        for (Dane info: spis)
            System.out.println(info);
        
    }
    
}
