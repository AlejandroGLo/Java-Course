package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    TextField tf;
    Button b;
    int count=0;

    MyFrame(){
        super("Event Demo");

        tf = new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new MyListener());
    }

    class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
        count++;
        tf.setText(String.valueOf(count));
    }

}
}

public class WayOfEventHandling2 {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
    }
    
}
