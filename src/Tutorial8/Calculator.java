package Tutorial8;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator () {
        setLayout(new GridLayout(2, 1));
        add(new JTextField());
        add(new ShowGridLayout());
    }

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setTitle("Calculator");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
