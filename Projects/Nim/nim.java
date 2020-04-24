import java.util.Scanner;
import java.util.Random;   
public class nim {
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) { //try with resources 
        Random r = new Random();
        System.out.println("How big would you like the possible size of the piles to be: ");
        int pileSize = scan.nextInt();
        int a = 1 + r.nextInt(pileSize); // this can be changed to be whatever size the user decides it to be 
        int b = 1 + r.nextInt(pileSize);
        int c = 1 + r.nextInt(pileSize);
        System.out.println("Which graphics option would you like:");
        System.out.println("Option 1: No graphics all text based");
        System.out.println("Option 2: Horizontal letters's ");
        System.out.println("Option 3: Vertical letter's ");
        int graphicsOption = scan.nextInt();
        while(graphicsOption != 1 && graphicsOption != 2 && graphicsOption != 3)
        {
            System.out.println("Has to be either 1, 2, 3");
            graphicsOption = scan.nextInt();
        }
        System.out.println("We will now randomly decide who is player 1 and who is player 2");
        System.out.print("Person 1: enter your name: ");
        String person1 = scan.next();
        System.out.print("Person 2: enter your name: ");
        String person2 = scan.next();
        String player1;
        String player2;
        int decider = 1 + r.nextInt(2);
        if(decider == 1)
        {
             player1 = person1;
             System.out.println(player1 + " You are player 1"); 
             player2 = person2;
        }
        else
        {
            player1 = person2;
            System.out.println(player1 + " You are player 1");
            player2 = person1;
        }
        int turnNumber = 1;
        int amountToRemove = 0;
        String move;
        while(a != 0 || b != 0 || c != 0)
        {
            if(graphicsOption == 1)
            {
                System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
            }
            if(graphicsOption == 2)
            {
                for(int i = 0; i < a; i++)
                {
                    System.out.print("A");
                }
                System.out.println("");
                for(int i = 0; i < b; i++)
                {
                    System.out.print("B");
                }
                System.out.println("");
                for(int i = 0; i < c; i++)
                {
                    System.out.print("C");
                }
                System.out.println("");
            }
            if(graphicsOption == 3)
            {
                for(int i = 0; i < a; i++)
                {
                    System.out.println("A");
                }
                for(int i = 0; i < b; i++)
                {
                    System.out.println("    B");
                }
                for(int i = 0; i < c; i++)
                {
                    System.out.println("      C");
                }
            }
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
}