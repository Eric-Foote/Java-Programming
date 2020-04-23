import java.util.Scanner;
import java.util.Random; 
public class threeCardMonte {
    public static void main(String[] args) {
        Random random = new Random();
        int ace = 1 + random.nextInt(3);
        Scanner scan = new Scanner(System.in);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println("Which one is the ace");
        int guess = scan.nextInt();
        if(guess == ace)
        {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        }
        else
        {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace);

        }

    }
}