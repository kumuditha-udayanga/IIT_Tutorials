package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class OperationsLayout extends JPanel {
    public OperationsLayout() {
//        Grid Layout
        setLayout(new GridLayout(4, 1,1,1));
        add(new Button("+"));
        add(new Button("-"));
        add(new Button("Clear"));
    }
}
