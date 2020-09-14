package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_3 extends Applet {
    int begingetal;
    int uitkomst;

    public void init() {
    }

    public void paint(Graphics g) {
        begingetal = 2147483647;
        uitkomst = begingetal + 1;
        g.drawString(" " + uitkomst + " ",20,20);
    }
}
