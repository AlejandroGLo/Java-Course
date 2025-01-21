package Loops;

public class Nested {
    public static void main(String [] args){
        int count = 0;
        for(int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                count++;
                //System.out.print("("+i+","+j+")");
                //System.out.print(i+j+",");
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
    
}
