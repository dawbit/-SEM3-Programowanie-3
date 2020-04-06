import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dawid Bitner
 */
public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj promien kola: ");
        double r = in.nextDouble();
        double powierzchnia = Math.PI*Math.pow(r, 2);
        System.out.println("Powierzchnia kola wynosi: "+powierzchnia);
    }
    
}
