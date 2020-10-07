package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_4 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {

        //aantal rijen

        int row = 11;

        //tellers

        int teller;
        int teller2;
        int teller3;
        int teller4;
        int teller5;

        //nummers

        int nummer;
        int nummer2 = 3;
        int staticNumber = 3;

        //assen

        int y = 20;
        int y2 = 20;
        int y3 = 20;
        int y4 = 20;
        int y5 = 20;

        //fors

        for (teller = 1; teller <= row;teller++) {
            y += 25;
            nummer = staticNumber * teller;
            g.drawString("" + nummer,90,y);
        }
        for (teller2 = 1; teller2 <= row; teller2++) {
            y2 += 25;
            g.drawString("" + nummer2,30,y2);
        }
        for (teller3 = 1; teller3 <= row; teller3++) {
            y3 += 25;
            g.drawString("" + teller3,60,y3);
        }
        for (teller4 = 1; teller4 <= row; teller4++) {
            y4 += 25;
            g.drawString("X",45,y4);
        }
        for (teller5 = 1; teller5 <= row; teller5++) {
            y5 += 25;
            g.drawString("=",75,y5);
        }

    }
}
