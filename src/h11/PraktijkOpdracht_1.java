package h11;

import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht_1 extends Applet {
    public void init(){

    }
    public void paint(Graphics g) {

        //aantal rijen

        int row = 10;

        //tellers

        int teller;

        //nummers

        int number;
        int tableNumber = 400;

        //assen

        int y = 20;

        //fors

        for (teller = 1; teller <= row;teller++) {
            y += 25;
            number = tableNumber * teller;
            g.drawString("" + number,130,y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("" + tableNumber,30,y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("" + teller,90,y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("X",70,y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("=",120,y);
        }
    }
}
