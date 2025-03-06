//We cannot override final methods and static methods
// The types of the methods should be the same in the sub as the super, or less strict. But cant be more strict.
class Super{
    public void display(){
        System.out.println("Super Display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Display");
    }
}

public class OverrideRules {
    public static void main(String args[]){
        Super s = new Sub();
        s.display();

    }
    
}

//In java, polymorphism is achieved using method overloading and method overriding.
