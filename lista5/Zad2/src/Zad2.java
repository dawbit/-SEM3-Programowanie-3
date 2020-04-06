/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawid.bitner
 */
public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) { 
        float tab[][] = new float[11][11]; 
        for (int i=1;i<=10;i++) { 
            for (int j=1;j<=10;j++){ 
                tab[i][j]=i*j; 
            } 
        } 

        for (int i=1;i<=10;i++) { 
            for (int j=1;j<=10;j++) { 
                System.out.printf("%4.0f", tab[i][j]); 
            } 
            System.out.println(" "); 
        } 
    } 
} 