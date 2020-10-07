package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_5 extends Applet {

    int amount = 5;

    public void init() {

    }
    public void paint(Graphics g) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < amount; i++) {
            x += 20;
            y += 20;
            g.drawRect(x,y,20,20);
        }
    }
}
