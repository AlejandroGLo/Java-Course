package Multithreading;

class MyThreadDaemon extends Thread{ 
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class DaemonJoinYield {
    
    public static void main(String[] args) throws Exception{
        MyThreadDaemon t = new MyThreadDaemon();
        t.setDaemon(true);
        t.start();

        int count=1;
        while(true){
            System.out.println(count++ +"Main");
            Thread.yield();
        }

        //Join

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        // Daemon
        // try{
        //     Thread.sleep(100);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

    } 
}
