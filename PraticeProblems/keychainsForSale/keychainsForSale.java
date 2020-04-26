// This program will be edited over the course of the next 2 pratice problems to gain some actual functionality
import java.util.Scanner;
public class keychainsForSale {
    public static void add_keychains()
    {
        System.out.println("ADD KEYCHAINS");
    }
    public static void remove_keychains()
    {
        System.out.println("REMOVE KEYCHAINS");
    }
    public static void view_order()
    {
        System.out.println("VIEW ORDER");
    }
    public static void checkout()
    {
        System.out.println("CHECKOUT");
    
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int input;
        int currentNumberOfKeychains;
        int pricePerKeychain;
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
                add_keychains();
            }
            else if(input == 2)
            {
                remove_keychains();
            }
            else if(input == 3)
            {
                view_order();
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
            checkout();
        }
    }
}