import java.util.Scanner;
import java.lang.Math;   
public class safeSquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double square;
        // Math has no constructor so we dont need to do anything similar to scanner or random as we have seen this far
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number:");
        square = scan.nextDouble();
        while(square < 0)
        {
            System.out.println("We are only dealing with real roots so no negative values");
            System.out.print("Try again:");
            square = scan.nextDouble();
        } 
        System.out.println("The square root of " + square + " is " + Math.sqrt(square));
    }
}