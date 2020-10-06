package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_2 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int x = 10;
        for (teller = 20; teller > 10; teller--) {
            x += 20;
            g.drawString("" + teller,x,40);
        }
    }
}
