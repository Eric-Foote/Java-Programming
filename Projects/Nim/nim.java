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
        String move;
        while(a != 0 || b != 0 || c != 0)
        {
            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
            if(turnNumber % 2 == 0)
            {
                System.out.println(player2 + " choose a pile: ");
                move = scan.next();
                while(a == 0 && move.equals("a"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                while(b == 0 && move.equals("b"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                while(c == 0 && move.equals("c"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                if(move.equals("a"))
                {
                    System.out.println("How much to remove from pile A: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile A: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(a - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile A: ");
                        amountToRemove = scan.nextInt();
                    }
                    a = a - amountToRemove;
                }
                else if(move.equals("b"))
                {
                    System.out.println("How much to remove from pile B: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile B: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(b - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile B: ");
                        amountToRemove = scan.nextInt();
                    }
                    b = b - amountToRemove;
                }
                else if(move.equals("c"))
                {
                    System.out.println("How much to remove from pile C: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile C: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(c - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile C: ");
                        amountToRemove = scan.nextInt();
                    }
                    c = c - amountToRemove;
                }
                turnNumber++;
        }
            else
            {
                System.out.println(player1 + " choose a pile: ");
                move = scan.next();
                while(a == 0 && move.equals("a"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                while(b == 0 && move.equals("b"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                while(c == 0 && move.equals("c"))
                {
                    System.out.println("Nice Try. Pick again ");
                    move = scan.next();
                }
                if(move.equals("a"))
                {
                    System.out.println("How much to remove from pile A: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile A: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(a - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile A: ");
                        amountToRemove = scan.nextInt();
                    }
                    a = a - amountToRemove;
                }
                else if(move.equals("b"))
                {
                    System.out.println("How much to remove from pile B: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile B: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(b - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile B: ");
                        amountToRemove = scan.nextInt();
                    }
                    b = b - amountToRemove;
                }
                else if(move.equals("c"))
                {
                    System.out.println("How much to remove from pile C: ");
                    amountToRemove = scan.nextInt();
                    while(amountToRemove < 0)
                    {
                        System.out.println("We can't put any back.... now how many to remove from pile C: ");
                        amountToRemove = scan.nextInt();
                    }
                    while(c - amountToRemove < 0)
                    {
                        System.out.println("Can't take more then we have.... now how many to remove from pile C: ");
                        amountToRemove = scan.nextInt();
                    }
                    c = c - amountToRemove;
                }
                turnNumber++; 
            
            }
        }
    if(turnNumber % 2 == 0){
        System.out.println(player2 + " there is no counters left so you win");
    }
    else
        System.out.println(player1 + " there is no counters left so you win");
    }
}