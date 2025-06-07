package AWT;

import java.awt.*;

public class FirstApp {
    public static void main(String args[]){
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout()); //so that components look properly instead of taking the whole space

        Button b = new Button("Exit");
        Label l = new Label("Name ");
        TextField tf = new TextField(20);

        f.add(b);
        f.add(l);
        f.add(tf);

        f.setVisible(true);
        f.setSize(400, 400);
        //b.addActionListener();
    }
    
}
