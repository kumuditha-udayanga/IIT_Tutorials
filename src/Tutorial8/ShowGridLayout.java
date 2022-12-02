package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class ShowGridLayout extends JPanel {
    public ShowGridLayout() {
//        Grid Layout Test
        setLayout(new GridLayout(1, 2));
        add(new NumberPad());
        add(new OperationsLayout());
    }
}
