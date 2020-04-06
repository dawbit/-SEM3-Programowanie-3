/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Arrays;

/**
 *
 * @author Dawid Bitner
 */
class Ramka extends JFrame {
    JTextArea notatnik;
    Ramka(){
        setTitle("ZAD5");
        setSize(800,800);
        
        notatnik=new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notatnik);
        scrollPane.setBounds(0,0,800,800);
        add(scrollPane);
        sito();
    }

    public void sito() {
        int zakres = 1000;
        boolean[] pierwsze = new boolean[zakres];
        Arrays.fill(pierwsze, true);
        pierwsze[0] = false;
        pierwsze[1] = false;
        for (int i = 2; i < zakres; i++) {

            if (pierwsze[i] == true) {
                for (int j=i+i; j<zakres;j=j+i){
                    pierwsze[j]=false;
                }
            }
        }
        for(int i=0;i<zakres;i++){
            if(pierwsze[i]==true){
                notatnik.append(String.valueOf(i)+"\n");
            }
        }
        
    }
}
