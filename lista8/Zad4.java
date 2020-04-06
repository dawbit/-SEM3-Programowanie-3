/*
Dawid Bitner IA
 */
package zad4;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in, "cp1250");
    
    System.out.println("Podaj wymiar");
        int n;
        try {
            n=in.nextInt();
        } catch (Exception e) {
            System.out.println("Wystąpił błąd");
            return;
        }
    
        int[][] matrix = new int[n][n];
        int val=1;
        int minKol=0, maxKol = n-1, minW = 0, maxW = n-1;
         
        while (val<=n*n)
        {
            for (int i=minKol; i<=maxKol; i++) {
                matrix[minW][i]=val;
                val++;
            }
             
            for (int i=minW+1; i<=maxW; i++) { 
                matrix[i][maxKol]=val; 
                val++; 
            } 
             
            for (int i=maxKol-1; i>=minKol; i--) {
                matrix[maxW][i]=val;
                val++;
            }
             
            for (int i=maxW-1; i>=minW+1; i--) {
                matrix[i][minKol]=val;
                val++;
            }
             
            minKol++;
            minW++;
            maxKol--;
            maxW--;
        }
         
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.printf("%-4d", matrix[i][j]);
            System.out.println();
        }
    
    }
    
}
