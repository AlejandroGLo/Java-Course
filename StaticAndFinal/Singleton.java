package StaticAndFinal;

class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my=null;

private CoffeeMachine(){
    coffeeQty=1;
    milkQty=1;
    waterQty=1;
    sugarQty=1;
}

public void fillWater(float qty){
    waterQty=qty;
}

public void fillSugar(float qty){
    sugarQty=qty;
}

public float getCoffee(){
    return 0.23f;
}

static CoffeeMachine getInstance(){
    if(my==null){
        my=new CoffeeMachine();
    }
    return my;
}

public class Singleton {
    public static void main(String args[]){
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1+" "+m2+" "+m2);
        if(m1==m2 && m1==m3){
            System.out.println("Same");
        }

    }
    
}
}
