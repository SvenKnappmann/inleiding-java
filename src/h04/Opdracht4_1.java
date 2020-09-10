package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int[] x ={100,70,130};
        int[] y ={30,100,100};
        g.drawPolygon(x,y,3);
    }
}