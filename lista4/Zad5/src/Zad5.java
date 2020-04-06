
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid Bitner
 */
import java.util.Scanner;
import java.util.regex.*;

public class Zad5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp1250");

        Pattern pat = Pattern.compile("(([1-9]|0[1-9]|[12][0-9]||3[01])[-//.]" + "(0[1-9]|1[012])[-//.](19|20)\\d\\d)");

        System.out.println("Wprowadź date");
        String text = in.nextLine();

        Matcher mat = pat.matcher(text);
        
        if(mat.find()) System.out.println("data i format poprawny");
            else System.out.println("data lub format niepoprawny");

}

}