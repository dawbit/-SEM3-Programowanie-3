/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Dawid Bitner
 */
class Oknoa extends JFrame {

    JTextField ramka;
    JLabel znak;
    Oknoa() {
        setTitle("zad4");
        setSize(600,600);
        setLayout(null);
        ramka = new JTextField();
        ramka.setBounds(50, 50, 300, 30);
        add(ramka);
        znak = new JLabel();
        znak.setBounds(50, 90, 300, 30);
        add(znak);
        
        
        
        ramka.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
                    znak.setText("liczba");
                    
                }
                else if(e.getKeyChar()>='a' && e.getKeyChar() <='z'){
                    znak.setText("litera");
                }
                else if (e.getKeyChar()==' '){
                    znak.setText("spacja");
                }
                else {
                    znak.setText("znak");
                }                
                
                
            }
        });
    }
}
