package Methods;

public class Challenge3 {
    static double area(double l, double b){
        return l*b;
    }
    static double area(double r){
        return Math.PI*r*r;
    }

    public static void main(String args[]){
        System.out.println("Area of a Rectangle: " + area(10,5));
        System.out.println("Area of a Circle: " + area(5));
    }
    
}
