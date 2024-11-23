public class IncDec {
    public static void main(String args[]){
        //int x=5, y;
        //y=x++; // Same with ++x
        //System.out.println("The value of x is: " + x +"And the value of y is: "+ y);

        int x=5, y=4, z;

        z = 2*x++ + 3 * ++y;
        System.out.println(z+" "+x+" "+y);
    }
    
}
