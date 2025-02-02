package Methods;

public class VarArgs {

    /*static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        show(null);
        show(10,20,30);
        show(new int[]{3,5,7,9,11,13,15}); //Created in Heap // Anonymous Array
    }*/

    static void showList(int start, String ...S){ //varargs parameters must be the last parameter.
        for(int i=0;i<S.length;i++){
            System.out.println(start+". "+S[i]);
            start++;
        }
    }

    public static void main(String args[]){
        showList(5,"John", "Smith", "Pablo", "Ahmed");

    }
    
}
