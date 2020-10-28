package h13;

import java.awt.*;
import java.applet.*;

public class Opdracht13_2 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setSize(1000,500);

        tekenMuur(g,50,50,20,20);


    }
    void tekenMuur(Graphics g,int xBegin,int y,int aantalBakstenenPerRij,int aantalRijen) {

        int counter = 0;

        int x;
        int width = 50;
        int height = 20;

        for (int i = 0; i < aantalRijen; i++) {
            if (counter % 2 == 0) {
                x = xBegin;
                for (int teller = 0; teller < aantalBakstenenPerRij; teller++) {

                    g.setColor(Color.red);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                    x += 50;


                }
            } else {
                x = xBegin - 25;
                for (int teller = 0; teller < aantalBakstenenPerRij; teller++) {

                    g.setColor(Color.red);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                    x += 50;


                }
            }
            y += 20;
            counter++;
        }
    }
}
