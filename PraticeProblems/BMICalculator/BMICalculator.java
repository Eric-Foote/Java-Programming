/*
* The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.
* It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
*/

import java.util.Scanner;
public class BMICalculator {
    
    public static double feetToMeters(double feet) //this method is a little beyond the current scope of the pratice lessons but I decided to put it here for simplicity
    {
        double conversion;
        conversion = feet / 3.28;
        return conversion;
    }

    public static double poundsToKilograms(double pounds) //this method is a little beyond the current scope of the pratice lessons but I decided to put it here for simplicity
    {
        double conversion;
        conversion = pounds / 2.20;
        return conversion;
    }

    public static void BMICategories(double BMI)
    {
        if(BMI < 18.5)
        {
            System.out.println("BMI Category: underweight");
        }
        if(BMI >= 18.5 && BMI < 24.9)
        {
            System.out.println("BMI Category: normal weight");
        }
        if(BMI >= 25 && BMI < 29.9)
        {
            System.out.println("BMI Category: overweight"); 
        }
        if(BMI >= 30.0)
        {
            System.out.println("BMI Category: obese");
        }
    }
    // we can add in additional categories at a later time as a bonus all this is going to do is break down the top case and the bottom case and add a later on bottom case

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
            BMICategories(BMI);
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
            BMICategories(BMI);
        }
        if(choice > 2){
            System.out.println("1 or 2");
        }
    }
}