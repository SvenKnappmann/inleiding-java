package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht13_1 extends Applet {


    public void init() {

    }
    public void paint(Graphics g) {

        setSize(600,500);

        for (int teller = 0; teller < 100; teller++) {

            tekenDriehoek(g, 200 + teller, 200 + teller, 400 + teller, 200 + teller, 300 + teller, 400 + teller);


        }
    }
    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);


    }
}
