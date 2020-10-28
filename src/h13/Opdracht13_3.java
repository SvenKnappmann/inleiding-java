package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht13_3 extends Applet{

    String muurType = "";

    Button bakstenenButton;
    Button betonnenButton;

    boolean baksteen = false;
    boolean beton = false;


    public void init() {

        //Button Bakstenen
        bakstenenButton = new Button("Bakstenen");
        bakstenenButton.addActionListener(new BakstenenMuur());
        add(bakstenenButton);

        //Button Beton
        betonnenButton = new Button("Beton");
        betonnenButton.addActionListener(new BetonneMuur());
        add(betonnenButton);


    }
    public void paint(Graphics g) {

        if (baksteen && !beton) {

            g.drawString("De muur is gemaakt van " + muurType,30,40);
            tekenBakstenenMuur(g,50,50,10,10);


        } else if (beton && !baksteen) {

            g.drawString("De muur is gemaakt van " + muurType,30,40);
            tekenBetonneMuur(g,50,50,5,5);


        }
    }
    //Bakstenen muur
    void tekenBakstenenMuur(Graphics g, int x, int y, int rijen, int kolomen) {

        int counter = 0;

        int convertedX;

        int width = 50;
        int height = 20;


        for (int i = 0; i < rijen; i++) {

            if (counter % 2 == 0) {

                convertedX = x;


                for (int teller = 0; teller < kolomen; teller++) {

                    g.setColor(Color.red);
                    g.fillRect(convertedX,y,width,height);
                    g.setColor(Color.black);
                    g.drawRect(convertedX,y,width,height);
                    convertedX += width;


                }

            } else {

                convertedX = x - (width / 2);


                for (int teller = 0; teller < kolomen; teller++) {

                    g.setColor(Color.red);
                    g.fillRect(convertedX,y,width,height);
                    g.setColor(Color.black);
                    g.drawRect(convertedX,y,width,height);
                    convertedX += width;


                }

            }

            y += height;
            counter++;


        }
    }
    //Betonne muur
    void tekenBetonneMuur(Graphics g, int x, int y, int rijen, int kolomen) {

        int counter = 0;

        int convertedX;

        int width = 100;
        int height = 40;


        for (int i = 0; i < rijen; i++) {


            if (counter % 2 == 0) {

                convertedX = x;


                for (int teller = 0; teller < kolomen; teller++) {

                    g.setColor(Color.gray);
                    g.fillRect(convertedX,y,width,height);
                    g.setColor(Color.black);
                    g.drawRect(convertedX,y,width,height);
                    convertedX += width;

                }


            } else {

                convertedX = x - (width / 2);


                for (int teller = 0; teller < kolomen; teller++) {

                    g.setColor(Color.gray);
                    g.fillRect(convertedX,y,width,height);
                    g.setColor(Color.black);
                    g.drawRect(convertedX,y,width,height);
                    convertedX += width;


                }

            }

            y += height;
            counter++;


        }
    }
    //Button voor bakstenen muur
    class BakstenenMuur implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            baksteen = true;
            beton = false;
            muurType = "Bakstenen";
            repaint();


        }
    }
    //Button voor betonne muur
    class BetonneMuur implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            beton = true;
            baksteen = false;
            muurType = "Beton";
            repaint();


        }
    }
}