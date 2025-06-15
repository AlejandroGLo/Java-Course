package Swing;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class MyFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener{
    JList list;
    JSpinner sp1, sp2;
    JComboBox cb;
    JTextField tf;

    MyFrame(){

        String countries[]= {"Spain", "France", "Germany", "Italy", "Portugal"};
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"};
        list = new JList(months);
        cb = new JComboBox(countries);
        list.setVisibleRowCount(5);
        tf = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1) { //value 1, min day, max day, increment value
            });
        sp2 = new JSpinner(new SpinnerListModel(days) { //value 1, min day, max day, increment value
            });

        setLayout(new FlowLayout());  
        
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem()); //Type casting
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1){
            tf.setText((String)sp1.getValue()+"");
        }
        else{
            tf.setText((String) sp2.getValue());
        }
    }
}

public class JSpinnerJListJCombo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(500,500);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
