package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int[] x ={100,70,130};
        int[] y ={63,100,100};
        g.drawPolygon(x,y,3);
        g.drawRect(70,100,60,60);
        g.drawRect(80,130,20,30);
        g.drawOval(93,142,4,4);
        g.drawRect(105,132,20,20);
    }
}