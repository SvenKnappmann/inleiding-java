package h11;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht_2 extends Applet {
    Button button;
    int number = 1;
    public void init() {
        button = new Button("Next");
        button.addActionListener(new ButtonListener());
        add(button);
    }
    public void paint(Graphics g) {

        //aantal rijen

        int row = 10;

        //tellers

        int teller;

        //nummers

        int displayingNumber;
        int tableNumber = number;

        //assen

        int y = 20;

        //fors


        for (teller = 1; teller <= row; teller++) {
            y += 25;
            displayingNumber = tableNumber * teller;
            g.drawString("" + displayingNumber, 130, y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("" + tableNumber, 30, y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("" + teller, 90, y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("X", 70, y);
        }
        y = 20;
        for (teller = 1; teller <= row; teller++) {
            y += 25;
            g.drawString("=", 120, y);

        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            number++;
            if (number == 11) {
                number = 1;
            }
            repaint();
        }
    }
}
