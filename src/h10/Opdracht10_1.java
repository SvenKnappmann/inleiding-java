package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
public class
 */

public class Opdracht10_1 extends Applet    {

    //Text
    TextField tekstVak;
    Button okButton;
    Label labelEersteZin;

    //Numbers
    double hoogsteGetal;

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
    }

/*
paint
 */

    public void paint(Graphics g)   {

        g.drawString("Het hoogste getal is " + hoogsteGetal + "",150,150);

    }

/*
classes
 */

    class OkButton implements ActionListener    {
        double getal;

        public void actionPerformed(ActionEvent e)    {

            String tempS = tekstVak.getText();

            getal = Double.parseDouble(tempS);

            if (hoogsteGetal <= getal)  {
                hoogsteGetal = getal;
            }

            repaint();
        }
    }
}
