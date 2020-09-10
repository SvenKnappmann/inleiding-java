package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {

    Color B;
    Color M;
    int h;
    int b;

    public void init() {
        B = Color.black;
        M = Color.magenta;
        h = 125;
        b = 275;
    }

    public void paint(Graphics g) {
        g.drawLine(20,25,295,25);
        g.drawRect(20,45,b,h);
        g.drawRoundRect(20,190,b,h,30,30);
        //magenta
        g.setColor(M);
        g.fillRect(310,45,b,h);
        g.fillOval(310,190,b,h);
        g.fillArc(600,35,b,h,0,45);
        //black
        g.setColor(B);
        g.drawOval(310,45,b,h);
        g.drawOval(600,35,b,h);
        g.drawOval(675,190,125,h);
        //text
        g.drawString("Lijn",130,40);
        g.drawString("Rechthoek",125,185);
        g.drawString("Afgeronde rechthoek",100,330);
        g.drawString("Gevulde rechthoek met ovaal",360,185);
        g.drawString("Gevulde ovaal",390,330);
        g.drawString("Taartpunt met ovaal eromheen",640,185);
        g.drawString("Circel",725,330);
    }
}