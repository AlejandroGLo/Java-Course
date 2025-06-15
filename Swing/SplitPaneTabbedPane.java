package Swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ListSelectionListener{
    JSplitPane sp;
    JList list;
    JLabel lbl;

    MyFrame(){
        super("Split Demo");

        String cols[] = {"RED", "GREEN", "BLUE", "YELLOW", "ORANGE"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);

        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2=new JScrollPane(lbl);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(200);
        add(sp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String) list.getSelectedValue();

        switch(str){
            case "RED" : lbl.setBackground(Color.red);
            break;
            case "GREEN" : lbl.setBackground(Color.green);
            break;
            case "BLUE" : lbl.setBackground(Color.blue);
            break;
            case "YELLOW" : lbl.setBackground(Color.yellow);
            break;
            case "ORANGE" : lbl.setBackground(Color.orange);
            break;
        }
    }
}

public class SplitPaneTabbedPane {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(800,800);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
