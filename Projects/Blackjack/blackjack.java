/* Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent.
 * The simplified blackjack rules are as follows:
 * Don't worry about suits and face cards; "cards" will have values from 2-11, and all values are equally likely 
 * Draw two cards for the player and display them.
 * Draw two cards for the dealer and display one of them, keeping the other one hidden.
 * Allow the player to "hit" as many times as they would like.
 * If the player "busts" (gets a total over 21), the dealer automatically wins.
 * Allow the dealer to hit as many times as they would like. Dealer should probably hit on sixteen or lower.
 * If the dealer busts, the player automatically wins
 * Assuming no one has busted the player with the highest total wins
 */
import java.util.Random;
import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	String playerChoice;
	// Generates cards from 2-11
	int playerCard1 = 2 + r.nextInt(10); 
	int playerCard2 = 2 + r.nextInt(10);
	int newPlayerCard;
	int dealerCard1 = 2 + r.nextInt(10);
	int dealerCard2 = 2 + r.nextInt(10);
	int newDealerCard;
	int playerTotal = playerCard1 + playerCard2;
	int dealerTotal = dealerCard1 + dealerCard2;
	
	// This will show either the first or second card for the dealer
	
	int dealerChoice = 1 + r.nextInt(2);
	
	// The initial totals for both the dealer and the player

	int playerTotal = playerCard1 + playerCard2;
	int dealerTotal = dealerCard1 + dealerCard2;

	System.out.println("Welcome to blackjack");
	System.out.println("You have a " + playerCard1 + " and a " + playerCard2);
	System.out.println("Your total is playerTotal);
	
	if(dealerChoice == 1)
		System.out.println("The dealer has a " + dealerCard1 + " showing, and a hidden card.");
	else 
		System.out.println("The dealer has a " + dealerCard2 + " showing, and a hidden card.");

	System.out.println("Their total is hidden, too);

		


    }
}
