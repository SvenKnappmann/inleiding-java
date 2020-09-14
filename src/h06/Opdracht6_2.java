package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_2 extends Applet {

    int aantalSecondenIneenUur;
    int aantalSecondenIneendag;
    int aantalSecondenIneenjaar;
    int invoergetalhier;
    int dag;
    int jaar;

    public void init() {
    }

    public void paint(Graphics g) {
        invoergetalhier = 1; // <-- Verander alleen het getal op deze regel voor de uitkomst.
        dag = 1;
        jaar = 1;
        aantalSecondenIneenUur = 60 * 60 * invoergetalhier;
        aantalSecondenIneendag = aantalSecondenIneenUur * 24 * dag;
        aantalSecondenIneenjaar = aantalSecondenIneendag * 365 * jaar;
        g.drawString("" + aantalSecondenIneenUur + " : " + invoergetalhier + " Uur/Uren",20,20);
        g.drawString("" + aantalSecondenIneendag + " : " + invoergetalhier + " Dag(en)", 20, 35);
        g.drawString("" + aantalSecondenIneenjaar + " : " + invoergetalhier + " Jaar/Jaren", 20, 50);
    }
}
