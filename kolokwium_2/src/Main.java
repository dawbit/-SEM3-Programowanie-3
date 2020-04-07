import Klasy.Punkt3D;
import Klasy.Punkt3DColor;

import java.util.Scanner;

public class Main {
    static Scanner inputer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lista zadań nr 8.");
        System.out.println("Aleksander Fedyczek");
        Menu.menu();
    }

    protected static void zadanie_1()
    {
        System.out.println("podaj przestrzeń (długość wektorów)");
        boolean flag = true;
        int n = 0;
        while(flag) {
            try {
                n = inputer.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Błąd wczytania liczby");
                inputer.nextLine();
            }
        }
        double[] vectorA = new double[n];
        double[] vectorB = new double[n];
        double scalar;
        System.out.println("Wypełnij wektor A");
        Algorytm.fillInArray(vectorA);
        System.out.println("Wypełnij wektor B");
        Algorytm.fillInArray(vectorB);
        scalar = Algorytm.scalar(vectorA,vectorB);
        System.out.println("Iloczyn skalarny ");
        Algorytm.showMatrix(vectorA);
        System.out.println("\n*\n");
        Algorytm.showMatrix(vectorB);
        System.out.println("wynosi: " + scalar);
    }
    protected static void zadanie_2()
    {
        //Getting from user amount of numbers to sort
        System.out.println("Ile liczb mam posortować? ");
        boolean flag = true;
        int n = 0;
        while(flag) {
            try {
                n = inputer.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Błąd wczytania liczby");
                inputer.nextLine();
            }
        }
        double[] arrayToSort = new double[n];
        //Filling array by user:
        Algorytm.fillInArray(arrayToSort);
        Algorytm.showMatrix(arrayToSort);
        //Sorting
        Algorytm.insertionSort(arrayToSort);
        Algorytm.showMatrix(arrayToSort);
    }
    protected static void zadanie_4()
    {
        System.out.println("to zadanie przetestuje konstruktory klasy Point3D");
        Punkt3D p1 = new Punkt3D();
        p1.show();
        Punkt3D p2 = new Punkt3D(1.23, 3.444, 9.99);
        p2.show();
        double[] var = {3.111,2.341,7.0};
        Punkt3D p3 = new Punkt3D(var);
        p3.show();
    }
    protected static void zadanie_5()
    {
        System.out.println("to zadanie przetestuje konstruktory klasy Point3DColors");
        Punkt3DColor p1 = new Punkt3DColor();
        p1.show();
        Punkt3DColor p2 = new Punkt3DColor(1.23, 3.444, 9.99, 255,255,0);
        p2.show();
        double[] var = {3.111,2.341,7.0,128,128,0.25};
        Punkt3DColor p3 = new Punkt3DColor(var);
        p3.show();
    }


}
