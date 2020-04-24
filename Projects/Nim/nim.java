import java.util.Scanner;
import java.util.Random;   
public class nim {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int a = 1 + r.nextInt(5); // we are first going to get the logic down when we have piles of size 5 
        int b = 1 + r.nextInt(5);
        int c = 1 + r.nextInt(5);
        System.out.print("Player 1: enter your name: ");
        String player1 = scan.next();
        System.out.print("Player 2: enter your name: ");
        String player2 = scan.next();
        int turnNumber = 1;
        int amountToRemove = 0;
        System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
        String move;
        while(a != 0 && b != 0 && c != 0)
        {
            if(turnNumber % 2 == 0)
            {
                System.out.println(player2 + "choose a pile: ");
                move = scan.next();
                turnNumber++;
            }
            else
            {
                System.out.println(player1 + "choose a pile: ");
                move = scan.next();
                turnNumber++; 
            }
        }
    }
}