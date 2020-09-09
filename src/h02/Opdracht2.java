package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {

        setBackground(Color.white);

    }
    public void paint(Graphics g) {
        g.setColor(new Color(0,0,255));
        g.drawString("Sven", 50, 60 );
        g.setColor(new Color(255,0,0));
        g.drawString("Knappmann", 50, 70 );
    }

}
