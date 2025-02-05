package OOP;

public class Cylinder {

    public double radius;

    public double height;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2*Math.PI * radius * height + 2*Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double circumference() {
        return 2*Math.PI * radius;
    }

    public static void main(String args[]){
        Cylinder c1 = new Cylinder();

        c1.radius = 7;
        c1.height = 10;

        System.out.println(String.format("%.2f",c1.area()));
        System.out.println(String.format("%.2f",c1.totalSurfaceArea()));
        System.out.println(String.format("%.2f",c1.volume()));
        System.out.println(String.format("%.2f",c1.circumference()));
    }
    
}
