package Swing;

import javax.print.attribute.standard.MediaPrintableArea;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInternalFrame extends JInternalFrame{
    static int count=0;
    JTextArea ta;
    JScrollPane sp;
    MyInternalFrame(){
        super("Document "+(++count), true, true, true, true);


        ta = new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}

class MyFrame extends JFrame implements ActionListener{

    JDesktopPane jp;

    MyFrame(){
        super("Internal Frame Demo");

        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);


        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame mi = new MyInternalFrame();
        jp.add(mi);
    }
}

public class InternalFrameDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(800,800);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
