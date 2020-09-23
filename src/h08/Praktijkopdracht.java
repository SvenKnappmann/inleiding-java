package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    //Textvakken
    TextField text1;
    TextField text2;

    //Buttons
    Button keer;
    Button gedeelddoor;
    Button plus;
    Button min;

    //double
    double uitkomstkeer;
    double uitkomstgedeelddoor;
    double uitkomstplus;
    double uitkomstmin;

    public void init() {

        //Tekstvak specify
        text1 = new TextField("",10);
        text2 = new TextField("",10);

        //Tekstvak add
        add(text1);
        add(text2);

        //Button confirmation
        keer = new Button("x");
        gedeelddoor = new Button(":");
        plus = new Button("+");
        min = new Button("-");

        //Button specify
        keer.addActionListener(new ButtonKeer());
        gedeelddoor.addActionListener(new ButtonGedeelddoor());
        plus.addActionListener(new ButtonPlus());
        min.addActionListener(new ButtonMin());

        //Button add
        add(keer);
        add(gedeelddoor);
        add(plus);
        add(min);
    }

    class ButtonKeer implements ActionListener {

        double getal1;
        double getal2;

        public void actionPerformed(ActionEvent e) {

            String temp1 = text1.getText();
            String temp2 = text2.getText();

            getal1 = Double.parseDouble( temp1 );
            getal2 = Double.parseDouble( temp2 );

            uitkomstkeer = getal1 * getal2;
            text1.setText("" + uitkomstkeer);
            text2.setText("");

        }
    }
    class ButtonGedeelddoor implements ActionListener {

        double getal1;
        double getal2;

        public void actionPerformed(ActionEvent e) {

            String temp1= text1.getText();
            String temp2 = text2.getText();

            getal1 = Double.parseDouble( temp1 );
            getal2 = Double.parseDouble( temp2 );

            uitkomstgedeelddoor = getal1 / getal2;
            text1.setText("" + uitkomstgedeelddoor);
            text2.setText("");

        }
    }
    class ButtonPlus implements ActionListener {

        double getal1;
        double getal2;

        public void actionPerformed(ActionEvent e) {

            String temp1 = text1.getText();
            String temp2 = text2.getText();

            getal1 = Double.parseDouble( temp1 );
            getal2 = Double.parseDouble( temp2 );

            uitkomstplus = getal1 + getal2;
            text1.setText("" + uitkomstplus);
            text2.setText("");

        }
    }
    class ButtonMin implements ActionListener {

        double getal1;
        double getal2;

        public void actionPerformed(ActionEvent e) {

            String temp1 = text1.getText();
            String temp2 = text2.getText();

            getal1 = Double.parseDouble( temp1 );
            getal2 = Double.parseDouble( temp2 );

            uitkomstmin = getal1 - getal2;
            text1.setText("" + uitkomstmin);
            text2.setText("");

        }
    }
}
