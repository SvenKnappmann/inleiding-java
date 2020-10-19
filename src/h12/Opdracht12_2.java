package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_2 extends Applet{

    Button[] buttons;
    Button button;

    public void init() {

        buttons = new Button[25];

        for (int i = 1; i <= buttons.length; i++) {

            button = new Button("       " + i + "        ");
            add(button);

        }

    }

    public void paint() {

    }

}
