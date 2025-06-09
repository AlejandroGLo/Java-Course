package AWT;

import java.awt.*;

import javax.swing.border.Border;

class MyFrame extends Frame{

    Button b1, b2, b3 , b4, b5 ,b6;
    public MyFrame(){
        super("FlowLayoutDemo");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        //FlowLayout fl = new FlowLayout();
        //fl.setAlignment(FlowLayout.RIGHT);
        //fl.setHgap(100);
        
        //setLayout(fl);

        add(b1, BorderLayout.NORTH);
        //add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        //add(b6);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
        add(p, BorderLayout.EAST);

    }

}

public class LayoutManager {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
    
}
