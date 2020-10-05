package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
public class
 */

public class Opdracht10_4 extends Applet    {

    //Text
    TextField tekstVakMaand, tekstVakJaar;
    Button okButton;
    Label labelEersteZin, jaartal, spacing, spacing01, spacing02, spacing03, spacing04, spacing05;
    String stringMaand, stringDagen;

/*
init
 */

    public void init()  {

        //Confirmation
        labelEersteZin = new Label("Voer het geta van een maand in");
        jaartal = new Label("Jaartal-->");
        tekstVakMaand = new TextField("", 30);
        okButton = new Button("Ok");
        tekstVakJaar = new TextField("",30);
        //spacing
        spacing = new Label("                   ");
        spacing01 = new Label("                          ");
        spacing02 = new Label("                        ");
        spacing03 = new Label("    ");
        spacing04 = new Label("");
        spacing05 = new Label("                ");
        //Class Confirm
        okButton.addActionListener(new OkButton());
        //string
        stringMaand = "";
        stringDagen = "";

        //LineUp
        add(spacing);
        add(labelEersteZin);
        add(spacing01);
        add(spacing02);
        add(tekstVakMaand);
        add(okButton);
        add(spacing03);
        add(spacing04);
        add(jaartal);
        add(tekstVakJaar);
        add(spacing05);

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
        double jaartal;
        double schrikkel;
        public void actionPerformed(ActionEvent e)    {

            //transfer naar nummers

            String tempS = tekstVakMaand.getText();
            String tempJ = tekstVakJaar.getText();

            getal = Double.parseDouble(tempS);
            jaartal = Double.parseDouble(tempJ);

            //Maanden

            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 )    {
                schrikkel = 28;
            }
            else    {
                schrikkel = 29;
            }

            if (getal == 1)  {
                stringMaand = "Januari";
                stringDagen = "31 dagen";
            }
            if (getal == 2) {
                stringMaand = "Februari";
                stringDagen = schrikkel + " dagen";
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
