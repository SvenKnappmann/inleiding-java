package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    //array
    int[] data;
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

    //Naam van persoon
    String naam = "Naam";

    //telefoonnummer van persoon
    String telefoonnummer = "Telefoonnummer";


    public void init() {

        //Size of applet
        setSize(500,500);

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

        //string
        for (int i = 0; i < 10; i++) {

            g.drawString("Naam", 20, y);

            g.drawString("" + data[i], 70, y);

            g.drawString("Telefoonnummer", 208, y);

            g.drawString(data2[i], 320, y);
//            data[i] =
        }

    }
    class OkButton implements ActionListener {

        int getTextFromTextFieldTelefoonNummer;


        public void actionPerformed(ActionEvent e) {

            //Converter
            naam = textFieldNaam.getText();

            //Converter
            String tempTelefoonNummer = textFieldTelefoonNummer.getText();
            getTextFromTextFieldTelefoonNummer = Integer.parseInt(tempTelefoonNummer);

            //Convert to string
            telefoonnummer = "" + getTextFromTextFieldTelefoonNummer;

            //Counter for okButton
            counterOkButton++;

            repaint();


        }
    }
}
