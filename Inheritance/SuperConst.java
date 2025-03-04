class Parent{
    Parent(){ //not taking parameters
        System.out.println("Non-Param of Parent");
    }
    Parent(int x){ // taking a value as a parameter
        System.out.println("Param of parent " +x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non-Param of Child");
    }
    Child(int y){
        System.out.println("Param of Child");
    }
    Child(int x, int y){
        super(x); //calling the constructor on the Parent class
        System.out.println("2 param of Child "+ y);
    }
}


public class SuperConst {
    public static void main(String[] args){
        Child c = new Child(10, 20);
    }
    
}
