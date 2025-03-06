
class Car{
    public void Start(){
        System.out.println("Vroom Vroom");
    }
    public void Accelerate(){
        System.out.println("Vrooooooooom");
    }
    public void ChangeGear(){
        System.out.println("Vrooooooooom Vrooooooom");
    }
}

class LuxuryCar extends Car{
    @Override
    public void ChangeGear(){
        System.out.println("Automatic Gear");
    }
    public void OpenRoof(){
        System.out.println("Opens Roof");
    }
}

public class Overriding3 {
    public static void main(String args[]){
        /*Car c = new Car();
        c.Start();
        c.Accelerate();
        c.ChangeGear();*/
        //Super Class methods

        /*LuxuryCar l = new LuxuryCar();
        l.Start();
        l.Accelerate();
        l.ChangeGear();
        l.OpenRoof();*/
        // First two methods are from the super class

        Car c = new LuxuryCar();
        c.Start();
        c.Accelerate();
        c.ChangeGear();
    }
    
}
