package Swing;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame{
    MyFrame(){
        JTextField tf1 = new JTextField(15); //15 = N of columns

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //if we do MMMM it shows the name of the month instead of n
        JFormattedTextField tf2 = new JFormattedTextField(15);
        tf2.setColumns(15);
        tf2.setValue(0);

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false); //does not allow text
        nft.setMaximum(10000); //does not allow number larger than 10
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);
        setLayout(new FlowLayout());

        //JTextArea ta = new JTextArea(20,20);
        add(tf1);
        add(tf2);
        add(tf3);
    }
}

public class TextFieldDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
