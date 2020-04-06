/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.text.Collator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;

class Pracownik implements Comparable {
        private int ID;
        private String LastName, Position;
        
        public Pracownik() {}
        
        public Pracownik(int ID, String LastName, String Position) {
            this.ID=ID;
            this.LastName=LastName;
            this.Position=Position;
        }
        
        @Override
        public String toString()
        {
            return String.format("%3d %-12s %-99s", ID, LastName, Position);
        }
        
        private static int compareIgnoreCase (String s1, String s2)
        {
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
            
            Pracownik e = (Pracownik) obj;
            int t = compareIgnoreCase(this.Position, e.Position);
            if(t!=0) return t;
            t = compareIgnoreCase(this.LastName, e.LastName);
            return t;
        }
    }

public class Zad4 {
    
    public static void main(String[] args) {
        ArrayList<Pracownik> spis = new ArrayList<>();           //Korzystam z ArrayList, a nie tablic gdyż chciałem mieć dynamiczny typ danych.
                                                            //Dla normalnej tablicy deklaracja dla 6 obiektów: Dane[] spis = new Dane[6];
        
        spis.add(new Pracownik(1, "Nowak", "magazynier"));
        spis.add(new Pracownik(2, "Nowok", "magazynier"));
        spis.add(new Pracownik(3, "Popiełuszko", "kierownik"));
        spis.add(new Pracownik(4, "Wojtyła", "kierownik"));
        spis.add(new Pracownik(5, "Grażyniak", "kierowca"));
        spis.add(new Pracownik(6, "Żółtkowska", "sprzątaczka"));
        spis.add(new Pracownik(7, "Adamska", "sprzątaczka"));
        
        Collections.sort(spis);
        
        for (Pracownik info: spis)
            System.out.println(info);
        
    }
    
}
