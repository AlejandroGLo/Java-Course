import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student{
    int rollNo;
    String name;
    String dept;
    Float avg;
}

public class DataStreamDemo {
    public static void main(String args[]) throws Exception{
        FileOutputStream fos  = new FileOutputStream("Path");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "John";
        s.dept = "CSE";
        s.avg=80.5f;

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

    }
    
}
