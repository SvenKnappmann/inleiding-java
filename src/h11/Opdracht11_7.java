package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int amount = 56;


        int x = amount*5;
        int y = amount*5;

        int width = 0;
        int height = 0;

        for (int i = 0; i < amount; i++) {

            x -= 5;
            y -= 5;

            g.drawOval(x,y,width,height);

            height += 10;
            width += 10;

        }
    }
}
