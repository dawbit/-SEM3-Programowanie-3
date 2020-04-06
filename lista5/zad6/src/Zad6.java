/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad6 {

public static void main(String[] args) {

ArrayList<Double> numericArray = new ArrayList<>();
try {
File file = new File("F:\\JAVA PROJEKTY\\Lab5\\dane.txt");
Scanner in = new Scanner(file);
while (in.hasNext()) {
numericArray.add(Double.parseDouble(in.nextLine()));
}
} catch (FileNotFoundException | NumberFormatException e) {
System.out.println("Ścieżka do pliku jest nieprawidłowa/nie ma takiego pliku");
}

System.out.println("Przed sortowaniem: ");
for(double i: numericArray)
System.out.println(i);

Collections.sort(numericArray,Collections.reverseOrder());


System.out.println("Po sortowaniu: ");
for(double i: numericArray)
System.out.println(i);


}

}
