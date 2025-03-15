package Multithreading;

//We can do it in two classes by adding the following code and modifying the main class

// class MyThread extends Thread{
//     public void run(){ //overriding run method
//         int i=1;
//         while(true){
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
//}

public class ThreadTest extends Thread{
    public void run(){ //overriding run method
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String args[]){
        ThreadTest t = new ThreadTest();
        t.start();
        int i =1;
        while(true){
            System.out.println(i+ "World");
            i++;
        }

    }
    
}
