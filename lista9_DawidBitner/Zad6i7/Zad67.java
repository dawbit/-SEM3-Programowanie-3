/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad67;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dawid Bitner
 */
public class Zad67 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dawid\\Desktop\\we.txt"));
        int lines = 0;
        while (reader.readLine() != null) {
            lines++;
        }
        int[] nums = new int[lines];
        reader = new BufferedReader(new FileReader("C:\\Users\\dawid\\Desktop\\we.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\dawid\\Desktop\\wy.txt"));
        String line = reader.readLine();
        int i=0;
		
        while (line != null) {
            nums[i] = Integer.parseInt(line);
            i++;
            line = reader.readLine();
        }
        nums = Algorytm.bubblesort(nums);
        for(int j=0; j<nums.length;j++){
            writer.write(Integer.toString(nums[j])+"\r\n");
        }
        writer.close();
    }

}
