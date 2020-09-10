package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_5 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(50,70,300,150,0,360);
    }
}