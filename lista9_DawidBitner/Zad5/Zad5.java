/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dawid Bitner
 */
public class Zad5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj, ile liczb chcesz wprowadzic:");
        int n = scan.nextInt();
		
        System.out.println("Podaj te liczby:");
        int[] nums = new int[n];
		
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        nums = Algorytm.bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
