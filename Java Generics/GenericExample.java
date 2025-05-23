

class Data<T>{ //we can add more parameters <T,K> but later down, we have to specify MyArray<Integer, String> ma = new MyArray<>();

    private T obj;

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj; 
    }
}

class MyArray<T>{

    T A[]=(T[]) new Object[10];
    int length=0;

    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}

public class GenericExample {
    public static void main(String args[]){
        Data<Integer> d = new Data<>();
        d.setData(new Integer(10));

        System.out.println(d.getData());

        MyArray<Integer> ma = new MyArray<>(); //We can change this for String  and then we will be able to use strings below
        ma.append(10);
        ma.append(20);
        ma.append(30);

        ma.display();
        
    }
    
}
