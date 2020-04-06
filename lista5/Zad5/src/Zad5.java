/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawid.bitner
 */
import java.util.Scanner;
import java.util.Arrays;

public class Zad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tab[] = new double[9];
        int i;
        Scanner in = new Scanner(System.in);
        
        for(i=0;i<9;i++){
            System.out.println("Podaj element "+i+" tablicy");
            int n = in.nextInt();
            tab[i]=n;
        }
        
        Arrays.sort(tab);
        
        for(i=0;i<9;i++){
            System.out.println(tab[i]);
        }
    }
    
}
