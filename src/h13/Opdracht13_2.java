package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht13_2 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        tekenMuur(g);
    }
    void tekenMuur(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 50;
        int height = 20;
        g.drawRect(x,y,width,height);
    }
}
