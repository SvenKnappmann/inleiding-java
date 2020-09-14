package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    double a, b;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt " + uitkomst, 20, 20);
        g.drawString("Ali krijgt " + uitkomst, 20, 35);
        g.drawString("Jeannette krijgt " + uitkomst, 20, 50);
        g.drawString("Sven krijgt " + uitkomst, 20, 65);
    }
}
