/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dawid Bitner
 */
public class Zad4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj sciezke");
        String path = scan.nextLine();
		
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
		
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
    }
    
}
