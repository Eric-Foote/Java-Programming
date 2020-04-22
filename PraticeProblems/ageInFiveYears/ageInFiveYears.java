import java.util.Scanner;
public class ageInFiveYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Hello. What is your name?");
        name = scan.next();
        System.out.println("Hi, " + name + "! How old are you?");
        age = scan.nextInt();
        System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
        System.out.println("And five years ago you were " + (age-5) + "! Imagine that!"); 
    }
}