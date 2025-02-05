package OOP;

public class Circle {  // Make Circle class public, so filename matches

    public double radius;

    // Method to calculate the area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (also known as circumference)
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the circumference (which is the same as perimeter)
    public double circumference() {
        return perimeter();
    }

    // Main method, inside the same file
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle c1 = new Circle();

        // Set the radius
        c1.radius = 7;

        // Output area, perimeter, and circumference
        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Circumference: " + c1.circumference());
    }
}


