/* Use nested for loops to generate a list of all the two digit numbers which are less than or equal to fifty-six
 * and the sum of whose digits is greater than ten.
 * Use another set of nested for loops to find a two-digit number such that the number itself minus the number reversed is equal to the sum of its digits.
 * For example, 72 is not such a number because 72-27 (which is 45) is not the same as the sum of its digits (2+7 = 9).
 * Finally, put the code for each of the two parts into its own separate function, and have a menu in main() which allows you to choose which of the two sets to find. 
 * This main program should keep repeating until you choose to quit (use a do-while loop for this).
 */

import java.util.Scanner;

public class numberPuzzlesTwo{
	public static void option1(){
	
	}
	public static void option2(){
	
	}
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println(" 1) Find two digit numbers <= 56 with sums of digits > 10");
	System.out.println(" 2) Find two digit number minus number reversed which equals sum of digits");
	System.out.println(" 3) Quit");
	System.out.println();
	int choice = scan.nextInt();
	if(choice == 1) 
		option1();
	else if(choice == 2)
		option2();
	}
}

