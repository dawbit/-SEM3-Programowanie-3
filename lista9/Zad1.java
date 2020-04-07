/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Dawid Bitner
 */
public class Zad1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
        File plik = new File("dane.txt");
        Scanner odczyt = new Scanner(plik);
        StringTokenizer token;
        int i=0;
        double[] liczby = new double[4];
        while(odczyt.hasNextLine()){
            token=new StringTokenizer(odczyt.nextLine()," ");
            while (token.hasMoreElements()){
                liczby[i] = Double.valueOf(token.nextToken());
                i++;
            }
        }
        double odl;
        odl = Math.sqrt(Math.pow(Math.abs(liczby[0]-liczby[2]),2) + Math.pow(Math.abs(liczby[1]-liczby[3]),2));
        System.out.print(odl);
        
        String msg= Double.toString(odl);
        
        try (PrintWriter zapis = new PrintWriter("wynik.txt", "UTF-8")) {
            zapis.print(msg);
        }
    }
    
}
