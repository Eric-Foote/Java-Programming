import java.util.Scanner; 
import java.lang.Math;
public class rightTriangleChecker {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        side1 = scan.nextInt();
        System.out.print("Side 2: ");
        side2 = scan.nextInt();
        while(side2 < side1)
        {
            System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
            System.out.print("Side 2: ");
            side2 = scan.nextInt();
        }
        System.out.print("Side 3: ");
        side3 = scan.nextInt();
        while(side3 < side2)
        {
            System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
            System.out.print("Side 3: ");
            side3 = scan.nextInt();
        }
        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        side1 = side1 * side1;
        side2 = side2 * side2;
        side3 = side3 * side3;
        int sum = side1 + side2;

        if(sum == side3)
        {
            System.out.println("These sides do make a right triangle.");
        }
        else 
        {
            System.out.println("These sides do not make a right triangle");
        }
    }
}