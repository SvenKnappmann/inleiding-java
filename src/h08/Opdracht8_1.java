package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_1 extends Applet {
    TextField tekstvak;
    Label label;
    Button ok;
    Button reset;
    String s;

    public void init()  {
        tekstvak = new TextField("",30);
        label = new Label("Voer hier je tekst in:");
        //ok button
        ok = new Button("Ok");
        ok.addActionListener(new KnopListener());
        //reset button
        reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        //overige
        add(label);
        add(tekstvak);
        add(ok);
        add(reset);
        s = "Deze tekst verandert";
    }
    public void paint(Graphics g)   {
        g.drawString(s,50,70);
        g.drawRect(48,58,300,14);
    }

    class KnopListener implements ActionListener    {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener    {
        public void actionPerformed(ActionEvent e) {
            s = "";
            tekstvak.setText("");
            repaint();
        }
    }
}