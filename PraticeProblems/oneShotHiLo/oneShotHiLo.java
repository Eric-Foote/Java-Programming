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