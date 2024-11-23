import java.util.Scanner;
public class Cuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float length, breadth, height;
        System.out.println("What will the length of the cuboid be: ");
        length = sc.nextFloat();
        System.out.println("What will the breadth of the cuboid be: ");
        breadth = sc.nextFloat();
        System.out.println("What will the height of the cuboid be: ");
        height = sc.nextFloat();

        float areaFront = length * height;
        float areaTop = length * breadth;
        float areaSide = breadth * height;
        float volume = length * breadth * height;

        System.out.println("The area of the front face of the cuboid is: " + areaFront);
        System.out.println("The area of the top face of the cuboid is: " + areaTop);
        System.out.println("The area of the side face of the cuboid is: " + areaSide);
        System.out.println("The volume of the cuboid is: " + volume);


    }
    
}
