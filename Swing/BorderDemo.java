package Swing;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.*;
import java.awt.*;

class MyFrame extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;

    JPanel p;
    MyFrame(){
        l = new JLabel("Name");
        tf= new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        //Border br = BorderFactory.createLoweredBevelBorder();
        //Border br = BorderFactory.createRaisedBevelBorder();
        //Border br = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        //Border br = BorderFactory.createBevelBorder(EtchedBorder.LOWERED);
        //Border br2 = BorderFactory.createLineBorder(Color.RED, 5);
        //Border br2 = BorderFactory.createTitledBorder("Login");
        //Border br2 = BorderFactory.createTitledBorder("Login");
        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.ABOVE_TOP, TitledBorder.LEFT);
        p.setBorder(br);
        //p.setBorder(br2);


        setLayout(new FlowLayout());
        add(p);
    }
}

public class BorderDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
