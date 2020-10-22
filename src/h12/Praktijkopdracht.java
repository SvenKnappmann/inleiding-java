package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdracht extends Applet {

    //array
    String[] data;
    String[] data2;

    //Label naam
    Label labelNaam;

    //TextField naam
    TextField textFieldNaam;

    //Label telefoonnummer
    Label labelTelefoonNummer;

    //TextField telefoonnummer
    TextField textFieldTelefoonNummer;

    //OkButton
    Button okButton;

    //Counter for okButton
    int counterOkButton;

    //Cords of Strings
    int y = 50;
    int y2 = 50;


    public void init() {

        //Size of applet
        setSize(500,500);

        //arrays
        data = new String[10];
        data2 = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = "";
            data2[i] = "";
        }

        //Label naam
        labelNaam = new Label("Naam");
        add(labelNaam);
        //TextField naam
        textFieldNaam = new TextField("",15);
        add(textFieldNaam);

        //Label telefoonnummer
        labelTelefoonNummer = new Label("Telefoonnummer");
        add(labelTelefoonNummer);
        //TextField telefoonnummer
        textFieldTelefoonNummer = new TextField("",15);
        add(textFieldTelefoonNummer);

        //Button
        okButton = new Button("Ok");
        okButton.addActionListener(new OkButton());
        add(okButton);


    }
    public void paint(Graphics g){
        y = 50;
        y2 = 50;
        //string
        for (int i = 0; i < data.length; i++) {

                g.drawString(data[i], 70, y);

                g.drawString(data2[i], 320, y);

                y += 15;

            if (i < data.length && counterOkButton == i) {

                    g.drawString("Naam", 20, y2);

                    g.drawString("Telefoonnummer", 208, y2);

                    y2 += 15;


            }
        }

    }
    class OkButton implements ActionListener {

        int getTextFromTextFieldTelefoonNummer;


        public void actionPerformed(ActionEvent e) {

            //Converter
            data[counterOkButton] = textFieldNaam.getText();

            //Converter
            String tempTelefoonNummer = textFieldTelefoonNummer.getText();
            getTextFromTextFieldTelefoonNummer = Integer.parseInt(tempTelefoonNummer);

            //Convert to string
            data2[counterOkButton] = "" + getTextFromTextFieldTelefoonNummer;

            //Counter for okButton
            counterOkButton++;

            repaint();


        }
    }
}
