import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame{

    MyFrame(){
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }

    class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){{
            System.exit(0);
        }}
    }
}

public class AdapterDemo {
    public static void main(String args[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(400,400);
    }
    
}
