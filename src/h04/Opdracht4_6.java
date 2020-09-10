package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(170,45,50,150,20,20);
        g.fillRect(190,195,10,200);
        g.setColor(Color.red);
        g.fillOval(175,54,40,40);
        g.setColor(Color.yellow);
        g.fillOval(175,98,40,40);
        g.setColor(Color.green);
        g.fillOval(175,142,40,40);
    }
}