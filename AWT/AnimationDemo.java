package AWT;

import java.awt.*;

class MyFrame extends Frame implements Runnable{
    int x,y,tx, ty;

    MyFrame(){
        x=100;
        y=100;
        tx=ty=1;


        Thread t = new Thread(this);
        t.start();


    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 50);
    }

    @Override
    public void run() {
        while(true){
            x+=tx;
            y+=ty;

            if(x<0 || x>450){ //boundaries
                tx = tx*-1;
            }
            if(y<27 || y>350){ //boundaries
                ty = ty*-1;
            }
            repaint();

            try{
                Thread.sleep(5);
            }
            catch(Exception e){}
        }
    }
}

public class AnimationDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(500,400);
    }
    
}
