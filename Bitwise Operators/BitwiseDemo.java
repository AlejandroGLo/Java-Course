public class BitwiseDemo {

    public static void main(String args[]){
        int x = 0b1010; //10 in decimal
        int y=0b0110; //6 in decimal
        int z;
        // z = x & y; AND
        // z = x|y; OR
        // z = x^y; XOR
        // z = ~x; NOT
        // z = x<<1; Left shift
        // z = x>>1; Right shift
        z = x>>>1; // Unsigned right shift
        System.out.println(z);
        System.out.println(String.format("%s", Integer.toBinaryString(z)));
    }
    
}
