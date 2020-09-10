package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(80,20,10,150);
        g.setColor(Color.red);
        g.fillRect(90,20,90,20);
        g.setColor(Color.white);
        g.fillRect(90,40,90,20);
        g.setColor(Color.blue);
        g.fillRect(90,60,90,20);
    }
}