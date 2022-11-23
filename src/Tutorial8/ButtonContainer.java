package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class ButtonContainer {
    JPanel panel;
    ButtonContainer () {
        JPanel buttonContainer = new JPanel();
        GridLayout buttonContainerLayout = new GridLayout(1, 2);

        JLabel leftColText = new JLabel("Left Column");
        JLabel rightColText = new JLabel("Right Column");

        buttonContainer.setLayout(buttonContainerLayout);
        buttonContainer.add(leftColText);
        buttonContainer.add(rightColText);
        buttonContainer.add(new NumberPad());
        this.panel = buttonContainer;
    }
}
