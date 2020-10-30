package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht14_1 extends Applet {

    String[] arrayColor = {"Hart","Klaver","Schoppe","Ruit"};
    String[] arrayString = {"Aas","2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer"};

    Button deelKaart;

    int kaartKleur;
    int kaartNummer;


    public void init() {

        deelKaart = new Button("Deel kaart");
        deelKaart.addActionListener(new DeelKaart());
        add(deelKaart);


    }
    public void paint(Graphics g) {

        g.drawString("" + arrayColor[kaartKleur] + " " + arrayString[kaartNummer],30,30);


    }
    class DeelKaart implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kaartKleur = (int) (Math.round(Math.random() * 3));
            kaartNummer = (int) (Math.round(Math.random() * 12));
            repaint();


        }
    }
}