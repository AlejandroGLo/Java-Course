package OOP;

public class Student {

    public int roll;

    public String name;

    public String course;

    public int g1, g2, g3;

    public int total(){
        return g1+g2+g3;
    }

    public float avg(){
        return (g1+g2+g3)/3;
    }

    public char grade(){
        if(avg()>=8){
            return'A';
        }
        else if(avg()<8 && avg()>=5 ){
            return'B';
        }
        else{
            return'C';
        }
        
    }

    public String details(){
        return "Roll Number:" +roll+"\n"+name+"\n"+course;
    }

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll = 1357683;
        s1.name = "John";
        s1.course = "Math";
        s1.g1 = 5;
        s1.g2 = 7;
        s1.g3 = 9;

        System.out.println(s1.avg());
        System.out.println(s1.grade());
        System.out.println(s1.details());

    }
    
}
