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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");
        String st;
        int position=-1;
        int liczba=0;
        System.out.println("Wprowadź tekst");
        st=in.nextLine();
        do{
            position = st.indexOf("ab",++position);
            if (position>=0)
                liczba++;
        } while (position>=0);
        
        System.out.println("ab wystapilo "+liczba+" razy");
    }   
}
