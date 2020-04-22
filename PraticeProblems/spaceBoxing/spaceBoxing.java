import java.util.Scanner;
public class spaceBoxing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        double weight;
        System.out.println("Please enter your current earth weight: ");
        weight = scan.nextDouble();
        System.out.println("I have information for the following planets: \n\t 1. Venus \t 2. Mars \t 3. Jupiter \n\t 4. Saturn \t 5. Uranus \t 6. Neptune" );
        System.out.println("Which planet are you visiting? ");
        choice = scan.nextInt();
        if (choice == 1)
        {
            System.out.println("Your weight would be " + (weight * 0.78) + " pounds on that planet");
        }
        if (choice == 2)
        {
            System.out.println("Your weight would be " + (weight * 0.39) + " pounds on that planet");
        }
        if (choice == 3)
        {
            System.out.println("Your weight would be " + (weight * 2.65) + " pounds on that planet");
        }
        if (choice == 4)
        {
            System.out.println("Your weight would be " + (weight * 1.17) + " pounds on that planet");
        }
        if (choice == 5)
        {
            System.out.println("Your weight would be " + (weight * 1.05) + " pounds on that planet");
        }
        if (choice == 6)
        {
            System.out.println("Your weight would be " + (weight * 1.23) + " pounds on that planet");
        }
        if (choice >= 7)
        {
            System.out.println("We don't have any information beyond these 6!");
        }
    }
}