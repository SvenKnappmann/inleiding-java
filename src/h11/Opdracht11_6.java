package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_6 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int amount = 5;
        int x = 190;
        int y = 150;
        int width = 0;
        int height = 0;

        for (int i = 0; i < amount; i++) {
            x += -10;
            y += -10;
            width += 20;
            height += 20;

            g.drawOval(x,y,width,height);
        }
    }
}
