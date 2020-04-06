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

class Dane implements Comparable {
        private int ID;
        private String LastName, phoneNumber;
        
        public Dane() {}
        
        public Dane(int ID, String LastName, String phoneNumber) {
            this.ID=ID;
            this.LastName=LastName;
            this.phoneNumber=phoneNumber;
        }
        
        @Override
        public String toString()
        {
            return String.format("%3d %-12s %-10s", ID, LastName, phoneNumber);
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
            
            Dane e = (Dane) obj;
            int t= compareIgnoreCase(this.LastName, e.LastName);
            
            return t;
        }
    }

public class Zad3 {
    
    public static void main(String[] args) {
        ArrayList<Dane> spis = new ArrayList<>();
        
        spis.add(new Dane(1, "Żuk", "125123512"));
        spis.add(new Dane(2, "Kowalski", "987654321"));
        spis.add(new Dane(3, "Adamski", "178349078"));
        
        Collections.sort(spis,Collections.reverseOrder());
        
        for (Dane info: spis)
            System.out.println(info);
        
    }
    
}
