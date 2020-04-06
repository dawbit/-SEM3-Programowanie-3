/*
Dawid Bitner IA
 */
package zad5;

import java.util.Scanner;
import java.util.Random;
        
class MatrixOperations{
    
    public MatrixOperations(){}
    
    public double[][] GenerateMatrix (int i, int j)
    {
        Random rand = new Random();
        double[][] matrix = new double[i][j];
        for (int a=0; a<i; a++) {
             for (int b=0; b<j; b++) 
                matrix[a][b]=(int)(Math.random() * 20 - 20);
        }
        
        return matrix;
    }
    
    public void show (double [][] mat)
    {
        for (int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++)
                System.out.printf("%-7.2f", mat[i][j]);
            System.out.printf("\n");
        }
    }
    
    public double[][] multiply (double [][] mat1, double [][] mat2)
    {
        int n=mat1.length, m=mat2[0].length, x=mat1[0].length;
        double[][] matrix = new double[n][m];
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                for (int k=0; k<x; k++)
                    matrix[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        return matrix;
    }
}


public class Zad5 {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in, "cp1250");
    System.out.println("Podaj wymiary w kolejności n, k, m:");
        int n, k, m;
        try {
            n=in.nextInt();
            k=in.nextInt();
            m=in.nextInt();
        } catch (Exception e) {
            System.out.println("Wystąpił błąd");
            return;
        }
    
        
        double[][] A = new double[n][k];
        double[][] B = new double[k][m];
        double[][] C = new double[n][m];
        
        MatrixOperations macierz = new MatrixOperations();
        A=macierz.GenerateMatrix(n, k);
        B=macierz.GenerateMatrix(k, m);
        
        macierz.show(A);
        System.out.println();
        macierz.show(B);
        System.out.println("\nWymnożone:");
        C=macierz.multiply(A, B);
        
        macierz.show(C);
    }
    
}
 