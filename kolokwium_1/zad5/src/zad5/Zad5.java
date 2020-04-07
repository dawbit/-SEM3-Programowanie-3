/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

/**
 *
 * @author Dawid Bitner
 */

import java.text.Collator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;

class Dane implements Comparable {
        private int ID;
        private String album, autor;
        private double cena;
        
        public Dane() {}
        
        public Dane(int ID, String autor, String album, double cena) {
            this.ID=ID;
            this.autor=autor;
            this.album=album;
            this.cena=cena;
        }
        
        @Override
        public String toString(){
            return String.format("%d %-18s %-18s %.2f", ID, autor, album, cena);
        }
        
        private static int compareIgnoreCase (String s1, String s2){
            Locale locale = new Locale ("pl", "PL");
            Collator col = Collator.getInstance(locale);
            
            col.setStrength(Collator.PRIMARY);
            
            return col.compare (s1.toUpperCase(locale), s2.toUpperCase(locale));
        }
        
        @Override
        public int compareTo (Object obj)
        {
            if (this==obj) return 0;
            if (this==null) return -1;
            if (this.getClass() != obj.getClass()) return 1;
            
            Dane e = (Dane) obj;
            int t= compareIgnoreCase(this.album, e.album);
            
            return t;
        }
    }

public class Zad5 {
    
    public static void main(String[] args) {
        ArrayList<Dane> spis = new ArrayList<>();           //Korzystam z ArrayList, a nie tablic gdyż chciałem mieć dynamiczny typ danych.
                                                            //Dla normalnej tablicy deklaracja dla 6 obiektów: Dane[] spis = new Dane[6];
        
        spis.add(new Dane(1, "Michael Jackson", "Thiller", 49.99));
        spis.add(new Dane(2, "Michael Jackson", "Dangerous", 39.99));
        spis.add(new Dane(3, "ACDC", "Back in Black", 39.00));
        spis.add(new Dane(4, "ACDC", "Highway to Hell", 27.99));
        spis.add(new Dane(5, "Led Zeppelin", "Houses of the Holy", 19.99));
        
        Collections.sort(spis);
        
        for (Dane info: spis)
            System.out.println(info);
        
    }
    
}
