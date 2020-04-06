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

public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Podaj maksymalny zakres : ");
            Scanner in = new Scanner(System.in);
            int max = in.nextInt();
            
            for(int i=1;i<=max;i++){
                System.out.println(i);
            }
    }
    
}
