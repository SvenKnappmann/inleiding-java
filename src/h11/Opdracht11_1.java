package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_1 extends Applet{
    public void init() {

    }
    public void paint(Graphics g){
        int teller = 0;
        int x = 50;
        do {
            x += 20;
            g.drawLine(x,30,x,200);
            teller++;
        } while (teller < 10);
    }
}

