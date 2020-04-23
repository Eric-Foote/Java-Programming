import java.util.Random;
import java.util.Scanner;
public class aNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int guess;
        int x = 1 + r.nextInt(10);
        System.out.println("I am thinking of a number from 1 to 10");
        System.out.println("Your guess");
        guess = scan.nextInt();
        while(guess != x){
            System.out.println("That is incorrect. Guess again");
            System.out.println("Your guess");
            guess = scan.nextInt();
        }
        System.out.println("You are correct your guess was what I was thinking of " + x);
    }
}