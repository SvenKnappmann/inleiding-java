package h12;

import java.awt.*;
import java.applet.Applet;

public class Opdracht12_1 extends Applet {
    int[] getallen;
    int memory;
    int displayMemory;
    public void init() {
        getallen = new int[10];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = 10 * i + 10;
        }
        for (int i = 0; i < getallen.length; i++) {
            memory += getallen[i];
        }
        displayMemory = memory / getallen.length;

    }
    public void paint(Graphics g) {
        int y = 15;
        for (int i = 0; i < getallen.length; i++) {
            y += 15;
            g.drawString(getallen[i] + "",30,y);

        }
        g.drawString(displayMemory + " is het gemiddelde",100,100);
    }
}
