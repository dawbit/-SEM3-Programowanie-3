/*
Dawid Bitner IA
 */
package zad2;

class Algorytm{
    static public double iloczynSkalarny(double x[], double y[]){
        if(x.length!=y.length){
            System.out.println("Wektory nie są tej samej długości.");
            return 0;
        }
        double wynik = 0;
        for(int i=0;i<x.length;i++){
            wynik+=x[i]*y[i];
        }
        return wynik;
    }
}
public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double wektor1[] = { 5,1 };
        double wektor2[] = { -2,4 };
        System.out.println(Algorytm.iloczynSkalarny(wektor1, wektor2));
    }
    
}
