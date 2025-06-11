package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener{
    Label l;

    MyFrame(){
        super("Window Event Demo");

        l=new Label("                               ");
        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    public void windowOpened(WindowEvent we){
        l.setText("Window Opened");
    }
    public void windowClosing(WindowEvent we){
        l.setText("Window Closing");
        System.exit(0);
    }
    public void windowClosed(WindowEvent we){
        l.setText("Window Closed");
    }
    public void windowIconified(WindowEvent we){
        l.setText("Window Iconified");
    }
    public void windowDeiconified(WindowEvent we){
        l.setText("Window Deiconified");
    }
    public void windowActivated(WindowEvent we){
        l.setText("Window Activated");
    }
    public void windowDeactivated(WindowEvent we){
        l.setText("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
    
}
