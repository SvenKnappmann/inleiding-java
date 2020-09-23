package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {
    Button button;
    TextField tekstvak;
    Label label;
    double getal;
    double metBtw;

    public void init() {
        button = new Button("Ok");
        button.addActionListener( new ButtonListener());
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        add(button);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(" Het getal is " + getal + " Met btw is het " + metBtw, 50, 60 );
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String temp = tekstvak.getText();
            getal = Double.parseDouble( temp );
            metBtw = getal * 1.21;
            repaint();
        }
    }
}
