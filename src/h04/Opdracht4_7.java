package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(10,10,200,200,60,60);
        g.fillOval(60,60,25,25);
        g.fillOval(135,60,25,25);
        g.fillOval(60,135,25,25);
        g.fillOval(135,135,25,25);
    }
}