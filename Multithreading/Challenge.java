package Multithreading;

class ATM {
    synchronized public void checkBalance(String name){
        System.out.println(name +" Checks Balance");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }
    synchronized public void withdraw(String name, int amount){
        System.out.println(name+" is withdrawing "+ amount +" dollars");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);

    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    Customer(String n, ATM a, int amt){
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }
}

public class Challenge {
    public static void main(String args[]){
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith", atm, 100);
        Customer c2 = new Customer("John", atm, 200);
        c1.start();
        c2.start();

    }
    
}
