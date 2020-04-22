import java.util.Scanner;
public class dumbCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        double solution;
        System.out.println("What is the first number?");
        firstNumber = scan.nextDouble();
        System.out.println("What is the second number?");
        secondNumber = scan.nextDouble();
        System.out.println("What is the third number?");
        thirdNumber = scan.nextDouble();
        solution = (firstNumber + secondNumber + thirdNumber)/2;
        System.out.println("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " )/2 is... " + solution);
        
    }
}