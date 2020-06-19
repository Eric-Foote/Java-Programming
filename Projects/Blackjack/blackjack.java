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
public class blackjack {
    public static void main(String[] args) {
	Random r = new Random();
	int playerCard1 = 2 + r.nextInt(10);
	int playerCard2 = 2 + r.nextInt(10);
	int dealerCard1 = 2 + r.nextInt(10);
	int dealerCard2 = 2 + r.nextInt(10);
	int playerTotal = playerCard1 + playerCard2;
	int dealerTotal = dealerCard1 + dealerCard2;



    }
}
