
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawid.bitner
 */
public class Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tab[] = new int[4];
        int i, max, min;
        Scanner in = new Scanner(System.in);
            
            for(i=0;i<4;i++){
                System.out.println("Podaj element "+i+" tablicy");
                int n = in.nextInt();
                tab[i]=n;
            }
            
            max = tab[0];
            min = tab[0];
            
            for(i=0;i<4;i++){
                if(min>=tab[i])min=tab[i];
                if(max<=tab[i])max=tab[i];
            }
            
            System.out.println("Najmniejsza wartosc w tablicy: "+min);
            System.out.println("Najwieksza wartosc w tablicy: "+max);
    }
}
