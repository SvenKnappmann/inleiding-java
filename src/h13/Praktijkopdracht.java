package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    Color brown = new Color(165,42,42);
    public void init() {

    }
    public void paint(Graphics g) {
        tekenBos(g,5,3);
    }
    void tekenBoom(Graphics g, int x, int y) {

            g.setColor(brown);
            g.fillRect(x,y,40,100);
            g.setColor(Color.green);
            g.fillOval(x - 30,y - 60,100,100);


    }
    void tekenBos(Graphics g, int aantalInEenRij, int aantalInEenKolom) {

        int x = 50;
        int y = 60;

        for (int i = 0; i < aantalInEenRij; i++) {
            for (int j = 0; j < aantalInEenKolom; j++) {
                tekenBoom(g,x + i * 100, y + j * 160);
            }
        }
    }
}
