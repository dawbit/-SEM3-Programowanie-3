/*
Dawid Bitner IA
 */

package zad3;

import java.util.ArrayList;

class Algorytm{
    static public ArrayList<Double> macierzXWektor(double m[][], double w[]){
        ArrayList<Double> wektor = new ArrayList<Double>();
        double tmp = 0;
        for(int i=0; i<m.length; i++){
            for(int j=0;j<m.length;j++){
                tmp+= w[j]*m[i][j];
            }
            wektor.add(tmp);
            tmp=0;
        }
        return(wektor);
 }
}
public class Zad3 {

    public static void main(String[] args) {
        double[][] macierz = {{10, 6, 7}, {3, 9, 1}, {5, 5, 5}};
        double[] wektor = {9, 5, 5};
        System.out.println(Algorytm.macierzXWektor(macierz, wektor));
    }
    
}
