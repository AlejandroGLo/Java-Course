package Swing;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.EventListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class MyFrame extends JFrame implements ChangeListener{
    
    JProgressBar pb;
    JPanel p1,p2;
    JSlider sl;

    int w = 50;

    MyFrame(){
        super("Slider/ProgressBar Demo");

        sl = new JSlider(0, 100, 50);
        sl.setMinorTickSpacing(1);
        sl.setMajorTickSpacing(10);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb = new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
        pb.setIndeterminate(false);

        p1=new JPanel(){
            public void paintComponent(Graphics g){
                g.drawOval(200, 200, w, w);
            }
        };

        p2=new JPanel();
        p2.add(pb);

        add(sl, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        sl.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w=sl.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setValue(w);
    }
}

public class SliderDemoProgressBar {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(500,500);    
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
