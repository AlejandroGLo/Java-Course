package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    int count=0;
    Button b;
    Label l;

    public MyFrame(){
        super("Button Demo");

        l=new Label("    "+count);
        b= new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(b);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(" "  + count);
    }
}

public class ButtonDemo {
    public static void main(String args[]){

        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);

    }
    
}
