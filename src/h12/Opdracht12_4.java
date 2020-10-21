package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht12_4 extends Applet {

    //array
    int[] data;

    //variabeles
    TextField tekstvak;

    Button okButton;

    String display;

    public void init() {

        data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i * 50;
        }
        //tekstvak
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new OkButton());
        add(tekstvak);
        //button
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButton());
        add(okButton);

    }
    public void paint(Graphics g) {
        //string
        g.drawString(display + "",50,100);

    }
    class OkButton implements ActionListener {
        //converter
        int getal;

        public void actionPerformed(ActionEvent e) {

            //converter
            String tempS = tekstvak.getText();
            getal = Integer.parseInt(tempS);

            //reverse searching code
//            display = "" + data[getal];
            //searching code
            for (int i = 0; i < data.length; i++) {
                if (getal == data[i]) {
                    display = "" + i;
                    break;
                } else {
                    display = "Not a correct number, the number must be divisible by 50" ;
                }
            }
            repaint();
        }
    }
}
