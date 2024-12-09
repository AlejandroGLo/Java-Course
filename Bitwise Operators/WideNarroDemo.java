public class WideNarroDemo {

    public static void main(String[] args){
        byte b = 10;
        short s=120;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;

        //b=s; Not allowed because destination is smaller
        s=b;
        i=b;
        l=b;
        f=b;
        l=b;
        // c=b; Only char can be assigned or integer value.

        b=(byte)s; //byte can only store up to 127
        i=(int)f;
        //Printing this would give 10 instead of 10.5

    }
    
}
