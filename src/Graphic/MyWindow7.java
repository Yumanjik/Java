package Graphic;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow7 extends JFrame {
    public MyWindow7() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyWindow7();
    }
}

