package Methods;

public class Challenge5 {
    static boolean validate(String name){
        return name.matches("[a-xA-Z\\s]+");
    }

    static boolean validate(int age){
        return age>=3 && age<=15;
    }
    static boolean validate(String name, int age) {  // New method
        return validate(name) && validate(age);
    }

    public static void main(String args[]) {
        System.out.println(validate("John", 5));  // This will now work
    }

}
