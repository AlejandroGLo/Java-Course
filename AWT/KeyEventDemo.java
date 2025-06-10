package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements KeyListener {
    Label l1, l2, l3, l4;

    MyFrame() {
        super("Key Event Demo");

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(20, 50, 100, 20);
        l2.setBounds(20, 80, 100, 20);
        l3.setBounds(20, 110, 100, 20);
        l4.setBounds(20, 140, 150, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

        // Ensure the frame can receive key input
        setFocusable(true);
        requestFocus();

        // Exit on close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Ensure focus when native window is ready
    @Override
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText("Char: " + e.getKeyChar());
    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
