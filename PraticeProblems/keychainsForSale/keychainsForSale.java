// This program will be edited over the course of the next 2 pratice problems to gain some actual functionality
import java.util.Scanner;
public class keychainsForSale {
    public static int add_keychains(int currentNumberOfKeychains, Scanner scan)
    {
        System.out.println("You have " + currentNumberOfKeychains + ". How many to add?");
        currentNumberOfKeychains = scan.nextInt();
        if (currentNumberOfKeychains < 0)
        {
            System.out.println("You cant put in the cart a negative number of keychains");
            return 0;
        }
        System.out.println("You now have " + currentNumberOfKeychains + " keychains");
        return currentNumberOfKeychains;
    }
    public static int remove_keychains(int currentNumberOfKeychains, Scanner scan)
    { // this function needs to be fleshed out with some pseudo error checking to make sure that the customer is not going to remove more keychains then there is in the cart.
        if(currentNumberOfKeychains < 0)
        {
            System.out.println("We can't remove any keychains yet... you need to add some to the cart");
            return currentNumberOfKeychains;
        }
        System.out.println("You have " + currentNumberOfKeychains + " how many to remove? ");
        int keychainsToBeRemoved = scan.nextInt();
        if (keychainsToBeRemoved < 0) 
        {
            System.out.println("You cant but back any keychains");
            return currentNumberOfKeychains;
        }
        if ((currentNumberOfKeychains - keychainsToBeRemoved) < 0)
        {
            System.out.println("Can't remove more keychains then you have");
            return currentNumberOfKeychains;
        }
        return (currentNumberOfKeychains - keychainsToBeRemoved);
    }
    public static void view_order(int currentNumberOfKeychains, int pricePerKeychain, double salesTax, int shippingCostPerOrder, int perKeychainCost)
    {
        System.out.println("You have " + currentNumberOfKeychains);
        System.out.println("Keychains cost $" + pricePerKeychain + " each");
        System.out.println("Shipping cost is $" + shippingCostPerOrder);
        System.out.println("Sub total before tax is $" + (currentNumberOfKeychains*pricePerKeychain));
        System.out.println("The tax on the order is $" + (salesTax * (currentNumberOfKeychains*pricePerKeychain)));
        System.out.println("The total is: $" + (salesTax * (currentNumberOfKeychains*pricePerKeychain) + currentNumberOfKeychains*pricePerKeychain + currentNumberOfKeychains*perKeychainCost + shippingCostPerOrder));
    }
    public static void checkout(int currentNumberOfKeychains, int pricePerKeychain,Scanner scan, double salesTax, int shippingCostPerOrder, int perKeychainCost)
    {
        System.out.println("What is your name? ");
        String name = scan.next();
        view_order(currentNumberOfKeychains, pricePerKeychain, salesTax, shippingCostPerOrder, perKeychainCost);
        System.out.println("Thanks for your order, " + name);
    
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int input;
        int currentNumberOfKeychains = 0;
        int pricePerKeychain = 10;
        double salesTax = 0.825;
        int shippingCostPerOrder = 5;
        int perKeychainCost = 1;
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains to Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        input = scan.nextInt();
        System.out.println("");
        while(input != 4)
        {
            if(input == 1)
            {
                currentNumberOfKeychains = add_keychains(currentNumberOfKeychains, scan);
            }
            else if(input == 2)
            {
                currentNumberOfKeychains = remove_keychains(currentNumberOfKeychains, scan);
            }
            else if(input == 3)
            {
                view_order(currentNumberOfKeychains, pricePerKeychain, salesTax, shippingCostPerOrder, perKeychainCost);
            }
            else 
            {
                System.out.println("Not a valid menu choice");
            }
            System.out.println("");
            System.out.println("Ye Olde Keychain Shoppe");
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains to Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println("");
            System.out.println("Please enter your choice: ");
            input = scan.nextInt();
            System.out.println("");

        }
        if(input == 4)
        {
            checkout(currentNumberOfKeychains,pricePerKeychain, scan, salesTax, shippingCostPerOrder, perKeychainCost);
        }
    }
}