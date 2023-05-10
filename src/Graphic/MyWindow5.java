package Graphic;

import javax.swing.*;
import java.awt.*;

public class MyWindow5 extends JFrame {
    public MyWindow5() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Нажми сюда!");
        add(button, BorderLayout.CENTER);
        button.addActionListener(actionEvent -> button.setText("Нажал!"));
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyWindow5();
    }
}

