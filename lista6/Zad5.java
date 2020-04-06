/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */

package zad5;

import java.text.Collator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;

class Ksiazka implements Comparable {
        private int ID;
        private String Name, Author, Publisher;
        
        public Ksiazka() {}
        
        public Ksiazka(int ID, String Name, String Author, String Publisher)
        {
            this.ID=ID;
            this.PublishmentYear=PublishmentYear;
            this.Name=Name;
            this.Author=Author;
        }
        
        @Override
        public String toString()
        {
            return String.format("%3d %-20s %-20s %-12s", ID, Name, Author, Publisher);
        }
        
        private static int compareIgnoreCase (String s1, String s2)
        {
            Locale locale = new Locale ("pl", "PL");
            Collator col = Collator.getInstance(locale);
            
            col.setStrength(Collator.PRIMARY);
            
            return col.compare (s1.toUpperCase(locale), s2.toUpperCase(locale));
        }
        
        @Override
        public int compareTo (Object obiekt)
        {
            if (this==obiekt) return 0;
            if (this==null) return -1;
            if (this.getClass() != obiekt.getClass()) return 1;
            
            Ksiazka e = (Ksiazka) obiekt;
            int t;
            
            t = compareIgnoreCase(this.Name, e.Name);
            if(t!=0) return t;
            
            t = compareIgnoreCase(this.Author, e.Author);
            if(t!=0) return t;
            
            t = compareIgnoreCase(this.Publisher, e.Publisher);
            return t;
        }
    }

public class Zad5 {
    
    public static void main(String[] args) {
        
        ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka(1, "Lalka", "Bolesław Prus", "Wyd1"));
        ksiazki.add(new Ksiazka(2, "Chłopi", "Reymont Władysław", "Wyd2"));
        
        Collections.sort(ksiazki);
        
        for (Ksiazka info: ksiazki)
            System.out.println(info);
        
    }
    

