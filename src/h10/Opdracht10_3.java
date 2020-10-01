package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
public class
 */

public class Opdracht10_3 extends Applet    {

    //Text
    TextField tekstVak;
    Button okButton;
    Label labelEersteZin;
    String stringMaand;
    String stringDagen;

/*
init
 */

    public void init()  {

        //Confirmation
        labelEersteZin = new Label("Voer het geta van een maand in");
        tekstVak = new TextField("", 30);
        okButton = new Button("Ok");

        //Class Confirm
        okButton.addActionListener(new OkButton());

        //LineUp
        add(labelEersteZin);
        add(tekstVak);
        add(okButton);

    }

/*
paint
 */

    public void paint(Graphics g)   {

        g.drawString(stringMaand,150,150);
        g.drawString(stringDagen,150,165);

    }

/*
classes
 */

    class OkButton implements ActionListener    {
        double getal;

        public void actionPerformed(ActionEvent e)    {

            //transfer naar nummers

            String tempS = tekstVak.getText();

            getal = Double.parseDouble(tempS);

            //Maanden

            if (getal == 1)  {
                stringMaand = "Januari";
                stringDagen = "31 dagen";
            }
            if (getal == 2) {
                stringMaand = "Februari";
                stringDagen = "28/29 dagen";
            }
            if (getal == 3) {
                stringMaand = "Maart";
                stringDagen = "31 dagen";
            }
            if (getal == 4) {
                stringMaand = "April";
                stringDagen = "30 dagen";
            }
            if (getal == 5) {
                stringMaand = "Mei";
                stringDagen = "31 dagen";
            }
            if (getal == 6) {
                stringMaand = "Juni";
                stringDagen = "30 dagen";
            }
            if (getal == 7) {
                stringMaand = "Juli";
                stringDagen = "31 dagen";
            }
            if (getal == 8) {
                stringMaand = "Augustus";
                stringDagen = "31 dagen";
            }
            if (getal == 9) {
                stringMaand = "September";
                stringDagen = "30 dagen";
            }
            if (getal == 10) {
                stringMaand = "Oktober";
                stringDagen = "31 dagen";
            }
            if (getal == 11) {
                stringMaand = "November";
                stringDagen = "30 dagen";
            }
            if (getal == 12) {
                stringMaand = "December";
                stringDagen = "31 dagen";
            }
            //extratje
            if (getal >= 13) {
                stringMaand = "Er zijn niet meer";
                stringDagen = "dan 12 maanden.";
            }
            repaint();
        }
    }
}
