package h11;


import java.awt.*;
import java.applet.Applet;

public class Opdracht11_8 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        setSize(1920,952);
        int amount = 100;

        int width = 5;
        int height = 5;

        for (int i = 0; i < amount; i++) {
            width += 10;
            height += 10;
            g.drawOval(0,0,width,height);
        }
    }
}
