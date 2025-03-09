package StaticAndFinal;

class Test{
    static int x = 10;
    int y=20;

    void show(){
        System.out.println(x+ " "+y); //can access y because it is a non static varaible (this is a non-static method)
    }

    static void display(){
        System.out.println(x); //cannot access y because it is a non static method (this is a static method)
    }
}

public class StaticPractice {
    public static void main(String args[]){
        Test t1 = new Test();
        t1.show();
        t1.x=30; //changing the value
        t1.x=50; //changing the value

        Test t2 = new Test();
        t2.show();


    }
    
}
