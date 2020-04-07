import java.util.Scanner;

public class Algorytm {
    protected static Scanner inputer = new Scanner(System.in);
    public static double scalar(double[] vectorA, double[] vectorB)
    {
        if(vectorA.length != vectorB.length)
        {
            System.out.println("wektory są w różnych przestrzeniach");
            return 0;
        }else
        {
            double scalar = 0.0;
            for(int i = 0; i< vectorA.length; i++)
            {
                scalar += (vectorA[i]*vectorB[i]);
            }return scalar;
        }
    }
    /*
     * @param double table (vector)
     * Fills in array, vector, returns nothing
     */
    public static void fillInArray(double[] a)
    {
        try {
            for (int i = 0; i < a.length; i++) {
                System.out.printf("podaj [%d] :", i);
                a[i] = inputer.nextDouble();
            }
        } catch (Exception e) {
            System.out.println("Błąd konwersji liczby");
            inputer.nextLine();
        }
    }

    public static void showMatrix(double[] a)
    {
        for (int i = 0; i<a.length; i++) System.out.print("- - - ");
        System.out.println();
        for (int i = 0; i<a.length; i++)
        {
            System.out.printf(" %.2f ",a[i]);
        }
        System.out.println();
        for (int i = 0; i<a.length; i++) System.out.print("- - - ");
        System.out.println();
    }
    // sortowanie przez wstawianie
    public static void insertionSort(double[] table) {

        double klucz;
        int j;
        for (int i = 1; i < table.length; i++) {
            j = i;
            klucz = table[i];
            while (j > 0 && table[j - 1] > klucz) {
                table[j] = table[j - 1];
                j--;
            }
            table[j] = klucz;
        }
    }
}
