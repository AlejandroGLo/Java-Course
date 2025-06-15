package Swing;

import javax.swing.JFrame;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

class MyFrame extends JFrame implements TreeSelectionListener{
    JLabel label;
    JTree tree;

    MyFrame(){
        super("Tree Demo");

        DefaultMutableTreeNode root=new DefaultMutableTreeNode("/Users/ale/Desktop/Java Course/Java-Course");

        File f = new File("/Users/ale/Desktop/Java Course/Java-Course");
        for(File x: f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            }
            else{
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }

        tree=new JTree(root);
        label = new JLabel("No Files Selected");
        tree.addTreeSelectionListener(this);
        JScrollPane sp = new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);


    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class JTreeDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);    
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
