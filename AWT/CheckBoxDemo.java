package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends Frame implements ItemListener{

    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;



    public MyFrame(){
        super("CheckBox Demo");

        l = new Label("Nothing is Selected");

        cbg = new CheckboxGroup();
        c1 = new Checkbox("Java ", false, cbg);
        c2 = new Checkbox("Python ", false, cbg);
        c3 = new Checkbox("Typescript ", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //e.getItem(); //if c1 is clicked, it returns a reference of c1, same with c2, c3...
        String str="";

        if (c1.getState()) str = str+" "+ c1.getLabel();
        if (c2.getState()) str = str+ " "+ c2.getLabel();
        if (c3.getState()) str =str + " " +c3.getLabel();

        if(str.isEmpty()){
            str="Nothing is selected";
        }
        l.setText(str);
    }

}

public class CheckBoxDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
    
}
