package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht12_6 extends Applet {

    //array
    int[] data = { 10, 20, 50, 40, 30, 20, 40, 40, 10, 20, 40, 10, 30, 50, 30};

    //TextField
    TextField textField;

    //Button
    Button okButton;

    //Counter
    int counterForSearchingLoop;

    //String
    String display = "";

    //Converter
    int textToNumberConverter;


    public void init() {

        //TextField
        textField = new TextField("",30);
        add(textField);

        //Button
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButton());
        add(okButton);


    }
    public void paint(Graphics g) {

        //String
        g.drawString(display,50,100);


    }
    class OkButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Counter reset
            counterForSearchingLoop =0;

            //Converter
            String tempS = textField.getText();
            textToNumberConverter = Integer.parseInt(tempS);

            //Searching loop
            for (int i = 0; i < data.length; i++) {
                if (textToNumberConverter == data[i]) {
                    counterForSearchingLoop++;
                }
            }

            //Counter updater
            display = "" + counterForSearchingLoop;
            repaint();


        }
    }
}
