import java.util.Scanner;

public class nameAgeSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.println("Hello. What is your name?");
        name = scan.next();
        System.out.println("Hi, " + name + "! How old are you");
        age = scan.nextInt();
        System.out.println("So you're " + age + ", eh? That is not old at all!");
        System.out.println("How much do you make, " + name);
        salary = scan.nextDouble();
        System.out.println(salary + "! I hope thats per hour and not per year! LOL!");
    }
}