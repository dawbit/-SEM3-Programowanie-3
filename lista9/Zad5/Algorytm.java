/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

/**
 *
 * @author Dawid Bitner
 */
public class Algorytm {

    public static int[] bubblesort(int[] dane) {
        int n = dane.length - 1;
        do {
            for (int i = 0; i < n; i++) {
                if (dane[i] > dane[i + 1]) {
                    int temp = dane[i + 1];
                    dane[i + 1] = dane[i];
                    dane[i] = temp;
                }
            }
            n--;
        } while (n > 1);
        return dane;
    }

}
