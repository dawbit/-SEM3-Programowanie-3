package zad3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Dawid Bitner
 */
public class Zad3 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String napis;
        napis = "Polskie znaki: ąęćłóśżź";
        Scanner input = new Scanner (System.in);
        System.out.print("Podaj sciezke pliku: ");
        String sciezka = input.nextLine();
        try (PrintWriter zapis = new PrintWriter(sciezka)) {
            zapis.print(napis);
        } 
		
		try {

			Writer out = new BufferedWriter(new OutputStreamWriter(

				new FileOutputStream("sciezka"), "UTF8"));
				

			out.write(napis);

			out.close();

		} catch (UnsupportedEncodingException e) {

		} 
		catch (IOException e) {

		}
				

			}
			
		}


    

