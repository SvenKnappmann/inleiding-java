package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_5 extends Applet    {
    //text
    TextField txt;
    String stringS, textgemiddeldeCijfer;

    //buttons
    Button okButton;
    double aantalCijfers, uitkomst, gemiddeldeCijfer;


    public void init()  {

        //Text
        txt = new TextField("",30);
        stringS = "Er is nog geen cijfer ingevuld of op ok gedrukt";

        //lines
        gemiddeldeCijfer = 0;
        textgemiddeldeCijfer = "";

        //Button
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButton());

        //add
        add(txt);
        add(okButton);

    }
    public void paint(Graphics g)   {

        g.drawString(stringS,40,105);
        g.drawString("Het gemiddelde cijfer is " + gemiddeldeCijfer,40,165);
        g.drawString("De leerling is dus " + textgemiddeldeCijfer,40,180);

    }
    class OkButton implements ActionListener    {
        double getal;
        public void actionPerformed(ActionEvent e)    {

            String tempS = txt.getText();

            getal = Double.parseDouble(tempS);

            //ifs
            // || OF
            // && EN
            if (getal > 10 || getal < 0)    {
                stringS = "Je kan niet hoger halen dan een tien of lager dan een nul.";
            } else if (getal >= 5.5){
                stringS = "Het ingevoerde cijfer is een voldoende";
                aantalCijfers++;
                uitkomst = uitkomst + getal;
            } else  {
                stringS = "Het huidige cijfer is een onvoldoende";
                aantalCijfers++;
                uitkomst = uitkomst + getal;
            }
            gemiddeldeCijfer = uitkomst / aantalCijfers;


            if (gemiddeldeCijfer >= 5.5)    {
                textgemiddeldeCijfer = "wel geslaagd";
            } else  {
                textgemiddeldeCijfer = "niet geslaagd";
            }
            repaint();
        }
    }
}