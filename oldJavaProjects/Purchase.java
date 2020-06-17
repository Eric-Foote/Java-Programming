import java.util.*; 
import java.text.*;
public class Purchase {
   /*
    Calculates the final price of a purchased item using value entered by the user.
    */
    public static void main(String[] args){
        final double TAX_RATE = 0.15; //15% Tax Rate
        
        int quantity;
        double subtotal, tax, totalcost, unitprice;
        
        Scanner scan = new Scanner(System.in);
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        
        System.out.println("Enter the quantity: ");
        quantity = scan.nextInt();
        
        System.out.println("Enter the unit price: ");
        unitprice = scan.nextDouble();
        
        subtotal = quantity * unitprice;
        tax = subtotal * TAX_RATE;
        totalcost = subtotal + tax;
        
        //Print output with appropriate formatting
        
        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalcost));
        
    }
}
