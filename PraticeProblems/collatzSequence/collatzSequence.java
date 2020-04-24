import java.util.Scanner;
public class collatzSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingNumber;
        int counter = 0;
        int largestValue;
        System.out.print("Starting Number: ");
        startingNumber = scan.nextInt();
        largestValue = startingNumber;
        System.out.print(startingNumber);
        System.out.print("\t");
        while(startingNumber != 1) 
        {
           if(largestValue < startingNumber)
           {
               largestValue = startingNumber;
           } 
            if(startingNumber % 2 == 0) 
            {
                startingNumber = (startingNumber / 2); 
                System.out.print(startingNumber);
                System.out.print("\t");
                counter++;

            }
            else
            {
                startingNumber = (startingNumber * 3) + 1;
                System.out.print(startingNumber);
                System.out.print("\t");
                counter++;
            }
        }
        System.out.println("");
        System.out.println("The number of times through the sequence is: " + counter);
        System.out.println("The largest value in the sequence is: " + largestValue);
    }
}