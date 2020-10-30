package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;

public class Opdracht14_2 extends Applet {

    String[] arrayColor = {"Hart ", "Klaver ", "Schoppe ", "Ruit "};
    String[] arrayString = {"Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer"};

    String[] deck = new String[52];

    String[] persoon1 = new String[13];
    String[] persoon2 = new String[13];
    String[] persoon3 = new String[13];
    String[] persoon4 = new String[13];

    int spacerX = 90;
    int spacerY = 30;

    Button deelKaartButton;

    boolean booleanForButton = false;


    public void init() {

        setSize(500, 500);

        int counter = 0;

        deelKaartButton = new Button("Deel Kaart");
        deelKaartButton.addActionListener(new DeelKaart());
        add(deelKaartButton);
        booleanForButton = true;
    }

    public void paint(Graphics g) {
        int counter = 0;
        deck = new String[52];
        if (booleanForButton){
            for (int i = 0; i < arrayColor.length; i++) {
                for (int j = 0; j < arrayString.length; j++) {
                    deck[counter] = arrayColor[i] + arrayString[j];
                    counter++;
                }
            }

            for (int i = 0; i < persoon1.length; i++) {
                persoon1[i] = drawCard();
            }
            for (int i = 0; i < persoon2.length; i++) {
                persoon2[i] = drawCard();
            }
            for (int i = 0; i < persoon3.length; i++) {
                persoon3[i] = drawCard();
            }
            for (int i = 0; i < persoon4.length; i++) {
                persoon4[i] = drawCard();
            }

            System.out.println(deck.length);
            booleanForButton = false;
        }
        for (int j = 0; j < 13; j++) {
            g.drawString(persoon1[j], spacerX * 1, spacerY + j * spacerY);
            g.drawString(persoon2[j], spacerX * 2, spacerY + j * spacerY);
            g.drawString(persoon3[j], spacerX * 3, spacerY + j * spacerY);
            g.drawString(persoon4[j], spacerX * 4, spacerY + j * spacerY);
        }
    }

    private String drawCard() {
        int random = 0;

        random = new Random().nextInt(deck.length);

        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {

            if (i != random) {

                hulpLijst[hulpindex] = deck[i];
                hulpindex++;


            }
        }
        deck = hulpLijst;

        return kaart;

    }

    class DeelKaart implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            booleanForButton = true;
            repaint();


        }
    }
}
