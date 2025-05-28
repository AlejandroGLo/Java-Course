import java.util.*;

public class TokenizerDemo {
    public static void main(String args[]){
        String data = "name=John;address=madrid;country=spain;dept=cse";

        StringTokenizer stk = new StringTokenizer(data, "=;");

        String s;

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }

    }
    
}
