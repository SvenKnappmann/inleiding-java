package h11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht11_9 extends Applet {

    int amountOfColumns = 8;
    int amountOfRows = 8;

    public void init() {

    }
    public void paint(Graphics g) {

        // size of window
        setSize(500,500);

        //x and y
        int x;
        int y = 10;

        //width and height
        int width = 50;
        int height = 50;
        int connectionBetweenLoopAndAmountOfRows = amountOfRows / 2;

        for (int Board = 0; Board < connectionBetweenLoopAndAmountOfRows; Board++) {


            x = 10;
            y += 50;


            for (int column = 0; column < amountOfColumns; column++) {

                x += width;

                if (column % 2 == 0) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                }
                g.drawRect(x, y, width, height);
            }


            x = 10;
            y += height;


            for (int column = 0; column < amountOfColumns; column++) {

                x += width;

                if (column % 2 == 0) {
                    g.setColor(Color.black);
                } else {
                    g.fillRect(x, y, width, height);
                }
                g.drawRect(x, y, width, height);
            }


        }

    }
}
