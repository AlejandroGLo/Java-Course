package AWT;

import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField tf;
    Button b;

    public MyFrame(){
        super("My App");

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);
    }

}

public class SecondApp{
    public static void main(String args[]){
        Frame f = new Frame();

        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
