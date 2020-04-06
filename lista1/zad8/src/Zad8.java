import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dawid Bitner
 */
public class Zad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj promien podstawy walca: ");
        double r = in.nextDouble();
        System.out.println("Podaj wysokosc walca: ");
        double h = in.nextDouble();
        double ppb = 2*Math.PI*r*h;
        double obj = Math.PI*Math.pow(r, 2)*h;
        System.out.println("Pole powierzchni bocznej wynosi: "+ppb+"\nObjetosc wynosi: "+obj);
    }
    
}

