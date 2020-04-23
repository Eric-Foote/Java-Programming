import java.util.Scanner;
public class countingMachine2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingPoint;
        int finishingPoint;
        int increment;
        System.out.print("Count from: ");
        startingPoint = scan.nextInt();
        System.out.print("Count to: ");
        finishingPoint = scan.nextInt();
        System.out.print("Count by: ");
        increment = scan.nextInt();
        for(int i = startingPoint; i <= finishingPoint; i = i+increment)
        {
            System.out.println(i);
        }
    }
}