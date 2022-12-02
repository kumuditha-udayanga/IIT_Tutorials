package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class NumberPad extends JPanel {
    public NumberPad (){
//      Grid Layout Test
        setLayout(new GridLayout(4,4,1,1));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("0"));
        add(new Button("-"));
    }
}
