package JavaLangPackage;

enum Dept{ //department of engineering college  (cs, it, civil, Electronics and comunications)
    //Enum can have other methods as well as constructor
    CS ("John", "Block A"), IT("Mark", "Block B"), CIVIL("Jim", "Block C"), ECE("Ryan", "Block D");  //They have to be in CAPS

    String head;
    String location;

    private Dept(String head, String loc){ //If we want to use the extra info we added above, we need to specify the constructor (String head, String location)
        System.out.println(this.name());
        this.head=head;
        this.location=loc;

    } //Whenever an enum is loaded, all the identifiers (CS, IT, CIVIL, ECE) will be created, and their constructors will be called
    /*public void display(){
        System.out.println(this.name() + " " +this.ordinal()); //ordinal displays the index. In this case, ECE is position 4, so the index is 3
    }*/
    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}

public class EnumDemo {
    public static void main(String args[]){
        Dept a = Dept.CS;
        Dept b = Dept.IT;
        Dept c = Dept.CIVIL;
        Dept d = Dept.ECE;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        //d.display();

        System.out.println(d.ordinal());

        Dept list[]=Dept.values();
        for(Dept x:list){
            System.out.println(x);
        }

        System.out.println(Dept.valueOf("IT"));
    }
    
}
