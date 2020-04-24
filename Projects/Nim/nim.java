import java.util.Scanner;
import java.util.Random;   
public class nim {

    public nim (){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int a = 1 + r.nextInt(5); // we are first going to get the logic down when we have piles of size 5 
        int b = 1 + r.nextInt(5);
        int c = 1 + r.nextInt(5);
        int firstPlayer = 1 + r.nextInt(2);
        System.out.print("Player 1: enter your name: ");
        String name1 = scan.next();
        System.out.print("Player 2: enter your name: ");
        String name2 = scan.next();
        if(firstPlayer == 1)
        {
            System.out.println(name1 + " is Player 1");
            //player1 = name1;
            //player2 = name2;
            game(a, b, c, name1, name2);
        }
        else
        {
            System.out.println(name2 + " is Player 1");
            //player1 = name2;
            // player2 = name1;   
            game(a, b, c, name2, name1);   
        }
    }
    
    public static void game(int a, int b, int c, String player1, String player2) 
    {
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
    
    public static void main(String[] args) {
        nim();
    }
}