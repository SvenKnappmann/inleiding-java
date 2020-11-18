package h14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.applet.*;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    private Image smileyNeutral;
    private Image youHaveWonImg;
    private Image cpuHasWon;
    private Image surelyWinningImg;
    private Image blankImg;
    private Image ResetSmiley;
    private URL doc;
    int invoer = 23;
    String error = "";
    int deComputerPakt;
    TextField textField;
    Button button;
    Button buttonR;

    public void init() {
        setSize(600, 600);
        doc = Praktijkopdracht.class.getResource("/h14/Doc/");
        smileyNeutral = getImage(doc, "smiley_neutralpx.png");
        youHaveWonImg = getImage(doc, "sad_face.png");
        cpuHasWon = getImage(doc, "evil-smiley-face.png");
        surelyWinningImg = getImage(doc, "surely_winningpx.png");
        blankImg = getImage(doc, "EasterEgg.png");
        ResetSmiley = getImage(doc, "smiley_neutralpx.png");
        textField = new TextField(30);
        textField.addActionListener(new ButtonL());
        add(textField);
        button = new Button("ok");
        button.addActionListener(new ButtonL());
        add(button);
        buttonR = new Button("reset");
        buttonR.addActionListener(new ButtonR());
        add(buttonR);
    }

    public void paint(Graphics g) {
        int getal = 0;
        for (int i = 0; i < 6; i++) {
            if (getal >= invoer) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                getal++;
                g.drawImage(smileyNeutral, 155 + 40 * j, 30 + 40 * i, 40, 40, this);
                if (getal >= invoer) {
                    break;
                }
            }
        }
        g.drawString("" + invoer, 130, 250);
        g.drawString(error, 30, 115);
        g.drawString("de compueter neemt " + deComputerPakt, 130, 280);
        g.drawImage(blankImg, 40, 30, 400, 400, this);
    }

    class ButtonL implements ActionListener {
        int getal;
        int random;

        public void actionPerformed(ActionEvent e) {
            String tempS = textField.getText();
            try {
                getal = Integer.parseInt(tempS);
            } catch (NumberFormatException exc) {
                error = "Voer getal in";
            }
            if (getal > 3 || getal < 1) {
                error = "Onjuist getal";
            }
            if (invoer == 1) {
                blankImg = youHaveWonImg;
            } else if (invoer <= 0) {
                blankImg = cpuHasWon;
            }
            if (getal <= 3 && getal >= 1) {
                invoer -= getal;
                if (invoer % 4 == 2) {
                    invoer -= 1;
                    deComputerPakt = 1;
                    smileyNeutral = surelyWinningImg;
                } else if (invoer % 4 == 3) {
                    invoer -= 2;
                    deComputerPakt = 2;
                    smileyNeutral = surelyWinningImg;
                } else if (invoer % 4 == 0) {
                    invoer -= 3;
                    deComputerPakt = 3;
                    smileyNeutral = surelyWinningImg;
                } else if (invoer % 4 == 1) {
                    random = (int) (Math.round(Math.random() * 3 + 1));
                    deComputerPakt = random;
                    invoer -= random;
                } else {
                    error = "Onjuist getal";
                }
            }
            repaint();
        }
    }

    class ButtonR implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = 23;
            smileyNeutral = ResetSmiley;
            deComputerPakt = 0;
            repaint();
        }
    }
}