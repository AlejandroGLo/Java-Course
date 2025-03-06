class TV{
    public void switchOn() {
        System.out.println("On");
    }
    public void changeChannel(){
        System.out.println("Changed");
    }
}

class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("SmartTV On");
    }
    @Override
    public void changeChannel(){
        System.out.println("SmartTV Channel Changed");
    }

    public void browse(){
        System.out.println("SmartTV Browsing");
    }

}

public class Overriding2 {
    public static void main(String args[]){
        /*TV t = new TV();
        t.switchOn();
        t.changeChannel();*/

        /*SmartTV s = new SmartTV();
        s.browse();
        s.switchOn();
        s.changeChannel();*/

        TV s = new SmartTV();
        s.switchOn();
        s.changeChannel();
        // Here we use the reference of the super class, we can hold the object of the subclass,
        // but can only run the methods already defined of the superclass
        //However, the SmartTV methods are called because the object is of the SmartTV
        // We can't have a sub class reference and have an object of super class. But it works viceversa

    }
    
}
