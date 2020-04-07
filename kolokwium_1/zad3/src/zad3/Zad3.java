//Marcin Krupa 1A
package zad3;

import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "cp1250");
        System.out.println("Podaj ścieżkę:");
        
        String path=in.nextLine();
        
        Charset cs = Charset.forName("cp1250");
        Path source = Paths.get(path);
        
        try {
            List<String> lines = Files.readAllLines(source, cs);
            
            for (String line : lines)
                System.out.println(line);

        } catch (NoSuchFileException e) {
            System.out.println(source.toAbsolutePath()+" nie ma takiego pliku");
        } catch (IOException e) 
        {
            System.out.println("Problem");
        }
    }
    
}