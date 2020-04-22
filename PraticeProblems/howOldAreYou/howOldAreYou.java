import java.util.Scanner;

public class howOldAreYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Hey, what's your name? ");
        name = scan.next();
        System.out.println("Ok, " + name + ", how old are you? ");
        age = scan.nextInt();
        if(age < 16)
        {
            System.out.println("You can't drive, " + name);
        }
        if(age < 18)
        {
            System.out.println("You can't vote, " + name);
        }
        if(age < 25)
        {
            System.out.println("You can't rent a car, " + name);
        }
        if(age >= 25)
        {
            System.out.println("You can do anything that's legal, " + name);
        } 
    }
}   