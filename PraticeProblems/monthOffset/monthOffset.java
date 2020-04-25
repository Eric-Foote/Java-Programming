import java.util.Scanner;
public class monthOffset {
    public static int monthOffset(int monthNumber)
    {
        if(monthNumber == 1) 
        {
            return 1;
        }
        else if (monthNumber == 2)
        {
            return 4;
        }
        if(monthNumber == 3) 
        {
            return 4;
        }
        else if (monthNumber == 4)
        {
            return 0;
        }
        if(monthNumber == 5) 
        {
            return 2;
        }
        else if (monthNumber == 6)
        {
            return 5;
        }
        if(monthNumber == 7) 
        {
            return 0;
        }
        else if (monthNumber == 8)
        {
            return 3;
        }
        if(monthNumber == 9) 
        {
            return 6;
        }
        else if (monthNumber == 10)
        {
            return 1;
        }
        if(monthNumber == 11) 
        {
            return 4;
        }
        else if (monthNumber == 12)
        {
            return 6;
        }
        else 
        {
            return -1;
        }   
    }
    public static void main(String[] args) 
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a month number");
    int monthNumber = scan.nextInt();
    System.out.println("Month #" + monthNumber + ": " + monthOffset(monthNumber));
    }
}