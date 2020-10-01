package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
public class
 */

public class Opdracht10_2 extends Applet    {

    //Text
    TextField tekstVak;
    Button okButton;
    Label labelEersteZin;

    //Numbers
    double hoogsteGetal, laagsteGetal;

/*
init
 */

    public void init()  {

        //Confirmation
        labelEersteZin = new Label("Voer een getal in");
        tekstVak = new TextField("", 30);
        okButton = new Button("Ok");

        //Class Confirm
        okButton.addActionListener(new OkButton());

        //LineUp
        add(labelEersteZin);
        add(tekstVak);
        add(okButton);

        //Text
        hoogsteGetal = 0;
        laagsteGetal = 1000000;
    }

/*
paint
 */

    public void paint(Graphics g)   {

        g.drawString("Het hoogste getal is "+ hoogsteGetal + "",150,150);
        g.drawString("Het laagste getal is "+ laagsteGetal + "",150,165);

    }

/*
classes
 */

    class OkButton implements ActionListener    {
        double getal, getal1;

        public void actionPerformed(ActionEvent e)    {

            //transfer naar nummers

            String tempS = tekstVak.getText();
            String tempP = tekstVak.getText();

            getal = Double.parseDouble(tempS);
            getal1 = Double.parseDouble(tempP);

            //if's

            if (hoogsteGetal <= getal)  {
                hoogsteGetal = getal;
            }
            if (laagsteGetal >= getal1) {
                laagsteGetal = getal1;
            }

            repaint();
        }
    }
}
