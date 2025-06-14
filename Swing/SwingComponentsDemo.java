package Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame(){
        super("Swing Demo");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked "+count+ " Times");
        b = new JButton("Click");

        add(l);
        add(b);
        //add(new JButton("Cancel"));
        b.addActionListener(this);

        getRootPane().setDefaultButton(b); //Default button accepts enter as click basically
        //b.setIcon(new ImageIcon("/Users/ale/Desktop/WhatsApp Image 2025-06-07 at 19.07.39.jpeg"));
        l.setToolTipText("Counter");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked "+count+ " Times");
    }
}

public class SwingComponentsDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
