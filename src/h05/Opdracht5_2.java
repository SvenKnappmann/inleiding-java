package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        setBackground(Color.white);
        Valerie = -4;
        Jeroen = -10;
        Hans = -8;
    }
    public void paint(Graphics g) {
        //base
        g.fillRect(80,180,230,5);
        g.setColor(Color.black);
        g.drawString("Gewicht van kinderen in KG",20,40);
        //pole
        g.setColor(Color.black);
        g.fillRect(80,80,2,100);
        g.fillRect(80,180,10,1);
        g.fillRect(80,160,10,1);
        g.fillRect(80,140,10,1);
        g.fillRect(80,120,10,1);
        g.fillRect(80,100,10,1);
        g.fillRect(80,80,10,1);
        g.drawString("0",70,185);
        g.drawString("20",63,165);
        g.drawString("40",63,145);
        g.drawString("60",63,125);
        g.drawString("80",63,105);
        g.drawString("100",56,85);
        //rects
        g.setColor(Color.red);
        g.fillRect(100,180,60,Valerie);
        g.setColor(Color.green);
        g.fillRect(170,180,60,Jeroen);
        g.setColor(Color.blue);
        g.fillRect(240,180,60,Hans);
        //names
        g.setColor(Color.red);
        g.drawString("Valerie",110,200);
        g.setColor(Color.green);
        g.drawString("Jeroen",180,200);
        g.setColor(Color.blue);
        g.drawString("Hans",255,200);
    }
}