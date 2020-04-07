import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zadanie_3 extends JFrame implements ActionListener {
    JTextField field,field2;
    String fieldValue,field2Value;
    JLabel label;
    JButton button;
    public zadanie_3()
    {
        setSize(450,300);
        setTitle("Zadanie 3");
        setLayout(null);

        //deklaracja pola napisu
        label = new JLabel("(---)");
        label.setBounds(20,70,430,50);
        label.setForeground(new Color(200, 0, 0));
        label.setFont(new Font("SansSerif",Font.PLAIN,16));
        add(label);

        //deklaracja pola tekstowego (do wpisywania)
        field = new JTextField("Promień");
        field.setBounds(20,20,80,20);
        add(field);

        //deklaracja pola tekstowego 2 (do wpisywania)
        field2 = new JTextField("Wysokość");
        field2.setBounds(120,20,80,20);
        add(field2);

        // deklaracja przycisku zatwierdzającego
        button = new JButton("zatwierdź");
        button.setBounds(20,45, 100,20);
        add(button);
        button.addActionListener(this);
    }
    public static void main(String[] args)
    {
        zadanie_3 aplikacja = new zadanie_3();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }

    protected void countVolume(){
        fieldValue = field.getText();
        field2Value = field2.getText();
        try {
            Double r,h;
            if (((r=Double.parseDouble(fieldValue)) <= 0) || ((h=Double.parseDouble(field2Value)) <= 0)) {label.setText("promień, wysokość muszą być większe niż '0'");}
            else {
                label.setText(String.format("<html>Objętość walca wynosi: %.3f,<br /> a jego pole powierzchni to: %.3f<html>", (Math.PI*r*r*h),(Math.PI*2*r*h)));
            }
        }catch(Exception x)
        {label.setText("<html>Podałeś zły promień lub wysokość<html>");}
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == button) {countVolume();}
    }
}