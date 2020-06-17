import java.text.*;
import java.util.*;

public class Wages {
    /*
    Reads the number of hours worked and calculates wages.
    */    
   
    public static void main(String[] args){
        final double RATE = 0.25; // regular pay rate
        final int STANDARD = 40; // standard hours in a work week.
        
        Scanner scan = new Scanner(System.in);
        
        double pay;
        
        System.out.println("Enter teh number of hours worked: ");
        int hours = scan.nextInt();
        
        System.out.println();
        
        // Pay overtime at time and a half
        
        if(hours > STANDARD)
            pay = STANDARD * RATE + (hours - STANDARD) * (RATE * 1.5);
        else
            pay = hours * RATE;
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Gross earnings: " + fmt.format(pay));
        
    }
}
