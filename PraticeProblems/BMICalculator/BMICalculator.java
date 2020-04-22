/*
* The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.
* It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
*/

import java.util.Scanner;
public class BMICalculator {
    
    public static double feetToMeters(double feet)
    {
        double conversion;
        conversion = feet / 3.28;
        return conversion;
    }

    public static double poundsToKilograms(double pounds)
    {
        double conversion;
        conversion = pounds / 2.20;
        return conversion;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int choice;
        double height;
        double weight;
        double BMI;
        System.out.println("Metric(1) or Imperial(2)");
        choice = scan.nextInt();
        if(choice == 1){
            System.out.println("Your height in meters: ");
            height = scan.nextDouble();
            System.out.println("Your weight in kilograms: ");
            weight = scan.nextDouble();
            BMI = weight / height;
            System.out.println("Your BMI is " + BMI);
        }
        if(choice == 2){
            System.out.println("Your height in feet input as feet.inches: ");
            height = scan.nextDouble();
            System.out.println("Your weight in pounds: ");
            weight = scan.nextDouble();
            height = feetToMeters(height);
            weight = poundsToKilograms(weight);
            BMI = weight / height;
            System.out.println("Your BMI is " + BMI);
        }
        if(choice > 2){
            System.out.println("1 or 2");
        }
        // We are going to return to this later to do some additional work with if statements
    }
}