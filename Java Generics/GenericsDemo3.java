
class A{};
class B extends A{};
class C extends B{};


public class GenericsDemo3 {
    static void fun(MyArray <? extends A> obj){ //? means any type - unbounded wildcard
        obj.display();
    }
    
    public static void main(String args[]){
        MyArray<B> ma1=new MyArray<>();

        MyArray<C> ma2=new MyArray<>();

        fun(ma1);
        fun(ma2);
    }
}

//Lower bound we use super
//Upper bound we use extends



