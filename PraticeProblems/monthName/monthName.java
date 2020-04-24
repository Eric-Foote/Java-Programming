import java.util.Scanner;
public class monthName {
    public static String month_name(int monthNumber)
    {
        if(monthNumber == 1) 
        {
            return "January";
        }
        else if (monthNumber == 2)
        {
            return "Febuary";
        }
        if(monthNumber == 3) 
        {
            return "March";
        }
        else if (monthNumber == 4)
        {
            return "April";
        }
        if(monthNumber == 5) 
        {
            return "May";
        }
        else if (monthNumber == 6)
        {
            return "June";
        }
        if(monthNumber == 7) 
        {
            return "July";
        }
        else if (monthNumber == 8)
        {
            return "August";
        }
        if(monthNumber == 9) 
        {
            return "September";
        }
        else if (monthNumber == 10)
        {
            return "October";
        }
        if(monthNumber == 11) 
        {
            return "November";
        }
        else if (monthNumber == 12)
        {
            return "December";
        }
        else 
        {
            return "error";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a month number");
        int monthNumber = scan.nextInt();
        System.out.println("Month #" + monthNumber + ": " + month_name(monthNumber));
    }
}