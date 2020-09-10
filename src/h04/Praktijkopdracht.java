package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,25,295,25);
        g.drawRect(20,45,275,125);
        g.drawRoundRect(20,190,275,125,30,30);
        //magenta
        g.setColor(Color.magenta);
        g.fillRect(310,45,275,125);
        g.fillOval(310,190,275,125);
        g.fillArc(600,35,275,125,0,45);
        //black
        g.setColor(Color.black);
        g.drawOval(310,45,275,125);
        g.drawOval(600,35,275,125);
        g.drawOval(675,190,125,125);
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