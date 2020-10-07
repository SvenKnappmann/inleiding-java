package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {

    int input = 12;

    public void init() {

    }
    public void paint(Graphics g) {
        int oudGetal = 1;
        int nieuwGetal = 1;
        int y = 40;
        g.drawString("" + oudGetal,20,y);
        y += 20;
        g.drawString("" + nieuwGetal,20,y);
        for (int i = 0; i < input; i++) {
            int tijdeijkGetal = nieuwGetal;
            nieuwGetal += oudGetal;
            oudGetal = tijdeijkGetal;
            y += 20;
            g.drawString("" + nieuwGetal,20,y);
        }
    }
}