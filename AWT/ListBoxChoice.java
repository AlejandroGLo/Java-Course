package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends Frame implements ItemListener, ActionListener{
    List l;
    Choice c;
    TextArea ta;

    MyFrame(){
        super("ListBox Demo");

        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);


        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("Apr");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource()==l){
            ta.setText(l.getSelectedItem());
        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[]=l.getSelectedItems();

        String txt="";

        for(String x:list){
            txt+=x+"\n";
        }
        ta.setText(txt);
    }
}

public class ListBoxChoice {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
    
}
