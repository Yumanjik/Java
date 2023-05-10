package Graphic;

import javax.swing.*;
import java.awt.*;


public class MyWindow6 extends JFrame {
    public MyWindow6() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(actionEvent -> System.out.println(textField.getText()));
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyWindow6();
    }
}
