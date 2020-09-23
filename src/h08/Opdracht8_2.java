package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_2 extends Applet{
    //ints
    int labelcords;
    int xcords;
    int stringcords;
    int man;
    int vrouw;
    int pvrouw;
    int pman;
    int totaal;
    //labels
    Label label01;
    Label lman;
    Label lvrouw;
    Label lpvrouw;
    Label lpman;
    Label totaal01;
    //buttons
    Button buttona;
    Button buttonb;
    Button buttonc;
    Button buttond;
    public void init()  {
        //labeltekst
        label01 = new Label("Wat voor bezoeker ben je?");
        lman = new Label("Mannelijke leerling");
        lvrouw = new Label("Vrouwelijke leerling");
        lpvrouw = new Label("Potentiële Vrouwelijke leerling");
        lpman = new Label("Potentiële Mannelijke leerling");
        totaal01 = new Label("Totaal:");
        //buttontekst
        buttona = new Button("                     ");
        buttonb = new Button("                     ");
        buttonc = new Button("                     ");
        buttond = new Button("                     ");
        //ActionListener
        buttona.addActionListener(new ButtonA());
        buttonb.addActionListener(new ButtonB());
        buttonc.addActionListener(new ButtonC());
        buttond.addActionListener(new ButtonD());
        //variables
        xcords = 216;
        labelcords = 37;
        stringcords = 300;
        man = 0;
        vrouw = 0;
        pvrouw = 0;
        pman = 0;
        //add label
        add(label01);
        add(lman);
        add(lvrouw);
        add(lpvrouw);
        add(lpman);
        add(totaal01);
        //add button
        add(buttona);
        add(buttonb);
        add(buttonc);
        add(buttond);
    }
    public void paint(Graphics g)   {
        //label cords
        label01.setLocation(labelcords,10);
        lman.setLocation(labelcords,34);
        lvrouw.setLocation(labelcords,58);
        lpvrouw.setLocation(labelcords,82);
        lpman.setLocation(labelcords,106);
        totaal01.setLocation(labelcords,130);
        //button cords
        buttona.setLocation(xcords,34);
        buttonb.setLocation(xcords,58);
        buttonc.setLocation(xcords,82);
        buttond.setLocation(xcords,106);
        //number cords
        g.drawString("" + man,stringcords,50);
        g.drawString("" + vrouw,stringcords,74);
        g.drawString("" + pvrouw,stringcords,98);
        g.drawString("" + pman,stringcords,122);
        g.drawString("" + totaal, stringcords,146);
    }
    //button man
    class ButtonA implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            totaal = (man + vrouw + pvrouw + pman);
            repaint();
        }
    }
    //button vrouw
    class ButtonB implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            totaal = (man + vrouw + pvrouw + pman);
            repaint();
        }
    }
    //button pvrouw
    class ButtonC implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pvrouw++;
            totaal = (man + vrouw + pvrouw + pman);
            repaint();
        }
    }
    //button pman
    class ButtonD implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pman++;
            totaal = (man + vrouw + pvrouw + pman);
            repaint();
        }
    }
}
