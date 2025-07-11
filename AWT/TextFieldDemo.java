package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.concurrent.Flow;

import javax.swing.Action;

class MyFrame extends Frame{
    Label l1, l2;
    TextField tf;

    MyFrame(){
        super("TextField Demo");

        l1 = new Label("No text is Entered yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        tf.setEchoChar('*');

        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }


    class Handler implements TextListener, ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        l2.setText(tf.getText());
    }

    @Override
    public void textValueChanged(TextEvent te) {
        l1.setText(tf.getText());
    }

    }
}

public class TextFieldDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
    
}
