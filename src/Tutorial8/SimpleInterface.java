package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class SimpleInterface {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        JPanel mainContainer = new JPanel();
        BoxLayout mainContainerLayout = new BoxLayout(mainContainer, BoxLayout.Y_AXIS);

        JTextField inputField = new JTextField();
        inputField.setMaximumSize(new Dimension(500, 500/4));

        ButtonContainer buttonContainer = new ButtonContainer();

        mainContainer.setLayout(mainContainerLayout);
        mainContainer.add(inputField);
        mainContainer.add(buttonContainer.panel);

        app.setSize(500, 500);
        app.add(mainContainer);
        app.setVisible(true);
    }
}
