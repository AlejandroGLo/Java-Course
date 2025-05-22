import java.io.*;

class Student implements Serializable{
    int rollNo;
    String name;
    String dept;
    Float avg;
    public static int Data=10;
    public transient int t;

    public Student(){

    }
    public Student(int r, String n, float a, String d){
        rollNo=r;
        name=n;
        avg=a;
        dept=d;
        Data = 500;
        t=500;
    }

    public String toString(){
        return "\nStudent Details\n"+
        "\nName "+name;
    }
}

public class ObjectDemo {
    public static void main(String args[])throws Exception{

        FileOutputStream fos = new FileOutputStream("Path");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10, "John", 89.9f, "CSE");

        oos.writeObject(s);

        fos.close();
        oos.close();
    }
    
}
