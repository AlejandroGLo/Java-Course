//Long Literal

public class LongLiteral {
    public static void main(String arg[]){
        //To large: long l=99999999999;
        long l=99999999999L; //L or l is used to specify the long literal
        // int i = 125L; Error: incompatible types: possible lossy conversion from long to int
        System.out.println(l);
    }
    
}
