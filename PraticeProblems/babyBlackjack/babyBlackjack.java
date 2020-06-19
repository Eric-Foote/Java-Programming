/* Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
 * 1. Pick two values from 1-10 for the player. These are the player's "cards".
 * 2. Pick two more values from 1-10 for the dealer.
 * 3. Whoever has the largest total is the answer.
 * 4. There is no betting, no busting, and no hitting. Save that for the real blackjack.
 */

import java.util.Random;

public class babyBlackjack{
	public static void main(String [] args) {
		Random r = new Random();
		int playerCard1 = 1 + r.nextInt(10);
		int playerCard2 = 1 + r.nextInt(10);
		int playerSum = playerCard1 + playerCard2;
		int dealerCard1 = 1 + r.nextInt(10);
		int dealerCard2 = 1 + r.nextInt(10);
		int dealerSum = dealerCard1 + dealerCard2;
		
		//Time to format the output

		System.out.println("Baby Blackjack!");
		System.out.println();
		System.out.println("You drew " + playerCard1 + " and " + playerCard2);
		System.out.println("Your total is " + playerSum);
		System.out.println();
                System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2);
                System.out.println("Dealer's total is " + dealerSum);

		//Now we determine who wins
		
		if(playerSum >= dealerSum)
			System.out.println("YOU WIN!");
		else 
			System.out.println("You Lose");
	}
}

