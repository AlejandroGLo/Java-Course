import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String args[]) throws Exception{
        FileOutputStream fos = new FileOutputStream("Path");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo=10;
        s.name="John";
        s.dept ="CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
    
}
