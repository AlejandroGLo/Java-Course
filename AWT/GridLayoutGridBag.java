package AWT;

import java.awt.*;

class MyFrame extends Frame{

    Button b1, b2, b3 , b4, b5 ,b6;
    public MyFrame(){
        super("GridBagLayout Demo");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);
    

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        //FlowLayout fl = new FlowLayout();
        //fl.setAlignment(FlowLayout.RIGHT);
        //fl.setHgap(100);
        
        //setLayout(new GridLayout(3,3));

        gbc.gridx=1;
        gbc.gridy=1;
        add(b1, gbc);

        gbc.gridx=3;
        gbc.gridy=1;
        add(b2, gbc);

        gbc.gridx=2;
        gbc.gridy=2;
        add(b3, gbc);

        gbc.gridx=4;
        gbc.gridy=2;
        add(b4, gbc);

        gbc.gridx=2;
        gbc.gridy=3;
        add(b5, gbc);

        gbc.gridx=1;
        gbc.gridy=4;
        add(b6, gbc);


    }

}
public class GridLayoutGridBag {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400, 400);
    }
}
