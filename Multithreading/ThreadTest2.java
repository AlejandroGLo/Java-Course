package Multithreading;

//We can do it in two classes by adding the following code and modifying the main class

// class MyRunnable implements Runnable{
//     public void run(){ //overriding run method
//         int i=1;
//         while(true){
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
// }

public class ThreadTest2 implements Runnable{
    public void run(){ //overriding run method
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String args[]){
        ThreadTest t = new ThreadTest(); //if we are using 2 classes we change this to MyRunnable m = new MyRunnable();
        Thread thread = new Thread(t);
        thread.start();
        int i =1;
        while(true){
            System.out.println(i+ "World");
            i++;
        }

    }
    
}

