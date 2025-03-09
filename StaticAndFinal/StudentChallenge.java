package StaticAndFinal;
import java.util.*;

class Student{
    private String rollNo;
    private static int count=1;
    private String generateRollNumber(){
        Date d = new Date();
        String rn="Uni-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    Student(){
        rollNo = generateRollNumber();
    }
    public String getRollNo(){
        return rollNo;
    }
}
class Account{
    public String acc;
    private static int count=1;
    private String generateAcc(){
        String text = "IE-"+count;
        count++;
        return text;
    }
    Account(){
        acc = generateAcc();
    }
    public String getAcc(){
        return acc;
    }

}

public class StudentChallenge {
    public static void main(String args[]){
        Student s1 = new Student();
        Account a1 = new Account();
        Student s2 = new Student();
        Account a2 = new Account();
        Student s3 = new Student();
        Account a3 = new Account();

        System.out.println(s1.getRollNo());
        System.out.println(a1.getAcc());
        System.out.println(s2.getRollNo());
        System.out.println(a2.getAcc());
        System.out.println(s3.getRollNo());
        System.out.println(a3.getAcc());
    }
    
}
