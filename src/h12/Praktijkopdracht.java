package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdracht extends Applet {

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

    //String
    String naam = "";
    //Array
    String[] dataNaam;
    //Sting
    String telefoonnummer = "";
    //Array
    String[] dataTelefoonNummer;

    //Counter for okButton
    int counterForOkButton = 0;

    //Cords of Strings
    int y = 50;
    int y2 = 50;

    public void init() {

        //Size of applet
        setSize(500,500);

        //arrays
        dataNaam = new String[10];
        dataTelefoonNummer = new String[dataNaam.length];
        //loop for arrays
        for (int i = 0; i < dataNaam.length; i++) {
            dataNaam[i] = "";
            dataTelefoonNummer[i] = "";
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
        //Cords
        y = 50;
        y2 = 50;

        //Loop for Strings
        for (int i = 0; i < dataNaam.length; i++) {

            if (dataNaam[i].equals(""))break;

            g.drawString(dataNaam[i], 70, y);

            g.drawString(naam, 20, y2);

            g.drawString(dataTelefoonNummer[i], 320, y);

            g.drawString(telefoonnummer, 208, y2);

            y += 15;

            y2 += 15;


        }

    }
    class OkButton implements ActionListener {

        //Converter
        int getTextFromTextFieldTelefoonNummer;


        public void actionPerformed(ActionEvent e) {

            //Converter
            dataNaam[counterForOkButton] = textFieldNaam.getText();

            //Converter
            String tempTelefoonNummer = textFieldTelefoonNummer.getText();
            getTextFromTextFieldTelefoonNummer = Integer.parseInt(tempTelefoonNummer);

            //Convert to string
            dataTelefoonNummer[counterForOkButton] = "" + getTextFromTextFieldTelefoonNummer;

            //Loop for Naam and Telefoonnummer
            for (int i = 0; i < dataNaam.length; i++) {
                naam = "Naam";
                telefoonnummer = "Telefoonnummer";
            }

            //Counter for okButton
            counterForOkButton++;
            if (counterForOkButton >= 10) {
                counterForOkButton = 0;
            }

            repaint();


        }
    }
}
