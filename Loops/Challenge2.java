
public class Challenge2 {
    public static void main(String[] args){
        int n = 153;
        int count = 0;
        int sum = 0;
        /*for(int i=1;i<4;i++){
            int remainder = n%10;
            n = n/10;
            System.out.println(remainder);
        }*/
        /*while(n>0){
            int remainder = n%10;
            n = n/10;
            System.out.println(remainder);
        }*/

        /*while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);*/


        /*int m = n;
        while(n>0){
            int remainder = n%10;
            sum = sum + remainder * remainder * remainder;
            n = n/10;
        }
        System.out.println(sum);
        if(sum == m){
            System.out.println("Amrstrong Number");
        }
        else{
            System.out.println("Not An Amrstrong Number");
        }*/


        /*int rev = 0;
        while(n>0){
            int remainder = n%10;
            rev = rev*10+remainder;
            n = n/10;
        }
        System.out.println(rev);*/

        int p = 12521;
        int rev = 0;
        int m=p;
        while(p>0){
            int remainder = p%10;
            rev = rev*10+remainder;
            p = p/10;
        }
        System.out.println(rev);
        if(rev==m){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        
    }
    
}
