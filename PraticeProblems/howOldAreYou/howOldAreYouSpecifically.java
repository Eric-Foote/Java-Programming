import java.util.Scanner;
public class howOldAreYouSpecifically {
    public static void main(String[] args) {
        // I am going to reuse my code from the previous exercise and modify it here!
        Scanner scan = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = scan.next();
        System.out.println("Ok, " + name + ", how old are you? ");
        age = scan.nextInt();
        if(age < 16)
        {
            System.out.println("You can't drive, " + name);
        }
        else if(age <= 18) 
        {
            System.out.println("You can drive but you can't vote, " + name);
        }
        else if(age <= 24)
        {
            System.out.println("You can vote but not rent a car. " + name);
        }
        else if(age >= 25)
        {
            System.out.println("You can do pretty much anything legal. " + name);
        }
    }
}