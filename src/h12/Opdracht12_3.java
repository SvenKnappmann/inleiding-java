package h12;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    //array's
    TextField[] tekstvakken;
    int[] sorter;

    //button
    Button okButton;

    //aantal tekstvakken
    int length = 5;

    //init
    public void init() {

        //array's
        tekstvakken = new TextField[length];
        sorter = new int[length];

        for (int i = 0; i < length; i++) {
            tekstvakken[i] = new TextField("", 30);
            add(tekstvakken[i]);
        }

        //ok button
        okButton = new Button("Ok");
        okButton.addActionListener(new Enter());
        add(okButton);

    }

    //class
    class Enter implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //get text
            for (int i = 0; i < length; i++) {
                sorter[i] = Integer.parseInt( tekstvakken[i].getText());
            }
            Arrays.sort(sorter);
            for (int i = 0; i < length; i++) {
                tekstvakken[i].setText("" + sorter[i]);
            }

        }

    }

}