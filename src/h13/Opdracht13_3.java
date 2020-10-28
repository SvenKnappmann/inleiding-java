package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht13_3 extends Applet{

    String muurType = "niks";
    Button bakstenenButton;
    Button betonnenButton;

    public void init() {

        bakstenenButton = new Button("Bakstenen");
        bakstenenButton.addActionListener(new BakstenenMuur());
        add(bakstenenButton);
        betonnenButton = new Button("Beton");
        betonnenButton.addActionListener(new BetonneMuur());
        add(betonnenButton);

    }
    public void paint(Graphics g) {
        g.drawString(muurType,30,30);

    }
    class BakstenenMuur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muurType = "Baksteen";
            repaint();
        }
    }
    class BetonneMuur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muurType = "Beton";
            repaint();
        }
    }
}
