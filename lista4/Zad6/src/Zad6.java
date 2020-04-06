/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Zad6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");

        List<String> zdania = new ArrayList<>();
        System.out.println("Wprowadz wzor do szukania");
        String s; 
        String slowo;
        slowo = in.nextLine();
        System.out.println(slowo);

        System.out.println("Wprowadz kolejne linie tekstu do wysuzkiwania wzoru");
        
        while (!(s=in.nextLine()).equals("quit")){
            zdania.add(s);
            for(String szukaj : zdania) {
                if(szukaj.toUpperCase().contains(slowo.toUpperCase()))
                    System.out.println(szukaj+"wykrytow wzor");
             }
        }
    } 
}
