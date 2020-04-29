import java.util.Random;
import java.util.Scanner;
public class oneShotHiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(100);
        int guess;
        int attempts = 1;
        System.out.println("I'm thinking of a number between 1-100. Try to guess it. You have 7 guesses.");
        System.out.println("Attempt: #" + attempts);
        guess = scan.nextInt();
        while(guess != randomNumber && attempts < 7)
        {
            if(guess > randomNumber)
            {
                System.out.println("Sorry, you are too high.");
                attempts++;
            }
            if(guess < randomNumber)
            {
                System.out.println("Sorry, you are too low.");
                attempts++;
            } 
            System.out.println("Attempt: #" + attempts);
            guess = scan.nextInt();
        }
    }
}

//Here is the original code 
/*
import java.util.Random;
import java.util.Scanner;
public class oneShotHiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(100);
        int guess;
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        guess = scan.nextInt();
        if(guess == randomNumber)
        {
            System.out.println("You guessed it! What are the odds!");
        }
        if(guess > randomNumber)
        {
            System.out.println("Sorry, you are too high. I was thinking of " + randomNumber);
        }
        if(guess < randomNumber)
        {
            System.out.println("Sorry, you are too low. I was thinking of " + randomNumber);

        }
    }
}
*/