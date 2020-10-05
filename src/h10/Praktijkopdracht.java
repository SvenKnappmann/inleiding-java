package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet    {
    //text
    TextField txt;
    String stringA;

    //buttons
    Button okButton;

    public void init()  {

        //Text
        txt = new TextField("",30);
        stringA = "Beoordeling";
        //Button
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButton());
        txt.addActionListener(new OkButton());
        //add
        add(txt);
        add(okButton);

    }
    public void paint(Graphics g)   {

        g.drawString(stringA,40,135);

    }
    class OkButton implements ActionListener    {
        double getal;
        public void actionPerformed(ActionEvent e)    {

            String tempS = txt.getText();

            getal = Double.parseDouble(tempS);

            if (getal < 3.5 && getal >= 1) {
                stringA = "Slecht";
            } else if (getal < 4.5 && getal >= 3.5) {
                stringA = "Onvoldoende";
            } else if (getal < 5.5 && getal >= 4.5) {
                stringA = "Matig";
            } else if (getal < 7.5 && getal >= 5.5) {
                stringA = "Voldoende";
            } else if (getal < 10 && getal >= 7.5) {
                stringA = "Goed";
            }else   {
                stringA = "Er is een ongeldig getal ingevuld";
            }
            repaint();
        }
    }
}