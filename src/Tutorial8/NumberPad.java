package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class NumberPad extends JPanel {
    public NumberPad (){
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        Button b1  = new Button("1");
        GridBagConstraints b1Constrains = new GridBagConstraints();
        b1Constrains.gridx = 1;
        b1Constrains.gridy = 2;

        Button b2  = new Button("2");
        GridBagConstraints b2Constrains = new GridBagConstraints();
        b2Constrains.gridx = 2;
        b2Constrains.gridy = 2;

        Button b3  = new Button("3");
        GridBagConstraints b3Constrains = new GridBagConstraints();
        b3Constrains.gridx = 3;
        b3Constrains.gridy = 2;

        this.add(b1, b1Constrains);
        this.add(b2, b2Constrains);
        this.add(b3, b3Constrains);
    }
}
