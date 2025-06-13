package AWT;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.color.*;

class MyFrame extends Frame{
    int x=0, y=0;


    MyFrame(){
        super("Painting");

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me){
                x=me.getX();
                y=me.getY();

                repaint(); //calls paint method for some reason
            }
            
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        //g.fillOval(x, y, 50, 50);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Hello", x, y);
    }
}

public class DrawingDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
    }
    
}
