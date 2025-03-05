class Super{
    public void Display(){
        System.out.println("Super Display");
    }
}

class Sub extends Super{
    public void Display(){
        System.out.println("Sub Display");
    }
}

public class Overriding {
    public static void main(String args[]){
        Super su = new Sub();
        su.Display();

        Super sup = new Super();
        sup.Display();

    }
    
}

//If we pass arguments in one of them, then it is not overriding because the methods wont be the same
